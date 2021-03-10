package uniandes.rebel.cc.mediator;

import uniandes.rebel.cc.db.CCModelDerby;
import uniandes.rebel.cc.db.CCProjectDerby;

public class CCDerbyDBMediator {
	
	public void insertModel(String projectName, String modelName, String modelType, String xmlRute) throws Exception {
		
		CCProjectDerby pd = new CCProjectDerby();
		String projectId = pd.find(projectName);
		
		if(projectId!=null && projectId.length()>0) {		
			CCModelDerby md = new CCModelDerby();
			md.insert(projectId, modelName, modelType, xmlRute); 
		}
		
	}
	
	public String getXMLContent(String projectName, String modelName) {
		String xmlContent = "";
		
		CCModelDerby md = new CCModelDerby();
		xmlContent = md.find(projectName, modelName);
		
		return xmlContent;
	}
	
}
