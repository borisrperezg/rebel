package uniandes.rebelapi.mediator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import rebel_core.ATDItem;
import rebel_core.ATDRationale;
import rebel_core.ArchimateView;
import rebel_core.BlockOfInterest;
import rebel_core.ChatEmailMessage;
import rebel_core.CommitMessage;
import rebel_core.Decision;
import rebel_core.Fact;
import rebel_core.MessageLog;
import rebel_core.Project;
import rebel_core.Relation;
import uniandes.rebel.archimate.AMModel;
import uniandes.rebel.core.model.CoreModel;
import uniandes.rebelapi.bo.APIElementRelations;
import uniandes.rebelapi.bo.APIModelElement;
import uniandes.rebelapi.bo.ATDItemBO;
import uniandes.rebelapi.bo.Model;
import uniandes.rebelapi.db.APIModelDerby;

public class IdentificationMediator {

	final String DATAFOLDERFORCLASSIFY = "/Users/borisperezg/rebelmodels_storing/datasets_to_classify/";
	
	/**
	 * Responsable de tomar los datos del Fact para un determinado BOI, prepararlos
	 * y enviarlos a entrenar un modelo.
	 * 
	 * @param params project&boi&modelbase
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	public String prepareDatasetToClassify(String params) throws Exception {

		String resp = "NOK";
//		Se descarta la informacion de las conexiones que tenia en la version anterior
//		String fileContent = "date,prevelementnames,types,relationtypes,sourceelementname,sourceelementtype,targetelementname,isnewelement,targetelementtype,facttype,relatontype,action,atdcause\n";

		String fileContent = "factid|driver|goal|sourceelementname|sourceelementtype|layersource|targetelementname|targetelementtype|layertarget|isnewelement|facttype|relatontype|action|incoming|outcoming|ratioLinks|mostlinkedlayer|commitlogs|adrlogs|chatlogs\n";

		// *********************************************
		// EXTRACCION DEL NOMBRE DEL PROYECTO Y DEL BOI
		// *********************************************
		String[] arrayP = params.split("&");
		String projectName = arrayP[0];
		String boiName = arrayP[1];

		System.out.println(
				"IdentificationMediator.prepareDatasetToClassify ::: Extraccion del nombre del proyecto -> OK");

		// ************************************
		// INSTANCIACION DEL PROJECT
		// ************************************
		String xml = "";

		// boiModels save the xml routes of the boi models.
		xml = (new APIModelDerby()).get(boiName, projectName);

		// Buscar el Fact
		Resource res = (new CoreModel()).buildModelRebelCore(xml, boiName);
		Project project = (Project) res.getContents().get(0);

		System.out.println("IdentificationMediator.prepareDatasetToClassify ::: Instanciacion del Proyecto -> OK");

		// ************************************
		// RECORRIDO DE FACTS PARA OBTENER LOS TEXTOS A CLASIFICAR
		// Esto no sería necesario por ahora para las causas, porque se seleccionan
		// desde la GUI.
		// Sin embargo, eventualmente será necesario para los artefactos heterogéneos
		// ************************************

		// Se usa el ID del Fact para mapear la clasificacion con el archivo de facts.
		// Se debe manejar por separado del bloque IMPRESION DE FACTS, porque se debe
		// generar el archivo con todos los textos a clasificar. Esto permite velocidad
		// en la clasificacion.

		// Este hashmap se usará para extraer la clasificacion de la justificacion
		// asociada al Fact que se esté recorriendo.
//		HashMap<String, String> listOfTags = null;
//		boolean ex = generacionDatasetClasificacionATDRationale(project); // Generacion del archivo plano para pasarle al clasificador
//		if(ex) {
//			TextClassification tx = new TextClassification("causes");
//			listOfTags = tx.runScriptForUse();
//		}
//		
//		System.out.println("ModelMediator.trainingModel ::: Obtencion de categorias -> OK ");

		// ************************************
		// RECORRIDO DE LOS MODELOS ORIGINALES, PARA PODER TOTALIZAR LAS RELACIONES.
		// NO SE USAN LOS MODELOS DE ARCHIMATE_CORE PORQUE ESOS SOLO TIENEN LOS
		// ELEMENTOS
		// DE INTERÉS.
		// ************************************

		String modelBase = "";

		// ------------------------------
		// Obtener nombre de modelo, para obtener la base

		if (project.getView() != null) {
			for (ArchimateView aView : project.getView()) {
				modelBase = aView.getName();
				break;
			}
		}

		String prefijoBaseModel = obtenerPrefijoNombreModel(modelBase);
		List<Model> archimateModels = (new APIModelDerby()).listArchimateModels(project.getName(), prefijoBaseModel);

		HashMap<String, Integer> hashRelaciones = obtenerVistasConCoincidencias(archimateModels);

		System.out.println(
				"IdentificationMediator.prepareDatasetToClassify ::: Extraccion del total de relaciones  -> OK "
						+ (hashRelaciones != null));

		// ************************************
		// IMPRESION DE FACTS
		// ************************************

		if (project != null) {
			for (BlockOfInterest boi : project.getBlockofinterest()) {

				String driver = boi.getBusiness_driver();
				String goal = boi.getBusiness_goal();

				for (Fact f : boi.getFact()) {

					if (!f.getElementType().equals("Component") && !f.getElementType().equals("Connector")) {

						System.out.println("IdentificationMediator.prepareDatasetToClassify ::: Fact ID -> " + f.getId()
								+ " (" + f.getElementType() + ")");

						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.append(f.getDate().getYear());
						stringBuilder.append("-");
						stringBuilder.append((f.getDate().getMonth() + 1));
						stringBuilder.append("-");
						stringBuilder.append(f.getDate().getDate());
						String fecha = stringBuilder.toString();

						// Guarda el nombre de los elementos de origen y destino en una relación
						String origen = "", destino = "";
						String tipoFact = "";

						// ----------------------------------------
						// SEPARACION DE ELEMENTOS EN RELACION
						// Se separan los elementos cuando se involucra -O)- o -X
						// ----------------------------------------
						if (f.getElementName().contains("->")) {
							String[] elementos = f.getElementName().split(" -> ");
							origen = elementos[0];
							destino = elementos[1];
						} else if (f.getElementName().contains("-X")) {
							String[] elementos = f.getElementName().split("-X");
							origen = elementos[0].trim();
							destino = elementos[1].trim();
						} else if (f.getElementName().contains("-O)-")) {
							String[] elementos = f.getElementName().split("-O");
							origen = elementos[0].trim();
							destino = elementos[1].substring(2).trim();
						} else
							origen = f.getElementName();

						/*
						 * -----------------------------------------
						 * 
						 */
						if (f.getElementType().contains("_"))
							tipoFact = "ELEMENT";
						else
							tipoFact = "RELATION";

						/*
						 * ----------------------------------------- Búsqueda del tipo del elemento de
						 * destino
						 */
						String layerSource = "";
						String layerTarget = "";

						String sourceElementType = "";
						String targetElementType = "";

						if (f.getView() != null) {

							String sourceType = "";
							String targetType = "";

							for (ArchimateView vForTarget : f.getView()) {
								if (vForTarget.getRelation() != null) {
									for (Relation relForTarget : vForTarget.getRelation()) {
										String sourceFT = relForTarget.getSource().getName();
										String targetFT = relForTarget.getTarget().getName();

										if (sourceFT.equals(origen) && targetFT.equals(destino)) {
											targetType = relForTarget.getTarget().getType().getLiteral();
											sourceType = relForTarget.getSource().getType().getLiteral();
										} else if (sourceFT.equals(origen)) {
											sourceType = relForTarget.getSource().getType().getLiteral();
										}
									}
								}
							}

							if (!sourceType.isEmpty()) {
								String[] distroSource = sourceType.split("_");
								layerSource = distroSource[0];
								sourceElementType = distroSource[1];
							}

							if (!targetType.isEmpty()) {
								String[] distroTarget = targetType.split("_");
								layerTarget = distroTarget[0];
								targetElementType = distroTarget[1];
							}

						}

						// ----------------------------------------------------
						// IDENTIFICACION DE NUEVO ELEMENTO
						/*
						 * En este bloque se revisaran los diagramas de archimate para poder establecer
						 * si el elemento target es creado en la version actual, o en una version
						 * anterior.
						 */

						String esNuevoString = "";
						if (tipoFact.equals("RELATION")) {

							if (f.getView() != null && f.getView().size() > 0 && f.getView().get(0) != null) {
								boolean esNuevo = identificarSiTargetEsNuevo(project, destino, f.getDate(),
										f.getView().get(0).getName());
								esNuevoString = String.valueOf(esNuevo);
							}
						}

						/*
						 * ----------------------------------------- En este bloque se extraen las
						 * relaciones anteriores del elemento de interés del Fact.
						 * 
						 * Se decide quitar por ser muy especifico
						 */

//						String previousRelations = findPreviousRelationships(project, origen, f.getDate());

						// ----------------------------------------------------
						// OBTENCION DE TOTAL DE CONEXIONES DE ENTRADA Y SALIDA
						// ----------------------------------------------------

						int incomingLinks = 0;
						int outcomingLinks = 0;
						String mostLinkedLayer = "";
						int allLinks = 0;
						double ratioLinks = 0;

						if (f.getView() != null && f.getView().get(0) != null) {

							if (hashRelaciones
									.get(f.getView().get(0).getName() + "#" + f.getElementName() + "#incoming") != null)
								incomingLinks = hashRelaciones
										.get(f.getView().get(0).getName() + "#" + f.getElementName() + "#incoming");

							if (hashRelaciones.get(
									f.getView().get(0).getName() + "#" + f.getElementName() + "#outcoming") != null)
								outcomingLinks = hashRelaciones
										.get(f.getView().get(0).getName() + "#" + f.getElementName() + "#outcoming");

							if (hashRelaciones.get("allLinks#" + f.getView().get(0).getName()) != null)
								allLinks = hashRelaciones.get("allLinks#" + f.getView().get(0).getName());

							ratioLinks = (double) (incomingLinks + outcomingLinks) / allLinks;
							BigDecimal bd = BigDecimal.valueOf(ratioLinks);
							bd = bd.setScale(2, RoundingMode.HALF_UP);
							ratioLinks = bd.doubleValue();

						}

						APIElementRelations elementRelations = findIncomingAndOutcomingLinks(project, origen,
								f.getDate());
						if (elementRelations != null) {
							mostLinkedLayer = elementRelations.getMostLinkedLayer();
						}

						/*
						 * ----------------------------------------- CONSIDERACIONES - Apoyar la
						 * identificación con el uso de palabras clave de paper de issue trackers del
						 * Brasilero (Using natural language processing to automatically detect
						 * self-admitted technical debt) y otro de Krtuchen (Detecting Technical Debt
						 * through Issue Trackers.) - Permitir la ejecución de varios algortimos en
						 * paralelo para mostrar un promedio de los items candidatos.
						 */

						/*
						 * ----------------------------------------- (1) Si el Fact es de creación de
						 * elemento, entonces su tipo será el tipo del elemento. (2) Si el Fact es de
						 * creación de relación, entonces su tipo será el tipo de relación.
						 * 
						 * Para el caso de (1), lo mejor sería que mostrara vacío, porque el tipo de
						 * elemento ya se muestra en la variable 'sourceType'.
						 */
						String relationType = "";
						if (tipoFact.equals("RELATION")) {
							relationType = f.getElementType();
						}

						// ------------------------------------------------------------------------
						// OBTENCION DE LOS TEXTOS DE COINCIDENCIA EN LOS ARTEFACTOS HETEROGENEOS
						// ------------------------------------------------------------------------

						// Texto de GitHub

						String commitMsgsText = "";
						if (f.getMessage() != null && f.getMessage().size() > 0) {
							for (CommitMessage commitMsg : f.getMessage()) {
								commitMsgsText += procesarTexto(commitMsg.getBody());
							}
						}

						// Texto de ADR

						String adrMsgsText = "";
						if (f.getArchitecturaldecision() != null && f.getArchitecturaldecision().size() > 0) {
							for (Decision adrMsg : f.getArchitecturaldecision()) {
//								System.out.println("ADR Desc: "+adrMsg.getDescription());
								adrMsgsText += adrMsg.getDescription();
//								System.out.println("adrMsgsText: "+adrMsgsText);
							}
						}

//						System.out.println("adrMsgsText = "+adrMsgsText);

						// Texto de Chat/Email

						String chatEmailMsgsText = "";
						if (f.getMessagelogs() != null && f.getMessagelogs().size() > 0) {
							for (MessageLog msgLog : f.getMessagelogs()) {
								if (msgLog.getMsgLogMessages() != null && msgLog.getMsgLogMessages().size() > 0) {
									for (ChatEmailMessage chatEmailMsg : msgLog.getMsgLogMessages()) {
										chatEmailMsgsText += procesarTexto(chatEmailMsg.getText());
									}
								}
							}
						}

						// ----------------------------------------
						// CONSTRUCCION DEL DATASET DE ENTRADA
						// ----------------------------------------

						String separador = "|";

						// String fileContent =
						// "driver,goal,sourceelementname,sourceelementtype,layersource,targetelementname,targetelementtype,layertarget,isnewelement,facttype,relatontype,action,incoming,outcoming,ratioLinks,mostlinkedlayer,atdcause\n";

						fileContent += f.getId() + separador + driver + separador + goal + separador + origen
								+ separador + sourceElementType + separador + layerSource + separador + destino
								+ separador + targetElementType + separador + layerTarget + separador + esNuevoString
								+ separador + tipoFact + separador + relationType + separador + f.getAction()
								+ separador + incomingLinks + separador + outcomingLinks + separador + ratioLinks
								+ separador + mostLinkedLayer + separador + commitMsgsText + separador + adrMsgsText
								+ separador + chatEmailMsgsText + "\n";
					}
				}
			}
		}

		// ************************************
		// TRANSFORMACION Y ESCRITURA DEL DATASET
		// ************************************

		String finalFileContent = "";

		// Transformacion a formato requerido
		finalFileContent = transformsDataset(fileContent);

		// Escritura a archivo.
		String fileName = "facts_prediction_dataset_" + Calendar.getInstance().getTimeInMillis() + ".csv";

		// La ruta esta en la variable DATAFILESFOLDER
		if (writeInputFile(fileName, finalFileContent)) {

			String hora = "" + Calendar.getInstance().get(Calendar.HOUR);
			String minuto = "" + Calendar.getInstance().get(Calendar.MINUTE);
			String segundo = "" + Calendar.getInstance().get(Calendar.SECOND);
			String milisegundo = "" + Calendar.getInstance().get(Calendar.MILLISECOND);

			String time = hora + ":" + minuto + ":" + segundo + "." + milisegundo;

			System.out.println("Service.identifyATDCandidates ::: End java time: " + time);

			resp = "OK";
		}

		return resp;
	}

	private String procesarTexto(String body) {
		String textToLines = "";
		if (body != null) {
			body = body.replaceAll(",", "");
			String[] linesOfText = body.split("(?s).*[\\n\\r].*");
			if (linesOfText.length >= 0) {
				for (String line : linesOfText) {
					textToLines += " " + line;
				}
			} else
				textToLines = body;
		}
		return textToLines;
	}

	private String transformsDataset(String oldDataset) {
		String finalFileContent = "";

		finalFileContent = oldDataset.toLowerCase();

		return finalFileContent;
	}

	private boolean writeInputFile(String fileName, String content) {
		try {
			FileWriter myWriter = new FileWriter(DATAFOLDERFORCLASSIFY + fileName);
			myWriter.write(content);
			myWriter.close();
			System.out.println("ModelMediator.writeInputFile ::: Written file: " + DATAFOLDERFORCLASSIFY + fileName);
			return true;
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Este metodo se encarga de recorrer las vistas de archimate para identificar
	 * si el elemento Target fue creado en la vista donde se estableció la relación,
	 * o si fue creado en una vista anterior. Las vistas se guardar en orden
	 * cronológico, por lo cual, su recorrido se haría de forma secuencial.
	 * 
	 * @param project
	 * @param targetName
	 * @return
	 */
	private boolean identificarSiTargetEsNuevo(Project project, String targetName, Date targetViewDate,
			String archimateViewName) {
		boolean esNuevo = false;
		Date targetDate = null;

		if (!targetName.isEmpty() && targetName.length() > 1) {

			if (!archimateViewName.isEmpty()) {

				// ************************************
				// BLOQUE DE OBTENCION DE OTROS MODELOS
				// ************************************

				// Se extrae la parte inicial del nombre: Layered_20201108. Se extrae "Layered"
				String prenombre = "";
				ArrayList<APIModelElement> listOfViews = null;

				String[] split = archimateViewName.split("_");
				if (split.length > 0) {
					prenombre = split[0];
				}

				// Se obtiene la lista de modelos que coinciden con el nombre del modelo
				if (prenombre.length() > 0) {
					listOfViews = (new APIModelDerby()).obtenerListaDeVistas(project.getName(), prenombre);
				}

				// ************************************
				// BLOQUE DE RECORRIDO DE OTROS MODELOS
				// ************************************

				if (listOfViews != null && listOfViews.size() > 0) {

					for (int t = 0; t < listOfViews.size(); t++) {

						APIModelElement archiModel = listOfViews.get(t);

						Resource resourceModel = null;
						rebel_archimate.Project projectArchimate = null;

						if (targetDate == null) {

							try {
								resourceModel = (new AMModel()).loadResource(archiModel.getXmlroute());
								projectArchimate = (rebel_archimate.Project) resourceModel.getContents().get(0);
							} catch (Exception e) {
								e.printStackTrace();
							}

							if (projectArchimate != null) {
								// Navego la vista para obtener los elementos y sus relaciones
								rebel_archimate.View view = projectArchimate.getView().get(0);

								for (int j = 0; j < view.getElement().size(); j++) {

									rebel_archimate.Element element = view.getElement().get(j);

									if (element.getName().equals(targetName)) {
										targetDate = view.getDate();
										break;
									}
								}
							}
						}
					}
				}

				// ************************************
				// BLOQUE DE IDENTIFICACION DE SI ES NUEVO
				// ************************************
				if (targetDate != null) {

					if (targetDate.compareTo(targetViewDate) == 0)
						esNuevo = true;
				}
			}
		}

		return esNuevo;
	}

	private boolean generacionDatasetClasificacionATDRationale(Project project) {

		boolean exito = false;
		String fileName = "/Users/borisperezg/rebelmodels_storing/datasets_to_classify/text_to_classify_causes.csv";

		if (project != null) {

			FileWriter myWriter = null;

			try {
				File file = new File(fileName);
				if (file.exists())
					file.delete();

				myWriter = new FileWriter(fileName);
			} catch (IOException e) {
				myWriter = null;
				e.printStackTrace();
			}

			if (myWriter != null) {
				String textToWrite = "idfact|text\n";
				for (BlockOfInterest boi : project.getBlockofinterest()) {
					for (Fact f : boi.getFact()) {

						if (f.getAtditem() != null && f.getAtditem().size() > 0) {
							for (ATDItem atdItem : f.getAtditem()) {
								if (atdItem.getRationales() != null && atdItem.getRationales().size() > 0) {
									for (ATDRationale atdRationale : atdItem.getRationales()) {
										textToWrite += f.getId() + "|" + atdRationale.getDescription() + "\n";
									}
								}
							}
						}

					}
				}
				try {
					myWriter.write(textToWrite);
					exito = true;
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						myWriter.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return exito;
	}

	/**
	 * Este metodo se usa para identificar las relaciones entrantes y salientes del
	 * elemento seleccionado en el BOI. Se recorren todos los modelos originales, y
	 * no los generados para visualizar el BOI.
	 * 
	 * @param project
	 * @param sourceElementName
	 * @param sourceElementViewDate
	 * @return
	 */
	private APIElementRelations findIncomingAndOutcomingLinks(Project project, String sourceElementName,
			Date sourceElementViewDate) {

		APIElementRelations elementRelations = null;
		// Recorrer los modelos hasta el directamente anterior

		HashMap<String, Integer> countLayers = new HashMap<String, Integer>();
		countLayers.put("APPLICATION", 0);
		countLayers.put("MOTIVATION", 0);
		countLayers.put("BUSINESS", 0);
		countLayers.put("STRATEGY", 0);
		countLayers.put("TECHNOLOGY", 0);

		String nameMostCitedLayer = "";

		if (project != null) {

			elementRelations = new APIElementRelations();

			for (int i = 0; i < project.getView().size(); i++) {

				ArchimateView view = project.getView().get(i);

				// Comparo la fecha de la vista recorrida con la fecha pasada como parametro.
				// Si son iguales, entonces en esta vista se buscaran las relaciones del
				// elemento
				// de origen.
				if (view.getDate().compareTo(sourceElementViewDate) == 0) {

					// Se declaran los contadores de las relaciones del elemento.
					int incomingLinks = 0;
					int outcomingLinks = 0;
					int allLinks = 0;

					for (int j = 0; j < view.getRelation().size(); j++) {
						Relation relat = view.getRelation().get(j);

						if (relat.getSource().getName().equals(sourceElementName)) {
							incomingLinks++;

							// Se revisa el elemento destino de la relacion.
							// A partir del IF anterior, se evidencia que el elemento origen
							// es el que se recibe como parametro. Por eso se obtiene el tipo
							// de elemento del destino de la relacion.
							String targetElementType = relat.getTarget().getType().getLiteral();
							String[] divideTargetElementType = targetElementType.split("_");
							String layerConnected = divideTargetElementType[0];

							countLayers.put(layerConnected, (countLayers.get(layerConnected) + 1));

						}

						if (relat.getTarget().getName().equals(sourceElementName)) {
							outcomingLinks++;

							// Se revisa el elemento destino de la relacion.
							// A partir del IF anterior, se evidencia que el elemento origen
							// es el que se recibe como parametro. Por eso se obtiene el tipo
							// de elemento del destino de la relacion.
							String sourceElementType = relat.getSource().getType().getLiteral();
							String[] divideSourceElementType = sourceElementType.split("_");
							String layerConnected = divideSourceElementType[0];

							countLayers.put(layerConnected, (countLayers.get(layerConnected) + 1));
						}

						allLinks++;
					}

					elementRelations.setIncomingLinks(incomingLinks);
					elementRelations.setOutcomingLinks(outcomingLinks);
					elementRelations.setAllLinks(allLinks);

					int mostCitedLayer = 0;

					Iterator<Map.Entry<String, Integer>> iterator = countLayers.entrySet().iterator();
					while (iterator.hasNext()) {
						Map.Entry<String, Integer> entry = iterator.next();

						if (entry.getValue() > mostCitedLayer) {
							mostCitedLayer = entry.getValue();
							nameMostCitedLayer = entry.getKey();
						}
					}

					elementRelations.setMostLinkedLayer(nameMostCitedLayer);

					break;
				}
			}
		}

		return elementRelations;
	}

	private String obtenerPrefijoNombreModel(String baseModel) {
		String prefijo = "";

		prefijo = baseModel.substring(0, baseModel.indexOf("_"));

		return prefijo;
	}

	private HashMap<String, Integer> obtenerVistasConCoincidencias(List<Model> archimateModels) throws Exception {

		HashMap<String, Integer> totalRelaciones = new HashMap<String, Integer>();

		if (archimateModels != null && archimateModels.size() > 0) {
			for (int t = 0; t < archimateModels.size(); t++) {
				Model archiModel = archimateModels.get(t);

				Resource resourceModel = (new AMModel()).loadResource(archiModel.getRute());

				// Se guarda un modelo por proyecto
				rebel_archimate.Project projectArchimate = (rebel_archimate.Project) resourceModel.getContents().get(0);

				if (projectArchimate != null) {
					// Navego la vista para obtener los elementos y sus relaciones
					rebel_archimate.View vistaArchi = projectArchimate.getView().get(0);

					if (vistaArchi != null) {

						// Se obtiene el total de relaciones
						if (vistaArchi.getRelation() != null) {
							totalRelaciones.put("allLinks#" + archiModel.getName(), vistaArchi.getRelation().size());

							for (rebel_archimate.Relation relation : vistaArchi.getRelation()) {
								String origen = relation.getSource().getName();
								String destino = relation.getTarget().getName();

								// ---------------
								// Adicionar origen
								// ---------------

								if (totalRelaciones.get(archiModel.getName() + "#" + origen + "#outcoming") == null) {
									totalRelaciones.put(archiModel.getName() + "#" + origen + "#outcoming", 1);
								} else {
									int val = totalRelaciones.get(archiModel.getName() + "#" + origen + "#outcoming");
									totalRelaciones.put(archiModel.getName() + "#" + origen + "#outcoming", val + 1);
								}

								// ---------------
								// Adicionar destino
								// ---------------

								if (totalRelaciones.get(archiModel.getName() + "#" + destino + "#incoming") == null) {
									totalRelaciones.put(archiModel.getName() + "#" + destino + "#incoming", 1);
								} else {
									int val = totalRelaciones.get(archiModel.getName() + "#" + destino + "#incoming");
									totalRelaciones.put(archiModel.getName() + "#" + destino + "#incoming", val + 1);
								}
							}
						}
					}
				}
			}
		}

		return totalRelaciones;
	}

	public ATDItemBO getATDItemData(String params) {
		
		ATDItemBO itemBO = null;
		
		String[] arrayP = params.split("&");
		String projectName = arrayP[0];
		String boiName = arrayP[1];
		String factId = arrayP[2];

		// ************************************
		// INSTANCIACION DEL PROJECT
		// ************************************
		String xml = "";

		// boiModels save the xml routes of the boi models.
		xml = (new APIModelDerby()).get(boiName, projectName);

		// Buscar el Fact
		Resource res = null;
		try {
			res = (new CoreModel()).buildModelRebelCore(xml, boiName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Project project = (Project) res.getContents().get(0);
		
		if (project != null) {
			for (BlockOfInterest boi : project.getBlockofinterest()) {

				for (Fact f : boi.getFact()) {
					
					if(f.getId().equals(factId)) {
						
						if(f.getAtditem()!=null && f.getAtditem().size()>0) {
						
							ATDItem atdItem = f.getAtditem().get(0);
							if(atdItem!=null) {
						
								String rationale = (atdItem.getRationales()!=null && atdItem.getRationales().size()>0)?atdItem.getRationales().get(0).getDescription():"";
								String benefit = (atdItem.getBenefits()!=null && atdItem.getBenefits().size()>0)?atdItem.getBenefits().get(0).getDescription():"";
								
								String type = atdItem.getType();
								String compromisedQA = atdItem.getCompromisedQA();
								
								itemBO = new ATDItemBO();
								itemBO.setType(type);
								itemBO.setCompromisedQA(compromisedQA);
								itemBO.setRationale(rationale);
								itemBO.setBenefit(benefit);
							}
						}
					}
				}
			}
		}
		
		return itemBO;
	}

}
