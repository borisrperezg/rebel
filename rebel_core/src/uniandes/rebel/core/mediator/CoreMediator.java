package uniandes.rebel.core.mediator;

import uniandes.rebel.core.db.CoreModelDerby;
import uniandes.rebel.core.db.CoreProjectDerby;

public class CoreMediator {

public void insertModel(String projectName, String modelName, String modelType, String xmlRute) throws Exception {
		
		CoreProjectDerby pd = new CoreProjectDerby();
		String projectId = pd.find(projectName);
		
		if(projectId!=null && projectId.length()>0) {		
			CoreModelDerby md = new CoreModelDerby();
			md.insert(projectId, modelName, modelType, xmlRute);
		}
		
	}
	
}
