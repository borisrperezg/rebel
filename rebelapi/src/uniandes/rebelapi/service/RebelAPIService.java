package uniandes.rebelapi.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import uniandes.rebelapi.bo.APIArchitecturalDecision;
import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.bo.APIElement;
import uniandes.rebelapi.bo.APIFact;
import uniandes.rebelapi.bo.APIModelElement;
import uniandes.rebelapi.bo.APIView;
import uniandes.rebelapi.bo.ATDItemBO;
import uniandes.rebelapi.bo.Model;
import uniandes.rebelapi.bo.Project;
import uniandes.rebelapi.mediator.DerbyDBMediator;
import uniandes.rebelapi.mediator.IdentificationMediator;
import uniandes.rebelapi.mediator.ModelMediator;
import uniandes.rebelapi.mediator.RebelMediator;
import uniandes.rebelapi.mediator.TrainingMediator;

@Path("rebel")
public class RebelAPIService {
	
	/**
	 * Este metodo se usa en WhyATD para mostrar la informacion
	 * almacenada respecto al item.
	 * @param params
	 */
	@Path("getATDItemData/{params}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ATDItemBO getATDItemData(@PathParam("params") String params) {
		ATDItemBO resp = null;
		
		try {
			resp = (new IdentificationMediator()).getATDItemData(params); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}
	
	
	/**
	 * 
	 * @param filtro
	 * @return
	 */
	@Path("gotraining/{params}")
	@GET
	@Produces("text/plain")
	public String goTraining(@PathParam("params") String params) {
		String resp = "NOK";
		
		try {
			resp = (new TrainingMediator()).trainingModel(params); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}
	
	/**
	 * 
	 * @param filtro
	 * @return
	 */
	@Path("identifycandidates/{params}")
	@GET
	@Produces("text/plain")
	public String identifyATDCandidates(@PathParam("params") String params) {
		String resp = "NOK";
		
		String hora = ""+Calendar.getInstance().get(Calendar.HOUR);
		String minuto = ""+Calendar.getInstance().get(Calendar.MINUTE);
		String segundo = ""+Calendar.getInstance().get(Calendar.SECOND);
		String milisegundo = ""+Calendar.getInstance().get(Calendar.MILLISECOND);
		
		String time = hora+":"+minuto+":"+segundo+"."+milisegundo;
		
		System.out.println("Service.identifyATDCandidates ::: Start java time: "+time);
		
		try {
			resp = (new IdentificationMediator()).prepareDatasetToClassify(params); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}
	
	/**
	 * Este metodo se usa para pintar la seccion TimeLine de la visualizacion
	 * del bloque de interes.
	 * @param params
	 * @return
	 */
	@Path("getTimeline/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getTimeline(@PathParam("filtro") String params) {
		
//		System.out.println("RebelAPIService.getTimeline ::: params = "+params);
		
		String resp = null;
		try {
			resp = (new ModelMediator()).buildTimeLine(params); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}
	
	/**
	 * Este metodo se encarga de buscar todos los Facts de un proyecto, que estén identificados
	 * como extraidos de un diagrama de componente y conector.
	 * Esta lista se muestra al momento de justificar un caso de ATD en Archimate
	 * @param params
	 * @return
	 */
	@Path("listcncfacts/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIFact> listFactsFromComponentAndConnectorsDiagram(@PathParam("filtro") String params) {
		List<APIFact> resp = null;  
		
		System.out.println("RebelAPIService.listFactsFromComponentAndConnectorsDiagram ::: Hi there");
		
		try {
			resp = (new ModelMediator()).listFactsFromComponentAndConnectorsDiagram(params);  
			
		}catch(Exception e) { 
			e.printStackTrace();    
		}
		
		System.out.println("RebelAPIService.listFactsFromComponentAndConnectorsDiagram ::: Bye");
		
		return resp;
	}
	
	/**
	 * Este metodo se encarga de listar las vistas involucradas en un BOI, 
	 * y retornarlas para pintarlas en el combo de visualizacion del BOI.
	 * @param params
	 * @return
	 */
	@Path("listboiviews/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIView> listBOIViews(@PathParam("filtro") String params) {
		List<APIView> resp = null;  
		
		try {
			resp = (new ModelMediator()).listBOIViews(params);  
			
		}catch(Exception e) { 
			e.printStackTrace();    
		}
		
		return resp;
	}
	
	/**
	 * Este metodo se encarga de listar los elementos involucrados en un BOI, 
	 * y retornarlas para pintarlas en el combo de visualizacion del BOI.
	 * @param params
	 * @return
	 */
	@Path("listboielements/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIElement> listBOIElements(@PathParam("filtro") String params) {
		List<APIElement> resp = null;  
		
		try {
			resp = (new ModelMediator()).listBOIElements(params);  
			
		}catch(Exception e) { 
			e.printStackTrace();    
		}
		
		return resp;
	}
	
	@Path("listdrivers/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIElement> listArchimateDrivers(@PathParam("filtro") String params) {
		List<APIElement> resp = null;  
		
		try {
			resp = (new ModelMediator()).listArchimateDrivers(params);  
			
		}catch(Exception e) { 
			e.printStackTrace();    
		}
		
		return resp;
	}
	
	/**
	 * Lista los goals encontrados en los modelos de Archimante asociados al proyecto. 
	 * @param params Se reciben el nombre del proyecto y el nombre del modelo. Se debe 
	 * extraer lo que está antes del "_"
	 * @return
	 */
	@Path("listgoals/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIElement> listArchimateGoals(@PathParam("filtro") String params) {
		List<APIElement> resp = null;  
		
		try {
			resp = (new ModelMediator()).listArchimateGoals(params);  
			
		}catch(Exception e) { 
			e.printStackTrace();    
		}
		
		return resp;
	}
	
	/**
	 * Este método se encarga de establecer la asociación entre un Fact y una Decisión
	 * de arquitectura.
	 * @param params projecname@boiname & idfact@idadr & idfact@idadr & idfact@idadr
	 * @return OK | NOK    
	 */
	@Path("setlinkfacttoadr/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIFact> setLinkFactToADR(@PathParam("filtro") String params) {
		
		List<APIFact> resp = null;  
		try {
			resp = (new ModelMediator()).setLinkFactToADR(params);  
			
		}catch(Exception e) { 
			e.printStackTrace();    
		}
		 
		return resp;
	}
	
	/**
	 * 
	 * @param params projectname&boiname
	 * @return
	 */
	@Path("listfacts/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIFact> listFacts(@PathParam("filtro") String params) {
		List<APIFact> resp = null;
		
		try {
			if(params!=null) {
				resp = (new ModelMediator()).listFacts(params);      
			}
		}catch(Exception e) { 
			e.printStackTrace();
		}
		
		return resp;
	}
	
	
	
	/**
	 * Este metodo se usa para listar todos los modelos de C&C o Despliegue
	 * y cargarlos en un combobox. Este método se usa en varias partes.
	 * @param projectName
	 * @return
	 */
	@Path("listmodels/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Model> listarModelos(@PathParam("filtro") String projectName) {
		List<Model> resp = null;
		
		DerbyDBMediator dm = new DerbyDBMediator();
		resp = dm.getNamesOfModels(projectName);   
		
		return resp;
	}
	
	/**
	 * Este metodo toma el archivo recien cargado al servidor, y lo procesa 
	 * para construir el xmi y almacenarlo en la BD. Este metodo se invoca desde 
	 * la pantalla de Cargar Artefactos.
	 * @param params p="+project+"&a="+artifactType+"&n="+fileName
	 * @return
	 */
	@Path("buildxmi/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String buildxmi(@PathParam("filtro") String params) {
		
//		System.out.println("RebelAPIService.buildxmi ::: Entering");
		
		String resp = "";
		
		if(params!=null && params.length()>0) {		   
			String project = "";
			String type = "";
			String name = "";
			
			String[] arrayParams = params.split("&");
			for(String s : arrayParams) {
				String[] keyValue = s.split("=");
				
				if(keyValue[0].equals("p"))
					project = keyValue[1];
				else if(keyValue[0].equals("a"))
					type = keyValue[1];
				else if(keyValue[0].equals("n"))
					name = keyValue[1];
			}
					
			resp = (new ModelMediator()).buildAndStoreXMI(project, type, name);
		} 
		
		return resp;
	}
	
	/**
	 * Este metodo se usa para retornar la informacion en JSON del 
	 * modelo que se pasa como filtro. El retorno se usa para visualizar
	 * el modelo usando jointjs.
	 * @param filtro
	 * @return
	 */
	@Path("getmodel/{filtro}")
	@GET
	@Produces("text/plain")
	public String getmodel(@PathParam("filtro") String filtro) {		
		
		String json = "";
		
		if(filtro!=null && filtro.length()>0) {
			DerbyDBMediator db = new DerbyDBMediator();
			try {
				
				json = db.getModelJSON(filtro);  
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return json;
		
	}
	
	@Path("getmodelboi/{filtro}")
	@GET
	@Produces("text/plain")
	public String getmodelBOI(@PathParam("filtro") String filtro) {		
		
		String resp = null;
		try {
			resp = (new ModelMediator()).buildBOIDiagram(filtro); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resp;
		
	}   
	
	@Path("getdriverandgoal/{filtro}")
	@GET
	@Produces("text/plain")
	public String getDriverAndGoal(@PathParam("filtro") String filtro) {		
		
		String resp = null;
		try {
			resp = (new ModelMediator()).getDriverAndGoal(filtro); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resp;
		
	}   
	
	@Path("updateposition/{filtro}")
	@GET
	@Produces("text/plain")
	public String updatePosition(@PathParam("filtro") String filtro) {
		System.out.println("Entrando");
		if(filtro!=null) {
			(new ModelMediator()).updateElementsPosition(filtro);
		}	
		return "Done";    
	}
	
	/**
	 * Este metodo se utiliza para cargar la lista de elementos arquitectural asociados 
	 * a un proyecto.
	 * @param params
	 * @return
	 */
	@Path("listelements/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIModelElement> listElements(@PathParam("filtro") String params) {
		
		List<APIModelElement> resp = null;
		
		if(params!=null) {
			resp = (new ModelMediator()).listModelElements(params);
		}	
		
		return resp;
	}
	
	@Path("listads/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIArchitecturalDecision> listArchitecturalDecisions(@PathParam("filtro") String projectName) {
		
		List<APIArchitecturalDecision> resp = null;
		if(projectName!=null && projectName.length()>0)
			resp = (new ModelMediator()).listArchitecturalDecisions(projectName);    
		return resp;
	}
	
	@Path("listprojects")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Project> listProjects() {
		 
		DerbyDBMediator med = new DerbyDBMediator();
		
		List<Project> list = med.getListOfProjects();
		
		return list;
	}
	
	@Path("listcompromisedqas")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIElement> listQualityAttributes() {
		 
		DerbyDBMediator med = new DerbyDBMediator();		
		List<APIElement> list = med.getListOfQAS();		
		return list;
	}
	
	@Path("listcausetypes")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIElement> listATDTypes() {
		 
		DerbyDBMediator med = new DerbyDBMediator();		
		List<APIElement> list = med.getListOfATDTypes();		
		return list;
	}
	
	@Path("createproject/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Project> createProject(@PathParam("filtro") String name) {
		
		List<Project> list = null;
		DerbyDBMediator med = new DerbyDBMediator();
		
		try {
			// Agrega el proyecto
			list = med.insertAndListProject(name);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Path("deleteproject/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Project> deleteProject(@PathParam("filtro") String id) {
		
		List<Project> list = null;
		DerbyDBMediator med = new DerbyDBMediator();
		
		try {
			// Agrega el proyecto
			list = med.deleteAndListProject(id);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * 
	 * @param params projectName & boiName & idAD & idFact   -- Spaces added for readibility
	 * @return
	 */
	@Path("removeadrtofact/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIFact> removeADToFact(@PathParam("filtro") String params) {
		  
		List<APIFact> list = null;
		
		try {
			if(params!=null) {
				list = (new ModelMediator()).removeADToFact(params);        
			}  
		}catch(Exception e) {   
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Path("deleteboi/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIBOI> deleteBOI(@PathParam("filtro") String id) {
		
		List<APIBOI> list = null;
		DerbyDBMediator med = new DerbyDBMediator();
		
		try {
			// Agrega el proyecto
			list = med.deleteAndListBOI(id);  
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Path("deleteartifact/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIModelElement> deleteArtifact(@PathParam("filtro") String artifactId) {
		
		List<APIModelElement> list = null;
		DerbyDBMediator med = new DerbyDBMediator();
		
		try {
			// Agrega el proyecto
			list = med.deleteAndListProjectArtifacts(artifactId);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * Este metodo lista los BoIs de acuerdo a un proyecto seleccionado
	 * @param id projectid
	 * @return
	 */
	@Path("listbois/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIBOI> listBOIs(@PathParam("filtro") String projectName) {
		  
		List<APIBOI> list = null;
		
		if(projectName!=null && projectName.length()>0) {  
			
			try {
				list = (new ModelMediator()).listBOIs(projectName);    
			}catch(Exception e) {
				e.printStackTrace();
			}  
		}
		
		return list;
	}
	
	/**
	 * Este metodo lista los BoIs donde se encuentre coincidencia con 
	 * el nombre del elemento pasado en el filtro
	 * @param params projectName&elementName
	 * @return
	 */
	@Path("listboiswithelement/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIBOI> listBOIWithElement(@PathParam("filtro") String params) {
		
		List<APIBOI> list = null;
		
		if(params!=null && params.length()>0) {  
			
			try {
				list = (new ModelMediator()).listBOIWithElement(params);
			}catch(Exception e) {
				e.printStackTrace();
			} 
		}
		
		return list;
	}
	
	/**
	 * Este metodo lista los artefactos asociados a un proyecto. Se usa para gestionar los artefactos
	 * @param id projectid
	 * @return
	 */
	@Path("listartifactsproject/{filtro}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<APIModelElement> listArtifactsProject(@PathParam("filtro") String projectName) {
		
		List<APIModelElement> list = null;
		
		System.out.println("ProjectName = "+projectName);
		
		if(projectName!=null && projectName.length()>0) {  
			
			try {
				list = (new ModelMediator()).listArtifactsProject(projectName);
//				System.out.println("list size = "+list.size());
			}catch(Exception e) {
				e.printStackTrace();
			} 
		}
		
		return list;
	}
	
	/**
	 * Este metodo arma el html en el cual se pintan los artefactos heterogeneos
	 * @param params
	 * @return
	 */
	@Path("loadhtml/{filtro}")
	@GET
	@Produces("text/plain")
	public String loadHtmlTable(@PathParam("filtro") String params) {
		
		String resp = null;    
		try {
			resp = (new ModelMediator()).buildBOITable(params);
		}catch(Exception e) {
			e.printStackTrace();
		} 
		
		return resp;
		
	}
	
	/**
	 * 
	 * @param params p=projectName&bm=baseModel&boi=boiName&[archielem1]&[archielem2]&[archielemn]
	 * @return
	 */
	@Path("createboiarchi/{filtro}")
	@GET
	@Produces("text/plain")
	public String createBOIArchi(@PathParam("filtro") String params) {
		
		System.out.println("Entering");
		
		String resp = "NOK";
		
		if(params!=null && params.length()>0) {
			
			try {
				resp = (new RebelMediator()).boiCreationArchi(params);
			}catch(Exception e) {
				e.printStackTrace();
			} 
			
		}
		
		return resp;
	}
	
	@Path("createboicnc/{filtro}")
	@GET
	@Produces("text/plain")
	public String createBOICnC(@PathParam("filtro") String params) {
		
		String resp = "NOK";
		
		System.out.println("Service.createboi ::: params = "+params);
		
		if(params!=null && params.length()>0) {
			String[] aParams = params.split("&");
			
			String project = aParams[0].substring(aParams[0].indexOf("=")+1);
			String boiName = aParams[1].substring(aParams[1].indexOf("=")+1);
			
			// Se crea la lista con los componentes a extraer
			ArrayList<String> componentsName = new ArrayList<String>();
			// Se crea la lista con los conectores a extraer
			ArrayList<String> connectorsName = new ArrayList<String>();
			
			for(int t=2;t<aParams.length;t++) {
				String p = aParams[t];
				// nm = nombre componente
				// nm = nombre conector
				
				String name = p.substring(p.indexOf("=")+1);
				
				if(p.indexOf("nm")>=0) {
					componentsName.add(name);
				}else if(p.indexOf("nn")>=0) {
					connectorsName.add(name);    
				} 
			}
			
			try {
				resp = (new RebelMediator()).boiCreationCnC(project, boiName, componentsName, connectorsName);
			}catch(Exception e) {
				e.printStackTrace();
			} 
			
		}
		
		return resp;
	}
	
	/**
	 * Este metodo se usa para incluir artefactos al BOI luego de que hubiera sido
	 * creado. Permite buscar en nuevos artefactos que se hayan incluido luego de
	 * haber creado al BOI
	 * @param params
	 * @return
	 */
	@Path("findnewartifacts/{filtro}")   
	@GET
	@Produces("text/plain")
	public String findNewArtifactsBOI(@PathParam("filtro") String params) {
		
		String resp = "NOK";
		
		if(params!=null && params.length()>0) {
			String[] aParams = params.split("&");
			
			String project = aParams[0].substring(aParams[0].indexOf("=")+1);
			String boiName = aParams[1].substring(aParams[1].indexOf("=")+1);
			
			try {
				resp = (new RebelMediator()).updateBOI(project, boiName);
			}catch(Exception e) {
				e.printStackTrace();
			} 
			
		}
		
		return resp;
	}
	
	/**
	 * Se pasa el nombre del BoI recien creado. Con el nombre del BoI, se buscan los nombres 
	 * de los elementos arquitecturales.
	 * @param boiName 
	 * @return
	 */
//	@Path("findbysimilarity/{filter}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String findBySimilarity(@PathParam("filter") String boiName) throws Exception{
//		
//		String resp = "";
//		
//		if(boiName!=null && boiName.length()>0) {		   
//						
//			resp = (new ModelMediator()).findRelationshipsBySimilarity(boiName);
//		} else {
//			resp = "NOK";
//			throw new Exception("RebelAPIService.findBySimilarity ::: Empty boi name");
//		}
//		 
//		return resp;
//	}
	
}
