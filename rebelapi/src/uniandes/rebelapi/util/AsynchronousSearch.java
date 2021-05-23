package uniandes.rebelapi.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.emf.ecore.resource.Resource;

import rebel_chatlogs.MessageLog;
import rebel_core.BlockOfInterest;
import rebel_core.ChatEmailMessage;
import rebel_core.Fact;
import rebel_core.MessageLogType;
import rebel_core.Project;
import rebel_github.Message;
import uniandes.rebel.core.model.CoreModel;
import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.bo.APIModelElement;
import uniandes.rebelapi.db.APIModelDerby;
import uniandes.rebelapi.similarity.SemanticSimilarityExec;

public class AsynchronousSearch {

	/**
	 * Este metodo es responsable de buscar las coincidencias de los nombres de los
	 * elementos arquitecturales en los demás artefactos heterogéneos. ESTE METODO
	 * ES UNA IMPLEMENTACION DE PRUEBA PARA GARANTIZAR QUE OTRAS OPERACIONES SOBRE
	 * EL MODELO NO SEAN SOBREESCRITAS AL FINALIZAR ESTE METODO.
	 * 
	 * @param boi
	 * @param projectName Se utiliza para buscar los modelos en la BD
	 */
	public void findAndLinkHeterogeneousArtifacts(CoreModel core, rebel_core.BlockOfInterest boi, String projectName) {

		ArrayList<rebel_core.CommitMessage> messagesToProject = new ArrayList<rebel_core.CommitMessage>();		
		ArrayList<rebel_core.Person> personsToProject = new ArrayList<rebel_core.Person>();		
		HashMap<String, ArrayList<String>> messagesToFact = new HashMap<String, ArrayList<String>>();

		try {
			int rowsUpdated = (new APIModelDerby()).updateLookForArtifactsState(boi.getName(), projectName,
					"SEARCHING");
			System.out.println(
					rowsUpdated > 0 ? "RebelMediator.findAndLinkHeterogeneousArtifacts ::: State changed to Searching"
							: "RebelMediator.findAndLinkHeterogeneousArtifacts ::: Error updating state to Searching");
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		boolean somethingToInsert = false;
		SemanticSimilarityExec simiExec = new SemanticSimilarityExec(0.7);

		/*
		 * Estos hashs se usan para guardar temporalmente la lista de Facts y Messages.
		 * Estos dos se usarán para buscar los objetos cuando sean devueltos del análisis
		 * de similaridad semántica.
		 */
		HashMap<String, Fact> hashFacts = new HashMap<String, Fact>();
		HashMap<String, Message> hashMessages = new HashMap<String, Message>();
		
		// Para escribir en archivo y notificar a Python
		String factsToFile = "id;fact\n";
		String messagesToFile = "idgithub;contenidogithub\n";
		
		// Se recorre la lista de Fact
		if (boi != null) {
			for (Fact fact : boi.getFact()) {
				if (fact != null) {
					// Por cada Fact, se saca el nombre del elemento arquitectural, y la accion
					String elementName = fact.getElementName();
					String action = fact.getAction().getLiteral();
					String descAction = fact.getObservations();
					// incluir el tipo de elemento arquitectural?

					// ------------------------------------------------------------
					// Se eliminan los simbolos de las relaciones (Creacion, Eliminacion)
					// ------------------------------------------------------------
					
					elementName = elementName.replaceAll("->", "").replaceAll("-X", "").replaceAll("-O\\)-", "");
					
					// Se revisa que el nombre pueda dividirse (ej, separar nombres compuestos
					// MaterialReturn)
					ArrayList<String> wordsOfElementName = Util.separateInWords(elementName);

					// Lematización se hace en el python
					// Se construye el conjunto de palabras
					String finalName = "";
					for (String word : wordsOfElementName) {
						finalName += word + " ";
					}
					
					hashFacts.put(fact.getId(), fact);
					factsToFile += fact.getId() + ";" + finalName + "\n";
				}
			}
		}
					

		// ************************************************************************
		// ACCEDER A LOS RECURSOS PARA ENCONTRAR EN CUALES APLICAR LA BUSQUEDA
		// POR SIMILARIDAD
		// ************************************************************************

		
		// Buscar en BD la lista de modelos para el proyecto pasado como parámetro
		List<APIModelElement> listArtifacts = (new APIModelDerby()).listAllArtifacts(projectName);
		
		if (listArtifacts != null && listArtifacts.size() > 0) {
			for (APIModelElement modelArtifact : listArtifacts) {

				// ------------------------------------------------------------------
				// ARTEFACTOS DE GITHUB
				
				if (modelArtifact.getType().equals("github")) {
					// Se saca la ruta del modelo
					String xmlRoute = modelArtifact.getXmlroute();

					rebel_github.Project ghProj = null;

					// Instancia los modelos encontrados usando el método de Util.
					try {
						ghProj = Util.buildModelRebelGitHub(xmlRoute);
					} catch (Exception e) {
						System.err.println(
								"RebelMediator.findAndLinkHeterogeneousArtifacts ::: No se pudo crear la instancia Project del model de github. "
										+ e.getMessage());
					}

					if (ghProj != null) {
						// Only one message is actually stored, but the model allow to have several
						// messages in one model.
						Message msg = ghProj.getMessages() != null ? ghProj.getMessages().get(0) : null;

						if (msg != null) {
							// Se extrae tanto el subject como el contenido del commit.
							String fullCommitMessage = msg.getSubject() + " " + msg.getBody();

							/*
							 * Se divide el contenido en oraciones, y cada oración se pasa para hallar similaridad.
							 * Para el caso de los commits, como el contenido es concreto, no sería necesario separarlo.
							 * Para cuando se incluyan los chats, sí habrá que considerarlos.
							 */
							
							hashMessages.put(msg.getId(), msg);
							messagesToFile += msg.getId() + ";" + fullCommitMessage + "\n";	

						}
					}
				}
				
			}
		}
		
		// ********************************************************************************
		// SE ESCRIBE EN DISCO Y SE NOTIFICA A PYTHON
		// ********************************************************************************

		String folderName = "/Users/borisperezg/temporalsimilfolder";
		
		// Escribir en disco los Facts
		try {
			FileWriter myWriter = new FileWriter(folderName+"/facts.csv");
			myWriter.write(factsToFile);
			myWriter.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		// Escribir en disco los Messages
		try {
			FileWriter myWriter = new FileWriter(folderName+"/github.csv");
			myWriter.write(messagesToFile);
			myWriter.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		simiExec.sentenceHasSimilarities();
		
		// ********************************************************************************
		// SE REVISA EL ARCHIVO GENERADO EN PYTHON Y SE PROCESA EL CONTENIDO
		// ********************************************************************************
		HashMap<String, ArrayList<Double>> procesarTXT = new HashMap<String, ArrayList<Double>>(); 
		
		File myObj = new File(folderName + "/results_ss.txt");
		
		Scanner myReader;
		try {
			myReader = new Scanner(myObj);
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				
				// Se convierte cada registro del archivo a una entrada de un hashmap para su posterior procesamiento
				procesarData(data, procesarTXT);
						
			}
			
			myReader.close();
			
			// Se procesa cada entrada del hashmap para creacion del objetos
			for (Map.Entry<String, ArrayList<Double>> entry : procesarTXT.entrySet()) {
		        
				
				
				boolean tieneSimilitudes = simiExec.contarSimilitudes(entry.getValue());
				
				if(tieneSimilitudes) {
					System.out.println("*** entry.getKey(): "+entry.getKey());
					System.out.println("    Hay similitudes");
					
					String[] splitFactMess = entry.getKey().split("::");
					String idFact = splitFactMess[0];
					String idMess = splitFactMess[1];
					
					Fact fact = hashFacts.get(idFact);
					Message msg = hashMessages.get(idMess);
					
					rebel_core.CommitMessage coreMsg = createMessage(core, msg);
					rebel_core.Person pers = createPerson(core, msg.getPerson());

					if (coreMsg != null) {
						
						boolean yaEsta = false;
						for(rebel_core.CommitMessage m1 : messagesToProject) {
							if(m1.getId().equals(coreMsg.getId())) {
								yaEsta = true;
								break;
							}
						}
						
						if(!yaEsta) {						
							coreMsg.setPerson(pers);
	
							// Agrega al arraylist de mensajes																						
							messagesToProject.add(coreMsg);
							
							// Agrega al arraylist de personas
							personsToProject.add(pers);
						}
						
						
						
						// Agrega al hashmap de facts
						ArrayList<String> messs = messagesToFact.get(fact.getId());
						if(messs==null) {
							messs = new ArrayList<String>();
						}
						messs.add(coreMsg.getId());
						messagesToFact.put(fact.getId(), messs);

						// Cambia variable para realizar la posterior escritura
						somethingToInsert = true;
					}
				}					
		    }		
			
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
	      
		
		// ********************************************************************************
		// SE ACTUALIZA EL MODELO EN CASO DE HABER ENCONTRADO SIMILITUDES
		// ********************************************************************************
		
		// Si los hashmaps tienen contenido, entonces se procede a traer de la base de
		// datos el xml del boi.
		// Luego se agregan los Messages y Persons al Project. Y luego se buscan los
		// Fact por el ID, y se asocian los
		// Messages

		if (somethingToInsert) {

			boolean changesUpdated = false;

			// Obtener el xml del BOI
			APIBOI apiBOI = (new APIModelDerby()).getBOI(projectName, boi.getName());

			if (apiBOI != null) {
				Resource resource = null;
				// Obtener el Resource a partir del xml
				try {
					resource = (new CoreModel()).buildModelRebelCore(apiBOI.getUrl(), boi.getName());
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (resource != null) {
					
//					System.out.println("RebelMediator.findAndLinkHeterogeneousArtifacts ::: Resource obtained");
					
					// Se inicia la insercion de los Message y Person a Project
					rebel_core.Project rebelProject = (rebel_core.Project) resource.getContents().get(0);
					
					if (rebelProject != null) {
						
						changesUpdated = true;
						
						for(rebel_core.Person perss : personsToProject) {
							rebelProject.getPerson().add(perss);
						}
						
						rebel_core.BlockOfInterest boiFinal = rebelProject.getBlockofinterest().get(0);
						
						for(rebel_core.CommitMessage msss : messagesToProject) {
							rebelProject.getCommitMessages().add(msss);
							
							// Revisar los Facts para poder asociar este Message
							for (Fact fact : boiFinal.getFact()) {
								ArrayList<String> messOfFact = messagesToFact.get(fact.getId());
								
								if(messOfFact!=null) {
									
									
									for(String idMess : messOfFact) {
										
										if(idMess.equals(msss.getId())) {
											fact.getMessage().add(msss);
											
										}
										
									}
								}
							}
							
						}
						
					}
					
					if(changesUpdated) {
						// Colocar el valor de la columna LOOKINARTIF a DONE
						try {
							int rowsUpdated = (new APIModelDerby()).updateLookForArtifactsState(boi.getName(), rebelProject.getName(),
									"DONE");
							System.out.println(
									rowsUpdated > 0 ? "RebelMediator.findAndLinkHeterogeneousArtifacts ::: State changed to DONE"
											: "RebelMediator.findAndLinkHeterogeneousArtifacts ::: Error updating state to DONE");

							resource.save(Collections.EMPTY_MAP);

						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					
				}
			}

		}else {
			try {
				int rowsUpdated = (new APIModelDerby()).updateLookForArtifactsState(boi.getName(), projectName,
						"DONE");
				System.out.println(
						rowsUpdated > 0 ? "RebelMediator.findAndLinkHeterogeneousArtifacts ::: State changed to DONE"
								: "RebelMediator.findAndLinkHeterogeneousArtifacts ::: Error updating state to DONE");

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}
	
	

	/**
	 * 
	 * @param linea 690::7aa32a74edba59f1c295a41e95f5deab0d1753c8::0.30564955002621913
	 * @param procesarTXT
	 */
	private void procesarData(String linea, HashMap<String, ArrayList<Double>> procesarTXT) {
		
		if(!linea.isEmpty()) {
			
			String[] values = linea.split("::");
			String idFact = values[0];
			String idMess = values[1];
			String simil = values[2];
			
			if(procesarTXT.get(idFact+"::"+idMess)==null) {
				
				ArrayList<Double> similValues = new ArrayList<Double>();
				similValues.add(Double.parseDouble(simil));
				
				procesarTXT.put(idFact+"::"+idMess, similValues);
			}else {
				
				ArrayList<Double> similValues = procesarTXT.get(idFact+"::"+idMess);
				similValues.add(Double.parseDouble(simil));
				
			}
			
		}
		
	}

	
	private rebel_core.CommitMessage createMessage(CoreModel core, rebel_github.Message msg) {
		rebel_core.CommitMessage coreMsg = null;
		if (msg != null) {
			coreMsg = core.createCommitMessage();

			coreMsg.setBody(msg.getBody());
			coreMsg.setDate(msg.getDate());
			coreMsg.setFooter(msg.getFooter());
			coreMsg.setId(msg.getId());
			coreMsg.setScope(msg.getScope());
			coreMsg.setSubject(msg.getSubject());

			if (msg.getAction().getLiteral().equals("COMMIT"))
				coreMsg.setAction(rebel_core.ACTIONTYPE.COMMIT);

			if (msg.getType().getLiteral().equals("FEAT")) {
				coreMsg.setType(rebel_core.OPERATIONTYPE.FEAT);
			} else if (msg.getType().getLiteral().equals("DOCS")) {
				coreMsg.setType(rebel_core.OPERATIONTYPE.DOCS);
			} else if (msg.getType().getLiteral().equals("FIX")) {
				coreMsg.setType(rebel_core.OPERATIONTYPE.FIX);
			} else if (msg.getType().getLiteral().equals("MODELS")) {
				coreMsg.setType(rebel_core.OPERATIONTYPE.MODELS);
			} else if (msg.getType().getLiteral().equals("REFACTOR")) {
				coreMsg.setType(rebel_core.OPERATIONTYPE.REFACTOR);
			}

		}
		return coreMsg;
	}

	private rebel_core.Person createPerson(CoreModel core, rebel_github.Person per) {
		rebel_core.Person person = null;

		if (per != null) {
			person = core.createPerson();
			person.setEmail(per.getEmail());
			person.setName(per.getName());
		}

		return person;
	}
	
	// **********************************************************************
	// **********************************************************************
	
	
	public static void main(String[] args) {
		(new AsynchronousSearch()).
			moveMessageLogToCore(	"NewProject", // Nombre proyecto
									"Survey Comments", // Nombre model artefactos
									"email",  // Tipo de artefacto
									"id-1615654283242", // Id message
									"2nd BOI", // BOI Model Name
									"38"); // Fact ID
	}
	
	
	/**
	 * Este metodo busca un MessageLog por ID, y lo lleva al BOI indicado.
	 * Especificamente se usa para vincular un MessaLog a un Fact. 
	 * No pretende recorrer la lista de MessageLogs (emails y chats)
	 * 
	 */
	private void moveMessageLogToCore(String projectName, String chatEmailModelName, 
			String artifactType, String msgLogId, String boiName, String factId) {
		
		// Buscar e instanciar el modelo de chatlogs.		
		APIModelElement apiModelElement = (new APIModelDerby()).getChatEmailArtifacts(projectName, chatEmailModelName, artifactType);
		String xmlRoute = apiModelElement.getXmlroute();

		rebel_chatlogs.Project ceProj = null;

		// Instancia los modelos encontrados usando el método de Util.
		try {
			ceProj = Util.buildModelRebelChatLogs(xmlRoute);
		} catch (Exception e) {
			System.err.println(
					"RebelMediator.findAndLinkHeterogeneousArtifacts ::: No se pudo crear la instancia Project del model de github. "
							+ e.getMessage());
		}

		if (ceProj != null) {
		
			MessageLog msgLogToRebel = null;
			
			// ******************************************************
			// SE BUSCA EL MESSAGELOG INDICADO EN PARAMETRO
			// ******************************************************
			
			for(MessageLog msgLog : ceProj.getMessagelogs()) {
				if(msgLog.getId().equals(msgLogId)) {
					msgLogToRebel = msgLog;
					break;
				}
			}
			
			// ******************************************************
			// SE PASA EL MESSAGELOG A REBEL_CORE, ASOCIANDOLO AL FACT
			// CORRESPONDIENTE
			// ******************************************************
			
			if(msgLogToRebel!=null) {
								
				// ------------------------------------
				// Se instancia el BOI
				// ------------------------------------
				
				// Obtener el xml del BOI
				APIBOI apiBOI = (new APIModelDerby()).getBOI(projectName, boiName);

				if (apiBOI != null) {
					Resource resource = null;
					try {
						resource = (new CoreModel()).buildModelRebelCore(apiBOI.getUrl(), boiName);
					} catch (Exception e) {
						e.printStackTrace();
					}

					if (resource != null) {
						
						boolean encontroMessageLog = false;
						// Este objeto guardara la referencia del MessageLog dentro de rebel_core.
						rebel_core.MessageLog msgFromRebelCore = null;
						
						rebel_core.Project rebelProject = (rebel_core.Project) resource.getContents().get(0);
						if (rebelProject != null) {
							// Primero se inserta en Rebel Core
							
							// Se recorren los MessageLogs contenidos en Core, para asegurarse de que
							// no exista uno igual ya creado.
							if(rebelProject.getMessagelog()!=null) {
								for(rebel_core.MessageLog msgLogRebel : rebelProject.getMessagelog()) {
									if(msgLogRebel.getId().equals(msgLogToRebel.getId())) {
										encontroMessageLog = true;
										msgFromRebelCore = msgLogRebel;
										break;
									}
								}
							}
							
							// --------------------------------------------------
							// SE CREA EL MESSAGELOG Y LOS MENSAJES, O SE ENCUENTRA
							// EL MESSAGELOG Y SE GUARDA LA REFERENCIA
							// --------------------------------------------------
							
							// Si recorrio todo el modelo y no lo encontro, entonces
							// prosiga a insertarlo.
							if(!encontroMessageLog) {
								
								// Se procede a crear el rebel_core.MessageLog y agregarlo a Project
								rebel_core.MessageLog rebelMsgLog = (new CoreModel()).createMessageLog();
								rebelMsgLog.setId(msgLogToRebel.getId());
								rebelMsgLog.setTitle(msgLogToRebel.getTitle());
								rebelMsgLog.setCreationDate(msgLogToRebel.getCreation());
								
								if(msgLogToRebel.getType().getLiteral().equals("EMAIL")) {
									rebelMsgLog.setType(MessageLogType.EMAIL);
								}else if(msgLogToRebel.getType().getLiteral().equals("CHATLOG")) {
									rebelMsgLog.setType(MessageLogType.CHATLOG);
								} 
								
								// Recorrer y transformar cada uno de los mensajes
								iterarYCrearMessages(msgLogToRebel, rebelMsgLog);
								
								// Se agregan los MessageLogs al proyecto
								rebelProject.getMessagelog().add(rebelMsgLog);
								
								// --------------------------------------------------
								// BUSCAR EL FACT PARA ASOCIARLE EL MESSAGELOG GUARDADO 
								// EN 'rebelMsgLog'
								// --------------------------------------------------
								Fact fact = buscarFactParaAsociarMessageLog(rebelProject, factId);
								if(fact!=null)
									fact.getMessagelogs().add(rebelMsgLog);
								
								
							}else { // Si lo encontró, entonces asocielo al Fact
							
								// --------------------------------------------------
								// BUSCAR EL FACT PARA ASOCIARLE EL MESSAGELOG GUARDADO 
								// EN 'msgFromRebelCore'
								// --------------------------------------------------
								Fact fact = buscarFactParaAsociarMessageLog(rebelProject, factId);
								if(fact!=null)
									fact.getMessagelogs().add(msgFromRebelCore);
								
							}
							
							
							
							// Para cualquiera de los dos casos, se debe persistir.
							// Se procede a actualizar el archivo fisico
							try {
								resource.save(Collections.EMPTY_MAP);
								System.out.println("Done");
							} catch (IOException e) {
								e.printStackTrace();
							}
							
							
						}
					}
				}
				
			}
			
		}else
			System.out.println("moveMessageLogToCore ::: No logro instanciar al BOI");
	}
	
	/**
	 * Este metodo toma un rebel_chatlogs.MessageLog e itera sobre sus rebel_chatlogs.Message, 
	 * los va convirtiendo en rebel_core.ChatEmailMessage, y los asocia a un rebel_core.MessageLog.
	 * @param 
	 */
	private void iterarYCrearMessages(rebel_chatlogs.MessageLog mlSource, rebel_core.MessageLog mlTarget) {
		for(rebel_chatlogs.Message msgSource : mlSource.getMessages()) {
			
			ChatEmailMessage msgTarget = (new CoreModel()).createChatEmailMessage();
			msgTarget.setId(msgSource.getId());
			msgTarget.setReceivedBy(msgSource.getReceivedBy());
			msgTarget.setSentBy(msgSource.getSentBy());
			msgTarget.setText(msgSource.getText());
			msgTarget.setTimestamp(msgSource.getTimestamp());
			
			mlTarget.getMsgLogMessages().add(msgTarget);
			
		}
	}
	
	/**
	 * Se usa para encontrar el Fact al que se asociará el MessageLog
	 * @param rebelProject
	 * @param factId
	 * @return
	 */
	private Fact buscarFactParaAsociarMessageLog(rebel_core.Project rebelProject, String factId) {
		Fact fact = null;
		
		for(BlockOfInterest boi : rebelProject.getBlockofinterest()) {
			if(boi!=null) {
				for(Fact f : boi.getFact()) {
					if(f!=null && f.getId().equals(factId)) {
						fact = f;
						break;
					}
				}
			}
		}
		
		return fact;
	}
	
	
	
}
