package uniandes.rebel.chatlogs;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import rebel_chatlogs.Message;
import rebel_chatlogs.MessageLog;
import rebel_chatlogs.Project;
import rebel_chatlogs.Rebel_chatlogsFactory;
import rebel_chatlogs.Rebel_chatlogsPackage;

public class CEModel {

	private Project project;
	private Rebel_chatlogsFactory factory;
	private Resource resource;
	private String uriAddress;
	
	//--------------------
	
	public CEModel() {	
		factory = Rebel_chatlogsFactory.eINSTANCE;
	}	
	
	public Resource createModel(String projectName, String modelName) throws Exception {
		
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("rebel_chatlogs", new XMIResourceFactoryImpl());
        
        ResourceSet resourceSet = new ResourceSetImpl();
        
        // Validar si existe la carpeta, si no existe, entonces se crea
 		if(CEUtil.checkOrCreateFolder(projectName)) {
 			
 			uriAddress = "/Users/borisperezg/rebel/"+projectName+"/chatlogs/" + modelName + ".rebel_chatlogs";
	 		
	 		resource = resourceSet.createResource(URI.createURI(uriAddress));
			
	 		//--------------------
	 		// ROOT NODE CREATION
	 		project = factory.createProject();
	 		project.setName(projectName);
	 		resource.getContents().add(project);		
 		
 		}else{
			throw new Exception("No se pudo crear la carpeta del proyecto para chatlogs ::: "+projectName+" - "+modelName);
		}
 		
 		return resource;
	}
	
	public void loadModel(String modelName) {
		Rebel_chatlogsPackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("rebel_chatlogs", new XMIResourceFactoryImpl());
        
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI(uriAddress), true);
        
        project = (Project) resource.getContents().get(0);
	}
	
	public void storeModel(String projectName, String modelName, String modelType) throws Exception {
		resource.save(Collections.EMPTY_MAP);
		
		CEDerbyDBMediator d = new CEDerbyDBMediator();
		d.insertModel(projectName, modelName, modelType, uriAddress);
	}
	
	public MessageLog createMessageLog() {
		return factory.createMessageLog();
	}
	
	public Message createMessage() {
		return factory.createMessage();		
	}
	
	public void storeMessageLog(MessageLog ml) {
		project.getMessagelogs().add(ml);
	}
	
	
	
}
