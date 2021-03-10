package uniandes.rebel.cc.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import rebel_componentandconnector.Component;
import rebel_componentandconnector.Connector;
import rebel_componentandconnector.FunctionalView;
import rebel_componentandconnector.Port;
import rebel_componentandconnector.Project;
import rebel_componentandconnector.Role;

public class JSONGenerator {

	private CNCModel modelInstance;
	private JSONObject mainObj;
	// chipermodel, ccmodel
	private String jsonModel = "chipermodel";
	// chiperModel, drawModel
	private String modelName = "chiperModel";
	
	public static void main(String[] args) throws Exception {		
		JSONGenerator fp = new JSONGenerator();
		fp.execute();	
	}
	
	public JSONGenerator() {
		modelInstance = new CNCModel();
	}
	
	/**
	 * Create a C&C model using an entity as connector.
	 * This way, components connect to a connector and the connector to another component.
	 * @throws Exception
	 */
	public void execute() throws Exception {		

		Project project = modelInstance.loadModel(modelName);
		
		if(project!=null) {
			
			createJSON();
			// It is used to stored the out/in port of all components
			HashMap<String, String> portsElement = new HashMap<String, String>();
			
			for(FunctionalView fv : project.getFunctionalviews()) {
				if(fv.getName().equals("cnc1")) {
					// Lista de componentes
					EList<Component> components = fv.getComponents();
					for(Component c : components) {
						addComponentToJSON(c);
						EList<Port> ports = c.getPorts();
						for(Port p : ports) {
							portsElement.put(p.getId(), c.getId());
						}
					}
					// Lista de conectores
					EList<Connector> connectors = fv.getConnectors();
					for(Connector c : connectors) {
						addConnectorToJSON(c);
						EList<Role> roles = c.getRoles();
						for(Role r : roles) {
							String idPort = r.getPort().getId();
							if(portsElement.get(idPort)!=null) {
								String portType = r.getPort().getType().getName();
								String idComponent = portsElement.get(idPort); 
								
								// create link between connector and idComponent
								if(portType.equals("REQUIRED"))
									addLinkToJSON(idComponent, c.getId());
								else if(portType.equals("PROVIDED"))
									addLinkToJSON(c.getId(), idComponent);
							}
						}
					}
				}
			}
			printJSON();
		}
				
	}
	
	@SuppressWarnings("unchecked")
	public void addLinkToJSON(String idSource, String idDest) {
		JSONArray obj = (JSONArray) mainObj.get("cells");
		
		JSONObject elem3 = new JSONObject();
		elem3.put("type", "standard.Link");
		elem3.put("id", idSource+idDest+Calendar.getInstance().getTimeInMillis());
		elem3.put("z", 2);
		
		JSONObject source = new JSONObject();
		source.put("id", idSource);
		elem3.put("source", source);
		
		JSONObject target = new JSONObject();
		target.put("id", idDest);
		elem3.put("target", target);
		
		obj.add(elem3);
	}
	
	/**
	 * 
	 * @param name
	 * @param id
	 * @param type "Conn": Connector; "Comp": Component
	 */
	@SuppressWarnings("unchecked")
	public void addConnectorToJSON(Connector co) {
		JSONArray obj = (JSONArray) mainObj.get("cells");
		
		JSONObject elem1 = new JSONObject();
		elem1.put("type", "standard.Rectangle");
		elem1.put("angle", 0);
		elem1.put("id", co.getId());
		elem1.put("z", 1);
		
		JSONObject posElem1 = new JSONObject();
		if(co.getPosX()!=null) {
			posElem1.put("x", Integer.parseInt(co.getPosX()));
			posElem1.put("y", Integer.parseInt(co.getPosY()));
		}
		elem1.put("position", posElem1);
		
		JSONObject sizeElem1 = new JSONObject();
		sizeElem1.put("width", 150);
		sizeElem1.put("height", 50);
		elem1.put("size", sizeElem1);
		
		JSONObject attrs = new JSONObject();
		
		JSONObject body = new JSONObject();
		body.put("fill", "#dfe6e9");
		attrs.put("body", body);
		
		System.out.println(co.getBuffering());
		
		JSONObject label = new JSONObject();
		label.put("fill", "black");
		label.put("text", "<<Connector>>\nType: "+co.getClass().getSimpleName().substring(0,co.getClass().getSimpleName().length()-4)+"\n"+co.getName());
		attrs.put("label", label);
				
		elem1.put("attrs", attrs);
		
		obj.add(elem1);
	}
	
	/**
	 * 
	 * @param name
	 * @param id
	 * @param type "Conn": Connector; "Comp": Component
	 */
	@SuppressWarnings("unchecked")
	public void addComponentToJSON(Component co) {
		JSONArray obj = (JSONArray) mainObj.get("cells");
		
		JSONObject elem1 = new JSONObject();
		elem1.put("type", "standard.Rectangle");
		elem1.put("angle", 0);
		elem1.put("id", co.getId());
		elem1.put("z", 1);
		
		JSONObject posElem1 = new JSONObject();
		posElem1.put("x", Integer.parseInt(co.getPosX()));
		posElem1.put("y", Integer.parseInt(co.getPosY()));
		elem1.put("position", posElem1);
		
		JSONObject sizeElem1 = new JSONObject();
		sizeElem1.put("width", Integer.parseInt(co.getWidth()));
		sizeElem1.put("height", Integer.parseInt(co.getHeight()));
		elem1.put("size", sizeElem1);
		
		JSONObject attrs = new JSONObject();
		
		JSONObject body = new JSONObject();
		body.put("fill", "#607D8B");
		attrs.put("body", body);
		
		JSONObject label = new JSONObject();
		label.put("fill", "white");
		label.put("text", "<<Component>>\n"+co.getName());
		attrs.put("label", label);
				
		elem1.put("attrs", attrs);
		
		obj.add(elem1);
	}
	
	@SuppressWarnings("unchecked")
	public void createJSON() {
		mainObj = new JSONObject();
		
		JSONArray obj = new JSONArray();
		
		
		mainObj.put("cells", obj);
		
		
	}
	
	public void printJSON() {
		//Write JSON file
        try (FileWriter file = new FileWriter("../rebelapi/WebContent/files/"+jsonModel+".json")) {
 
            file.write(mainObj.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
