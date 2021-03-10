package uniandes.rebelapi.mediator;

import java.io.File;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.FileUtils;

import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.bo.APIElement;
import uniandes.rebelapi.bo.APIModelElement;
import uniandes.rebelapi.bo.Model;
import uniandes.rebelapi.bo.Project;
import uniandes.rebelapi.db.APIATDTypeDerby;
import uniandes.rebelapi.db.APIModelDerby;
import uniandes.rebelapi.db.APIQualityAttributesDerby;
import uniandes.rebelapi.db.ProjectDerby;
import uniandes.rebelapi.util.ComponentAndConnectorJSONGenerator;

public class DerbyDBMediator {
	
	private String uriAddress = "/Users/borisperezg/rebel";
		

	public List<Project> getListOfProjects(){
		List<Project> list = null;
		
		ProjectDerby pd = new ProjectDerby();
		list = pd.list();
		
		for(int t=0;t<list.size();t++) {
			Project proj = list.get(t);
			proj.setAmountOfArtifacts(pd.countArtifacts(proj.getId()));
		}
		
		return list;
	}
	
	public void insertProject(String name) throws Exception {
		
		ProjectDerby pd = new ProjectDerby();
		pd.insert(name);
		
	}
	
	public List<Project> insertAndListProject(String name) throws Exception {
		List<Project> list = null;
		ProjectDerby pd = new ProjectDerby();
		pd.insert(name);
		list = pd.list();
		return list;
	}
	
	public List<APIModelElement> deleteAndListProjectArtifacts(String artifactId) throws Exception {
		List<APIModelElement> list = null;
		
		APIModelDerby pd = new APIModelDerby();
		
		// 1. Obtener el nombre y el id del proyecto
		Project project = pd.getProject(artifactId);
		
		// 2. Obtener el nombre y el tipo de artefacto a borrar
		APIModelElement artifact = pd.getArtifact(artifactId);
		
		// 3. Borrar el archivo de la BD con el id
		pd.deleteArtifact(artifactId);
		
		// 4. Borrar del disco usando el nombre del proyecto, el tipo de artefacto y el nombre del artefacto 
		File f = null;
		
		if(artifact.getType().equals("decision"))
			f = new File(uriAddress + "/"+project.getName()+"/decision/" + artifact.getName() + ".rebel_architecturaldecisions");
		else if(artifact.getType().equals("functionalview"))
			f = new File(uriAddress + "/"+project.getName()+"/functionalview/" + artifact.getName() + ".rebel_componentandconnector");
		else if(artifact.getType().equals("chat") || artifact.getType().equals("email"))
			f = new File(uriAddress + "/"+project.getName()+"/chatlogs/" + artifact.getName() + ".rebel_chatlogs");
		else if(artifact.getType().equals("github"))
			f = new File(uriAddress + "/"+project.getName()+"/github/" + artifact.getName() + ".rebel_github");
		else if(artifact.getType().equals("archimate"))	{
			f = new File(uriAddress + "/"+project.getName()+"/archimate/" + artifact.getName() + ".rebel_archimate");
			
			File xmlViewDevFile = new File("/Users/borisperezg/apache-tomcat-7.0.100/webapps/rebelviz/archimatemodels/"+project.getName()+"/"+artifact.getName()+".xml");
			File xmlViewProFile = new File("/Users/borisperezg/apache-tomcat-7.0.100/webapps/rebelviz/archimatemodels/"+project.getName()+"/"+artifact.getName()+".xml");
			
			try {
				xmlViewDevFile.delete();
			} catch (Exception e) {
				System.out.println("Error borrando xml asociado a Archimate ::: "+e.getMessage());
			}
			
			try {
				xmlViewProFile.delete();
			} catch (Exception e) {
				System.out.println("Error borrando xml asociado a Archimate ::: "+e.getMessage());
			}
		}
			
		
		if(f!=null && f.exists()) {
			f.delete();
			System.out.println("File "+f.getName()+ " deleted");
		}else
			System.out.println("File  NOT deleted");
		
		// 5. Devolviendo la nueva lista
		list = pd.listAllArtifacts(project.getName());
		
		return list;
	}
	
	/**
	 * Borra el proyecto de la BD y de la estructura de archivos en todos los lugares correspondientes
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Project> deleteAndListProject(String id) throws Exception {
		List<Project> list = null;
		ProjectDerby pd = new ProjectDerby();
		
		try {
			
			String projectName = pd.find(id);
			int amountOfArtifacts = pd.countArtifacts(id);
			System.out.println("DerbyDBMetiator.deleteAndListProject ::: " + projectName + " - " + amountOfArtifacts);
			
			if(amountOfArtifacts==0) {
			
				// ****************************************
				// BORRADO DE CARPETA DE REBEL
				// ****************************************
				
				// Borrar carpeta en desarrollo, borrar carpeta en produccion y borrar carpeta en Rebel			
				File fileRebel = new File("/Users/borisperezg/rebel/"+projectName);
				
				// No pregunta si hay archivos dentro, simplemente borra todo.
				FileUtils.deleteDirectory(fileRebel);
				
				// ****************************************
				// BORRADO DE DESARROLLO Y PRODUCCION
				// ****************************************
				
				File fileVizDev = new File("/Users/borisperezg/eclipsews/rebelviz/WebContent/archimatemodels/"+projectName);
				File fileVizPro = new File("/Users/borisperezg/apache-tomcat-7.0.100/webapps/rebelviz/archimatemodels/"+projectName);
				// No pregunta si hay archivos dentro, simplemente borra todo.
				FileUtils.deleteDirectory(fileVizDev);
				FileUtils.deleteDirectory(fileVizPro);
				
				// ****************************************
				// BORRADO DE BASE DE DATOS
				// ****************************************
				
				pd.delete(id);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);			
		}		
		
		// ****************************************
		// LISTADO
		// ****************************************
		list = pd.list();
		
		for(int t=0;t<list.size();t++) {
			Project proj = list.get(t);
			proj.setAmountOfArtifacts(pd.countArtifacts(proj.getId()));
		}
		
		return list;
	}
	
	public List<APIBOI> deleteAndListBOI(String id) throws Exception {
		
//		System.out.println("DerbyDBMediator.deleteAndListBOI ::: String id = "+id);
		
		APIModelDerby pd = new APIModelDerby();
		
		// 1. Obtener el nombre y el id del proyecto
		Project project = pd.getProject(id);
		
		// 2. Obtener el nombre y el tipo de artefacto a borrar
		APIModelElement artifact = pd.getArtifact(id);
		
		// 3. Borrar el archivo de la BD con el id
		pd.deleteArtifact(id);
		
		// 4. Borrar del disco usando el nombre del proyecto, el tipo de artefacto y el nombre del artefacto 
		File f = null;
		
		f = new File(uriAddress + "/"+project.getName()+"/core/" + artifact.getName() + ".rebel_core");
				
		if(f!=null && f.exists()) {
			f.delete();
			System.out.println("File "+f.getName()+ " deleted");
		}else
			System.out.println("File "+f.getName()+ " NOT deleted");
		
		
		return (new ModelMediator()).listBOIs(project.getName());
	}
	
	public List<Model> getListOfModelsx(String projectName){
		List<Model> list = null;
		
		APIModelDerby pd = new APIModelDerby();
		list = pd.listXMLRute(projectName);
		
		return list;
	}
	
	public List<Model> getNamesOfModels(String projectName){
		List<Model> list = null;
		
		APIModelDerby pd = new APIModelDerby();
		list = pd.listModelsName(projectName);
		
		return list;
	}
	
	public String getModelJSON(String filtro) throws Exception {
		String json = "";
		
		String[] params = filtro.split("&");
		String projName = params[0];
		String modelName = params[1];		
		
		// Consulta el xml de la bd
		String xmlRute = (new APIModelDerby()).get(modelName, projName);
		
		// Lo transforma en json
		ComponentAndConnectorJSONGenerator c = new ComponentAndConnectorJSONGenerator();
		json = c.buildJSON(xmlRute, modelName);
		
		return json;
	}
	
	public void updateModel(String xml, String modelName) {
		try {
			(new APIModelDerby()).update(xml, modelName);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public List<APIElement> getListOfQAS() {
		List<APIElement> list = null;
		
		APIQualityAttributesDerby pd = new APIQualityAttributesDerby();
		list = pd.listQualityAttributes();
		
		return list;
	}

	public List<APIElement> getListOfATDTypes() {
		List<APIElement> list = null;
		
		APIATDTypeDerby pd = new APIATDTypeDerby();
		list = pd.listCauseTypes();
		
		return list;
	}
	
	/*
	 * Bloque de cosas
	 */
	
//	FileReader reader = null;	
//	reader = new FileReader(path+"/WebContent/files/"+filtro+".json");	
//	resp = (new JSONParser()).parse(reader).toString();
	
}
