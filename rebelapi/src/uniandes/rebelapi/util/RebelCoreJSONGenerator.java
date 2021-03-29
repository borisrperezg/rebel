package uniandes.rebelapi.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import rebel_core.Action;
import rebel_core.ArchimateView;
import rebel_core.BlockOfInterest;
import rebel_core.Component;
import rebel_core.Connector;
import rebel_core.Decision;
import rebel_core.Element;
import rebel_core.Fact;
import rebel_core.FunctionalView;
import rebel_core.MessageLog;
import rebel_core.CommitMessage;
import rebel_core.Port;
import rebel_core.Project;
import rebel_core.Role;
import uniandes.rebel.core.model.CoreModel;
import uniandes.rebelapi.bo.APIArchitecturalDecision;
import uniandes.rebelapi.bo.APIFact;
import uniandes.rebelapi.bo.ArtifactBO;

public class RebelCoreJSONGenerator {

	private JSONArray mainObjTimeline;
	private JSONObject mainObj;
	
	private CoreModel cModel;
	
	public RebelCoreJSONGenerator() {
		cModel = new CoreModel();
	}
	
	/**
	 * Este metodo se encarga de generar el html para pintar la tabla con las 
	 * coincidencias en la visualizacion del BoI.
	 * @param xml
	 * @param modelName
	 * @return
	 */
	public String buildHTMLForTable(String xml, String modelName, String factId) throws Exception {
		String html = "";
		
		Resource res = cModel.buildModelRebelCore(xml, modelName);
		Project project = (Project) res.getContents().get(0);
		
		if(project!=null) {
			
			for(BlockOfInterest boi : project.getBlockofinterest()) {
				if(boi!=null) {
					
					html += openHeader();
					
					for(Fact fact : boi.getFact()) {
						
						// Se lista las coincidencias registradas solo para Fact ID
						if(fact.getId().equals(factId)) {
						
							html += openElementHeader(fact.getElementName(), fact.getObservations());
							
							
							html += openElementContent();
							
							
							// Gathering information about Architectural decisions, Commits, Chats and Emails.
							// An ArrayList could be used to store the data required to print it.
							
							ArrayList<ArtifactBO> listOfArtifacts = listRelatedArtifacts(fact);
							
							if(listOfArtifacts!=null && listOfArtifacts.size()>0) {
							
								for(ArtifactBO bo : listOfArtifacts) {
								
									html += printHTMLContent(bo.getType(), bo.getName(), bo.getDate());
									
								}
								
							}else {
								html += printHTMLEmptyContent();
							}
							
							// ----------------------------
							
							html += closeElementContent();
						}
					}
					
					html += closeHeader();
					
				}
			}
		}
		
		return html.toString();		
	}
	
	/**
	 * Este metodo se usa para recorrer las relaciones de un fact con las decisiones 
	 * de arquitectura, los commits, correos y chats. Este listado es luego
	 * usado para pintar la tabla con las coincidencias.
	 * @param fact
	 * @return
	 */
	private ArrayList<ArtifactBO> listRelatedArtifacts(Fact fact){
		
		ArrayList<ArtifactBO> list = new ArrayList<ArtifactBO>();
		
		// Listing architectural decisions
		getADRs(fact, list);
		
		// Listing github commits messages
		getGitHubMessages(fact, list);
		
		// Listing chatlogs messages
		getChatLogMessages(fact, list);
		
		return list;
	}
	
	private void getChatLogMessages(Fact fact, ArrayList<ArtifactBO> list) {
		if(fact.getMessagelogs()!=null) {
			for(MessageLog ml : fact.getMessagelogs()) {
				ArtifactBO bo = new ArtifactBO();
				bo.setName(ml.getTitle());
				bo.setType(ml.getType().getLiteral().toLowerCase());
				bo.setDate((ml.getCreationDate().getYear()+1900) + "-" + (ml.getCreationDate().getMonth()+1) + "-" + ml.getCreationDate().getDate());
				
				
				
				list.add(bo);
			}				
		}
	}
	
	private void getADRs(Fact fact, ArrayList<ArtifactBO> list) {
		if(fact.getArchitecturaldecision()!=null) {
			
			for(Decision dec : fact.getArchitecturaldecision()) {
				ArtifactBO bo = new ArtifactBO();
				bo.setType("AD");
				bo.setName(dec.getNumber()+"-"+dec.getTitle());
				bo.setDate((dec.getDate().getYear()+1900) + "-" + (dec.getDate().getMonth()+1) + "-" + dec.getDate().getDate());
				list.add(bo);
			}
		}
	}
	
	private void getGitHubMessages(Fact fact, ArrayList<ArtifactBO> list) {
		if(fact.getMessage()!=null) {
			
			for(CommitMessage msn : fact.getMessage()) {
				ArtifactBO bo = new ArtifactBO();
				bo.setType("GH");
				bo.setName(msn.getSubject());
				bo.setDate((msn.getDate().getYear()+1900) + "-" + (msn.getDate().getMonth()+1) + "-" + msn.getDate().getDate());
				list.add(bo);  
			}
		}
	}
	
	private String printHTMLEmptyContent() {
		StringBuffer html = new StringBuffer();
		html.append("<tr>");
		html.append("<td colspan=\"3\">No related artifacts were found</td>");
		html.append("</tr>");
		return html.toString();
	}
	
	private String printHTMLContent(String type, String name, String date) {
		StringBuffer html = new StringBuffer();
		html.append("<tr>");
		html.append("<td>"+type+"</td>");
		html.append("<td>"+name+"</td>");
		html.append("<td>"+date+"</td>");
		html.append("</tr>");
		return html.toString();
	}
	
	private String openElementContent() {
		StringBuffer html = new StringBuffer();
		html.append("<tbody>");
		return html.toString();
	}
	
	private String closeElementContent() {
		StringBuffer html = new StringBuffer();
		html.append("</tbody>");
		return html.toString();
	}
	
	private String openElementHeader(String elementName, String elementDescription) {
		StringBuffer html = new StringBuffer();
		
		if(elementDescription.isEmpty())
			elementDescription = "No description";
		
		html.append("<thead>");
		html.append("<tr>");
//		html.append("<th colspan=\"3\">"+elementName+": <span style='font-weight:normal'><i>"+elementDescription+"</i></span></th>");
		html.append("<th colspan=\"3\">Content similarities found in related artifacts</th>");
		html.append("</tr>");
		html.append("<tr style=\"background-color: #F5F5F1\">");
		html.append("<th>Artifact type</th>");
		html.append("<th>Artifact id or name</th>");
		html.append("<th>Artifact date</th>");
		html.append("</tr>");
		html.append("</thead>");
		
		return html.toString();
	}
	
	private String openHeader() {
		StringBuffer html = new StringBuffer();
		
		html.append("<table class=\"pure-table pure-table-horizontal\">	");
		html.append("<col width=\"130px\" />");
		html.append("<col width=\"400px\" />");
		html.append("<col width=\"130px\" />");
		
		return html.toString();
	}
	
	private String closeHeader() {
		StringBuffer html = new StringBuffer();
		
		html.append("</table>");
		
		return html.toString();
	}
	
	
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
		
		Resource res = cModel.buildModelRebelCore(xml, modelName);
		Project project = (Project) res.getContents().get(0);
		
		// Buscar el nombre del functional view más recience
		FunctionalView fv = findNewestFunctionalView(project);
		
		// Construyo el json a partir del functional view
		jsonContent = functionalViewToJSON(fv);
		
		
		return jsonContent;		
	}
	
	public String buildJSONForJoint(String xml, String modelName, String functionalViewName) throws Exception {
		String jsonContent = "";
		
		
		
		Resource res = cModel.buildModelRebelCore(xml, modelName);
		Project project = (Project) res.getContents().get(0);
		
		// Buscar el nombre del functional view pasado como parametro
		FunctionalView fv = findFunctionalViewByName(project, functionalViewName);
		
		
		
		// Construyo el json a partir del functional view
		jsonContent = functionalViewToJSON(fv); 
		
		
		return jsonContent;		
	}
	
	private FunctionalView findFunctionalViewByName(Project project, String functionalViewName) throws Exception {
		
		FunctionalView foundfv = null;
		
		if(project!=null) {
			for(BlockOfInterest boi : project.getBlockofinterest()){
				for(Fact f : boi.getFact()) {
					for(FunctionalView fv : f.getFunctionalview()) {
						if(fv.getName().equals(functionalViewName)) {
							foundfv = fv;
							break;
						}
					}
				}
			}
		}
		
		return foundfv;
	}
	
	/**
	 * Obtiene el functional view mas reciente de los que se citan en los Fact
	 * @param project
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	private FunctionalView findNewestFunctionalView(Project project) throws Exception {
		
		Date newestDate = new Date(0, 0, 13);
		FunctionalView newestfv = null;
		
		if(project!=null) {
			for(BlockOfInterest boi : project.getBlockofinterest()){
				for(Fact f : boi.getFact()) {
					for(FunctionalView fv : f.getFunctionalview()) {
						Date fvDate = fv.getDate();
						
						
						
						if(fvDate.compareTo(newestDate)>0) {
							newestDate = fvDate;
							newestfv = fv;
						}
					}
				}
			}
		}
		
		return newestfv;
	}
	
	/**
	 * Este es un metodo generico para crear el json requerido por jointjs
	 * para pintar el diagrama de componentes.
	 * @param fv Objeto FunctionaView que contiene la relación de componentes y conectores
	 * @return
	 */
	private String functionalViewToJSON(FunctionalView fv) {
		String jsonContent = "";
		
		createJSON();
		// It is used to stored the out/in port of all components
		HashMap<String, String> portsElement = new HashMap<String, String>();
				
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
				
				if(r.getPort()!=null) {
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
	
	
	
	
	@SuppressWarnings("unchecked")
	public void createJSONDiagram() {
		mainObj = new JSONObject();		
		JSONArray obj = new JSONArray();
		mainObj.put("cells", obj);
	}
	
	public void createJSONTimeline() {
		mainObjTimeline = new JSONArray();
	}
	
	public List<APIFact> buildListOfFacts(String xmlRoute, String modelName) throws Exception {		

		List<APIFact> list = null;
		
		// Se carga unicamente el boi de ese proyecto. Por eso no se valida el nombre del boi cuando se recorren
		Resource res = cModel.buildModelRebelCore(xmlRoute, modelName);
		Project project = (Project) res.getContents().get(0);
		
		if(project!=null) {
			
			list = new ArrayList<APIFact>();
			
			for(BlockOfInterest boi : project.getBlockofinterest()){
				
				for(Fact f : boi.getFact()) {
					
					if(!f.getElementType().equals("Component") && !f.getElementType().equals("Connector")) {
					
						Action action = f.getAction();
						Date date = f.getDate();
						String observation = f.getObservations();
						String id = f.getId();
						
						String name = f.getElementName();
						
						APIFact fact = new APIFact();
						
						String elementName = "<<"+ getSentenceFormat(f.getElementType()) +">> "+name;
						
						
						fact.setId(id);
						fact.setName(elementName);
						fact.setDate(dateToString(date));
						fact.setAction(action.getLiteral());
						fact.setObservation(observation!=null&&observation.length()>0?observation:"");
						// Este se usa para los modelos de C&C
	//					fact.setModel(f.getFunctionalview().get(0).getName());
						fact.setModel(f.getView().get(0).getName());
						fact.setListOfADs(getADRelatedToFact(f));
						
						list.add(fact);
					}
				}
			}
		}
		
		return list;
		
	}
	
	/**
	 * Lista las decisiones de arquitectura previamente asociadas al Fact
	 * @param f
	 * @return
	 */
	private ArrayList<APIArchitecturalDecision> getADRelatedToFact(Fact f) {
		ArrayList<APIArchitecturalDecision> adList = new ArrayList<APIArchitecturalDecision>();
		
		EList<rebel_core.Decision> factDecisions = f.getArchitecturaldecision();
		if(factDecisions!=null) {
			for(rebel_core.Decision dec : factDecisions) {
				APIArchitecturalDecision apiAD = new APIArchitecturalDecision(dec.getNumber(), dec.getTitle());
				adList.add(apiAD);
			}
		}
		
		return adList;
	}
	
	public String dateToString(Date date) {
		 
		@SuppressWarnings("deprecation")
		String textDate = date.getDate() + ", " + (date.getMonth()+1) + " " + (date.getYear()+1900);
		
		return textDate;
	}
	
	public String getSentenceFormat(String text) {
		if(text!=null && text.length()>0) {
		
			String newText = text.toLowerCase();
		
			String first = String.valueOf(newText.toCharArray()[0]);
			String otherText = newText.substring(1);
			String finalText = first.toUpperCase()+otherText;
			return finalText;
		}else
			return text;
	}
	
	/**
	 * 
	 * @param xml XML route
	 * @param modelName
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public String buildJSONForTimeline(String xmlRoute, String modelName) throws Exception {		

		String jsonContent = "";
		
		Resource res = cModel.buildModelRebelCore(xmlRoute, modelName);
		Project project = (Project) res.getContents().get(0);
		
		// Se carga unicamente el boi de ese proyecto. Por eso no se valida el nombre del boi cuando se recorren
		if(project!=null) {
			
			createJSONTimeline();
			
			for(BlockOfInterest boi : project.getBlockofinterest()){
				
				for(Fact f : boi.getFact()) {
					
					// Este if se coloca para evitar que se listen los Facts relacionados con los diagramas de C&C. 
					// El timeline debe solo listar los Facts de Archimate
					if(!f.getElementType().equals("Component") && !f.getElementType().equals("Connector")) {
					
						Action action = f.getAction();
						Date date = f.getDate();
						String observation = f.getObservations();
						
						String name = f.getElementName();
						// Por ahora no se usa
						// ElementTypeEnum type = e.getType();
						
//						System.out.println("f.getElementName() = "+f.getElementName()+" ("+f.getElementType()+")");
						String referencedView = f.getView().get(0).getName();	
						
						
						// ----------------------------------
						
						JSONObject elem1 = new JSONObject();
						
						elem1.put("time", (date.getYear()+1900)+"-"+(date.getMonth()+1)+"-"+date.getDate());
						
						JSONArray body1 = new JSONArray();
						
						JSONObject tag = new JSONObject();
						tag.put("tag", "p");
						
						String urlContent = "<a href=\"http://localhost:8080/rebelviz/seeboi.html?p="+project.getName()+"&boi="+boi.getName()+"&mn="+referencedView+"\">"+referencedView+"</a>";
						
						String actionAndType = "";
						String sentenceFormat = getSentenceFormat(f.getElementType()!=null?f.getElementType():"").toLowerCase();
						
						if(sentenceFormat.indexOf("_")>=0) {
							if(!getSentenceFormat(action.getLiteral()).equals("Update"))
								actionAndType = getSentenceFormat(action.getLiteral())+" element type "+getSentenceFormat(f.getElementType()).toLowerCase();
							else
								actionAndType = getSentenceFormat(action.getLiteral())+" property of element type "+getSentenceFormat(f.getElementType()).toLowerCase();
						}else {
							actionAndType = getSentenceFormat(action.getLiteral())+" relation of type "+getSentenceFormat(f.getElementType()).toLowerCase();
						}
						
						String buttonJustify  = "";
						
						// ----------------------------------------------------------
						// Para validar si el Fact está marcado como item ATD
						// ----------------------------------------------------------
						if(f.getAtditem()!=null && f.getAtditem().size()>0) {
							if(f.getAtditem().get(0).isIdentifyByArchitect()) {
								String content = "&nbsp;ATD item - Type: "+f.getAtditem().get(0).getType()+" - Compromised QA: "+f.getAtditem().get(0).getCompromisedQA()+"&nbsp;";
								buttonJustify = "<a onclick=\"window.open('whyatd_filled.html?b="+boi.getName()+"&p="+project.getName()+"&i="+f.getId()+"&t="+actionAndType+"&d="+name+"', '_blank', 'location=no,height=680,width=870,scrollbars=yes,status=yes');\"><img src=\"images/atdflagleft.png\"/>"+content+"<img src=\"images/atdflagright.png\"/></a>";
							}else {
								String content = "&nbsp;Candidate ATD item - Type: "+f.getAtditem().get(0).getType()+" - Compromised QA: "+f.getAtditem().get(0).getCompromisedQA()+"&nbsp;";
								buttonJustify = "<a onclick=\"window.open('whyatd_filled.html?b="+boi.getName()+"&p="+project.getName()+"&i="+f.getId()+"&t="+actionAndType+"&d="+name+"', '_blank', 'location=no,height=680,width=870,scrollbars=yes,status=yes');\"><img src=\"images/atdflagleft.png\"/>"+content+"<img src=\"images/atdflagright.png\"/></a>";
							}
						}else
							buttonJustify = "<a onclick=\"window.open('whyatd.html?b="+boi.getName()+"&p="+project.getName()+"&i="+f.getId()+"&t="+actionAndType+"&d="+name+"', '_blank', 'location=no,height=680,width=870,scrollbars=yes,status=yes');\">Why ATD?</a>";
						
						
						// ----------------------------------------------------------
						// Para traer la decision de arquitectura asociada
						// ----------------------------------------------------------
						
						String linkedADR = "";
						
						// Buscar si el Fact tiene ADRs asociados
						if(f.getArchitecturaldecision()!=null && f.getArchitecturaldecision().size()>0) {
							for(Decision dec : f.getArchitecturaldecision()) {
								if(dec!=null) {
									// Obtener el número y el título
									linkedADR = dec.getNumber() + " - " + dec.getTitle();
									break;
								}
							}
						}
						
						
						// ----------------------------------------------------------
						// Construccion del JSON
						// ----------------------------------------------------------
						
						String contentStructure = actionAndType + " ("+urlContent+")<br/>"+name;
						
						// La observacion se usa para cuando se actualizan propiedades
						if(observation!=null && observation.length()>0) {
							contentStructure += "<br/>"+observation; 
						}
						
													
						String finalPart = "";
						
						if(linkedADR!=null && linkedADR.length()>0) {
							finalPart = "Linked ADR: " + linkedADR + "<br/>" + buttonJustify;
						}else {
							finalPart = buttonJustify;
						}
							
						contentStructure += "<br/>"+finalPart;
						
						tag.put("content", contentStructure);
						
						body1.add(tag);
						
						elem1.put("body", body1);
						
						mainObjTimeline.add(elem1);
						
						// ----------------------------------
					}	
					
				}				
			}				
			jsonContent = mainObjTimeline.toJSONString();
		}
		
		return jsonContent;
	}
	
	public int countArchitecturalElementsByName(String xmlRoute, String modelName) throws Exception {
		int total = 0;
		
		List<String> namesList = new ArrayList<String>();
		
		Resource res = cModel.buildModelRebelCore(xmlRoute, modelName);
		Project project = (Project) res.getContents().get(0);
		
		// Recorrer Project / BOI
		for(BlockOfInterest boi : project.getBlockofinterest()){
			
			
			// Buscar coincidencia de nombre de BOI
			if(boi!=null && boi.getName()!=null && boi.getName().equals(modelName)) {
				
				// Recorrer los FACT
				for(Fact f : boi.getFact()) {
					
					if(f.getFunctionalview()!=null && f.getFunctionalview().size()>0) {
						
						// Un hecho estará ligado siempre a un FV
						FunctionalView fv = f.getFunctionalview().get(0);
						
						for(Component c : fv.getComponents()) {
							namesList.add(c.getName());
						}
						
						for(Connector c : fv.getConnectors()) {
							namesList.add(c.getName());
						}
					}
					
					if(f.getView()!=null && f.getView().size()>0) {
						// Un hecho estará ligado siempre a un FV
						// De todas maneras se deja en un for de una iteración
						for(ArchimateView v : f.getView()) {
							if(v.getElement()!=null) {
								for(Element e : v.getElement()) {
									namesList.add(e.getName());
								}
							}
						}
					}
					
				}
				
				Set<String> uniqueNames = new HashSet<String>(namesList);
				total = uniqueNames.size();
				
				break;
			}
		}
		
		return total;
	}
	
}
