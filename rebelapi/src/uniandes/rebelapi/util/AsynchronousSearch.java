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

import rebel_core.Fact;
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

		ArrayList<rebel_core.Message> messagesToProject = new ArrayList<rebel_core.Message>();		
		ArrayList<rebel_core.Person> personsToProject = new ArrayList<rebel_core.Person>();		
		HashMap<String, ArrayList<String>> messagesToFact = new HashMap<String, ArrayList<String>>();

		try {
			int rowsUpdated = (new APIModelDerby()).updateLookForArtifactsState(boi.getName(), projectName,
					"SEARCHING");
			System.out.println(
					rowsUpdated > 0 ? "RebelMediator.findAndLinkHeterogeneousArtifacts ::: State changed to Searching"
							: "RebelMediator.findAndLinkHeterogeneousArtifacts ::: Error updating state to Searching");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		boolean somethingToInsert = false;
		SemanticSimilarityExec simiExec = new SemanticSimilarityExec(0.4);

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
		// Acceder los modelos de GitHub para encontrar cuáles vincular a los Fact
		// ************************************************************************

		
		// Buscar en BD la lista de modelos para el proyecto pasado como parámetro
		List<APIModelElement> listArtifacts = (new APIModelDerby()).listAllArtifacts(projectName);
		
		if (listArtifacts != null && listArtifacts.size() > 0) {
			for (APIModelElement modelArtifact : listArtifacts) {

				// Para los artefactos que correspondan a mensajes de commit
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
		        
				System.out.println("*** entry.getKey(): "+entry.getKey());
				
				boolean tieneSimilitudes = simiExec.contarSimilitudes(entry.getValue());
				
				if(tieneSimilitudes) {
					
					System.out.println("    Hay similitudes");
					
					String[] splitFactMess = entry.getKey().split("::");
					String idFact = splitFactMess[0];
					String idMess = splitFactMess[1];
					
					Fact fact = hashFacts.get(idFact);
					Message msg = hashMessages.get(idMess);
					
					rebel_core.Message coreMsg = createMessage(core, msg);
					rebel_core.Person pers = createPerson(core, msg.getPerson());

					if (coreMsg != null) {
						
						boolean yaEsta = false;
						for(rebel_core.Message m1 : messagesToProject) {
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
			// TODO Auto-generated catch block
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
					// TODO Auto-generated catch block
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
						
						for(rebel_core.Message msss : messagesToProject) {
							rebelProject.getMessage().add(msss);
							
							System.out.println("Msss = "+msss.getId());
							
							// Revisar los Facts para poder asociar este Message
							for (Fact fact : boiFinal.getFact()) {
								ArrayList<String> messOfFact = messagesToFact.get(fact.getId());
								
								if(messOfFact!=null) {
									
									System.out.println("	Mensajes a Fact: "+ fact.getId() + " - " + messOfFact.size());
									
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
							// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
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

	
	private rebel_core.Message createMessage(CoreModel core, rebel_github.Message msg) {
		rebel_core.Message coreMsg = null;
		if (msg != null) {
			coreMsg = core.createMessage();

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
	
}
