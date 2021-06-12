package uniandes.rebelapi.mediator;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import co.edu.uniandes.rebel.architecturaldecisions.PopulationADR;
import rebel_architecturaldecisions.Decision;
import rebel_core.ArchimateView;
import rebel_core.BlockOfInterest;
import rebel_core.Fact;
import rebel_core.Project;
import rebel_core.Relation;
import uniandes.rebel.archimate.Processing;
import uniandes.rebel.cc.drawio.PopulationDraw;
import uniandes.rebel.chatlogs.CEPopulation;
import uniandes.rebel.core.model.CoreModel;
import uniandes.rebel.github.GHPopulation;
import uniandes.rebelapi.bo.APIArchitecturalDecision;
import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.bo.APIElement;
import uniandes.rebelapi.bo.APIFact;
import uniandes.rebelapi.bo.APIModelElement;
import uniandes.rebelapi.bo.APIView;
import uniandes.rebelapi.bo.Model;
import uniandes.rebelapi.db.APIModelDerby;
import uniandes.rebelapi.util.ModelFiltering;
import uniandes.rebelapi.util.RebelCoreJSONGenerator;
import uniandes.rebelapi.util.Util;

public class ModelMediator {

	final String DATAFILESFOLDER = "/Users/borisperezg/rebel/InputDataFiles/";
	
	public String buildAndStoreXMI(String project, String artifactType, String fileName) {
		String resp = "";

		try {

			System.out.println("artifactType = "+artifactType);
			
			// Separar por el tipo de artefacto
			if (artifactType.equals("ccm")) {
				PopulationDraw pd = new PopulationDraw();
				pd.execute(project, fileName);
				resp = "OK";
			} else if (artifactType.equals("adrs")) {
				PopulationADR pd = new PopulationADR();
				pd.execute(project, fileName);
				resp = "OK";
			} else if (artifactType.equals("commitlogs")) {
				System.out.println("Commit logs - entering");
				GHPopulation pd = new GHPopulation();
				pd.execute(project, fileName);
				resp = "OK";
				System.out.println("Commit logs - entering - OK");
			} else if (artifactType.equals("archi")) {

				// Procesarlo para cargarlo (llamar a Processing.execute)
				boolean exito = (new Processing()).execute(project, fileName);
				// La conversion a xml se hace al final del processing.
				// Se hace así porque se debe generar un xml por cada vista.
				if (exito)
					resp = "OK";
			} else if(artifactType.equals("chatlogs")) {
				(new CEPopulation()).execute(project, fileName);
				resp = "OK";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Llamar el population correspondiente

		return resp;
	}

	public List<APIArchitecturalDecision> listArchitecturalDecisions(String projectName) {
		List<APIArchitecturalDecision> resp = new ArrayList<APIArchitecturalDecision>();

		Document input = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			// Obtener el xml
			List<Model> admodels = (new APIModelDerby()).listArchitecturalDecisions(projectName);

			for (Model ad : admodels) {

				File f2 = new File(ad.getRute());

				DocumentBuilder builder = factory.newDocumentBuilder();
				input = builder.parse(f2);

				// ***************************************************************
				// architectural decisions
				// ***************************************************************

				NodeList cellNodes = input.getElementsByTagName("decisions");

				for (int i = 0; i < cellNodes.getLength(); i++) {
					Element e = (Element) cellNodes.item(i);
					resp.add(new APIArchitecturalDecision(e.getAttribute("number"), e.getAttribute("title")));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resp;
	}

	public List<APIModelElement> listModelElements(String params) {
		List<APIModelElement> finalList = null;

		String[] vars = params.split("&");
		String projectName = vars[0];
		String modelType = vars[1];
		String modelName = vars[2]; // llega de la forma: bus-to-app_v3

		// Obtiene la parte del nombre que corresponde.
		String shortModelName = modelName.substring(0, modelName.indexOf("_"));

		if (modelType.equals("arc")) {
			finalList = listModelElementsArchi(projectName, shortModelName);
		} else if (modelType.equals("cnc"))
			finalList = listModelElementsCnC(projectName);

		return finalList;
	}

	/**
	 * Este metodo se encarga de listar todos los elementos de los modelos de
	 * archimate de un proyecto. Es importante tener en cuenta que solo se listan
	 * los elementos encontrados en modelos con el mismo nombre aunque diferente
	 * versión.
	 * 
	 * @param projectName
	 * @param modelName   Este es el nombre base con el cual se buscarán los
	 *                    elementos en los demás modelos. Si el modelo se llama
	 *                    bus-to-app_v2, entonces se buscarán los elementos en todos
	 *                    los modelos que se llamen 'bus-to-app'. Es importante que
	 *                    el nombre del modelo no use el _ dentro del nombre.
	 * @return
	 */
	public List<APIModelElement> listModelElementsArchi(String projectName, String modelName) {
		Set<APIModelElement> resp = new HashSet<APIModelElement>();

		Document input = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			// Listar todos los modelos que sean del proyecto y que sean de tipo
			// functionalview
			List<Model> modelsList = (new APIModelDerby()).listXMLRute(projectName, "archimate", modelName);

			for (Model m : modelsList) {

				// Obtener la ruta del xml
				String xmlRute = m.getRute();

				File f2 = new File(xmlRute);

				DocumentBuilder builder = factory.newDocumentBuilder();
				input = builder.parse(f2);

				// ***************************************************************
				// ELEMENTS
				// ***************************************************************

				NodeList cellNodes = input.getElementsByTagName("element");

				for (int i = 0; i < cellNodes.getLength(); i++) {
					Element e = (Element) cellNodes.item(i);
					resp.add(new APIModelElement(e.getAttribute("name"), e.getAttribute("type")));
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ********************************
		List<APIModelElement> finalList = new ArrayList<APIModelElement>();
		if (resp.size() > 0) {

			Iterator<APIModelElement> i = resp.iterator();
			int ite = 0;
			while (i.hasNext()) {

				APIModelElement val = i.next();
				String nameVal = val.getName();

				if (ite == 0) {
					finalList.add(val);
					ite++;
				} else {
					boolean found = false;
					for (int t = 0; t < finalList.size(); t++) {
						APIModelElement listVal = finalList.get(t);
						String nameListVal = listVal.getName();

//	            		System.out.println("'"+nameVal + "' compareTo '"+nameListVal+"' = "+nameVal.compareTo(nameListVal));

						if (nameVal.compareTo(nameListVal) < 0) {
							finalList.add(t, val);
							found = true;
							break;
						}
					}
					if (!found)
						finalList.add(val);
				}
			}

//	        System.out.println("finalList.size = " + finalList.size());

		}

		return finalList;
	}

	/**
	 * Este metodo se encarga de listar todos los componentes y conectos de los
	 * modelos relacionados a un proyecto.
	 * 
	 * @param params
	 * @return
	 */
	public List<APIModelElement> listModelElementsCnC(String projectName) {

		Set<APIModelElement> resp = new HashSet<APIModelElement>();

		Document input = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			// Listar todos los modelos que sean del proyecto y que sean de tipo
			// functionalview
			List<Model> modelsList = (new APIModelDerby()).listXMLRute(projectName, "functionalview");

			for (Model m : modelsList) {

				// Obtener la ruta del xml
				String xmlRute = m.getRute();

				File f2 = new File(xmlRute);

				DocumentBuilder builder = factory.newDocumentBuilder();
				input = builder.parse(f2);

				// ***************************************************************
				// COMPONENTS
				// ***************************************************************

				NodeList cellNodes = input.getElementsByTagName("components");

				for (int i = 0; i < cellNodes.getLength(); i++) {
					Element e = (Element) cellNodes.item(i);
					resp.add(new APIModelElement(e.getAttribute("name"), "Component"));
				}

				// ***************************************************************
				// CONNECTORS
				// ***************************************************************

				cellNodes = input.getElementsByTagName("connectors");

				for (int i = 0; i < cellNodes.getLength(); i++) {
					Element e = (Element) cellNodes.item(i);
					resp.add(new APIModelElement(e.getAttribute("name"), "Connector"));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// ********************************

		List<APIModelElement> finalList = new ArrayList<APIModelElement>();
		if (resp.size() > 0)
			finalList.addAll(resp);

		return finalList;
	}

	public void updateElementsPosition(String filtro) {
		// ccmodel?con2&231@202?con1&146@236?DataAccess&85@31?MaterialLoan&413@31?MaterialReturn&248@31

		String[] elements = filtro.split("\\+");
		String modelName = elements[0];

		Document input = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			// Obtener el xml
			String xmlRute = (new APIModelDerby()).get(modelName);

			File f2 = new File(xmlRute);

			DocumentBuilder builder = factory.newDocumentBuilder();
			input = builder.parse(f2);

			// ***************************************************************
			// COMPONENTS
			// ***************************************************************

			NodeList cellNodes = input.getElementsByTagName("components");

			// Por cada elemento, se hace esto

			for (int t = 1; t < elements.length; t++) {
				String element = elements[t];

				String[] elementStructure = element.split("&");

				String elementName = elementStructure[0];
				String position = elementStructure[1];

				String[] positionDecomposed = position.split("@");

				String posX = positionDecomposed[0];
				String posY = positionDecomposed[1];

				for (int i = 0; i < cellNodes.getLength(); i++) {
					Element e = (Element) cellNodes.item(i);
					if (e.getAttribute("name").equals(elementName)) {
						e.setAttribute("posX", posX);
						e.setAttribute("posY", posY);
						break;
					}
				}

			}

			// ***************************************************************
			// CONNECTORS
			// ***************************************************************

			cellNodes = input.getElementsByTagName("connectors");

			// Por cada elemento, se hace esto

			for (int t = 1; t < elements.length; t++) {
				String element = elements[t];

				String[] elementStructure = element.split("&");

				String elementName = elementStructure[0];
				String position = elementStructure[1];

				String[] positionDecomposed = position.split("@");

				String posX = positionDecomposed[0];
				String posY = positionDecomposed[1];

				for (int i = 0; i < cellNodes.getLength(); i++) {
					Element e = (Element) cellNodes.item(i);
					if (e.getAttribute("name").equals(elementName)) {
						e.setAttribute("posX", posX);
						e.setAttribute("posY", posY);
						break;
					}
				}
			}

			DOMSource source = new DOMSource(input);

			StreamResult result = new StreamResult(f2);

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			transformer.transform(source, result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	public static void main(String[] args) {
//		(new ModelMediator()).buildTimeLine("chiper&first");
//	}

	public List<APIFact> listFacts(String params) throws Exception {
		List<APIFact> list = null;

		String[] arrayP = params.split("&");

		String projectName = arrayP[0];
		String boiName = arrayP[1];

		String xml = "";

		// boiModels save the xml routes of the boi models.
		xml = (new APIModelDerby()).get(boiName, projectName);

		// Lo transforma en json
		list = (new RebelCoreJSONGenerator()).buildListOfFacts(xml, boiName);

		return list;
	}

	/**
	 * 
	 * @param params projectname&bioname
	 * @return
	 * @throws Exception
	 */
	public String buildTimeLine(String params) throws Exception {
		String resp = null;

		if (params != null) {

			String[] arrayP = params.split("&");

			String projectName = arrayP[0];
			String boiName = arrayP[1];

			String xml = "";

			// boiModels save the xml routes of the boi models.
			xml = (new APIModelDerby()).get(boiName, projectName);

			// Lo transforma en json
			RebelCoreJSONGenerator c = new RebelCoreJSONGenerator();
			resp = c.buildJSONForTimeline(xml, boiName);

		}

		return resp;
	}

	/**
	 * Este metodo se usa para cargar los modelos de Archi historicos en la
	 * visualizacion de los Facts.
	 * 
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public String buildBOIDiagramArchi(String params) throws Exception {
		return null;
	}

	public String buildBOIDiagram(String params) throws Exception {
		String resp = null;

		if (params != null) {

			String[] arrayP = params.split("&");

			// Valida que se vaya a cargar el BOI por primera vez. Buscando y mostrando
			// el FV mas reciente
			if (arrayP.length == 2) {

				String projectName = arrayP[0];
				String boiName = arrayP[1];

				String xml = "";

				xml = (new APIModelDerby()).get(boiName, projectName);

				// Lo transforma en json
				RebelCoreJSONGenerator c = new RebelCoreJSONGenerator();
				resp = c.buildJSONForJoint(xml, boiName);

				// Cuando vienen tres parametros, es porque se manda a cargar un FV historico
				// como parte del BOI. Esta parte se ejecuta desde un llamado de una entrada del
				// Timeline
			} else if (arrayP.length == 3) {

				String projectName = arrayP[0];
				String boiName = arrayP[1];
				String functionalView = arrayP[2];

				String xml = "";
				xml = (new APIModelDerby()).get(boiName, projectName);

				// Lo transforma en json
				RebelCoreJSONGenerator c = new RebelCoreJSONGenerator();
				resp = c.buildJSONForJoint(xml, boiName, functionalView);

			}

		}

		return resp;
	}

	public String buildBOITable(String params) throws Exception {
		String resp = null;

		if (params != null) {

//			System.out.println("Params = "+params);
			
			String[] arrayP = params.split("&");

			String projectName = arrayP[0];
			String boiName = arrayP[1];
			String factId = arrayP[2];

			String xml = "";

			xml = (new APIModelDerby()).get(boiName, projectName);

			// Lo transforma en json
			RebelCoreJSONGenerator c = new RebelCoreJSONGenerator();
			resp = c.buildHTMLForTable(xml, boiName, factId);

		}

		return resp;
	}

	/**
	 * Lista todos los BOI donde se encuentre coincidencia con el nombre del
	 * elemento arquitectural pasado como parámetro
	 * 
	 * @param params Los parametros vienen sin letra, el primero es el proyecto, el
	 *               segundo es el nombre del elemento
	 * @return
	 * @throws Exception
	 */
	public List<APIBOI> listBOIWithElement(String params) throws Exception {

		List<APIBOI> list = new ArrayList<APIBOI>();

		// 1. Obtener el nombre del proyecto y el nombre del elemento
		String[] arrayP = params.split("&");

		String projectName = arrayP[0];
		String elementName = arrayP[1];

		// 2. Listar todos los BOIs que correspondan a ese proyecto
		List<APIBOI> tempList = (new APIModelDerby()).listBOIs(projectName);

		// 3. Usando la ruta, instancio cada BOI
		if (tempList != null) {
			for (APIBOI boi : tempList) {

				Resource res = (new CoreModel()).buildModelRebelCore(boi.getUrl(), boi.getName());
				Project rebelcore_Project = (Project) res.getContents().get(0);

				// 4. Consulto en la clase Fact por el atributo "elementName"
				for (BlockOfInterest rebelcore_boi : rebelcore_Project.getBlockofinterest()) {
					for (Fact rebelcore_fact : rebelcore_boi.getFact()) {
						if (rebelcore_fact.getElementName().toUpperCase().contains(elementName.toUpperCase())) {

							int total = (new RebelCoreJSONGenerator()).countArchitecturalElementsByName(boi.getUrl(),
									boi.getName());
							list.add(new APIBOI("seeboi.html?p=" + projectName + "&boi=" + boi.getName(), boi.getName(),
									total));
						}
					}
				}
			}
		}

		return list;
	}

	public List<APIBOI> listBOIs(String projectName) throws Exception {

		List<APIBOI> list = null;

		APIModelDerby pd = new APIModelDerby();
		List<Model> listBOIs = pd.listByName(projectName);

		list = new ArrayList<APIBOI>();

		if (listBOIs != null && listBOIs.size() > 0) {

			for (Model boi : listBOIs) {
				int total = (new RebelCoreJSONGenerator()).countArchitecturalElementsByName(boi.getRute(),
						boi.getName());

				// ==================================================================
				// INSTANCIACION DEL BOI PARA OBTENER LA VISTA MAS RECIENTE
				// ==================================================================

				String lastModelName = "";

				CoreModel core = new CoreModel();
				Resource res = core.loadResource(boi.getRute());
				if (res != null) {
					rebel_core.Project coreProject = (rebel_core.Project) res.getContents().get(0);
					if (coreProject != null) {
						if (coreProject.getView() != null && coreProject.getView().size() > 0) {
							lastModelName = coreProject.getView().get(coreProject.getView().size() - 1).getName();
						}
					}
				}

				// ==================================================================
				// LISTA DE PARAMETROS
				// ==================================================================

				String params = "p=" + boi.getProjectName() + "&boi=" + boi.getName() + "&mn=" + lastModelName;

				// ==================================================================
				// CONFIGURACION DEL ICONO
				// ==================================================================

				String syncIcon = "";
				if (boi.getSyncState() != null) {
					if (boi.getSyncState().equals("SEARCHING"))
						syncIcon = "syncprogressicon.png";
					else if (boi.getSyncState().equals("DONE"))
						syncIcon = "syncdoneicon.png";
				} else {
					syncIcon = "editicon.png";
				}

				list.add(new APIBOI("seeboi.html?" + params, boi.getName(), total, "linkfactstoadrs.html?" + params,
						syncIcon, boi.getId()));

			}
		}

		return list;
	}

	public List<APIModelElement> listArtifactsProject(String projectName) throws Exception {

		List<APIModelElement> list = (new APIModelDerby()).listAllArtifacts(projectName);

		return list;
	}

//	public String findRelationshipsBySimilarity(String boiName) {
//
//		// 1. Utilizo el boi para encontrar los elementos arquitecturales. Cada uno de
//		// estos tiene una asociación a un Fact.
//
//		// 2. Para cada elemento arquitectural (después completo)
//
//		String architecturalElement = "Payment";
//		String[] sentences = { "We have to change the payment component to a queue mechanism",
//				"It was better to remove the dependencies for the payment and increase its throughput" };
//
//		// Se debe descomponer cada sentencia en sus palabras, y hacer la comparación
//		// palabra por palabra.
//		// Si dentro de esa sentencia se encuentra una coincidencia alta, entonces se
//		// toma toda la frase.
//
//		SemanticSimilarityExec exec = null; //new SemanticSimilarityExec();
//
//		for (String sentence : sentences) {
//			System.out.println("ModelMediator.findRelationshipsBySimilarity ::: sentence = " + sentence);
//			try {
////				System.out.println(exec.sentenceHasSimilarities(architecturalElement, sentence));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		return "OK";
//	}

	/**
	 * Este método se encarga de establecer la asociación entre un Fact y una
	 * Decisión de arquitectura.
	 * 
	 * @param params projectname@boiname & idfact@idadr & idfact@idadr &
	 *               idfact@idadr
	 * @return OK | NOK
	 */
	public List<APIFact> setLinkFactToADR(String params) throws Exception {

//		System.out.println("ModelMediator.setLinkFactToADR ::: params = "+params);

		List<APIFact> resp = null;

		String projectName = "", boiName = "";

		// Descomposion de los parametros
		String[] arrayParams = params.split("&");
		if (arrayParams.length > 0) {
			String projectAndBOI = arrayParams[0];

			String[] arrayProjectAndBOI = projectAndBOI.split("@");
			if (arrayProjectAndBOI.length == 2) {
				projectName = arrayProjectAndBOI[0];
				boiName = arrayProjectAndBOI[1];
			} else {
				throw new Exception("No fueron recibidos el nombre del proyecto y el nombre del bloque de interes");
			}

		}

		// Traer el modelo BOI usando el nombre del proyecto y el nombre del BOI
		APIBOI boiBD = (new APIModelDerby()).getBOI(projectName, boiName);

		CoreModel core = new CoreModel();

		Resource res = core.buildModelRebelCore(boiBD.getUrl(), boiBD.getName());
		Project boiProject = (Project) res.getContents().get(0);

		// 1. Traer todos los modelos de los ADRs. Cargar cada modelo y almacenarlo en
		// un HashMap

		// 1.1 Consultar en la BD
		List<Model> listADR = (new APIModelDerby()).listArchitecturalDecisions(projectName);

		HashMap<String, rebel_core.Decision> mapADRs = new HashMap<String, rebel_core.Decision>();

		// 1.2 Crear el objeto Decision
		if (listADR != null) {
			for (Model modelADR : listADR) {
				String modelName = modelADR.getName();
				String modelRoute = modelADR.getRute();

				rebel_architecturaldecisions.Project projADR = Util.buildModelRebelArchitecturalDecisions(modelRoute,
						modelName);
				Decision decisionADR = projADR.getDecisions().get(0);
				if (decisionADR != null) {
					rebel_core.Decision temporalDec = ModelFiltering.getRebelDecision(core, decisionADR);
					mapADRs.put(modelName, temporalDec);
					// Add to Project
					boiProject.getDecisions().add(temporalDec);
				}
			}
		}

		if (boiProject != null) {
			// Solo existirá una. Cada BOI se crea como un archivo, así sean varias para el
			// mismo proyecto.
			for (BlockOfInterest boi : boiProject.getBlockofinterest()) {
				if (boi.getFact() != null) {
					for (Fact fact : boi.getFact()) {
						// Buscar este ID en la lista que llegó como parametros
						String idFact = fact.getId();

						if (arrayParams.length > 1) {
							for (int i = 1; i < arrayParams.length; i++) {
								String idFactIdADRPair = arrayParams[i];
								String[] arrayidFactIdADRPair = idFactIdADRPair.split("@");
								if (arrayidFactIdADRPair.length == 2) {
									String idFactByParam = arrayidFactIdADRPair[0];
									String idADRByParam = arrayidFactIdADRPair[1];

//									System.out.println("ModelMediator.setLinkFactToADR ::: idFactByParam = "+idFactByParam+" -- idFact = "+idFact);

									if (idFact.equals(idFactByParam)) {
//										System.out.println("ModelMediator.setLinkFactToADR ::: Entering last IFs");

										rebel_core.Decision decADR = mapADRs.get(idADRByParam);

										if (decADR != null) {

											fact.getArchitecturaldecision().add(decADR);
											break;
										}
									}
								}
							}
						}
					}
				}
			}
			res.save(Collections.EMPTY_MAP);

			String params2 = projectName + "&" + boiName;
			resp = listFacts(params2);
//			System.out.println("ModelMediator.setLinkFactToADR ::: Updated model");
		}

		return resp;
	}

	/**
	 * 
	 * @param params projectName & boiName & idAD & idFact -- Spaces added for
	 *               readibility
	 * @return
	 */
	public List<APIFact> removeADToFact(String params) throws Exception {
		List<APIFact> list = null;

		String[] arrayP = params.split("&");

		String projectName = arrayP[0];
		String boiName = arrayP[1];
		String idAD = arrayP[2];
		String idFact = arrayP[3];

		String xml = "";

		// boiModels save the xml routes of the boi models.
		xml = (new APIModelDerby()).get(boiName, projectName);

		// Buscar el Fact
		Resource res = (new CoreModel()).buildModelRebelCore(xml, boiName);
		Project project = (Project) res.getContents().get(0);

		if (project != null) {
			for (BlockOfInterest boi : project.getBlockofinterest()) {

				for (Fact f : boi.getFact()) {
//					System.out.println("f.getId() = "+f.getId()+" - idFact = "+idFact);
					if (f.getId().equals(idFact)) {
						// Sacar la lista de ADs y Buscar el idAD
						EList<rebel_core.Decision> decisions = f.getArchitecturaldecision();
						if (decisions != null) {
							for (int i = 0; i < decisions.size(); i++) {
								rebel_core.Decision dec = decisions.get(i);
//								System.out.println("dec.getNumber() = "+dec.getNumber()+" - idAD = "+idAD);
								if (dec.getNumber().equals(idAD)) {
									decisions.remove(i);
//									f.getArchitecturaldecision().clear();
//									f.getArchitecturaldecision().addAll(decisions);
									res.save(Collections.EMPTY_MAP);
//									System.out.println("Encontro y borro");
									break;
								}
							}
						}
					}
				}
			}
		}

		// Realizando
		list = listFacts(params);

		return list;
	}

	public List<APIView> listBOIViews(String params) throws Exception {

		List<APIView> resp = null;
		ArrayList<APIView> finalOrderedList = null;

		// *********************************************
		// EXTRACCION DEL NOMBRE DEL PROYECTO Y DEL BOI
		// *********************************************
		String[] arrayP = params.split("&");
		String projectName = arrayP[0];
		String boiName = arrayP[1];

		// ************************************
		// GENERACION DEL XML
		// ************************************
		String xml = "";

		// boiModels save the xml routes of the boi models.
		xml = (new APIModelDerby()).get(boiName, projectName);

		// Buscar el Fact
		Resource res = (new CoreModel()).buildModelRebelCore(xml, boiName);
		Project project = (Project) res.getContents().get(0);

		HashSet<String> hs = new HashSet<String>();

		if (project != null) {
			for (BlockOfInterest boi : project.getBlockofinterest()) {
				for (Fact f : boi.getFact()) {
					for (ArchimateView av : f.getView()) {
						hs.add(av.getName());
					}
				}
			}

			ArrayList<String> orderedList = new ArrayList<String>();
			finalOrderedList = new ArrayList<APIView>();

			// ************************************
			// LLENADO DE LA LISTA PARA RETORNAR
			// ************************************
			if (hs.size() > 0) {
				resp = new ArrayList<APIView>();
				for (String name : hs) {

					String id = name.substring(name.indexOf("_") + 1);
					resp.add(new APIView(id, name));
					orderedList.add(id);
				}
				// Se recorre la lista para ordenarla
				if (resp.size() > 0) {
					Collections.sort(orderedList, Collections.reverseOrder());

					for (int t = 0; t < orderedList.size(); t++) {
						String id = orderedList.get(t);

						for (int u = 0; u < resp.size(); u++) {
							APIView lastView = resp.get(u);
							if (lastView.getId().equals(id)) {
								finalOrderedList.add(lastView);
								break;
							}
						}
					}
				}
			}
		}

		return finalOrderedList;
	}

	public List<APIElement> listBOIElements(String params) throws Exception {
		List<APIElement> resp = null;
		ArrayList<APIElement> finalOrderedList = null;

		// *********************************************
		// EXTRACCION DEL NOMBRE DEL PROYECTO Y DEL BOI
		// *********************************************
		String[] arrayP = params.split("&");
		String projectName = arrayP[0];
		String boiName = arrayP[1];

		// ************************************
		// GENERACION DEL XML
		// ************************************
		String xml = "";

		// boiModels save the xml routes of the boi models.
		xml = (new APIModelDerby()).get(boiName, projectName);

		// Buscar el Fact
		Resource res = (new CoreModel()).buildModelRebelCore(xml, boiName);
		Project project = (Project) res.getContents().get(0);

		HashSet<String> hs = new HashSet<String>();

		if (project != null) {
			for (BlockOfInterest boi : project.getBlockofinterest()) {
				for (Fact f : boi.getFact()) {
					for (ArchimateView av : f.getView()) {
						for (rebel_core.Element boiElement : av.getElement()) {
							if (boiElement.isBoiElement())
								hs.add(boiElement.getName());
						}
					}
				}
			}

			ArrayList<String> orderedList = new ArrayList<String>();
			finalOrderedList = new ArrayList<APIElement>();

			// ************************************
			// LLENADO DE LA LISTA PARA RETORNAR
			// ************************************
			if (hs.size() > 0) {
				resp = new ArrayList<APIElement>();
				for (String name : hs) {

					resp.add(new APIElement(name, name));
					orderedList.add(name);
				}
				// Se recorre la lista para ordenarla
				if (resp.size() > 0) {
					Collections.sort(orderedList, Collections.reverseOrder());

					for (int t = 0; t < orderedList.size(); t++) {
						String id = orderedList.get(t);

						for (int u = 0; u < resp.size(); u++) {
							APIElement lastView = resp.get(u);
							if (lastView.getId().equals(id)) {
								finalOrderedList.add(lastView);
								break;
							}
						}
					}
				}
			}
		}

		return finalOrderedList;
	}

	
	
	
//	private boolean identificarSiTargetEsNuevo(Project project, String targetName, Date targetViewDate) {
//		boolean esNuevo = false;
//		Date targetDate = null;
//		
//		System.out.println("--------");
//		System.out.println("targetName = "+targetName);
//		
//		if(project!=null) {
//			for (int i = 0; i < project.getView().size(); i++) {
//				
//				// Mientras no se haya encontrado la fecha del elemento de destino
//				if(targetDate==null) {
//				
//					ArchimateView view = project.getView().get(i);
//					Date viewDate = view.getDate();
//					
//					System.out.println("*******");
//					System.out.println("Archimate name = "+view.getName());
//					System.out.println("Archimate viewDate = "+viewDate);
//					
//					// Se recorren todos los elementos para encontrar el target.
//					if(view!=null) {
//						for (int j = 0; j < view.getElement().size(); j++) {
//							
//							rebel_core.Element element = view.getElement().get(j);
//							
//							if(element.getName().equals(targetName)) {
//								targetDate = viewDate;
//								break;
//							}
//						}
//					}					
//				}				
//			}
//			
//			if(targetDate!=null) {
//				
//				
//				System.out.println("targetDate = "+targetDate);
//				System.out.println("targetViewDate = "+targetViewDate);
//				
//				if(targetDate.compareTo(targetViewDate)==0)
//					esNuevo = true;
//			}
//			
//		}
//		
//		return esNuevo;
//	}
	
	/**
	 * Busca en el modelo anterior (por fecha) las relaciones del elemento de interés pasado como
	 * parámetro. Obtiene los nombres de los elementos relacionados, el tipo de relación y el tipo
	 * de elemento. Se construye una cadena de la forma "nombres elementos, tipo elementos, relaciones elementos".
	 * La idea es concatenar este resultado a la cadena que se está construyendo. Serían tres columnas 
	 * a agregar.
	 * @param sourceElementName
	 * @param sourceElementViewDate
	 * @return
	 */
	private String findPreviousRelationships(Project project, String sourceElementName, Date sourceElementViewDate) {
		String previousRelationships = "";
		
		String names = "";
		String types = "";
		String relationTypes = "";
		
		// Recorrer los modelos hasta el directamente anterior
		
		if(project!=null) {
			for (int i = 0; i < project.getView().size(); i++) {
				
				ArchimateView view = project.getView().get(i);
				ArchimateView nextView;
				
				// Obtengo el view siguiente para ver si este (view) es el directamente anterior
				if(i+1<project.getView().size() && project.getView().get(i+1)!=null) {
					nextView = project.getView().get(i+1);
					
					if(nextView.getDate().compareTo(sourceElementViewDate)==0) {
						// Significa que son iguales. Es decir, (view) sería la vista
						// directamente anterior, y por tanto es esta la que necesitamos
						// para encontrar las relaciones del elemento.
						
						for (int j = 0; j < view.getRelation().size(); j++) {
							
							Relation relat = view.getRelation().get(j);
							
							rebel_core.Element objectRelation = null;
							
							// Relaciones como origen
							if(relat.getSource().getName().equals(sourceElementName)) {
								
								objectRelation = relat.getTarget();
								
							// Relaciones como destino
							}else if(relat.getTarget().getName().equals(sourceElementName)) {
								
								objectRelation = relat.getSource();
								
							} 
							
							if(objectRelation!=null) {
								names += objectRelation.getName() + " ";
								types += objectRelation.getType().getName() + " ";
								relationTypes += relat.getType().getName() + " ";
							}
							
						}						
						
						break;
					}
				
				}
				
			}
			
			previousRelationships = names + "," + types + "," + relationTypes;
			
		}
		
		return previousRelationships;
	}

	/**
	 * Este metodo se encarga de buscar todos los Facts de un proyecto, que estén identificados
	 * como extraidos de un diagrama de componente y conector.
	 * Esta lista se muestra al momento de justificar un caso de ATD en Archimate.
	 * @param params p=XX&b=YY Se espera el nombre del proyecto y el nombre del boi
	 * @return
	 */
	public List<APIFact> listFactsFromComponentAndConnectorsDiagram(String params) throws Exception {
		
		List<APIFact> list = null;
		
		// *********************************************
		// EXTRACCION DEL NOMBRE DEL PROYECTO Y DEL BOI
		// *********************************************
		
		String[] arrayP = params.split("&");
		
		// For Project
		String projectName = "";
		String projectNameTemp = arrayP[0];
		String[] arrayPP = projectNameTemp.split("=");
		if(arrayPP!=null && arrayPP.length>0)
			projectName = arrayPP[1];
		
		
		// For Boi
		String boiName = "";
		String boiNameTemp = arrayP[1];
		String[] arrayPB = boiNameTemp.split("=");
		if(arrayPB!=null && arrayPB.length>0)
			boiName = arrayPB[1];
		
		
		if(projectName!=null && projectName.length()>0) {

			// ************************************
			// INSTANCIACION DEL PROJECT
			// ************************************
			String xml = "";
	
			// boiModels save the xml routes of the boi models.
			xml = (new APIModelDerby()).get(boiName, projectName);
	
			// Buscar el Fact
			Resource res = (new CoreModel()).buildModelRebelCore(xml, boiName);
			Project project = (Project) res.getContents().get(0);
	
			
			// ************************************
			// IMPRESION DE FACTS
			// ************************************
	
			if (project != null) {
				
				list = new ArrayList<APIFact>();
				
				for (BlockOfInterest boi : project.getBlockofinterest()) {
					for (Fact f : boi.getFact()) {
						if(f.getElementType().equals("Component") || f.getElementType().equals("Connector")) {
							APIFact apiFact = new APIFact();
							
							String fecha = "";
							
							// Fecha
							if(f.getDate()!=null) {
								fecha = (f.getDate().getYear()+1900)+"-"+(f.getDate().getMonth()+1)+"-"+f.getDate().getDate();
							}
							
							
							if(fecha.length()>0) {
								// Name (tipo)
								apiFact.setName(fecha + " - " + f.getElementName() + " ("+f.getElementType()+") " + " - " + f.getAction());
							}else {
								// Name (tipo)
								apiFact.setName(f.getElementName() + " ("+f.getElementType()+") " + " - " + f.getAction());
							}
							
							if(f.getObservations()!=null && f.getObservations().length()>0 && !f.getObservations().equals("none"))
								apiFact.setName(apiFact.getName() + " - " + f.getObservations());
								
							// Observations (En el caso de conectores, muestra la relacion entre los componentes A -O)- B )
							// apiFact.setObservation(f.getObservations());
							
							apiFact.setId(f.getId());
							
//							System.out.println(apiFact.getId()+ " - " + apiFact.getName() + " - " + apiFact.getAction() + " - " + apiFact.getObservation());
							
							list.add(apiFact);
						}
					}
				}
			}
			
		}
		
		return list;
	}

	// TODO: Arreglar
	public List<APIElement> listArchimateDrivers(String params) {
		List<APIElement> lista = new ArrayList<APIElement>();
		
		String[] vars = params.split("&");
		String projectName = vars[0];
		String modelName = vars[1]; // llega de la forma: Layered_20201108

		// Obtiene la parte del nombre que corresponde.
		String shortModelName = modelName.substring(0, modelName.indexOf("_"));

		lista = getArchimateDrivers(projectName, shortModelName, "MOTIVATION_DRIVER");
		
		return lista;
	}

	// TODO: Arreglar
	public List<APIElement> listArchimateGoals(String params) {
		List<APIElement> lista = new ArrayList<APIElement>();
		
		String[] vars = params.split("&");
		String projectName = vars[0];
		String modelName = vars[1]; // llega de la forma: Layered_20201108

		// Obtiene la parte del nombre que corresponde.
		String shortModelName = modelName.substring(0, modelName.indexOf("_"));

		lista = getArchimateDrivers(projectName, shortModelName, "MOTIVATION_GOAL");
		
		return lista;
	}
	
	
	/**
	 * Este metodo obtiene la lista de todos los elementos que son tipo DRIVER
	 * de todos los modelos que tengan el mismo nombre. Dado que el nombre original
	 * del modelo sera, por ejemplo, Layered_20201108, entonces se recorreran todos
	 * los modelos que su nombre empiece por Layered.
	 * @param projectName
	 * @param modelName
	 * @return
	 */
	private List<APIElement> getArchimateDrivers(String projectName, String modelName, String type) {
		Set<APIElement> resp = new HashSet<APIElement>();

		Document input = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			// Listar todos los modelos que sean del proyecto y que sean de tipo
			// functionalview
			List<Model> modelsList = (new APIModelDerby()).listXMLRute(projectName, "archimate", modelName);

			for (Model m : modelsList) {

				// Obtener la ruta del xml
				String xmlRute = m.getRute();

				File f2 = new File(xmlRute);

				DocumentBuilder builder = factory.newDocumentBuilder();
				input = builder.parse(f2);

				// ***************************************************************
				// ELEMENTS
				// ***************************************************************

				NodeList cellNodes = input.getElementsByTagName("element");

				for (int i = 0; i < cellNodes.getLength(); i++) {
					Element e = (Element) cellNodes.item(i);
					if(e.getAttribute("type").equals(type))
						resp.add(new APIElement(e.getAttribute("id"), 
										e.getAttribute("name"), 
										e.getAttribute("type")));
				}

			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<APIElement> list = new ArrayList<APIElement>(resp);
		
		return list;
	}

	public String getDriverAndGoal(String filtro) throws Exception {
		
		String response = "";
		
		// *********************************************
		// EXTRACCION DEL NOMBRE DEL PROYECTO Y DEL BOI
		// *********************************************
		String[] arrayP = filtro.split("&");
		String projectName = arrayP[0];
		String boiName = arrayP[1];
		
		// boiModels save the xml routes of the boi models.
		String xml = (new APIModelDerby()).get(boiName, projectName);

		// Buscar el Fact
		Resource res = (new CoreModel()).buildModelRebelCore(xml, boiName);
		Project project = (Project) res.getContents().get(0);
		
		if (project != null) {
			for (BlockOfInterest boi : project.getBlockofinterest()) {
				if(boi.getBusiness_driver()!=null)
					response += boi.getBusiness_driver();
				
				if(boi.getBusiness_goal()!=null)
					response += "|" + boi.getBusiness_goal();
			}
		}
		
		return response;
	}
	

}
