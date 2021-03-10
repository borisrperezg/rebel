package uniandes.rebel.cc.lucidchart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import rebel_componentandconnector.Component;
import rebel_componentandconnector.Connector;
import rebel_componentandconnector.Port;
import rebel_componentandconnector.PortType;
import rebel_componentandconnector.Role;
import rebel_componentandconnector.RoleType;
import uniandes.rebel.cc.model.CNCModel;
import uniandes.rebel.cc.model.Util;

public class PopulationLucid {

	private HashMap<String, HashMap<String, String>> lines;
	private CNCModel modelInstance;
	
	public static void main(String[] args) throws Exception {		
		PopulationLucid fp = new PopulationLucid();
		fp.execute();	
	}
	
	public PopulationLucid() {
		modelInstance = new CNCModel();
	}
	
	public void execute() throws Exception {		
		ArrayList<String> lines =  Util.readFile("Diagram.csv");
		
		decomposeLines(lines);
		
		processingElements();
				
	}
	
	public void decomposeLines(ArrayList<String> diagramContent) {
		if(diagramContent.size()>0) {
			lines = new HashMap<String, HashMap<String,String>>();
		
			for(int t=0;t<diagramContent.size();t++) {
				String line = diagramContent.get(t);
				
				String[] lineParts = line.split(",");
				
				HashMap<String, String> elementParts = new HashMap<String, String>();
								
				elementParts.put("id", lineParts[0]);
				elementParts.put("type", lineParts[1]);
				if(lineParts.length>10)
					elementParts.put("name", lineParts[10]);
				if(lineParts.length>6) {
					elementParts.put("from", lineParts[6]);
					elementParts.put("to", lineParts[7]);
				}
												
				lines.put(lineParts[0], elementParts);
				
			}
		}
	}
	
	public void processingElements() throws Exception {
		
		String project = "demo";
		String model = "cnc1";
		
		modelInstance.createModelAndFunctionalView(project, model, "");
		
		retrieveAndBuildComponentsAndPorts();
		retrieveAndBuildConnectorsAndRoles();
		
		modelInstance.storeModel(project, model, "functionalview");
	}
	
	public void retrieveAndBuildConnectorsAndRoles() {
		// Processing connectors
		for (Map.Entry<String, HashMap<String, String>> entry : lines.entrySet()) {
			
			HashMap<String, String> elementParts = entry.getValue();
			if(elementParts.get("type").equals("Rectángulo")) {
				
				String name = elementParts.get("name");				
				Connector c = modelInstance.createConnector(name);
				
				c.setId(elementParts.get("id"));
				c.setName(name);
				
				ArrayList<String> idLinesForConnector = getIdLinesForElement(elementParts.get("id"));
				for(String idLine : idLinesForConnector) {
					
					// Saco la primera de las lineas en las cuales se menciona al connector
					// de interes
					HashMap<String, String> lineOfInterest = lines.get(idLine);
					
					String linePort = "";
					
					// elementParts.get("id") --> Se refiere al ID del conector
					
					if(!lineOfInterest.get("from").equals(elementParts.get("id"))) {
						linePort = lineOfInterest.get("from");
					}else if(!lineOfInterest.get("to").equals(elementParts.get("id"))) {
						linePort = lineOfInterest.get("to");
					}
					
					// Buscar referencia de ese puerto
					Port portToConnect = modelInstance.getPort(linePort, "cnc1");
					
					// Crear los roles
					Role r = modelInstance.createRole();
					
					// Asignar el tipo del rol, de acuerdo con el tipo del puerto
					if(portToConnect!=null) {
						if(portToConnect.getType()==PortType.PROVIDED) {
							r.setType(RoleType.IN);
						}else if(portToConnect.getType()==PortType.REQUIRED) {
							r.setType(RoleType.OUT);
						}
					}
					
					// Conectar rol con puerto
					r.setPort(portToConnect);
					
					// Asociar roles a conector
					c.getRoles().add(r);
					
				}
				modelInstance.storeConnector(c, "cnc1");
			}
		}
	}
	
	public void retrieveAndBuildComponentsAndPorts() {
		// Processing components
		for (Map.Entry<String, HashMap<String, String>> entry : lines.entrySet()) {
			
			HashMap<String, String> elementParts = entry.getValue();
			if(elementParts.get("type").equals("Componente")) {
				Component c = modelInstance.createComponent();
				c.setId(elementParts.get("id"));
				c.setName(elementParts.get("name"));
				
				ArrayList<String> idLinesForComponent = getIdLinesForElement(elementParts.get("id"));
				for(String idLine : idLinesForComponent) {
					
					// Saco la primera de las lineas en las cuales se menciona al componente
					// de interes
					HashMap<String, String> lineOfInterest = lines.get(idLine);
					
					String linePort = "";
					
					if(!lineOfInterest.get("from").equals(elementParts.get("id"))) {
						linePort = lineOfInterest.get("from");
					}else if(!lineOfInterest.get("to").equals(elementParts.get("id"))) {
						linePort = lineOfInterest.get("to");
					}
					
					// Obtengo la linea donde esta la parte con la que se conecta el componente
					// es decir, la interfaz requerida o proporcionada
					HashMap<String, String> portLineInvolved = lines.get(linePort);
					String type = portLineInvolved.get("type");
					String name = linePort + "-" + type;
					
					Port p = modelInstance.createPort();
					p.setName(name);
					p.setId(linePort);
					
					if(type.equals("Interfaz proporcionada"))
						p.setType(PortType.PROVIDED);
					else if(type.equals("Interfaz requerida"))
						p.setType(PortType.REQUIRED);
					
					c.getPorts().add(p);
					
				}
				modelInstance.storeComponent(c, "cnc1");
			}
		}
	}
	
	/**
	 * Could be a component or a connector
	 * @param idComponent
	 * @return
	 */
	public ArrayList<String> getIdLinesForElement(String idElement) {
		ArrayList<String> idLinesForComponent = new ArrayList<String>();
		
		for (Map.Entry<String, HashMap<String, String>> entry : lines.entrySet()) {
			HashMap<String, String> elementParts = entry.getValue();
			
			if(elementParts.get("type").equals("Línea")) {
				if(elementParts.get("from").contentEquals(idElement) || elementParts.get("to").contentEquals(idElement)) {
					idLinesForComponent.add(elementParts.get("id"));
				}
			}
		}
		
		return idLinesForComponent;
	}
	
}
