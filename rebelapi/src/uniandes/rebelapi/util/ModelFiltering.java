package uniandes.rebelapi.util;

import java.util.ArrayList;
import java.util.List;

import rebel_architecturaldecisions.Decision;
import rebel_architecturaldecisions.StateType;
import rebel_architecturaldecisions.UserStory;
import rebel_componentandconnector.Adaptor;
import rebel_componentandconnector.Arbitrator;
import rebel_componentandconnector.Component;
import rebel_componentandconnector.Connector;
import rebel_componentandconnector.Distributor;
import rebel_componentandconnector.Event;
import rebel_componentandconnector.FunctionalView;
import rebel_componentandconnector.Port;
import rebel_componentandconnector.PortType;
import rebel_componentandconnector.ProcedureCall;
import rebel_componentandconnector.Project;
import rebel_componentandconnector.Role;
import rebel_componentandconnector.Stream;
import uniandes.rebel.core.model.CoreModel;

public class ModelFiltering {
	
	private static List<rebel_core.Port> portsList = new ArrayList<rebel_core.Port>();
	
	
	
	//***************************************************
	// CONNECTORS
	//***************************************************
	
	public static void copyConnector(CoreModel core, Project pS, rebel_core.FunctionalView fvD, String boiModel, String connectorName) {
		// Se recorren los FV del modelo origen
		for(FunctionalView fv : pS.getFunctionalviews()) {
			
			// fvD tiene el mismo nombre que el modelo origen, por eso se usa esa variable
			if(fv.getName().equals(fvD.getName())) {
				
				for(Connector c : fv.getConnectors()){
					if(c.getName().equals(connectorName)) {
						
						String type = getConnectorType(c);
						
						rebel_core.Connector cd = core.createConnector(type);
						
						cd.setId(c.getId());
						cd.setName(c.getName());
						cd.setPosX(c.getPosX());
						cd.setPosY(c.getPosY());
						cd.setProps(c.getProps());
						cd.setProtocol(c.getProtocol());
						
						cd.setBuffering(getBuffering(c.getBuffering()));
						cd.setDelivery(getDelivery(c.getDelivery()));
						cd.setNotification(getNotification(c.getNotification()));
						cd.setSync(getSync(c.getSync()));
						cd.setThroughput(getThroughput(c.getThroughput()));
						
						// Adicionando los roles al conector
						for(Role r : c.getRoles()) {
							
							rebel_core.Role rd = core.createRole();
							
							rd.setName(r.getName());
							rd.setType(getRoleType(r.getType()));
							rd.setPort(getPort(r.getPort()));
							
							cd.getRoles().add(rd);
							
						}
						 
						fvD.getConnectors().add(cd);
						
//						CoreModel.getInstance().storeConnector(cd, sourceModel);
						
						break;
					}
				}
				
				break;
			}
		}
	}
	
	private static rebel_core.Port getPort(rebel_componentandconnector.Port val){
		if(val!=null) {
			for(rebel_core.Port portRebel : portsList) {
				if(portRebel.getName().equals(val.getName()))
					return portRebel;
			}
		}
		return null;
	}
	
	private static rebel_core.RoleType getRoleType(rebel_componentandconnector.RoleType val){
		if(val!=null) {
			if(val.getLiteral().equals("OUT"))
				return rebel_core.RoleType.OUT;
			else if(val.getLiteral().equals("IN"))
				return rebel_core.RoleType.IN;
		}
		return null;
	}
	
	private static rebel_core.NotificationModel getNotification(rebel_componentandconnector.NotificationModel val){
		if(val!=null) {
			if(val.getLiteral().equals("CENTRAL"))
				return rebel_core.NotificationModel.CENTRAL;
			else if(val.getLiteral().equals("POLLED"))
				return rebel_core.NotificationModel.POLLED;
			else if(val.getLiteral().equals("PUBSUB"))
				return rebel_core.NotificationModel.PUBSUB;
			else if(val.getLiteral().equals("QUEUED"))
				return rebel_core.NotificationModel.QUEUED;
		}
		return null;
	}
	
	private static rebel_core.SyncType getSync(rebel_componentandconnector.SyncType val){
		if(val!=null) {
			if(val.getLiteral().equals("ASYNC"))
				return rebel_core.SyncType.ASYNC;
			else if(val.getLiteral().equals("SYNC"))
				return rebel_core.SyncType.SYNC;
		}
		return null;
	}
	
	private static rebel_core.Throughput getThroughput(rebel_componentandconnector.Throughput val){
		if(val!=null) {
			if(val.getLiteral().equals("ATOMIC"))
				return rebel_core.Throughput.ATOMIC;
			else if(val.getLiteral().equals("HIGH_ORDER"))
				return rebel_core.Throughput.HIGH_ORDER;
		}
		return null;
	}
	
	private static rebel_core.DeliveryModel getDelivery(rebel_componentandconnector.DeliveryModel dev){
		if(dev!=null) {
			if(dev.getLiteral().equals("BEST_EFFORT"))
				return rebel_core.DeliveryModel.BEST_EFFORT;
			else if(dev.getLiteral().equals("AT_LEAST_ONE"))
				return rebel_core.DeliveryModel.AT_LEAST_ONE; 
			else if(dev.getLiteral().equals("AT_MOST_ONE"))
				return rebel_core.DeliveryModel.AT_MOST_ONE;
			else if(dev.getLiteral().equals("EXACTLY_ONE"))
				return rebel_core.DeliveryModel.EXACTLY_ONE;
		}
		return null;			
	}
	
	private static rebel_core.Buffering getBuffering(rebel_componentandconnector.Buffering buf){
		if(buf!=null) {
			if(buf.getLiteral().equals("BUFFERED"))
				return rebel_core.Buffering.BUFFERED;
			else if(buf.getLiteral().equals("UNBUFFERED"))
				return rebel_core.Buffering.UNBUFFERED;
		}
		return null;
	}
	
	private static String getConnectorType(Connector cFV) {
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
	
	
	//***************************************************
	// COMPONENTS
	//***************************************************
	
	public static void copyComponent(CoreModel core, Project pS, rebel_core.FunctionalView fvD, String boiModel, String componentName) {

		// Se recorren los FV del modelo origen
		for(FunctionalView fv : pS.getFunctionalviews()) {
			
			// Ambos FVs tienen el mismo nombre, por eso se usa esa variable para comparar
			if(fv.getName().equals(fvD.getName())) {
				
				for(Component c : fv.getComponents()) {
					
					if(c.getName().equals(componentName)) {
					
						rebel_core.Component cd = core.createComponent();
						
						cd.setHeight(c.getHeight());
						cd.setId(c.getId());
						cd.setName(c.getName());
						cd.setPosX(c.getPosX());
						cd.setPosY(c.getPosY());
						cd.setWidth(c.getWidth());
						
						// Adicionando los puertos al componente
						for(Port port : c.getPorts()) {
							
							rebel_core.Port portd = core.createPort();
							
							portd.setId(port.getId());
							portd.setName(port.getName());
							portd.setType(getNewPortType(port.getType()));
							
							cd.getPorts().add(portd);
							
							portsList.add(portd);
							
						}
						
						fvD.getComponents().add(cd);
//						CoreModel.getInstance().storeComponent(cd, sourceModel);
						
						break;
					}
				}
				
				break;
			}
		}
	}
	
	public static rebel_core.PortType getNewPortType(PortType pt) {
		rebel_core.PortType newpt = null;
		
		if(pt.getLiteral().equals("REQUIRED")) {
			newpt = rebel_core.PortType.REQUIRED;
		}else if(pt.getLiteral().equals("PROVIDED")) {
			newpt = rebel_core.PortType.PROVIDED;
		} 
		
		return newpt;
	}

	//***************************************************
	// ARCHITECTURAL DECISIONS
	//***************************************************
	
	public static rebel_core.UserStory getRebelUserStory(CoreModel core, UserStory us){
	
		rebel_core.UserStory requiredUS = null;
		
		if(us!=null) {
			requiredUS = core.createUserStory();
			requiredUS.setId(us.getId());			
		}
		
		return requiredUS;
		
	}
	
	public static rebel_core.Decision getRebelDecision(CoreModel core, Decision de){
		rebel_core.Decision requiredDE = null;
		
		if(de!=null) {
			requiredDE = core.createDecision();
			requiredDE.setDate(de.getDate());
			requiredDE.setDescription(de.getDescription());
			requiredDE.setNumber(de.getNumber());
			requiredDE.setPhase(de.getPhase());
			requiredDE.setTitle(de.getTitle());
			
			rebel_core.StateType sType = getStateType(de.getState()); 
			System.out.println("ModelFiltering.getRebelDecision ::: sType = "+sType.getLiteral());
			if(sType!=null)
				requiredDE.setState(sType);
		}
		
		return requiredDE;
	}
	
	private static rebel_core.StateType getStateType(StateType state){
		if(state!=null) {
			if(state.getLiteral().equals("ACCEPTED"))
				return rebel_core.StateType.ACCEPTED;
			else if(state.getLiteral().equals("PROPOSED"))
				return rebel_core.StateType.PROPOSED;
			else if(state.getLiteral().equals("DEPRECATED"))
				return rebel_core.StateType.DEPRECATED;
			else if(state.getLiteral().equals("SUPERCEDES"))
				return rebel_core.StateType.SUPERCEDES;
			else if(state.getLiteral().equals("REJECTED"))
				return rebel_core.StateType.REJECTED;
		}
		return null;
	}
	
}
