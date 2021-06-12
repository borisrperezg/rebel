package uniandes.rebel.github;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import rebel_github.Message;
import rebel_github.Person;
import rebel_github.Project;
import rebel_github.Rebel_githubFactory;
import rebel_github.Rebel_githubPackage;
import uniandes.rebel.github.mediator.GHDerbyDBMediator;

public class GHModel {

	private Project project;
	private Rebel_githubFactory factory;
	private Resource resource;
	private String uriAddress;
	
	//--------------------
	
	public GHModel() {	
		factory = Rebel_githubFactory.eINSTANCE;
	}	
	
	public Resource createModel(String projectName, String modelName) throws Exception {
		
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("rebel_github", new XMIResourceFactoryImpl());
        
        ResourceSet resourceSet = new ResourceSetImpl();
        
        // Validar si existe la carpeta, si no existe, entonces se crea
 		if(GHUtil.checkOrCreateFolder(projectName)) {
 			
 			uriAddress = "/Users/borisperezg/rebel/"+projectName+"/github/" + modelName + ".rebel_github";
	 		
	 		resource = resourceSet.createResource(URI.createURI(uriAddress));
			
	 		//--------------------
	 		// ROOT NODE CREATION
	 		project = factory.createProject();
	 		project.setName(projectName);
	 		project.setModelingDate(new Date());
	 		resource.getContents().add(project);		
 		
 		}else{
			throw new Exception("No se pudo crear la carpeta del proyecto para Commits ::: "+projectName+" - "+modelName);
		}
 		
 		return resource;
	}
	
	public void loadModel(String modelName) {
		Rebel_githubPackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("rebel_github", new XMIResourceFactoryImpl());
        
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI(uriAddress), true);
        
        project = (Project) resource.getContents().get(0);
	}
	
	public void storeModel(String projectName, String modelName, String modelType) throws Exception {
		
		System.out.println("Storing model - save");
		
		resource.save(Collections.EMPTY_MAP);
		
		System.out.println("Storing model - BD");
		
		GHDerbyDBMediator d = new GHDerbyDBMediator();
		d.insertModel(projectName, modelName, modelType, uriAddress);
		
		System.out.println("Storing model - OK");
	}
	
	public Message createMessage() {
		return factory.createMessage();		
	}
	
	public Person createPerson() {
		return factory.createPerson();		
	}
	
	public void storeMessage(Message m) {
		project.getMessages().add(m);
	}
	
	public void storePerson(Person p) {
		// Check that person doesnot exist in the list of members
		
		// Store the person
		project.getMembers().add(p);
	}
	
}
