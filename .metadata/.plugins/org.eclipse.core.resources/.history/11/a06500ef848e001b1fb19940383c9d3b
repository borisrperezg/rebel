package uniandes.rebel.archimate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import rebel_archimate.Buffering;
import rebel_archimate.DeliveryModel;
import rebel_archimate.ELEMENTTYPE;
import rebel_archimate.NotificationModel;
import rebel_archimate.RELATIONTYPE;
import rebel_archimate.SyncType;
import rebel_archimate.Throughput;
import rebel_archimate.View;

public class Processing {

	private AMModel amModel;
	private HashMap<String, rebel_archimate.Element> rebelElements;
	// ID, AMElement
	private HashMap<String, AMElement> sourceModelElements;
	// ID, AMElement
	private HashMap<String, AMRelations> sourceModelRelations;
	// ID, AMElement
	private HashMap<String, Element> sourceModelViews;
	
	private HashMap<String, String> diagramObjects;

	
	public static void main(String[] args) throws Exception {
		Processing p = new Processing();
		p.execute("Paulo", "ABC_20201118.archimate");
//		String date = "20200820";
		
	}
	
	public Processing(){
		amModel = new AMModel();
	}

	/**
	 * Este metodo se llama apenas se carga el archivo por la gui.
	 * @param project
	 * @param fileName El filename debe tener al final una subraya para separar la version o fecha del archivo. 
	 * Esto se usa para diferenciar las vistas una vez quedan cargadas en el sistema.
	 * @return
	 * @throws Exception
	 */
	public boolean execute(String project, String fileName) throws Exception {
		String file = "/Users/borisperezg/temporaluploadfolder/" + fileName;

		sourceModelElements = new HashMap<String, AMElement>();
		// ID, AMElement
		sourceModelRelations = new HashMap<String, AMRelations>();
		// ID, AMElement
		sourceModelViews = new HashMap<String, Element>();

		// Open and read XML pasado como parametro
		Document doc = ArchimateUtil.parseXML(file);
		
		// Se saca la informacion de los nodos
		processingNodes(doc);
		
		// Se obtiene el prefijo que correspondera a lo que hay entre la subraya "_" y el ".extesion"
		String prefijo = obtenerFechaDelNombre(fileName);
		
		// Se crean y se persisten por separado cada View
		buildViewModels(project, prefijo);
		
		return true;
	}
	
	/**
	 * Este metodo se encarga de crear un modelo, por cada vista de Archimate. Un modelo corresponde a un archivo físico, y a una entrada en la BD.
	 */
	@SuppressWarnings("deprecation")
	private void buildViewModels(String project, String prefijo) throws Exception {
		
		if(sourceModelViews.size()>0) {
		
			for (Map.Entry<String, Element> modelView : sourceModelViews.entrySet()) {
//		        modelView.getKey(); 
//        		modelView.getValue();
				
				// Para almacenar los Elements en el MM de destino.
				// Estos se usaran para llevar el registro de los objetos y poderles crear las relaciones.
				rebelElements = new HashMap<String, rebel_archimate.Element>(); 
				
				Element element = modelView.getValue(); 
				
				String elementID = element.getAttribute("id");
				String elementName = element.getAttribute("name");
				
				amModel = new AMModel();
				
				// Todas las vistas se llamaran igual. Unicamente el nombre del xml tendrá
				// concatenado la version/fecha del archivo original.
				amModel.createModel(project, elementName+"_"+prefijo);
				
				// Todas las vistas se llamaran igual. Unicamente el nombre del xml tendrá
				// concatenado la version/fecha del archivo original.
				View view = amModel.createView(elementID, elementName+"_"+prefijo);
				
				// Significa que corresponde a una fecha en formato yyyymmdd
				if(prefijo.length()==8) {
					int year = Integer.parseInt(prefijo.substring(0, 4));
					int month = Integer.parseInt(prefijo.substring(4, 6));
					int day = Integer.parseInt(prefijo.substring(6, 8));
					
					/* El año queda bien generado, pero el problema es que al crear el modelo, y por 
					 * alguna razón desconocida, se guarda con una fecha sumándole 1900.
					 * Entonces a la fecha obtenida, se le resta 1900.
					 * Para lo mismo para el mes. Se debe restar uno porque inicia en 0.
					 */
					
					view.setDate(new Date(year-1900, month-1, day));
					
//					System.out.println(view.getName());
//					System.out.println(view.getDate().getYear() + " - " + view.getDate().getMonth());
//					System.out.println("----");
					
				}
				
				// ----------------------------------------------------------------
				// VINCULACION DE ELEMENTOS Y SUS RELACIONES
				// ----------------------------------------------------------------
				
				view.getElement().addAll(buildElementsIntoView(element));				
				view.getRelation().addAll(buildRelationsIntoView(element));
				
				
				// ----------------------------------------------------------------
				// ASOCIACION Y ALMACENAMIENTO
				// ----------------------------------------------------------------
				
				amModel.setViewToProject(view);
				amModel.storeModel();
				
				// ----------------------------------------------------------------
				// CONSTRUCCION DEL XML PARA VISUALIZACION
				// ----------------------------------------------------------------
				
				boolean exito = (new ArchiToXML()).xmlCreation(amModel.getModelName(), project);
				if(!exito) {
					break;
				}
				
		    }
		}
	}
	
	/**
	 * Se recibe el objeto Element, que corresponde a la vista de un diagrama en Archimate.
	 * Se busca obtener las relaciones asociadas a cada elemento.
	 * @param element
	 * @return
	 */
	private List<rebel_archimate.Relation> buildRelationsIntoView(Element element) {
		List<rebel_archimate.Relation> listRelations = new ArrayList<rebel_archimate.Relation>();
		
		diagramObjects = new HashMap<String, String>();
		
		if(element.getAttribute("xsi:type").equals("archimate:ArchimateDiagramModel")) {
//			System.out.println("View name = "+element.getAttribute("name"));
			// Se saca el Value, y se obtienen todos los elementos que sean child
			// Cada element corresponde a un Diagrama o Vista
			
			// Recorro la lista primero para sacar la lista de DiagramObjects y los ArchimateElements.
			NodeList childNodes = element.getElementsByTagName("child");
			if(childNodes!=null) {
				for (int i = 0; i < childNodes.getLength(); i++) {
					Node childNode = childNodes.item(i);
					if (childNode.getNodeType() == Node.ELEMENT_NODE) {
						Element childrenElement = (Element) childNode;
						
						diagramObjects.put(childrenElement.getAttribute("id"), childrenElement.getAttribute("archimateElement"));
					}
				}
			}
			
						
			// Luego de haber obtenido la información de cada DiagramObject para obtener el id del elemento,
			// se procede a recorrer nuevamente la lista, para armar las relaciones
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node childNode = childNodes.item(i);
				if (childNode.getNodeType() == Node.ELEMENT_NODE) {
					Element childrenElement = (Element) childNode;
					
//					System.out.println("Child ID = "+childrenElement.getAttribute("id"));
					
					// Se obtiene el Bounds para sacar las dimensiones y posición
					NodeList connectionNodes = childrenElement.getElementsByTagName("sourceConnection");
					
//					System.out.println("Total = "+connectionNodes.getLength());
					
					if(connectionNodes!=null) {
						for(int x=0;x<connectionNodes.getLength();x++) {
							Node connectionNode = connectionNodes.item(x);
							Element connectionElement = (Element) connectionNode;
							
							if(connectionElement!=null) {
								
								if(connectionElement.getAttribute("source").equals(childrenElement.getAttribute("id"))) {
									
									rebel_archimate.Element elemSource = rebelElements.get(childrenElement.getAttribute("archimateElement"));
									
//									System.out.println("Element Id Source = "+childrenElement.getAttribute("archimateElement")+" - "+elemSource.getName());
//									System.out.println("Conex Id : "+connectionElement.getAttribute("id"));
//									System.out.println("DiagramObject Target Id : "+connectionElement.getAttribute("target"));
									
									String elementIdTarget = diagramObjects.get(connectionElement.getAttribute("target"));
									rebel_archimate.Element elemTarget = rebelElements.get(elementIdTarget);
									
//									System.out.println("Element Target Name : "+elemTarget.getName());
//									System.out.println("Relation Id : "+connectionElement.getAttribute("archimateRelationship")+" - "+sourceModelRelations.get(connectionElement.getAttribute("archimateRelationship")).getType());
//									System.out.println("******************************");
		
									rebel_archimate.Relation relation = amModel.createRelation();
									relation.setSource(elemSource);
									relation.setTarget(elemTarget);
									relation.setType(getRelationType(sourceModelRelations.get(connectionElement.getAttribute("archimateRelationship")).getType()));
									relation.setId(connectionElement.getAttribute("id"));
									
									listRelations.add(relation);
								}
							}
						}
					}
				}
			}
			
		}
		
		return listRelations;
	}
	
	/**
	 * Se recibe el objeto Element, que corresponde a la vista de un diagrama en Archimate.
	 * 
	 * Este metodo solo obtiene las caracteristicas de los elementos. Las relaciones se generan
	 * a traves de otro metodo.
	 * @param element
	 * @return
	 */
	private List<rebel_archimate.Element> buildElementsIntoView(Element element) {
		
		List<rebel_archimate.Element> listElements = new ArrayList<rebel_archimate.Element>();
		
		// Se saca el Value, y se obtienen todos los elementos que sean child
		NodeList childNodes = element.getElementsByTagName("child");
		if(childNodes!=null) {
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node childNode = childNodes.item(i);
				if (childNode.getNodeType() == Node.ELEMENT_NODE) {
					Element childrenElement = (Element) childNode;
					
					/*
					 * Esta pregunta se hace, porque al inicio, se trae todos los child, incluidos los nietos.
					 * Entonces, cuando se revisa un child, se pregunta si ademas tiene otros childs. En caso 
					 * de tenerlos, los procesa y los agrega a rebelElements. Con eso, cuando los escuentre por
					 * fuera, no lo procesa ni agrega.
					 */
					AMElement amElement = sourceModelElements.get(childrenElement.getAttribute("archimateElement"));
					if(rebelElements.get(amElement.getId())==null) {
					
						// Se debe indicar que es agrupador
						rebel_archimate.Element archiRebelElement = procesarChild(childrenElement, -1, -1);
						listElements.add(archiRebelElement);
						rebelElements.put(archiRebelElement.getId(), archiRebelElement);
						
						// -----------------------------------
						// Inclusion de hijos. 
						// Esto se hace para los casos en que hay 
						// elementos que contienen a otros.
						// -----------------------------------
						NodeList grandChildNodes = childrenElement.getElementsByTagName("child");
						if(grandChildNodes!=null && grandChildNodes.getLength()>0) {
							
							archiRebelElement.setGrouper(true);
							
							for (int j = 0; j < grandChildNodes.getLength(); j++) {
								Node grandchildNode = grandChildNodes.item(j);
								if (grandchildNode.getNodeType() == Node.ELEMENT_NODE) {
									Element grandchildrenElement = (Element) grandchildNode;
									
									rebel_archimate.Element childArchiRebelElement = procesarChild(grandchildrenElement, archiRebelElement.getPosX(), archiRebelElement.getPosY());
									listElements.add(childArchiRebelElement);
									rebelElements.put(childArchiRebelElement.getId(), childArchiRebelElement);
									
									
								}
							}
						}
					}
					
				}
			}
		}
		
		return listElements;
	}
	
	/**
	 * Este metodo genera el elemento. Fue especialmente diseñado para los casos en que hay nested child.
	 * En ese orden de ideas, si el child es nested, se reciben como parámetros la posición del padre, ya 
	 * que el child tiene posiciones relativas.
	 * @param childrenElement
	 * @param xPadre
	 * @param yPadre
	 * @return
	 */
	private rebel_archimate.Element procesarChild(Element childrenElement, int xPadre, int yPadre) {
		
		int posX = 0, posY = 0;
		int width = 0, height = 0;
		
		// Se obtiene el Bounds para sacar las dimensiones y posición
		NodeList boundNodes = childrenElement.getElementsByTagName("bounds");
//		System.out.println("Bound size = "+boundNodes.getLength());
		if(boundNodes!=null) {
			Node boundNode = boundNodes.item(0);
			
//			System.out.println("boundNode = "+boundNode);
			
			Element boundElement = (Element) boundNode;
			
//			System.out.println("boundElement = "+boundElement);
			
			posX = boundElement.getAttribute("x")!=null?Integer.parseInt(boundElement.getAttribute("x")):0;
			posY = boundElement.getAttribute("y")!=null?Integer.parseInt(boundElement.getAttribute("y")):0;
			width = boundElement.getAttribute("width")!=null?Integer.parseInt(boundElement.getAttribute("width")):0;
			height = boundElement.getAttribute("height")!=null?Integer.parseInt(boundElement.getAttribute("height")):0;
		}
		
		// Se obtiene el objeto AMElement que contiene la información obtenida del element de Archimate
		AMElement amElement = sourceModelElements.get(childrenElement.getAttribute("archimateElement"));
		
		// Se crea el element de rebel archimate, para asociarlo a la vista
		rebel_archimate.Element archiRebelElement = amModel.createElement();
		archiRebelElement.setName(amElement.getName());
		
		// Se obtienen las propiedades
		processingElementProperties(archiRebelElement, amElement);
		
		archiRebelElement.setId(amElement.getId());
		archiRebelElement.setType(getElementType(amElement.getType()));
		if(xPadre>0) {
			archiRebelElement.setPosX(posX+xPadre);
			archiRebelElement.setPosY(posY+yPadre);
		}else {
			archiRebelElement.setPosX(posX);
			archiRebelElement.setPosY(posY);
		}
		archiRebelElement.setWidth(width);
		archiRebelElement.setHeight(height);
		
		return archiRebelElement;
	}
	
	/**
	 * Este metodo se encarga de procesar las propiedades de los elementos tipo Service.
	 * @param archiRebelElement
	 * @param amElement
	 */
	private void processingElementProperties(rebel_archimate.Element archiRebelElement, AMElement amElement) {
		
		if(amElement.getSync()!=null) {
			switch (amElement.getSync().toLowerCase()) {
			case "sync":
				archiRebelElement.setSync(SyncType.SYNC);
				break;
			case "async":
				archiRebelElement.setSync(SyncType.ASYNC);
				break;
			default:
				break;
			}			
		}
		
		if(amElement.getDelivery()!=null) {
			switch (amElement.getDelivery().toLowerCase()) {
			case "at_least_one":
				archiRebelElement.setDelivery(DeliveryModel.AT_LEAST_ONE);
				break;
			case "at_most_one":
				archiRebelElement.setDelivery(DeliveryModel.AT_MOST_ONE);
				break;
			case "exactly_one":
				archiRebelElement.setDelivery(DeliveryModel.EXACTLY_ONE);
				break;
			case "best_effort":
				archiRebelElement.setDelivery(DeliveryModel.BEST_EFFORT);
				break;
			default:
				break;
			}			
		}
		
		if(amElement.getNotification()!=null) {
			switch (amElement.getNotification().toLowerCase()) {
			case "pubsub":
				archiRebelElement.setNotification(NotificationModel.PUBSUB);
				break;
			case "queued":
				archiRebelElement.setNotification(NotificationModel.QUEUED);
				break;
			case "central":
				archiRebelElement.setNotification(NotificationModel.CENTRAL);
				break;
			case "polled":
				archiRebelElement.setNotification(NotificationModel.POLLED);
				break;
			default:
				break;
			}			
		}
		
		if(amElement.getBuffering()!=null) {
			switch (amElement.getBuffering().toLowerCase()) {
			case "unbuffered":
				archiRebelElement.setBuffering(Buffering.UNBUFFERED);
				break;
			case "buffered":
				archiRebelElement.setBuffering(Buffering.BUFFERED);
				break;			
			default:
				break;
			}			
		}
		
		if(amElement.getThroughput()!=null) {
			switch (amElement.getThroughput().toLowerCase()) {
			case "high_order":
				archiRebelElement.setThroughput(Throughput.HIGH_ORDER);
				break;
			case "atomic":
				archiRebelElement.setThroughput(Throughput.ATOMIC);
				break;			
			default:
				break;
			}			
		}
		
		
		// sync, delivery, notification, buffering, throughput;
		
		
	}
	
	
	/**
	 * Este metodo se encarga de recorrer el xml y sacar la informacion de los nodos. Para el caso de las vistas, guarda el elemento del xml para su posterior procesamiento
	 * @param doc
	 * @param sourceModelElements
	 * @param sourceModelRelations
	 * @param sourceModelViews
	 */
	private void processingNodes(Document doc) {
		
		// Obtengo la instancia del proyecto
//		Project proj = (Project) resource.getContents().get(0);
		
		// Get properties of diagram
		NodeList objectNodes = doc.getElementsByTagName("folder");
		for (int i = 0; i < objectNodes.getLength(); i++) {
			Node connectorNode = objectNodes.item(i);
			if (connectorNode.getNodeType() == Node.ELEMENT_NODE) {
				Element objectElement = (Element) connectorNode;
				if (objectElement.hasChildNodes()) {

					// Corresponden a las Vistas
					if (objectElement.getAttribute("type").equals("diagrams")) {
						NodeList childrenNodes = objectElement.getChildNodes();
						for (int j = 0; j < childrenNodes.getLength(); j++) {
							Node childrenNode = childrenNodes.item(j);
							if (childrenNode.getNodeType() == Node.ELEMENT_NODE) {
								Element childrenElement = (Element) childrenNode;

								sourceModelViews.put(childrenElement.getAttribute("id"), childrenElement);
								
//								// Se crea la vista
//								View view = amModel.createView(childrenElement.getAttribute("name"));
//								proj.getView().add(view);								

							}

						}
					} else if (objectElement.getAttribute("type").equals("relations")) {
						NodeList childrenNodes = objectElement.getChildNodes();
						for (int j = 0; j < childrenNodes.getLength(); j++) {
							Node childrenNode = childrenNodes.item(j);
							if (childrenNode.getNodeType() == Node.ELEMENT_NODE) {
								Element childrenElement = (Element) childrenNode;

								AMRelations elem = new AMRelations();
								elem.setId(childrenElement.getAttribute("id"));
								elem.setType(childrenElement.getAttribute("xsi:type"));
								elem.setSource(childrenElement.getAttribute("source"));
								elem.setTarget(childrenElement.getAttribute("target"));
								
								sourceModelRelations.put(childrenElement.getAttribute("id"), elem);

							}

						}
					// Filtro para recorrer los folder que son tipo business, strategy, application, etc
					} else if (!objectElement.getAttribute("type").equals("other")
							&& !objectElement.getAttribute("type").equals("implementation_migration")) {

						NodeList childrenNodes = objectElement.getChildNodes();
						for (int j = 0; j < childrenNodes.getLength(); j++) {
							Node childrenNode = childrenNodes.item(j);
							if (childrenNode.getNodeType() == Node.ELEMENT_NODE) {
								Element childrenElement = (Element) childrenNode;

								AMElement elem = new AMElement();
								elem.setId(childrenElement.getAttribute("id"));
								elem.setName(childrenElement.getAttribute("name"));
								
								String elementType = childrenElement.getAttribute("xsi:type"); 
								
								elem.setType(elementType);
								
								// Preguntar si en el tipo aparece la palabra Service al final
								if(elementType.endsWith("Service")) {
								
									NodeList propertiesNodes = childrenElement.getElementsByTagName("property");
									if(propertiesNodes!=null) {
										for (int x = 0; x < propertiesNodes.getLength(); x++) {
											Node propertyNode = propertiesNodes.item(x);
											if (propertyNode.getNodeType() == Node.ELEMENT_NODE) {
												Element propertyElement = (Element) propertyNode;
												
												String key = propertyElement.getAttribute("key");
												String value = propertyElement.getAttribute("value");
												
												if(key.equals("sync"))
													elem.setSync(value);
												
												if(key.equals("delivery"))
													elem.setDelivery(value);
												
												if(key.equals("notification"))
													elem.setNotification(value);
												
												if(key.equals("buffering"))
													elem.setBuffering(value);
												
												if(key.equals("throughput"))
													elem.setThroughput(value);
												
											}
										}
									}
								}
								
								sourceModelElements.put(childrenElement.getAttribute("id"), elem);

							}
						}
					}
				}
			}
		}
	}
	
	/** 
	 * Este metodo toma el tipo de elemento del modelo de Archi y lo 
	 * transforma al MM de Archimate en Rebel
	 * @param elementType
	 * @return
	 */
	private ELEMENTTYPE getElementType(String elementType) {
		
		if(elementType.equals("archimate:Stakeholder")) // <------
			return ELEMENTTYPE.MOTIVATION_STAKEHOLDER;
		else if(elementType.equals("archimate:Driver")) // <------
			return ELEMENTTYPE.MOTIVATION_DRIVER;
		else if(elementType.equals("archimate:Goal")) // <------
			return ELEMENTTYPE.MOTIVATION_GOAL;
		else if(elementType.equals("archimate:Outcome")) // <------
			return ELEMENTTYPE.MOTIVATION_OUTCOME;
		else if(elementType.equals("archimate:Requirement")) // <------
			return ELEMENTTYPE.MOTIVATION_REQUIREMENT;
		
		if(elementType.equals("archimate:BusinessService")) // <------
			return ELEMENTTYPE.BUSINESS_SERVICE;
		else if(elementType.equals("archimate:BusinessProcess")) // <------
			return ELEMENTTYPE.BUSINESS_PROCESS;
		else if(elementType.equals("archimate:BusinessCollaboration")) // <------
			return ELEMENTTYPE.BUSINESS_COLLABORATION;
		
		
		else if(elementType.equals("archimate:ApplicationService")) // <------
			return ELEMENTTYPE.APPLICATION_SERVICE;
		else if(elementType.equals("archimate:ApplicationComponent")) // <------
			return ELEMENTTYPE.APPLICATION_COMPONENT;		
		else if(elementType.equals("archimate:ApplicationCollaboration")) // <------
			return ELEMENTTYPE.APPLICATION_COLLABORATION;
		else if(elementType.equals("archimate:ApplicationInterface")) // <------
			return ELEMENTTYPE.APPLICATION_INTERFACE;
		
		else if(elementType.equals("archimate:DataObject")) // <------
			return ELEMENTTYPE.DATAOBJECT;
		
		return null;
			
	}
	
	private RELATIONTYPE getRelationType(String relationType) {
		if(relationType.equals("archimate:RealizationRelationship"))
			return RELATIONTYPE.REALIZATION;
		else if(relationType.equals("archimate:ServingRelationship"))
			return RELATIONTYPE.SERVING;
		else if(relationType.equals("archimate:TriggeringRelationship"))
			return RELATIONTYPE.TRIGGERING;
		else if(relationType.equals("archimate:AccessRelationship"))
			return RELATIONTYPE.ACCESS;
		else if(relationType.equals("archimate:CompositionRelationship"))
			return RELATIONTYPE.COMPOSITION;
		else if(relationType.equals("archimate:AssociationRelationship"))
			return RELATIONTYPE.ASSOCIATION;
		
		return null;
	}
	
	private String obtenerFechaDelNombre(String fileName) {
		
		Pattern rId = Pattern.compile("[a-z|A-Z|\\d]+\\_([\\w|\\d]+)\\.[\\w|\\d]+");
		Matcher mId = rId.matcher(fileName);
		mId.find();
		
		String prefijo = "";
		
		try {
			if(mId.group(1)!=null)
				prefijo = mId.group(1);
		} catch (Exception e) {
			System.err.println("Processing.obtenerPrefijo ::: No match found");
		}
		
		return prefijo;
	}

}
