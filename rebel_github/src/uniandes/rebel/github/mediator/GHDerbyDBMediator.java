package uniandes.rebel.github.mediator;

import uniandes.rebel.github.db.GHModelDerby;
import uniandes.rebel.github.db.GHProjectDerby;

public class GHDerbyDBMediator {
	
	public void insertModel(String projectName, String modelName, String modelType, String xmlcontent) throws Exception {
		
		GHProjectDerby pd = new GHProjectDerby();
		String projectId = pd.find(projectName);
		
		if(projectId!=null && projectId.length()>0) {		
			GHModelDerby md = new GHModelDerby();
			md.insert(projectId, modelName, modelType, xmlcontent);
		}
		
	}
	
	public String getXMLContent(String projectName, String modelName) {
		String xmlContent = "";
		
		GHModelDerby md = new GHModelDerby();
		xmlContent = md.find(projectName, modelName);
		
		return xmlContent;
	}
	
}
