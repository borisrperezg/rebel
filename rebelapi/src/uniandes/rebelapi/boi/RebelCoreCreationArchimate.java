package uniandes.rebelapi.boi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import rebel_archimate.Element;
import rebel_archimate.Relation;
import rebel_archimate.View;
import rebel_componentandconnector.FunctionalView;
import rebel_core.APPLICATIONSERVICETYPE;
import rebel_core.Action;
import rebel_core.ArchimateView;
import rebel_core.BlockOfInterest;
import rebel_core.Buffering;
import rebel_core.DeliveryModel;
import rebel_core.Fact;
import rebel_core.NotificationModel;
import rebel_core.Project;
import rebel_core.RELATIONTYPE;
import rebel_core.SyncType;
import rebel_core.Throughput;
import uniandes.rebel.archimate.AMModel;
import uniandes.rebel.core.model.CoreModel;
import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.bo.Model;
import uniandes.rebelapi.db.APIModelDerby;
import uniandes.rebelapi.mediator.RebelMediator;
import uniandes.rebelapi.util.AsynchronousSearch;
import uniandes.rebelapi.util.RebelArchiToXML;
import uniandes.rebelapi.util.Util;

public class RebelCoreCreationArchimate {

	private AMModel amModel;
	private CoreModel cModel;
	private int factUniqueId;
	private RebelMediator rebelMediator;

	public RebelCoreCreationArchimate(RebelMediator rebelMediator) {
		this.rebelMediator = rebelMediator;
		
		amModel = new AMModel();
		cModel = new CoreModel();
		
		
		int major = 0;
    	// Obtener los modelos tipo rebel.
    	List<APIBOI> bois = (new APIModelDerby()).listAllBOIs();
    	
    	if(bois!=null) {
	    	// Cargar el proyecto y recorrer los Fact
	    	for(APIBOI boi : bois) {
	    		try {
	    			Resource res = cModel.buildModelRebelCore(boi.getUrl(), boi.getName());
	    			Project project = (Project) res.getContents().get(0);
					
					if(project.getBlockofinterest()!=null) {
						
						for(BlockOfInterest block : project.getBlockofinterest()) {
							
							if(block.getFact()!=null) {
							
								for(Fact fact : block.getFact()) {
								
									// Encontrar el valor mayor y asignarlo a variable de clase
									int val = Integer.parseInt(fact.getId()!=null&&fact.getId().length()>0?fact.getId():"0");
									if(val>major) {
										major = val;
									}									
								}
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
	    	}
    	}
    	
    	factUniqueId = major;
		
	}
    
    private int nextFactId() {
    	factUniqueId++;
    	return factUniqueId;
    }

	
    public static void main(String[] args) {
		RebelCoreCreationArchimate m = new RebelCoreCreationArchimate(new RebelMediator());

		String params = "p=TT6&bm=LayeredView_20201108&boi=2_BOI&dr=Cost reduction&go=Fast time to deployment&"
				+ "Patient Informacion System Component&Guidance";

		m.boiCreationArchi(params);
	}
    
    

	/**
	 * Este metodo crea el boi para cuando se trabaja desde un modelo en Archimate
	 * 
	 * @param params 	p=ArchimateProject&
	 * 					bm=Layered_20201108&
	 * 					boi=FirstBOI&
	 * 					dr=cost reduction&
	 * 					go=process automation&
	 * 					[element1]&[element2]
	 * @return
	 */
	public String boiCreationArchi(String params) {
     
		String resp = "NOK";

//		System.out.println("RebelCoreCreation.boiCreationArchi ::: params = "+params);
		
		try {
			String[] aParams = params.split("&");

			String project = aParams[0].substring(aParams[0].indexOf("=") + 1);
			String baseModel = aParams[1].substring(aParams[1].indexOf("=") + 1);
			String boiName = aParams[2].substring(aParams[2].indexOf("=") + 1);
			
			String driver = aParams[3].substring(aParams[3].indexOf("=") + 1);
			String goal = aParams[4].substring(aParams[4].indexOf("=") + 1);

			// Para manejar nombres unicos de los elementos y para facilitar su localizacion
			HashMap<String, String> elementsName = new HashMap<String, String>();

			for (int t = 5; t < aParams.length; t++) {
				
				// Para reemplazar caracteres especiales
				String nameOfElement = aParams[t];
				nameOfElement = nameOfElement.replaceAll("_AMP_", "%");
				nameOfElement = nameOfElement.replaceAll("_CHA_", "#");
				nameOfElement = nameOfElement.replaceAll("_MON_", "$");
				nameOfElement = nameOfElement.replaceAll("_PER_", "%");
				
				elementsName.put(nameOfElement, nameOfElement);
			}

			// Para cada elemento, se debe construir un objeto con su estructura.
			// Para esto, se toma el primer elemento y se busca en el primer modelo.
			// Se extraen las relaciones de entrada y de salida de ese elemento.

			// Saco de la BD todos los modelos archimate de ese proyecto y que cumplan con
			// el prefijo de nombre.
			String prefijoBaseModel = obtenerPrefijoNombreModel(baseModel);
			List<Model> archimateModels = (new APIModelDerby()).listArchimateModels(project, prefijoBaseModel);

			// Conjunto de listas para incluirse en Rebel, porque son las vistas
			// que tienen los elementos seleccionados en el BOI.
			List<rebel_archimate.View> vistasParaRebel = obtenerVistasConCoincidencias(archimateModels, elementsName);

			// Se encontraron vistas que contienen a los elementos
			if (vistasParaRebel != null && vistasParaRebel.size() > 0) {

				// Se crea el modelo Core
				cModel.createModel(project, boiName);

				// Mover vistas a Rebel
				archimateViewsInRebelCore(vistasParaRebel, elementsName);				
				
				if(cModel.getProject().getView()!=null) {
					
					// Creación de BOI
					BlockOfInterest boi = cModel.createBOI();
					boi.setId((int) Calendar.getInstance().getTimeInMillis());
					boi.setName(boiName);
					boi.setBusiness_driver(driver);
					boi.setBusiness_goal(goal);
					
					// Agrego el BOI al proyecto
					cModel.getProject().getBlockofinterest().add(boi);
					
					
					/*
					 * Revisar por cada vista los cambios para la construccion de los Fact.
					 * Consideraciones: 
					 * - Toca revisar por relación, es decir, donde coincida source y target 
					 * - Buscar cada relación del modelo origen en el modelo destino 
					 * - Si la relación no existe, entonces hay un fact indicando la ausencia de relación
					 * entre elementos 
					 * - Si hay nueva relación, entonces hay un fact indicando la aparición de relación 
					 * - No hay Facts de Update 
					 * - Comparación por nombres
					 */
					buildFacts(boi, elementsName);
					
					// **************************************************
					// REVISA LOS MODELOS DE CNC PARA INTENTAR VINCULAR NUEVOS FACTS AL MODELO
					// **************************************************
					
					// Se crea la lista con los componentes a extraer
					ArrayList<String> componentsName = new ArrayList<String>();
					// Se crea la lista con los conectores a extraer
					ArrayList<String> connectorsName = new ArrayList<String>();
					
					// Consultar los modelos C&C del proyecto
					List<Model> cncModelsList = (new APIModelDerby()).listXMLRute(project, "functionalview");
					
					// Recorro los modelos hasta encontrar los elementos y obtener su tipo
					if(cncModelsList!=null && cncModelsList.size()>0) {
						
						for(int y=0;y<cncModelsList.size();y++) {
							
							try {
							
								Model modelCnC = cncModelsList.get(y);
								rebel_componentandconnector.Project cncProj = Util.buildModelRebelComponentAndConnector(modelCnC.getRute(), modelCnC.getName());
								
								if(cncProj.getFunctionalviews()!=null) {
									
									for(int g=0;g<cncProj.getFunctionalviews().size();g++) {
										
										FunctionalView fView = cncProj.getFunctionalviews().get(g);
										
										// ---------------------------------------------
										// Recorriendo la lista de Componentes
										
										if(fView.getComponents()!=null) {
											
											for(int u=0; u<fView.getComponents().size();u++) {
												
												// Obtengo una instancia de Component del functional view
												rebel_componentandconnector.Component componentCnc = fView.getComponents().get(u);
												
												// Itero sobre la lista de elementos seleccionados en la GUI.
												Iterator<Map.Entry<String, String>> iterator = elementsName.entrySet().iterator();
											    while (iterator.hasNext()) {
											        Map.Entry<String, String> entry = iterator.next();
											        
											        // Comparo los nombres de los componentes
											        if(componentCnc.getName().equals(entry.getKey())) {
											        	componentsName.add(componentCnc.getName());
											        	break;
											        }
											    }												
											}											
										}
										
										// ---------------------------------------------
										// Recorriendo la lista de Conectores
										
										if(fView.getConnectors()!=null) {
											
											for(int u=0; u<fView.getConnectors().size();u++) {
												
												// Obtengo una instancia de Component del functional view
												rebel_componentandconnector.Connector connectorCnc = fView.getConnectors().get(u);
												
												// Itero sobre la lista de elementos seleccionados en la GUI.
												Iterator<Map.Entry<String, String>> iterator = elementsName.entrySet().iterator();
											    while (iterator.hasNext()) {
											        Map.Entry<String, String> entry = iterator.next();
											        
											        // Comparo los nombres de los componentes
											        if(connectorCnc.getName().equals(entry.getKey())) {
											        	connectorsName.add(connectorCnc.getName());
											        	break;
											        }
											    }												
											}											
										}										
									}									
								}							
							}catch(Exception e) {
								e.printStackTrace();
							}							
						}
					}
					
					// Si hay registros en las listas, se procede a la extracción
					if(componentsName.size()>0 || connectorsName.size()>0) {
						// Invocacion
						rebelMediator.factsExtractionFromCnC(cModel, project, boi, componentsName, connectorsName, nextFactId());
					}
					
					// **************************************************************
					// SE PERSISTE EL MODELO
					// **************************************************************
					cModel.storeModel();
					
//					if(true)
//						return null;
					
					// **************************************************************
					// LLAMADA ASINCRONO PARA LA BUSQUEDA EN ARTEFACTOS HETEROGENEOS
					// **************************************************************
					
					new Thread(() -> {
						(new AsynchronousSearch()).findAndLinkHeterogeneousArtifacts(cModel, boi, project);
					}).start();
					
					
					// **************************************************
					// CREACION DEL XML PARA VISUALIZACION
					// **************************************************
					
					// Se debe hacer acá recorriendo las vistas, porque debe estar creado físicamente el modelo en disco
					
					
					if(!(new RebelArchiToXML()).xmlCreation(boiName, cModel.getProject().getName()))
						throw new Exception("Couldn't create the xml for visualization");
					
					resp = "OK";
					
					
				}else {
					resp = "NOK. No Rebel views could be created.";
				}
				
				
			}else {
				resp = "NOK. There is no views with the elements selected.";
			}

		} catch (Exception e) {
			resp = e.getMessage();
			e.printStackTrace();
		}

		return resp;
	}
	
	private void buildFacts(BlockOfInterest boi, 
			HashMap<String, String> elementsName) {
		
		if (cModel.getProject().getView().size() == 1) {
			createFirstFacts(cModel.getProject().getView().get(0), boi, elementsName);
		} else if (cModel.getProject().getView().size() > 1) {

			// Para los create del primer modelo
			createFirstFacts(cModel.getProject().getView().get(0), boi, elementsName);

			// Para las comparaciones con modelos posteriores
			for (int u = 0; u < cModel.getProject().getView().size(); u++) {
				ArchimateView m1 = cModel.getProject().getView().get(u);
				try {
					ArchimateView m2 = cModel.getProject().getView().get(u + 1);
					compareViews(m1, m2, boi, elementsName);
				} catch (IndexOutOfBoundsException ie) {
					System.err.println("--- Comparison end");
				}
			}
		}
		
	}
	
	private void createFirstFacts(ArchimateView m1, BlockOfInterest boi, 
			HashMap<String, String> elementsName) {
		
		System.out.println("***********");
		System.out.println("createFirstFacts");
		System.out.println("***********");
		
		// ---------------------------------------------
		// CREACION DE FACTS DE TIPO ELEMENTO
		// Para crear los Facts de creación de elementos
		
		for(rebel_core.Element element : m1.getElement()) {
			
			if(elementsName.get(element.getName())!=null) {
				
				System.out.println(element.getName() + ": " + element.getApplicationServiceType());
				
				Fact f = createFact(element.getName(), m1.getDate(), element.getType().getLiteral(), "", "Create");				
				f.getView().add(m1);				
				boi.getFact().add(f);
				
				
				if(element.getSync()!=null && !element.getSync().getLiteral().contentEquals("NONE")) {
					String syncTypeElement = element.getSync().getLiteral();
					
					Fact ft = createFact(element.getName(), 
							m1.getDate(), 
							element.getType().getLiteral(), 
							"Create Sync property: " + syncTypeElement, 
							"Create");				
					ft.getView().add(m1);				
					boi.getFact().add(ft);
				
				}
				
				if(element.getDelivery()!=null && !element.getDelivery().getLiteral().contentEquals("NONE")) {
					String propertyValue = element.getDelivery().getLiteral();
					
					Fact ft = createFact(element.getName(), 
							m1.getDate(), 
							element.getType().getLiteral(), 
							"Create Delivery property: " + propertyValue, 
							"Create");				
					ft.getView().add(m1);				
					boi.getFact().add(ft);
				
				}
				
				if(element.getNotification()!=null && !element.getNotification().getLiteral().contentEquals("NONE")) {
					String propertyValue = element.getNotification().getLiteral();
					
					Fact ft = createFact(element.getName(), 
							m1.getDate(), 
							element.getType().getLiteral(), 
							"Create Notification property: " + propertyValue, 
							"Create");				
					ft.getView().add(m1);				
					boi.getFact().add(ft);
				
				}
				
				if(element.getBuffering()!=null && !element.getBuffering().getLiteral().contentEquals("NONE")) {
					String propertyValue = element.getBuffering().getLiteral();
					
					Fact ft = createFact(element.getName(), 
							m1.getDate(), 
							element.getType().getLiteral(), 
							"Create Buffering property: " + propertyValue, 
							"Create");				
					ft.getView().add(m1);				
					boi.getFact().add(ft);
				
				}
				
				if(element.getThroughput()!=null && !element.getThroughput().getLiteral().contentEquals("NONE")) {
					String propertyValue = element.getThroughput().getLiteral();
					
					Fact ft = createFact(element.getName(), 
							m1.getDate(), 
							element.getType().getLiteral(), 
							"Create Throughput property: " + propertyValue, 
							"Create");				
					ft.getView().add(m1);				
					boi.getFact().add(ft);
				
				}
				
				if(element.getApplicationServiceType()!=null && !element.getApplicationServiceType().getLiteral().contentEquals("NONE")) {
					String propertyValue = element.getApplicationServiceType().getLiteral();
					
					Fact ft = createFact(element.getName(), 
							m1.getDate(), 
							element.getType().getLiteral(), 
							"Create Service Type property: " + propertyValue, 
							"Create");				
					ft.getView().add(m1);				
					boi.getFact().add(ft);
				
				}
			}
		}
		
		// ---------------------------------------------
		// CREACION DE FACTS DE TIPO RELACION
		// Para crear los Facts de creación de relaciones
		
		for(rebel_core.Relation relation: m1.getRelation()) {
			
			if (elementsName.get(relation.getSource().getName()) != null
					|| elementsName.get(relation.getTarget().getName()) != null) {
				
				
				String nameComponentForService = "";
				
				if(relation.getTarget().getType().getLiteral().equals("APPLICATION_SERVICE")) {
					for(rebel_core.Relation relationsToIterate : m1.getRelation()) {
						if(relationsToIterate.getSource().getType().getLiteral().equals("APPLICATION_COMPONENT") && 
								relationsToIterate.getTarget().getName().equals(relation.getTarget().getName()) &&
								relationsToIterate.getType().getLiteral().equals("REALIZATION") &&
								!relationsToIterate.getSource().getName().equals(relation.getSource().getName())) {
							nameComponentForService = relationsToIterate.getSource().getName();
							break;
						}
					}
				}
				
				String name = "";
				
				if(nameComponentForService.isEmpty())
					name = relation.getSource().getName() + " -> " + relation.getTarget().getName();
				else
					name = relation.getSource().getName() + " -( " + relation.getTarget().getName() + " O- " + nameComponentForService;
				
				Fact f = createFact(name, m1.getDate(), relation.getType().getLiteral(), "", "Create");
				
				f.getView().add(m1);
				
				boi.getFact().add(f);
				
			}
			
		}
		
	}
	
	/**
	 * Compara las vistas para establecer los cambios tanto de elementos, como 
	 * de sus relaciones.
	 * @param m1
	 * @param m2
	 * @param boi
	 * @param elementsName
	 */
	private void compareViews(ArchimateView m1, ArchimateView m2, BlockOfInterest boi, 
			HashMap<String, String> elementsName) {
		
		System.out.println("----------------------------");
		System.out.println("COMPARE VIEWS: "+m1.getName()+" vs "+m2.getName());
		
		// Aca toca tener presente cuando un elemento aparezca en un segundo modelo
		
		// Verificar estado de los elementos: 1) Creación, 2) Eliminación
		// Preguntar si está en un modelo, y luego si está en el otro: No pasa nada
		// Preguntas si está en el primero modelo, y no está en el segundo: Eliminacion
		// Preguntar si no está en el primer modelo, y sí está en el seungi: Creación
		
		// -------------------------------------------------
		// BLOQUE DE VALIDACION DE ESTADO DE LOS ELEMENTOS
		// -------------------------------------------------
		
		List<String> elementsNameList = new ArrayList<String>(elementsName.keySet());
		
		for(String elementName : elementsNameList) {
			
			boolean existsM1 = false;
			boolean existsM2 = false;
			
			String elementType = "";
			
			// sync, delivery, notification, buffering, throughput;
			
			String syncTypeElementM1 = "";
			String syncTypeElementM2 = "";
			
			String deliveryTypeElementM1 = "";
			String deliveryTypeElementM2 = "";
			
			String notificationTypeElementM1 = "";
			String notificationTypeElementM2 = "";
			
			String bufferingTypeElementM1 = "";
			String bufferingTypeElementM2 = "";
			
			String throughputTypeElementM1 = "";
			String throughputTypeElementM2 = "";
			
			String applicationServiceTypeM1 = "";
			String applicationServiceTypeM2 = "";
			
			for(rebel_core.Element coreElement : m1.getElement()) {
				if(elementName.equals(coreElement.getName())){
					existsM1 = true;
					
					if(coreElement.getSync()!=null)
						syncTypeElementM1 = coreElement.getSync().getLiteral();
					
					if(coreElement.getDelivery()!=null)
						deliveryTypeElementM1 = coreElement.getDelivery().getLiteral();
					
					if(coreElement.getNotification()!=null)
						notificationTypeElementM1 = coreElement.getNotification().getLiteral();
					
					if(coreElement.getBuffering()!=null)
						bufferingTypeElementM1 = coreElement.getBuffering().getLiteral();
					
					if(coreElement.getThroughput()!=null)
						throughputTypeElementM1 = coreElement.getThroughput().getLiteral();
					
					if(coreElement.getApplicationServiceType()!=null)
						applicationServiceTypeM1 = coreElement.getApplicationServiceType().getLiteral();
					
					break;
				}
			}
			
			for(rebel_core.Element coreElement : m2.getElement()) {
				if(elementName.equals(coreElement.getName())){
					existsM2 = true;
					elementType = coreElement.getType().getLiteral();
					
					if(coreElement.getSync()!=null)
						syncTypeElementM2 = coreElement.getSync().getLiteral();
					
					if(coreElement.getDelivery()!=null)
						deliveryTypeElementM2 = coreElement.getDelivery().getLiteral();
					
					if(coreElement.getNotification()!=null)
						notificationTypeElementM2 = coreElement.getNotification().getLiteral();
					
					if(coreElement.getBuffering()!=null)
						bufferingTypeElementM2 = coreElement.getBuffering().getLiteral();
					
					if(coreElement.getThroughput()!=null)
						throughputTypeElementM2 = coreElement.getThroughput().getLiteral();
					
					if(coreElement.getApplicationServiceType()!=null)
						applicationServiceTypeM2 = coreElement.getApplicationServiceType().getLiteral();
					
					break;
				}
			}
			
			if(existsM1 && existsM2) {
				// No hay Fact
				// Acá se podrían considerar las propiedades
				// Se debe considerar que sea solo para los services o interfaces
				
				if(!syncTypeElementM1.equals(syncTypeElementM2)) {
					Fact f = createFact(elementName, m2.getDate(), elementType, "Change Sync property: " + syncTypeElementM2 + " (prev. " + syncTypeElementM1 + ")", "Update");				
					f.getView().add(m2);				
					boi.getFact().add(f);
				}
				
				if(!deliveryTypeElementM1.equals(deliveryTypeElementM2)) {
					Fact f = createFact(elementName, m2.getDate(), elementType, "Change Delivery property: " + deliveryTypeElementM2 + "(prev. " + deliveryTypeElementM1 + ")", "Update");				
					f.getView().add(m2);				
					boi.getFact().add(f);
				}
				
				if(!notificationTypeElementM1.equals(notificationTypeElementM2)) {
					Fact f = createFact(elementName, m2.getDate(), elementType, "Change Notification property: " + notificationTypeElementM2 + "(prev. " + notificationTypeElementM1 + ")", "Update");				
					f.getView().add(m2);				
					boi.getFact().add(f);
				}
				
				if(!bufferingTypeElementM1.equals(bufferingTypeElementM2)) {
					Fact f = createFact(elementName, m2.getDate(), elementType, "Change Buffering property: " + bufferingTypeElementM2 + "(prev. " + bufferingTypeElementM1 + ")", "Update");				
					f.getView().add(m2);				
					boi.getFact().add(f);
				}
				
				if(!throughputTypeElementM1.equals(throughputTypeElementM2)) {
					Fact f = createFact(elementName, m2.getDate(), elementType, "Change Throughput property: " + throughputTypeElementM2 + "(prev. " + throughputTypeElementM1 + ")", "Update");				
					f.getView().add(m2);				
					boi.getFact().add(f);
				}
				
				if(!applicationServiceTypeM1.equals(applicationServiceTypeM2)) {
					Fact f = createFact(elementName, m2.getDate(), elementType, "Change Service Type property: " + applicationServiceTypeM2 + "(prev. " + applicationServiceTypeM1 + ")", "Update");				
					f.getView().add(m2);				
					boi.getFact().add(f);
				}
				
			}else if(!existsM1 && existsM2) { 
				// Creacion
				Fact f = createFact(elementName, m2.getDate(), elementType, "", "Create");				
				f.getView().add(m2);			
				boi.getFact().add(f);
				
				if(applicationServiceTypeM2!=null && !applicationServiceTypeM2.contentEquals("NONE")) {					
					Fact ft = createFact(elementName, 
							m2.getDate(), 
							elementType, 
							"Create Service Type property: " + applicationServiceTypeM2, 
							"Create");				
					ft.getView().add(m2);				
					boi.getFact().add(ft);				
				}
				
				if(syncTypeElementM2!=null && !syncTypeElementM2.contentEquals("NONE")) {
					Fact ft = createFact(elementName, 
							m2.getDate(), 
							elementType, 
							"Create Sync property: " + syncTypeElementM2, 
							"Create");				
					ft.getView().add(m2);				
					boi.getFact().add(ft);
				
				}
				
				if(deliveryTypeElementM2!=null && !deliveryTypeElementM2.contentEquals("NONE")) {
					Fact ft = createFact(elementName, 
							m2.getDate(), 
							elementType, 
							"Create Delivery property: " + deliveryTypeElementM2, 
							"Create");				
					ft.getView().add(m2);				
					boi.getFact().add(ft);
				
				}
				
				if(notificationTypeElementM2!=null && !notificationTypeElementM2.contentEquals("NONE")) {
					Fact ft = createFact(elementName, 
							m2.getDate(), 
							elementType, 
							"Create Notification property: " + notificationTypeElementM2, 
							"Create");				
					ft.getView().add(m2);				
					boi.getFact().add(ft);
				
				}
				
				if(bufferingTypeElementM2!=null && !bufferingTypeElementM2.contentEquals("NONE")) {
					Fact ft = createFact(elementName, 
							m2.getDate(), 
							elementType, 
							"Create Buffering property: " + bufferingTypeElementM2, 
							"Create");				
					ft.getView().add(m2);				
					boi.getFact().add(ft);
				
				}
				
				if(throughputTypeElementM2!=null && !throughputTypeElementM2.contentEquals("NONE")) {
					Fact ft = createFact(elementName, 
							m2.getDate(), 
							elementType, 
							"Create Throughput property: " + throughputTypeElementM2, 
							"Create");				
					ft.getView().add(m2);				
					boi.getFact().add(ft);
				
				}
				
			}else if(existsM1 && !existsM2) { 
				// Creacion
				Fact f = createFact(elementName, m2.getDate(), elementType, "", "Delete");				
				f.getView().add(m2);				
				boi.getFact().add(f);
			}else if(!existsM1 && !existsM2) { 
				// No hay Fact
			}
			
		}
		
		// -------------------------------------------------
		// BLOQUE DE VALIDACION DE ESTADO DE LAS RELACIONES
		// -------------------------------------------------
		
		for(rebel_core.Relation coreRelationFirst : m1.getRelation()) {
			
			// Esto no necesita validarse porque en el BOI ya están las relaciones
			// que involucran únicamente a los elementos seleccionados
//			if (elementsName.get(coreRelationFirst.getSource().getName()) != null || elementsName.get(coreRelationFirst.getTarget().getName()) != null) {
			
			String sfeName = coreRelationFirst.getSource().getName();
			String tfeName = coreRelationFirst.getTarget().getName();
			
			boolean existe = false;
			
			for(rebel_core.Relation coreRelationSecond : m2.getRelation()) {
				
				String sseName = coreRelationSecond.getSource().getName();
				String tseName = coreRelationSecond.getTarget().getName();
				
				if(sfeName.equals(sseName) && tfeName.equals(tseName)) {
					existe = true;
					break;
				}
			}
			
			if(!existe) {
				
				String name = coreRelationFirst.getSource().getName() + " -X " + coreRelationFirst.getTarget().getName();
				
				// Se crea un Fact de Eliminación de Relación
				Fact f = createFact(name, m2.getDate(), coreRelationFirst.getType().getName(), "", "Delete");				
				f.getView().add(m2);				
				boi.getFact().add(f);
			}
			
		}
		
		HashSet<String> listOfFacts = new HashSet<String>();
		HashSet<String> listOfTypes = new HashSet<String>();
		
//		System.out.println("\n******************************************************");
//		System.out.println(" "+m2.getDate() + " ");
//		System.out.println("******************************************************\n");
		
		for(rebel_core.Relation coreRelationSecond : m2.getRelation()) {
			
			// Esto no necesita validarse porque en el BOI ya están las relaciones
			// que involucran únicamente a los elementos seleccionados
//			if (elementsName.get(coreRelationFirst.getSource().getName()) != null || elementsName.get(coreRelationFirst.getTarget().getName()) != null) {
			
			String sseName = coreRelationSecond.getSource().getName();
			String tseName = coreRelationSecond.getTarget().getName();
			
			boolean existe = false;
			
			for(rebel_core.Relation coreRelationFirst : m1.getRelation()) {
				
				String sfeName = coreRelationFirst.getSource().getName();
				String tfeName = coreRelationFirst.getTarget().getName();
				
				if(sfeName.equals(sseName) && tfeName.equals(tseName)) {
					existe = true;
					break;
				}
			}
			
			
			
			if(!existe) {
				
//				System.out.println(sseName + " --> " + tseName + " :: " + existe);
				
				String nameComponentForService = "";
				
				//System.out.println("View name --> "+m2.getName());
				
//				if(m2.getName().equals("Layered_20201027")) {
//					
//					String puntoSirve = "", tipoPuntoSirve = "";
//					String puntoConsume = "", tipoPuntoConsume = "";
//					
//					if(coreRelationSecond.getSource().getName().equals("Asignación Service")) {
//						
//						String origen_ = coreRelationSecond.getSource().getName() + " (" + coreRelationSecond.getSource().getType().getLiteral() + ")";
//						
//						for(rebel_core.Relation relationsToIterate : m2.getRelation()) {
//							// No me importa que sea solo para Componentes. Cualquier elemento que se conecte a un application_service
//							//if(relationsToIterate.getSource().getType().getLiteral().equals("APPLICATION_COMPONENT") &&
//							
//							if(relationsToIterate.getSource().getName().equals(coreRelationSecond.getSource().getName())) {
//								
//								puntoConsume = relationsToIterate.getTarget().getName() + " (" + relationsToIterate.getTarget().getType().getLiteral() + ")";
//								
////								System.out.println(relationsToIterate.getId() + ")) "+ origen_ + " -- ("+ relationsToIterate.getType().getLiteral() +") -> "+destino_);
//								
//							}
//							
//							if(relationsToIterate.getTarget().getName().equals(coreRelationSecond.getSource().getName())) {
//								
//								puntoSirve = relationsToIterate.getSource().getName() + " (" + relationsToIterate.getSource().getType().getLiteral() + ")";
//								
////								System.out.println(relationsToIterate.getId() + ")) "+ origen_ + " -- ("+ relationsToIterate.getType().getLiteral() +") -> "+destino_);
//							}
//							
//							
//						}
//						
//						System.out.println(puntoSirve + " -O)- " + puntoConsume);
//						
//					}
					
//					else if(coreRelationSecond.getTarget().getName().equals("Asignación Service")) {
//						
//						String destino_ = coreRelationSecond.getTarget().getName() + " (" + coreRelationSecond.getTarget().getType().getLiteral() + ")";
//						
//						for(rebel_core.Relation relationsToIterate : m2.getRelation()) {
//							// No me importa que sea solo para Componentes. Cualquier elemento que se conecte a un application_service
//							//if(relationsToIterate.getSource().getType().getLiteral().equals("APPLICATION_COMPONENT") &&
//							
//							
//							
//							if(relationsToIterate.getTarget().getName().equals(coreRelationSecond.getTarget().getName())) {
//								puntoSirve = relationsToIterate.getSource().getName() + " (" + relationsToIterate.getSource().getType().getLiteral() + ")";
//								
////								System.out.println(relationsToIterate.getId() + ")) "+ origen_ + " -- ("+ relationsToIterate.getType().getLiteral() +") -> "+destino_);
//							}
//						}
//					}
					
					
					
//				}
				
//				System.out.println(sseName + "(" + coreRelationSecond.getSource().getType() + ") --> "+ tseName + "(" + coreRelationSecond.getTarget().getType() + ") ::: "+coreRelationSecond.getType().getName());
				
				if(coreRelationSecond.getSource().getType().getLiteral().equals("APPLICATION_SERVICE")) {
					
					rebel_core.Element elementProducing = null;
					rebel_core.Element service = null;
					rebel_core.Element elementConsuming = null;
					
					if(coreRelationSecond.getType().getName().equals("SERVING")) {
						if(coreRelationSecond.getSource().getType().getLiteral().equals("APPLICATION_SERVICE")) {
							service = coreRelationSecond.getSource();
							elementConsuming = coreRelationSecond.getTarget();
						}else {
							service = coreRelationSecond.getTarget();
							elementConsuming = coreRelationSecond.getSource();
						}
						
						for(rebel_core.Relation relationsToIterate : m2.getRelation()) {
							
							if(relationsToIterate.getType().getLiteral().equals("REALIZATION")) {
								
								if(relationsToIterate.getSource().getName().equals(service.getName()) || relationsToIterate.getTarget().getName().equals(service.getName())) {
								
									if(relationsToIterate.getSource().getType().getLiteral().equals("APPLICATION_SERVICE")) {
										service = relationsToIterate.getSource();
										elementProducing = relationsToIterate.getTarget();
									}else {
										service = relationsToIterate.getTarget();
										elementProducing = relationsToIterate.getSource();
									}									
								}
							}
						}						
					}
					
					if(coreRelationSecond.getType().getName().equals("REALIZATION")) {
						if(coreRelationSecond.getSource().getType().getLiteral().equals("APPLICATION_SERVICE")) {
							service = coreRelationSecond.getSource();
							elementProducing = coreRelationSecond.getTarget();
						}else {
							service = coreRelationSecond.getTarget();
							elementProducing = coreRelationSecond.getSource();
						}
						
						for(rebel_core.Relation relationsToIterate : m2.getRelation()) {
							
							if(relationsToIterate.getType().getLiteral().equals("SERVING")) {
								
								if(relationsToIterate.getSource().getName().equals(service.getName()) || relationsToIterate.getTarget().getName().equals(service.getName())) {
								
									if(relationsToIterate.getSource().getType().getLiteral().equals("APPLICATION_SERVICE")) {
										service = relationsToIterate.getSource();
										elementConsuming = relationsToIterate.getTarget();
									}else {
										service = relationsToIterate.getTarget();
										elementConsuming = relationsToIterate.getSource();
									}									
								}
							}
						}						
					}
					
					if(elementProducing!=null && elementConsuming.getName()!=null) {					
						nameComponentForService = elementProducing.getName() + " -O)- " + elementConsuming.getName();
						listOfFacts.add(nameComponentForService+"@consume");
					}
					
				}else if(coreRelationSecond.getTarget().getType().getLiteral().equals("APPLICATION_SERVICE")) {
					
					rebel_core.Element elementProducing = null;
					rebel_core.Element service = null;
					rebel_core.Element elementConsuming = null;
					
					if(coreRelationSecond.getType().getName().equals("SERVING")) {
						if(coreRelationSecond.getSource().getType().getLiteral().equals("APPLICATION_SERVICE")) {
							service = coreRelationSecond.getSource();
							elementConsuming = coreRelationSecond.getTarget();
						}else {
							service = coreRelationSecond.getTarget();
							elementConsuming = coreRelationSecond.getSource();
						}
						
						for(rebel_core.Relation relationsToIterate : m2.getRelation()) {
							
							if(relationsToIterate.getType().getLiteral().equals("REALIZATION")) {
								
								if(relationsToIterate.getSource().getName().equals(service.getName()) || relationsToIterate.getTarget().getName().equals(service.getName())) {
								
									if(relationsToIterate.getSource().getType().getLiteral().equals("APPLICATION_SERVICE")) {
										service = relationsToIterate.getSource();
										elementProducing = relationsToIterate.getTarget();
									}else {
										service = relationsToIterate.getTarget();
										elementProducing = relationsToIterate.getSource();
									}									
								}
							}
						}						
					}
					
					if(coreRelationSecond.getType().getName().equals("REALIZATION")) {
						if(coreRelationSecond.getSource().getType().getLiteral().equals("APPLICATION_SERVICE")) {
							service = coreRelationSecond.getSource();
							elementProducing = coreRelationSecond.getTarget();
						}else {
							service = coreRelationSecond.getTarget();
							elementProducing = coreRelationSecond.getSource();
						}
						
						for(rebel_core.Relation relationsToIterate : m2.getRelation()) {
							
							if(relationsToIterate.getType().getLiteral().equals("SERVING")) {
								
								if(relationsToIterate.getSource().getName().equals(service.getName()) || relationsToIterate.getTarget().getName().equals(service.getName())) {
								
									if(relationsToIterate.getSource().getType().getLiteral().equals("APPLICATION_SERVICE")) {
										service = relationsToIterate.getSource();
										elementConsuming = relationsToIterate.getTarget();
									}else {
										service = relationsToIterate.getTarget();
										elementConsuming = relationsToIterate.getSource();
									}									
								}
							}
						}						
					}
					
					if(elementProducing!=null && elementConsuming.getName()!=null) {
						nameComponentForService = elementProducing.getName() + " -O)- " + elementConsuming.getName();
						listOfFacts.add(nameComponentForService+"@consume");
					}
					
				}else {
					nameComponentForService = coreRelationSecond.getSource().getName() + " -> " + coreRelationSecond.getTarget().getName();
					listOfFacts.add(nameComponentForService + "@" + coreRelationSecond.getType().getName());
				}
				
				
			}
			
		}
		
		ArrayList<String> listFacts = new ArrayList<String>(listOfFacts);
		
		
		for(int h=0;h<listFacts.size();h++){
			
			String content = listFacts.get(h);
			String[] arrayContent = content.split("@");
			
			
			
			// Se crea un Fact de Eliminación de Relación
			Fact f = createFact(arrayContent[0], m2.getDate(), arrayContent[1], "", "Create");				
			f.getView().add(m2);				
			boi.getFact().add(f);
			
		  
		}
		
	}
	
	
	@SuppressWarnings("deprecation")
	public Fact createFact(String name, Date date, String type, String obs, String action) {
		Fact fact = cModel.createFact();
		
		fact.setElementName(name);
		fact.setDate(new Date(date.getYear(), date.getMonth(), date.getDate()));
		fact.setObservations(obs);
		fact.setId(String.valueOf(nextFactId()));		
		fact.setElementType(type);
		
		if(action.equals("Create"))
			fact.setAction(Action.CREATE);
		else if(action.equals("Delete"))
			fact.setAction(Action.DELETE);
		else if(action.equals("Update"))
			fact.setAction(Action.UPDATE);
		else if(action.equals("Divide"))
			fact.setAction(Action.DIVIDE);
		
		return fact;
	}

	/**
	 * Este metodo toma las vistas de archimate y las mueve al modelo Core.
	 * 
	 * @param vistasParaRebel
	 * @return
	 */
	private void archimateViewsInRebelCore(List<View> vistasParaRebel,
			HashMap<String, String> elementsName) throws Exception {

		// Este Map se usa para guardar las referencias de los elementos que se van
		// pasando a rebel_core
		HashMap<String, rebel_core.Element> elementsToRebelCore = null;

		for (int t = 0; t < vistasParaRebel.size(); t++) {

			elementsToRebelCore = new HashMap<String, rebel_core.Element>();

			View vista = vistasParaRebel.get(t);
			
			ArchimateView archiView = cModel.createArchimateView(vista.getId(), vista.getName());
			archiView.setDate(new Date(vista.getDate().getYear(), vista.getDate().getMonth(), vista.getDate().getDate()));
			
//			System.out.println(archiView.getName());
//			System.out.println(archiView.getDate().getYear() + " - " + archiView.getDate().getMonth());
//			System.out.println("----");
			
			
			// ----------------------------------------
			// BLOQUE PARA PROCESAR LOS ELEMENTOS
			// ----------------------------------------

			// Se tienen que ir guardando los element en un Map para poderlos asociar en los
			// Relations
			if (vista.getElement() != null) {
				// Se obtienen los elementos de la vista de archimate
				for (Element element : vista.getElement()) {
					// Se verifica que el elemento fue de los seleccionados para el boi
					if (elementsName.get(element.getName()) != null) {
						
						// Se convierte a un elemento rebel_core y se agrega a la vista de rebel_core
						rebel_core.Element coreElement = giveMeACoreElement(element, true);
						
						if(elementsToRebelCore.get(coreElement.getName())==null) {
//							System.out.println("Adding "+coreElement.getName());
							archiView.getElement().add(coreElement);
							// Este Map se usa para almacenar las referencias de los elementos en rebel_core
							// Se usara para crear las relaciones en rebel_core
							elementsToRebelCore.put(coreElement.getName(), coreElement);
						}						
					}
				}
			}
			
			// ----------------------------------------
			// INI - BLOQUE PARA PROCESAR LOS ELEMENTOS - FORMA 2
			// ----------------------------------------
			
			
//			recursiveGetElementsRelated(vista, "Queuing Service", elementsToRebelCore, archiView);
			
			
//			elementsToRebelCore.forEach((key,value) -> System.out.println(key + " = " + value));
		
			// ----------------------------------------
			// FIN - BLOQUE PARA PROCESAR LOS ELEMENTOS - FORMA 2
			// ----------------------------------------
			

			// ----------------------------------------
			// BLOQUE PARA INSERTAR LAS RELACIONES
			// ----------------------------------------
			if (vista.getRelation() != null) {

				for (Relation relation : vista.getRelation()) {

					// Validar si en el source o en el target, están los elementos selecionados para
					// el boi
					if (elementsToRebelCore.get(relation.getSource().getName()) != null
							|| elementsToRebelCore.get(relation.getTarget().getName()) != null) {

						// Crea la relación
						rebel_core.Relation coreRelation = giveMeACoreRelation(relation);

						// Asocia los elementos de origen y destino
						if (elementsToRebelCore.get(relation.getSource().getName()) != null)
							coreRelation.setSource(elementsToRebelCore.get(relation.getSource().getName()));
						else {
							/* Se valida que el elemento no haya sido insertado anteriormente.
							 */
							rebel_core.Element myElement = existeInsercionPreviaElemento(archiView, relation.getSource().getId());
							if(myElement==null) {
								rebel_core.Element coreElement = giveMeACoreElement(relation.getSource(), false);
								coreRelation.setSource(coreElement);
								archiView.getElement().add(coreElement);
							}else {
								coreRelation.setSource(myElement);
							}
							
							// Esto se hacía para evitar los IDs duplicados en los vecinos de los elementos
							// seleccionados. El problema es que lleva a vincular más elementos de los deseados.
							// elementsToRebelCore.put(coreElement.getName(), coreElement);
						}

						if (elementsToRebelCore.get(relation.getTarget().getName()) != null) {
							coreRelation.setTarget(elementsToRebelCore.get(relation.getTarget().getName()));
						} else {
							/* Se valida que el elemento no haya sido insertado anteriormente.
							 */
							rebel_core.Element myElement = existeInsercionPreviaElemento(archiView, relation.getTarget().getId());
							if(myElement==null) {
								rebel_core.Element coreElement = giveMeACoreElement(relation.getTarget(), false);
								coreRelation.setTarget(coreElement);
								archiView.getElement().add(coreElement);
							}else {
								coreRelation.setTarget(myElement);
							}							
							
							// Esto se hacía para evitar los IDs duplicados en los vecinos de los elementos
							// seleccionados. El problema es que lleva a vincular más elementos de los deseados.
							// elementsToRebelCore.put(coreElement.getName(), coreElement);
						}

						archiView.getRelation().add(coreRelation);
					}
				}
			}

			cModel.getProject().getView().add(archiView);
			
		}
	}
	
	/**
	 * Este metodo valida si el elemento fue previamente agregado a la vista, para evitar
	 * volverlo a hacer, y por tanto, generar IDs duplicados.
	 * @param archiView
	 * @return
	 */
	public rebel_core.Element existeInsercionPreviaElemento(ArchimateView archiView, String id) {
		
		for(rebel_core.Element element : archiView.getElement()) {
			if(element.getId().equals(id)) {
				return element;
			}
		}
		
		return null;
		
	}
	
	/**
	 * Este es un metodo recursivo que se usa para poder extraer las relaiones asociadas
	 * al elemento seleccionado para el BOI. 
	 * Este metodo busca obtener los nombres de los elementos que se usarán para la creación
	 * del BOI. 
	 * @param elementsName Contiene la lista de los nombres de los elementos que irán para el boi
	 */
	private void recursiveGetElementsRelated(View vista, String elementName, 
			HashMap<String, rebel_core.Element> elementsToRebelCore, ArchimateView archiView) {
		
//		System.out.println("Recursive");
		
		if (vista.getRelation() != null) {
			// Se obtienen los elementos de la vista de archimate
			for (Relation relation : vista.getRelation()) {
				// Se verifica que el elemento fue de los seleccionados para el boi
				if (elementName.equals(relation.getSource().getName())) {					
					
					String relationElementName = relation.getTarget().getName();
					
					if(elementsToRebelCore.get(relationElementName)==null) {
						
						rebel_core.Element coreElement = giveMeACoreElement(relation.getTarget(), false);
						archiView.getElement().add(coreElement);
						
												
						elementsToRebelCore.put(relationElementName, coreElement);
						
						if(relation.getTarget().getType()!=rebel_archimate.ELEMENTTYPE.DATAOBJECT)						
							recursiveGetElementsRelated(vista, relationElementName, elementsToRebelCore, archiView);
					}					
				}else if (elementName.equals(relation.getTarget().getName())) {		
					
					String relationElementName = relation.getSource().getName();
					
					if(elementsToRebelCore.get(relationElementName)==null) {
						
						rebel_core.Element coreElement = giveMeACoreElement(relation.getSource(), false);
						archiView.getElement().add(coreElement);
						
												
						elementsToRebelCore.put(relationElementName, coreElement);
						
						if(relation.getSource().getType()!=rebel_archimate.ELEMENTTYPE.DATAOBJECT)
							recursiveGetElementsRelated(vista, relationElementName, elementsToRebelCore, archiView);
					}	
				} 
			}
		}
	}

	private rebel_core.Relation giveMeACoreRelation(Relation relation) {
		rebel_core.Relation coreRelation = cModel.createRelation(relation.getId());

		String relationType = relation.getType().getLiteral();
		
		switch(relationType) {
			case "REALIZATION":
				coreRelation.setType(RELATIONTYPE.REALIZATION);
				break;
			case "AGGREGATION":
				coreRelation.setType(RELATIONTYPE.AGGREGATION);
				break;
			case "INFLUENCE":
				coreRelation.setType(RELATIONTYPE.INFLUENCE);
				break;
			case "TRIGGERING":
				coreRelation.setType(RELATIONTYPE.TRIGGERING);
				break;
			case "SERVING":
				coreRelation.setType(RELATIONTYPE.SERVING);
				break;
			case "ASSOCIATION":
				coreRelation.setType(RELATIONTYPE.ASSOCIATION);
				break;
			case "COMPOSITION":
				coreRelation.setType(RELATIONTYPE.COMPOSITION);
				break;
		}
		

		return coreRelation;
	}

	/**
	 * Este metodo toma el elemento Archimate y lo convierte en un elemento Core.
	 * @param element Elemento de Archimate
	 * @param isBoiElement Establece si es uno de los elementos del boi seleccionados en la página. 
	 * 						Si es falso, significa que un elemento relacionado a un element core.
	 * @return
	 */
	private rebel_core.Element giveMeACoreElement(Element element, boolean isBoiElement) {
		rebel_core.Element coreElement = cModel.createElement(element.getId(), element.getName());

		coreElement.setPosX(element.getPosX());
		coreElement.setPosY(element.getPosY());
		coreElement.setWidth(element.getWidth());
		coreElement.setHeight(element.getHeight());
		coreElement.setGrouper(element.isGrouper());
		coreElement.setBoiElement(isBoiElement);
		
		if(element.getName().contentEquals("Guidance")) {
			System.out.println("Guidance app serv type = " + element.getApplicationServiceType());
		}
		
		if(element.getApplicationServiceType()!=null) {
			switch (element.getApplicationServiceType().getLiteral()) {
			case "EVENT":
				coreElement.setApplicationServiceType(APPLICATIONSERVICETYPE.EVENT);
				break;
			case "PROCEDURE_CALL":
				coreElement.setApplicationServiceType(APPLICATIONSERVICETYPE.PROCEDURE_CALL);
				break;
			}
		}
		
		// --------------------------------------------------
		// PARA PROCESAR LAS PROPIEDADES DE LOS SERVICIOS
		// --------------------------------------------------
		switch (element.getSync().getLiteral()) {
		case "SYNC":
			coreElement.setSync(SyncType.SYNC);
			break;
		case "ASYNC":
			coreElement.setSync(SyncType.ASYNC);
			break;	
		default:
			break;
		}
		
		switch (element.getDelivery().getLiteral()) {
		case "AT_LEAST_ONE":
			coreElement.setDelivery(DeliveryModel.AT_LEAST_ONE);
			break;
		case "AT_MOST_ONE":
			coreElement.setDelivery(DeliveryModel.AT_MOST_ONE);
			break;	
		case "EXACTLY_ONE":
			coreElement.setDelivery(DeliveryModel.EXACTLY_ONE);
			break;	
		case "BEST_EFFORT":
			coreElement.setDelivery(DeliveryModel.BEST_EFFORT);
			break;	
		default:
			break;
		}
		
		switch (element.getNotification().getLiteral()) {
		case "PUBSUB":
			coreElement.setNotification(NotificationModel.PUBSUB);
			break;
		case "QUEUED":
			coreElement.setNotification(NotificationModel.QUEUED);
			break;	
		case "CENTRAL":
			coreElement.setNotification(NotificationModel.CENTRAL);
			break;	
		case "POLLED":
			coreElement.setNotification(NotificationModel.POLLED);
			break;	
		default:
			break;
		}
		
		switch (element.getBuffering().getLiteral()) {
		case "UNBUFFERED":
			coreElement.setBuffering(Buffering.UNBUFFERED);
			break;
		case "BUFFERED":
			coreElement.setBuffering(Buffering.BUFFERED);
			break;	
		default:
			break;
		}
		
		switch (element.getThroughput().getLiteral()) {
		case "HIGH_ORDER":
			coreElement.setThroughput(Throughput.HIGH_ORDER);
			break;
		case "ATOMIC":
			coreElement.setThroughput(Throughput.ATOMIC);
			break;	
		default:
			break;
		}
		
		
		// sync, delivery, notification, buffering, throughput;
		
		// --------------------------------------------------
		// PARA PROCESAR LOS TIPOS DE ELEMENTOS
		// --------------------------------------------------
		
		String literal = element.getType().getLiteral();
		
		switch(literal) {
			case "BUSINESS_SERVICE": 
				coreElement.setType(rebel_core.ELEMENTTYPE.BUSINESS_SERVICE);
				break;
			case "BUSINESS_PROCESS":
				coreElement.setType(rebel_core.ELEMENTTYPE.BUSINESS_PROCESS);
				break;
			case "BUSINESS_COLLABORATION":
				coreElement.setType(rebel_core.ELEMENTTYPE.BUSINESS_COLLABORATION);
				break;
			case "APPLICATION_SERVICE":
				coreElement.setType(rebel_core.ELEMENTTYPE.APPLICATION_SERVICE);
				break;
			case "APPLICATION_COMPONENT":
				coreElement.setType(rebel_core.ELEMENTTYPE.APPLICATION_COMPONENT);
				break;
			case "APPLICATION_COLLABORATION":
				coreElement.setType(rebel_core.ELEMENTTYPE.APPLICATION_COLLABORATION);
				break;
			case "APPLICATION_INTERFACE":
				coreElement.setType(rebel_core.ELEMENTTYPE.APPLICATION_INTERFACE);
				break;
			case "MOTIVATION_STAKEHOLDER":
				coreElement.setType(rebel_core.ELEMENTTYPE.MOTIVATION_STAKEHOLDER);
				break;
			case "MOTIVATION_DRIVER":
				coreElement.setType(rebel_core.ELEMENTTYPE.MOTIVATION_DRIVER);
				break;
			case "MOTIVATION_GOAL":
				coreElement.setType(rebel_core.ELEMENTTYPE.MOTIVATION_GOAL);
				break;
			case "MOTIVATION_OUTCOME":
				coreElement.setType(rebel_core.ELEMENTTYPE.MOTIVATION_OUTCOME);
				break;
			case "MOTIVATION_REQUIREMENT":
				coreElement.setType(rebel_core.ELEMENTTYPE.MOTIVATION_REQUIREMENT);
				break;
		}
		
		

		return coreElement;
	}

	/**
	 * Obtiene los nombres de las vistas que tienen uno o más de los elementos
	 * solicitados para la creación del boi. Este método se invoca desde
	 * boiCreationArchi().
	 */
	private List<rebel_archimate.View> obtenerVistasConCoincidencias(List<Model> archimateModels,
			HashMap<String, String> elementsName) throws Exception {

		// Lista con nombres unicos retornados.
		List<rebel_archimate.View> vistasParaRebel = new ArrayList<rebel_archimate.View>();

		if (archimateModels != null && archimateModels.size() > 0) {
			for (int t = 0; t < archimateModels.size(); t++) {
				Model archiModel = archimateModels.get(t);

//				System.out.println("archiModel.getName() "+archiModel.getName());
				
				Resource resourceModel = amModel.loadResource(archiModel.getRute());
				rebel_archimate.Project projectArchimate = (rebel_archimate.Project) resourceModel.getContents().get(0);
				
				
				
				if (projectArchimate != null) {
					// Navego la vista para obtener los elementos y sus relaciones
					rebel_archimate.View vistaArchi = projectArchimate.getView().get(0);

					if (vistaArchi != null) {

						if (vistaArchi.getElement() != null) {

							boolean encontrado = false;
							
							// Se recorren los elementos de la vista para buscar coincidencia
							for (rebel_archimate.Element element : vistaArchi.getElement()) {

								// Esta lista de elementos fueron obtenidos a partir de la url
								if (elementsName.get(element.getName()) != null) {

									//hset.add(vistaArchi);
									encontrado = true;
									break;
								}
							}
							
							if(encontrado) {
								vistasParaRebel.add(vistaArchi);
							}
							
						}

					}

				}
			}
		}
		
		
		
		

//		if (hset.size() > 0) {
//			vistasParaRebel = new ArrayList<rebel_archimate.View>(hset);
//		}

		
		
		return vistasParaRebel;
	}

	private String obtenerPrefijoNombreModel(String baseModel) {
		String prefijo = "";

		prefijo = baseModel.substring(0, baseModel.indexOf("_"));

		return prefijo;
	}

}
