package uniandes.rebel.chatlogs;

import uniandes.rebel.chatlogs.db.GHModelDerby;
import uniandes.rebel.chatlogs.db.GHProjectDerby;

public class CEDerbyDBMediator {

	
	
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
