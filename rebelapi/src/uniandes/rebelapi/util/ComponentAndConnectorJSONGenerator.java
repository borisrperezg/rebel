package uniandes.rebelapi.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import rebel_componentandconnector.Component;
import rebel_componentandconnector.Connector;
import rebel_componentandconnector.FunctionalView;
import rebel_componentandconnector.Port;
import rebel_componentandconnector.Project;
import rebel_componentandconnector.Rebel_componentandconnectorPackage;
import rebel_componentandconnector.Role;

public class ComponentAndConnectorJSONGenerator {

	private JSONObject mainObj;
//	private String tempurl = "/Users/borisrainieroperezgutierrez/tempmodel/";
	
	
	private Project buildModel(String xmlRute, String modelName) throws Exception {
		Project project = null;        
		
		Rebel_componentandconnectorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_componentandconnector", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(xmlRute),true);
		project = (Project) resource.getContents().get(0);
		
		return project;
	}
	
	
	/**
	 * Create a C&C model using an entity as connector.
	 * This way, components connect to a connector and the connector to another component.
	 * @throws Exception
	 */
	public String buildJSON(String xml, String modelName) throws Exception {		

		String jsonContent = "";
		
		Project project = buildModel(xml, modelName);
		
		if(project!=null) {
			
			createJSON();
			// It is used to stored the out/in port of all components
			HashMap<String, String> portsElement = new HashMap<String, String>();
			
			for(FunctionalView fv : project.getFunctionalviews()) {
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
			jsonContent = mainObj.toJSONString();
		}
		return jsonContent;
				
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
		elem1.put("type", "standard.Ellipse");
		elem1.put("angle", 0);
		elem1.put("id", co.getId());
		elem1.put("z", 1);
		
		JSONObject posElem1 = new JSONObject();
		if(co.getPosX()!=null && co.getPosX().length()>0) {
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
		body.put("fill", "#dff9fb");
		body.put("strokeWidth", 2);
		body.put("stroke", "#BED7D9");
		attrs.put("body", body);
		
		JSONObject label = new JSONObject();
		label.put("fill", "black");
		label.put("fontSize", 12);
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
		body.put("fill", "#ACD5FF");
		body.put("rx", 10);
		body.put("ry", 10);
		body.put("strokeWidth", 2);
		body.put("stroke", "#2980b9");
		attrs.put("body", body);
		
		JSONObject label = new JSONObject();
		label.put("fill", "#2d3436");
		label.put("fontWeight", "bold");
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
	
	public void printJSON(String modelName) {
		//Write JSON file
        try (FileWriter file = new FileWriter("../rebelapi/WebContent/files/"+modelName+".json")) {
 
            file.write(mainObj.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * Create a C&C model using an entity as connector.
	 * This way, components connect to a connector and the connector to another component.
	 * @throws Exception
	 */
	public String buildJSON_Temp(String xml, String modelName) throws Exception {		

		
		String jsonContent = "";
		
		Project project = buildModel(xml, modelName);
		
		if(project!=null) {
			
			createJSON();
			// It is used to stored the out/in port of all components
			HashMap<String, String> portsElement = new HashMap<String, String>();
			
			for(FunctionalView fv : project.getFunctionalviews()) {
				// Lista de componentes
				EList<Component> components = fv.getComponents();
				for(Component c : components) {
					
					if(!c.getName().equals("MaterialReturn")) {					
						addComponentToJSON(c);
						EList<Port> ports = c.getPorts();
						for(Port p : ports) {
							portsElement.put(p.getId(), c.getId());
						}
					}
				}
				// Lista de conectores
				EList<Connector> connectors = fv.getConnectors();
				for(Connector c : connectors) {
					
					if(!c.getName().equals("con1")) {					
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
			jsonContent = mainObj.toJSONString();
		}
		return jsonContent;
				
	}
	
}
