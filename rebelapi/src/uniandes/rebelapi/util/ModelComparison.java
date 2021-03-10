package uniandes.rebelapi.util;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import rebel_core.Action;
import rebel_core.Adaptor;
import rebel_core.Arbitrator;
import rebel_core.BlockOfInterest;
import rebel_core.Component;
import rebel_core.Connector;
import rebel_core.Distributor;
import rebel_core.Event;
import rebel_core.Fact;
import rebel_core.FunctionalView;
import rebel_core.Port;
import rebel_core.PortType;
import rebel_core.ProcedureCall;
import rebel_core.Project;
import rebel_core.Stream;
import uniandes.rebel.core.model.CoreModel;
import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.db.APIModelDerby;

/**
 * Clase implementada como Singleton para la asignación única
 * de los identificadores de los Fact. Este identificador es 
 * requerido para la posterior asignación del ADR con el Fact.
 * @author borisrainieroperezgutierrez
 *
 */
public class ModelComparison {
	
	private static ModelComparison singleton;
	private int factUniqueId;
	
	private CoreModel cModel;
	

	/**
	 * Se encarga de encontrar el mayor valor asignado a un Fact
	 * y contar desde ahí para los siguientes Id de asignación.
	 */
    private ModelComparison() {
    	
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

    public static ModelComparison getInstance() {
        if (singleton == null){
        	singleton = new ModelComparison();
        }        
        return singleton;
    }
    
    /**
     * Este metodo recibe el siguiente FactId que se usara.
     * Es importante que desde la creacion de los Fact de Archimate, 
     * se asegure de pasar el siguiente valor.
     * @param nextFactUniqueId
     */
    public void assingNextFactUniqueId(int nextFactUniqueId) {
    	factUniqueId = nextFactUniqueId;
    }
    
    @Override
    public ModelComparison clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase ModelComparison");
        }
        return null; 
    }
    
    private int nextFactId() {
    	factUniqueId++;
    	return factUniqueId;
    }
	
	public void comparisonOfModels(FunctionalView fvSource, FunctionalView fvDest, BlockOfInterest boi) {
		
		
		
//		Project project1 = CNCModel.getInstance().loadModel(modelNameSource);
//		Project project2 = null;
//		if(modelNameDest!=null)
//			project2 = CNCModel.getInstance().loadModel(modelNameDest);
		
		
		// *********************************
		// For Components
		
		Set<String> elementsList = new HashSet<String>();
		
		FunctionalView fvToLink = fvSource;
		
		HashMap<String, Object> elementsFV1 = getComponentsList(fvSource);
		HashMap<String, Object> elementsFV2 = null;
		if(fvDest!=null) {
			elementsFV2 = getComponentsList(fvDest);
			fvToLink = fvDest;
		}
		
		// obtengo el consolidado de los elementos encontrado en los functionalview a comparar.
		
		elementsList.addAll(elementsFV1.keySet());
		if(elementsFV2!=null)
			elementsList.addAll(elementsFV2.keySet());
		
		boi.getFact().addAll(compareComponentsBetweenModels(elementsList, elementsFV1, elementsFV2, fvToLink));
		
		// *********************************
		// For Connectors
		
		elementsList = new HashSet<String>();
		
		elementsFV1 = getConnectorsList(fvSource);
		elementsFV2 = null;
		if(fvDest!=null)
			elementsFV2 = getConnectorsList(fvDest);
		
		elementsList.addAll(elementsFV1.keySet());
		if(elementsFV2!=null)
			elementsList.addAll(elementsFV2.keySet());
		
		boi.getFact().addAll(compareConnectorsBetweenModels(elementsList, elementsFV1, elementsFV2, fvToLink));
		
	}
	
	public EList<Fact> compareComponentsBetweenModels(Set<String> elementsList, HashMap<String, Object> elementsFV1, 
			HashMap<String, Object> elementsFV2, FunctionalView fvToLink) {
		
		EList<Fact> facts = new BasicEList<Fact>();
		
		Iterator<String> it = elementsList.iterator();
		while(it.hasNext()) {
			String componentName = it.next();
			
			Component cFV1 = (Component)elementsFV1.get(componentName);
			Component cFV2 = null;
			if(elementsFV2!=null)
				cFV2 = (Component)elementsFV2.get(componentName);
			
			// Si existe en el modelo 1 y no existe en modelo 2
			if(cFV1!=null && elementsFV2==null) {
				
				facts.add(createFact(fvToLink, componentName, fvToLink.getDate(), "Component", "none", "Create"));
				
			}else if(cFV1!=null && cFV2==null) {
				
				facts.add(createFact(fvToLink, componentName, fvToLink.getDate(), "Component", "none", "Delete"));				
			}
			
			// Si no existe en el modelo 1 y sí existe en modelo 2
			if(cFV1==null && cFV2!=null) {
				
				facts.add(createFact(fvToLink, componentName, fvToLink.getDate(), "Component", "none", "Create"));
								
			}			
		}
		
		return facts;
	}
	
	public EList<Fact> compareConnectorsBetweenModels(Set<String> elementsList, HashMap<String, Object> elementsFV1, 
			HashMap<String, Object> elementsFV2, FunctionalView fvToLink) {
		
		EList<Fact> facts = new BasicEList<Fact>();
		
		
		Iterator<String> it = elementsList.iterator();
		while(it.hasNext()) {
			String connectorName = it.next();
			
			Connector cFV1 = (Connector)elementsFV1.get(connectorName);
			Connector cFV2 = null;
			if(elementsFV2!=null) {
				cFV2 = (Connector)elementsFV2.get(connectorName);
			}
			
			System.out.println("EPA");
			
			// ----------------------------------------
			// BLOQUE PARA IDENTIFICAR EL ORIGEN Y DESTINO DEL CONECTOR
			// ----------------------------------------
			
			String observations = "";
			if(cFV2!=null && cFV2.getRoles()!=null) {
			
				String idPort1 = cFV2.getRoles().get(0).getPort().getId();
				String typePort1 = cFV2.getRoles().get(0).getType().getLiteral();
				
				String idPort2 = cFV2.getRoles().get(1).getPort().getId();
				String typePort2 = cFV2.getRoles().get(1).getType().getLiteral();
				
				String sourceComp = "", targetComp = "";
				
				if(fvToLink!=null && fvToLink.getComponents()!=null) {
					for(int t=0;t<fvToLink.getComponents().size();t++){
						Component co = fvToLink.getComponents().get(t);
						if(co.getPorts()!=null) {
							for(int y=0;y<co.getPorts().size();y++) {
								Port portComp = co.getPorts().get(y);
								if(portComp.getId().equals(idPort1) || portComp.getId().equals(idPort2)) {
									if(portComp.getType()==PortType.PROVIDED) {
										sourceComp = co.getName();
									}else if(portComp.getType()==PortType.REQUIRED) {
										targetComp = co.getName();
									}
								}
							}
						}
					}
					observations = sourceComp +" -O)- " + targetComp;
				
				}
			}
			
			// ----------------------------------------
			// BLOQUE PARA CREAR EL FACT DE TIPO CONECTOR
			// ----------------------------------------
			
			// Si existe en el modelo 1 y no existe en modelo 2
			if(cFV1!=null && elementsFV2==null) {
				
				facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", observations, "Create"));
				
			}else if(cFV1!=null && cFV2==null) {
				
				facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "none", "Delete"));
								
			}
			
			// Si no existe en el modelo 1 y sí existe en modelo 2
			if(cFV1==null && cFV2!=null) {
				
				facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", observations, "Create"));
				
				String typeE2 = getConnectorType(cFV2);
				
				if(getConnectorType(cFV2)!=null && !getConnectorType(cFV2).equals("NONE")) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Type: "+typeE2, "Create"));
				}
				
				if(cFV2.getDelivery()!=null && !cFV2.getDelivery().toString().equals("NONE")) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Delivery type = "+cFV2.getDelivery(), "Create"));
				}
				
				if(cFV2.getBuffering()!=null && !cFV2.getBuffering().toString().equals("NONE")) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Buffering type = "+cFV2.getBuffering(), "Create"));
				}
				
				if(cFV2.getNotification()!=null && !cFV2.getNotification().toString().equals("NONE")) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Notification type = "+cFV2.getNotification(), "Create"));
				}
				
				if(cFV2.getProtocol()!=null && cFV2.getProtocol().length()>0 && !cFV2.getProtocol().equals("NONE")) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Protocol type = "+cFV2.getProtocol(), "Create"));
				}
					
				if(cFV2.getSync()!=null && !cFV2.getSync().toString().equals("NONE")) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Sync type = "+cFV2.getSync(), "Create"));
				}
				
				if(cFV2.getThroughput()!=null && !cFV2.getThroughput().toString().equals("NONE")) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Throughput type = "+cFV2.getThroughput(), "Create"));
				}
					
								
			}			
			
			// Existen en ambos modelos y se procede a comparar sus propiedades 
			if(cFV1!=null && cFV2!=null) {
					
				String typeE1 = getConnectorType(cFV1);
				String typeE2 = getConnectorType(cFV2);
				
				if(!typeE1.equals(typeE2)) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Type: "+typeE2, "Update"));
				}
				
				if(cFV1.getDelivery()!=cFV2.getDelivery()) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Delivery type = "+cFV2.getDelivery(), "Update"));
				}
				
				if(cFV1.getBuffering()!=cFV2.getBuffering()) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Buffering type = "+cFV2.getBuffering(), "Update"));
				}
				
				if(cFV1.getNotification()!=cFV2.getNotification()) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Notification type = "+cFV2.getNotification(), "Update"));
				}
				
				if(!cFV1.getProtocol().equals(cFV2.getProtocol())) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Protocol type = "+cFV2.getProtocol(), "Update"));
				}
					
				if(cFV1.getSync()!=cFV2.getSync()) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Sync type = "+cFV2.getSync(), "Update"));
				}
				
				if(cFV1.getThroughput()!=cFV2.getThroughput()) {
					facts.add(createFact(fvToLink, connectorName, fvToLink.getDate(), "Connector", "Change to Throughput type = "+cFV2.getThroughput(), "Update"));
				}
					
			}
		}
		return facts;
	}
	
	public Fact createFact(FunctionalView fv, String name, Date date, String type, String obs, String action) {
		Fact fact = cModel.createFact();
		
		fact.getFunctionalview().add(fv);
		fact.setElementName(name);
		fact.setDate(date);
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
	
	public HashMap<String, Object> getComponentsList(FunctionalView fv){
		HashMap<String, Object> elementsFV = new HashMap<String, Object>();
		
		EList<Component> cs1 = fv.getComponents();
		for(Component c : cs1) {
			elementsFV.put(c.getName(), c);
		}
		
		return elementsFV;
	}
	
	
	public HashMap<String, Object> getConnectorsList(FunctionalView fv){
		HashMap<String, Object> elementsFV = new HashMap<String, Object>();
				
		EList<Connector> cs1 = fv.getConnectors();
		for(Connector c : cs1) {
			elementsFV.put(c.getName(), c);
		}
				
		return elementsFV;
	}
	
	
	public String getConnectorType(Connector cFV) {
		String type = "";
		
		if(cFV instanceof ProcedureCall)
			type = "ProcedureCall";
		else if(cFV instanceof Event)
			type = "Event";
		else if(cFV instanceof Stream)
			type = "Stream";
		else if(cFV instanceof Arbitrator)
			type = "Arbitrator";
		else if(cFV instanceof Distributor)
			type = "Distributor";
		else if(cFV instanceof Adaptor)
			type = "Adaptor";
		else
			type = "None";
		
		return type;
	}
	
}
