package uniandes.rebelapi.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import rebel_core.BlockOfInterest;
import rebel_core.Fact;
import rebel_core.Project;
import rebel_core.Rebel_corePackage;

public class RebelCoreJSONGenerator_old {

	private JSONArray mainObjTimeline;
	private JSONObject mainObjDiagram;
	private String tempurl = "/Users/borisrainieroperezgutierrez/tempmodel/";
	
	/**
	 * Este metodo se encarga de generar el html para pintar la tabla con las 
	 * coincidencias en la visualizacion del BoI.
	 * @param xml
	 * @param modelName
	 * @return
	 */
	
	/*
	public String buildHTMLForTable(String xml, String modelName) throws Exception {
		StringBuffer html = null;
		
		Project project = buildModel(xml, modelName);
		
		HashMap<String, Boolean> listElements = new HashMap<String, Boolean>();
		
		if(project!=null) {
			
			html = new StringBuffer();
			
			html.append("<table class=\"pure-table pure-table-horizontal\">	");
			html.append("<col width=\"90px\" />");
			html.append("<col width=\"350px\" />");
			html.append("<col width=\"20px\" />");
					 
			for(BlockOfInterest boi : project.getBlockofinterest()){
				
				for(Fact f : boi.getFact()) {
					
					Element e = f.getElement();
					
					String elementName = e.getName();
					String elementDesc = e.getDescription();
					
					if(listElements.get(elementName)==null){ 
						
						listElements.put(elementName, true);
					
						html.append("<thead>");
						html.append("<tr>");
						
						if(elementDesc!=null && elementDesc.length()>0)						
							html.append("<th colspan=\"3\">"+elementName+": <span style='font-weight:normal'>"+elementDesc+"</span></th>");
						else
							html.append("<th colspan=\"3\">"+elementName+": <span style='font-weight:normal'><i>no description</i></span></th>");
						html.append("</tr>");
						html.append("<tr style=\"background-color: #F5F5F1\">");
						html.append("<th>Type</th>");
						html.append("<th>Artifact</th>");
						html.append("<th>#</th>");
						html.append("</tr>");
						html.append("</thead>");
						html.append("<tbody>");
						
						boolean foundArtifacts = false;
						
						if(f.getArchitecturaldecision()!=null && f.getArchitecturaldecision().size()>0) {
							
							foundArtifacts = true;
							
							for(ArchitecturalDecision ad : f.getArchitecturaldecision()) {
								
								String adNumber = ad.getNumber();
								String adTitle = ad.getTitle();
															
								html.append("<tr>");
								html.append("<td>AD</td>");
								html.append("<td>"+adNumber+"-"+adTitle+"</td>");
								html.append("<td>X</td>");
								html.append("</tr>");
								html.append("");
								
							}
						}
						
						if(f.getCommit()!=null && f.getCommit().size()>0) {
							
							foundArtifacts = true;
							
							for(Commit com : f.getCommit()) {
								
								String subject = com.getSubject();
								
								html.append("<tr>");
								html.append("<td>Commit</td>");
								html.append("<td>"+subject+"</td>");
								html.append("<td>X</td>");
								html.append("</tr>");
								html.append("");
							}						
						}					
						
						if(!foundArtifacts) {
							html.append("<tr>");
							html.append("<td></td>");
							html.append("<td>No artifacts found</td>");
							html.append("<td></td>");
							html.append("</tr>");
							html.append("");
						}
						
						html.append("</tbody>");					
					}
				}
			}
			html.append("</table>");
		}
		
		return html.toString();		
	}
	*/
	
	/**
	 * Este metodo se encarga de generar el json para poder pintar el diagrama C&C
	 * en la visualizacion del BoI.
	 * Primero revisa cuál es el modelo más reciente mencionado en un Fact
	 * @param xml
	 * @param modelName
	 * @return
	 * @throws Exception
	 */
	public String buildJSONForJoint(String xml, String modelName) throws Exception {
		String jsonContent = "";
		
		Project project = buildModel(xml, modelName);
		
		// Buscar el nombre del functional view más recience
		String fvname = findNewestFunctionalView(project);
		
		return jsonContent;		
	}
	
	/**
	 * Obtiene el functional view mas reciente de los que se citan en los Fact
	 * @param project
	 * @return
	 * @throws Exception
	 */
	private String findNewestFunctionalView(Project project) throws Exception {
		String functionalViewName = "";
		
		if(project!=null) {
			for(BlockOfInterest boi : project.getBlockofinterest()){
				for(Fact f : boi.getFact()) {
					
					
					
				}
			}
		}
		
		return functionalViewName;
	}
	
	private String functionalViewToJSON() {
		String jsonContent = "";
		
		return jsonContent;
	}
	
	/*
	public String buildJSONForJoint_anterior(String xml, String modelName) throws Exception {
		String jsonContent = "";
				
		Project project = buildModel(xml, modelName);
		
		if(project!=null) {
			
			createJSONDiagram();
			
			for(BlockOfInterest boi : project.getBlockofinterest()){
				
				for(Element e : boi.getElement()) {
					
					ElementTypeEnum type = e.getType();
					
					if(type.getLiteral().equals("COMPONENT"))
						addComponentToJSON(e);
					else if(type.getLiteral().equals("CONNECTOR"))
						addConnectorToJSON(e);
					
					for(Element outElement : e.getOutElement()) {
//						listOfElements.put(e.getId(), outElement.getId());
						addLinkToJSON(e.getId(), outElement.getId());
					}
				}
			}
			
			jsonContent = mainObjDiagram.toJSONString();
			System.out.println(jsonContent);
		}
		return jsonContent;		
	}
	*/
	
	@SuppressWarnings("unchecked")
	public void addLinkToJSON(String idSource, String idDest) {
		JSONArray obj = (JSONArray) mainObjDiagram.get("cells");
		
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
	
	/*
	@SuppressWarnings("unchecked")
	public void addConnectorToJSON(Element e) {
		
		String name = e.getName();
		String posX = e.getPosX();
		String posY = e.getPosY();
		String id = e.getId();				
		
		JSONArray obj = (JSONArray) mainObjDiagram.get("cells");
		
		JSONObject elem1 = new JSONObject();
		elem1.put("type", "standard.Ellipse");
		elem1.put("angle", 0);
		elem1.put("id", id);
		elem1.put("z", 1);
		
		JSONObject posElem1 = new JSONObject();
		if(posX!=null && posX.length()>0) {
			posElem1.put("x", Integer.parseInt(posX));
			posElem1.put("y", Integer.parseInt(posY));
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
		label.put("text", "<<Connector>>\n"+name);
		attrs.put("label", label);
				
		elem1.put("attrs", attrs);
		
		obj.add(elem1);
	}
	
	
	@SuppressWarnings("unchecked")
	public void addComponentToJSON(Element e) {
		
		String name = e.getName();
		String posX = e.getPosX();
		String posY = e.getPosY();
		String id = e.getId();
		
		JSONArray obj = (JSONArray) mainObjDiagram.get("cells");
		
		JSONObject elem1 = new JSONObject();
		elem1.put("type", "standard.Rectangle");
		elem1.put("angle", 0);
		elem1.put("id", id);
		elem1.put("z", 1);
		
		JSONObject posElem1 = new JSONObject();
		posElem1.put("x", Integer.parseInt(posX));
		posElem1.put("y", Integer.parseInt(posY));
		elem1.put("position", posElem1);
		
		JSONObject sizeElem1 = new JSONObject();
		sizeElem1.put("width", 150);
		sizeElem1.put("height", 50);
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
		label.put("text", "<<Component>>\n"+name);
		attrs.put("label", label);
				
		elem1.put("attrs", attrs);
		
		obj.add(elem1);
	}
	*/
	
	
	/**
	 * Create the BoI model
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	/*
	public String buildJSONForTimeline(String xml, String modelName) throws Exception {		

		String jsonContent = "";
		
		Project project = buildModel(xml, modelName);
		
		if(project!=null) {
			
			createJSONTimeline();
			
			for(BlockOfInterest boi : project.getBlockofinterest()){
				
				for(Fact f : boi.getFact()) {
					
					ActionEnum action = f.getAction();
					Date date = f.getDate();
					String observation = f.getObservations();
					
					Element e = f.getElement();
					
					String name = e.getName();
					// Por ahora no se usa
					// ElementTypeEnum type = e.getType();
					
						
					// ----------------------------------
					
					JSONObject elem1 = new JSONObject();
					
					elem1.put("time", (date.getYear()+1900)+"-"+(date.getMonth()+1)+"-"+date.getDate());
					
					JSONArray body1 = new JSONArray();
					
					JSONObject tag = new JSONObject();
					tag.put("tag", "p");
					tag.put("content", name+" ("+action.getLiteral()+")<br/>"+observation);
					body1.add(tag);
					
					elem1.put("body", body1);
					
					mainObjTimeline.add(elem1);
					
					// ----------------------------------
						
					
				}				
			}				
			jsonContent = mainObjTimeline.toJSONString();
		}
		
		return jsonContent;
	}
	*/
	
	/**
	 * This method is used to load the root eclass of the model received as parameter.
	 * This method is called before create the json file.
	 * @param xml
	 * @param modelName
	 * @return
	 * @throws Exception
	 */
	private Project buildModel(String xml, String modelName) throws Exception {
		
		String fileUrl = tempurl+modelName+".rebel_core";
		
		System.out.println("RebelCoreJSONGenerator.buildModel ::: fileUrl = "+fileUrl);
		
		// Create a xml file to load into a resource
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileUrl));
	    writer.write(xml);	     
	    writer.close(); 
        
		
		Rebel_corePackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_core", new XMIResourceFactoryImpl());

		
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileUrl),true);
		Project project = (Project) resource.getContents().get(0);

		
		// Deleting temp file
		File file = new File(tempurl+modelName+".rebel_core");        
        file.delete(); 
		
		return project;
	}
	
	public void createJSONTimeline() {
		mainObjTimeline = new JSONArray();
	}
	
	@SuppressWarnings("unchecked")
	public void createJSONDiagram() {
		mainObjDiagram = new JSONObject();		
		JSONArray obj = new JSONArray();
		mainObjDiagram.put("cells", obj);
	}
	
}
