package uniandes.rebel.cc.mediator;

import uniandes.rebel.cc.db.ADModelDerby;
import uniandes.rebel.cc.db.ADProjectDerby;

public class ADDBMediator {
	
	public void insertModel(String projectName, String modelName, String modelType, String xmlcontent) throws Exception {
		
		ADProjectDerby pd = new ADProjectDerby();
		String projectId = pd.find(projectName);
		
		ADModelDerby md = new ADModelDerby();
		md.insert(projectId, modelName, modelType, xmlcontent);
		
	}
	
	public String getXMLContent(String projectName, String modelName) {
		String xmlContent = "";
		
		ADModelDerby md = new ADModelDerby();
		xmlContent = md.find(projectName, modelName);
		
		return xmlContent;
	}
	
}
