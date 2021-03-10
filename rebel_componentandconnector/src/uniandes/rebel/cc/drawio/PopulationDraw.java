package uniandes.rebel.cc.drawio;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import rebel_componentandconnector.Buffering;
import rebel_componentandconnector.Component;
import rebel_componentandconnector.Connector;
import rebel_componentandconnector.DeliveryModel;
import rebel_componentandconnector.NotificationModel;
import rebel_componentandconnector.Port;
import rebel_componentandconnector.PortType;
import rebel_componentandconnector.Role;
import rebel_componentandconnector.RoleType;
import rebel_componentandconnector.SyncType;
import rebel_componentandconnector.Throughput;
import uniandes.rebel.cc.model.CNCModel;
import uniandes.rebel.cc.model.Util;

public class PopulationDraw {

	private CNCModel modelInstance;
	
	public static void main(String[] args) throws Exception {		
		PopulationDraw fp = new PopulationDraw();
		fp.execute("REBEL", "BibliotecaV4.xml");	
	}
	
	public PopulationDraw() {
		modelInstance = new CNCModel();
	}
	
	public void execute(String project, String model) throws Exception {		
		
		// Ubicacion temporal donde se guarda el archivo cargado
		// Se utiliza para poderlo recorrer y obtener la informacion requerida
		String file = "/Users/borisperezg/temporaluploadfolder/"+model;
		
		String fvDate = "";
		
		// Open and read XML
		Document doc = Util.parseXML(file);
		
		// Get properties of diagram
		NodeList objectNodes = doc.getElementsByTagName("object");
		for(int i=0; i<objectNodes.getLength(); i++) {
			Node connectorNode = objectNodes.item(i);
	        if(connectorNode.getNodeType() == Node.ELEMENT_NODE){
	        	Element objectElement = (Element) connectorNode;
	        	
	        	String id = objectElement.getAttribute("id");
	        	if(id.equals("0"))
	        		fvDate = objectElement.getAttribute("date");
	        }
		}
		
		modelInstance.createModelAndFunctionalView(project, model, fvDate);
		
		// Get components
		NodeList cellNodes = doc.getElementsByTagName("mxCell");
		for(int i=0; i<cellNodes.getLength(); i++) {
			Node cellNode = cellNodes.item(i);
	        if(cellNode.getNodeType() == Node.ELEMENT_NODE){
	        	Element moduleElement = (Element) cellNode;
	        	
	        	String elementStyle = moduleElement.getAttribute("style");
	        	
	        	// Found a component
	        	if(elementStyle.contains("shape=module")) {
	        		
//	        		System.out.println("Module Id = " + moduleElement.getAttribute("id") + " - Name = "+moduleElement.getAttribute("value"));
	        		
	        		String componentId = moduleElement.getAttribute("id");
	        		String componentName = moduleElement.getAttribute("value");
	        		
	        		Component c = modelInstance.createComponent();
					
					c.setId(componentId);
					c.setName(componentName);
					
					
					NodeList geometries = moduleElement.getElementsByTagName("mxGeometry");
					for(int g=0; g<geometries.getLength(); g++) {
						Node geometry = geometries.item(g);
						if(geometry.getNodeType() == Node.ELEMENT_NODE){
							Element t = (Element)geometry;
							String posX = t.getAttribute("x");
							String posY = t.getAttribute("y");
							String width = t.getAttribute("width");
							String height = t.getAttribute("height");
							
							c.setPosX(posX);
							c.setPosY(posY);
							c.setWidth(width);
							c.setHeight(height);
						}
						
					}
					
					// Build ports
					getConnectionsComponent(doc, c);
					
					modelInstance.storeComponent(c, model);
	        		
	        	}	        	
	        }
	    }
		
		
		// Get Connectors
		NodeList connectorNodes = doc.getElementsByTagName("object");
		for(int i=0; i<connectorNodes.getLength(); i++) {
			Node connectorNode = connectorNodes.item(i);
	        if(connectorNode.getNodeType() == Node.ELEMENT_NODE){
	        	Element objectElement = (Element) connectorNode;
	        	
	        	
	        	
	        	String id = objectElement.getAttribute("id");
	        	String type = objectElement.getAttribute("type");
	        	
	        	if(type!=null && type.length()>0) {
	        	
		        	String name = objectElement.getAttribute("name");
					
		        	String delivery = objectElement.getAttribute("delivery");
		        	String sync = objectElement.getAttribute("sync");
		        	String notification = objectElement.getAttribute("notification");
		        	String buffering = objectElement.getAttribute("buffering");
		        	
		        	String throughput = objectElement.getAttribute("throughput");
		        	String protocol = objectElement.getAttribute("protocol");
		        	
//		        	System.out.println("Type = "+type);
		        	
		        	Connector c = modelInstance.createConnector(type);
		        	
//		        	System.out.println("Connector = "+c);
		        	
					if(name!=null && name.length()>0)
						c.setName(name);
					else
						c.setName(type);
					
					c.setId(id);
					c.setDelivery(getDeliveryModel(delivery));
					c.setSync(getSyncType(sync));
					c.setNotification(getNotificationModel(notification));
					
					c.setBuffering(getBuffering(buffering));
					c.setThroughput(getThroughput(throughput));
					c.setProtocol(protocol);
					
					System.out.println("Connector Type = "+type);
					System.out.println("Connector Sync = "+c.getSync().getLiteral());
		        	
		        	NodeList mxCells = objectElement.getElementsByTagName("mxCell");
		        	for(int g=0; g<mxCells.getLength(); g++) {
						Node mxCell = mxCells.item(g);
						if(mxCell.getNodeType() == Node.ELEMENT_NODE){
							Element t = (Element)mxCell;
							
							String source = t.getAttribute("source");
							String target = t.getAttribute("target");
							
							// This list implies that the component have ports.
							// Ports are based on connections
							Port sourcePort = modelInstance.getPort(source+"_"+source+"_"+target, model);
							
							Role r = modelInstance.createRole();
							if(sourcePort.getType()==PortType.PROVIDED) {
								r.setType(RoleType.IN);
							}else if(sourcePort.getType()==PortType.REQUIRED) {
								r.setType(RoleType.OUT);
							}
							r.setPort(sourcePort);
							
							// Asociar roles a conector
							c.getRoles().add(r);
							
							
							Port targetPort = modelInstance.getPort(target+"_"+source+"_"+target, model);
							
							r = modelInstance.createRole();
							if(targetPort.getType()==PortType.PROVIDED) {
								r.setType(RoleType.IN);
							}else if(targetPort.getType()==PortType.REQUIRED) {
								r.setType(RoleType.OUT);
							}
							r.setPort(targetPort);
							
							// Asociar roles a conector
							c.getRoles().add(r);
							
							c.setPosX("");
							c.setPosY("");
							
							
						}
						modelInstance.storeConnector(c, model);
		        	}
	        	}
	        }
		}
		
		
		modelInstance.storeModel(project, model, "functionalview");
		System.out.println("PopulationDraw.execute ::: Success");
		
		
		
//		processingElements();
				
	}
	
	public Throughput getThroughput(String value) {
		Throughput nm = null;
		
		switch(value) {
		case "ATOMIC": 
			nm = Throughput.ATOMIC;
			break;
		case "HIGH_ORDER":
			nm = Throughput.HIGH_ORDER;
			break;
		}
		
		return nm;
	}
	
	public Buffering getBuffering(String value) {
		Buffering nm = null;
		
		switch(value) {
		case "BUFFERED": 
			nm = Buffering.BUFFERED;
			break;
		case "UNBUFFERED":
			nm = Buffering.UNBUFFERED;
			break;
		}
		
//		System.out.println("getBuffering = "+nm);
		
		return nm;
	}
	
	public NotificationModel getNotificationModel(String value) {
		NotificationModel nm = null;
		
		switch(value) {
		case "POLLED": 
			nm = NotificationModel.POLLED;
			break;
		case "PUBSUB":
			nm = NotificationModel.PUBSUB;
			break;
		case "QUEUED":
			nm = NotificationModel.QUEUED;
			break;
		case "CENTRAL":
			nm = NotificationModel.CENTRAL;
			break;
		}
		
		return nm;
	}
	
	public DeliveryModel getDeliveryModel(String value) {
		DeliveryModel dm = null;
		
		switch(value) {
		case "BEST_EFFOR":
			dm = DeliveryModel.BEST_EFFORT;
			break;
		case "AT_LEAST_ONE":
			dm = DeliveryModel.AT_LEAST_ONE;
			break;
		case "AT_MOST_ONE":
			dm = DeliveryModel.AT_MOST_ONE;
			break;
		case "EXACTLY_ONE":
			dm = DeliveryModel.EXACTLY_ONE;
			break;
		}
		
		return dm;
	}
	
	public SyncType getSyncType(String value) {
		SyncType st = null;
		
		switch(value) {
		case "ASYNC":
			st = SyncType.ASYNC;
			break;
		case "SYNC":
			st = SyncType.SYNC;
			break;
		}
		return st;
	}
	
	
	public void getConnectionsComponent(Document doc, Component c) {
		NodeList cellNodes = doc.getElementsByTagName("object");
		for(int i=0; i<cellNodes.getLength(); i++) {
			Node cellNode = cellNodes.item(i);
	        if(cellNode.getNodeType() == Node.ELEMENT_NODE){
	        	Element moduleElement = (Element) cellNode;
	        	
	        	NodeList mxCells = moduleElement.getElementsByTagName("mxCell");
	        	for(int g=0; g<mxCells.getLength(); g++) {
					Node mxCell = mxCells.item(g);
					if(mxCell.getNodeType() == Node.ELEMENT_NODE){
						Element t = (Element)mxCell;
						String source = t.getAttribute("source");
						String target = t.getAttribute("target");
						String style = t.getAttribute("style");
						
						// In case the line was drawn in the oppsite direction
						// Arrow representation allows to define the direction
						boolean lineInverted = false;
						if(style.contains("endArrow=none"))
							lineInverted = true;
						
						
						if(!lineInverted) {
							if(source.equals(c.getId())) {
								Port p = modelInstance.createPort();
								p.setName(c.getId()+"_"+source+"_"+target);
								p.setId(c.getId()+"_"+source+"_"+target);
								p.setType(PortType.REQUIRED);
								c.getPorts().add(p);
							}else if(target.equals(c.getId())) {
								Port p = modelInstance.createPort();
								p.setName(c.getId()+"_"+source+"_"+target);
								p.setId(c.getId()+"_"+source+"_"+target);
								p.setType(PortType.PROVIDED);
								c.getPorts().add(p);
							} 
						}else {
							if(source.equals(c.getId())) {
								Port p = modelInstance.createPort();
								p.setName(c.getId()+"_"+source+"_"+target);
								p.setId(c.getId()+"_"+source+"_"+target);
								p.setType(PortType.PROVIDED);
								c.getPorts().add(p);
							}else if(target.equals(c.getId())) {
								Port p = modelInstance.createPort();
								p.setName(c.getId()+"_"+source+"_"+target);
								p.setId(c.getId()+"_"+source+"_"+target);
								p.setType(PortType.REQUIRED);
								c.getPorts().add(p);
							}
						}
						
						
					}
	        	}
	        }
		}
	}
	
	
	
	
}
