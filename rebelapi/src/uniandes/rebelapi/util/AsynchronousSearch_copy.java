package uniandes.rebelapi.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import rebel_core.Fact;
import rebel_github.Message;
import uniandes.rebel.core.model.CoreModel;
import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.bo.APIModelElement;
import uniandes.rebelapi.db.APIModelDerby;
import uniandes.rebelapi.similarity.SemanticSimilarityExec;

public class AsynchronousSearch_copy {

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
		SemanticSimilarityExec simiExec = null; //new SemanticSimilarityExec();

		// Se recorre la lista de Fact
		if (boi != null) {
			for (Fact fact : boi.getFact()) {
				if (fact != null) {
					// Por cada Fact, se saca el nombre del elemento arquitectural, y la accion
					String elementName = fact.getElementName();
					String action = fact.getAction().getLiteral();
					String descAction = fact.getObservations();
					// incluir el tipo de elemento arquitectural?

//					System.out.println("***************************");
//					System.out.println("RebelMediator.findAndLinkHeterogeneousArtifacts ::: Fact = " + elementName
//							+ " - " + action + " - " + descAction);

					// Se revisa que el nombre pueda dividirse (ej, separar nombres compuestos
					// MaterialReturn)
					ArrayList<String> wordsOfElementName = Util.separateInWords(elementName);

					// Lematización se hace en el python
					// Se construye el conjunto de palabras
					String finalName = "";
					for (String word : wordsOfElementName) {
						finalName += word + " ";
					}

					// ************************************
					// Acceder los modelos de GitHub para encontrar cuáles vincular a los Fact
					// ************************************

//					System.out.println("finalName = " + finalName);
					
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

										
//										System.out.println("fullCommitMessage = " + fullCommitMessage);

										// Se divide el contenido en oraciones, y cada oración se pasa para hallar
										// similaridad
										// Para el caso de los commits, como el contenido es concreto, no sería
										// necesario separarlo.
										// Para cuando se incluyan los chats, sí habrá que considerarlos.

										// Enviar a comprobar similaridad

										boolean accuracy = false;
//										boolean accuracy = simiExec.sentenceHasSimilarities(finalName,
//												fullCommitMessage, 0.7);

										if (accuracy) {
											// Si supera el umbral definido, se debe convertir el modelo rebel_github a
											// rebel_core.
											rebel_core.Message coreMsg = createMessage(core, msg);
											rebel_core.Person pers = createPerson(core, msg.getPerson());

											if (coreMsg != null) {

												coreMsg.setPerson(pers);

												// Agrega al arraylist de mensajes																						
												messagesToProject.add(coreMsg);
												
												// Agrega al arraylist de personas
												personsToProject.add(pers);
												
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
								}
							}
						}
					}
				}
			}
		}

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
