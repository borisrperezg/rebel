package co.edu.uniandes.rebel.architecturaldecisions;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import rebel_architecturaldecisions.Alternative;
import rebel_architecturaldecisions.Assumption;
import rebel_architecturaldecisions.Consequence;
import rebel_architecturaldecisions.Decision;
import rebel_architecturaldecisions.Motivator;
import rebel_architecturaldecisions.Person;
import rebel_architecturaldecisions.Project;
import rebel_architecturaldecisions.Rebel_architecturaldecisionsFactory;
import rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage;
import rebel_architecturaldecisions.UserStory;
import uniandes.rebel.cc.mediator.ADDBMediator;


public class ADModel {
	
	private Project project;
	private Rebel_architecturaldecisionsFactory factory;
	private Resource resource;
	private String uriAddress;
	
	//--------------------
	
	public ADModel() {	
		factory = Rebel_architecturaldecisionsFactory.eINSTANCE;
	}	
	
	//--------------------

	public Resource createModel(String projectName, String modelName) throws Exception {
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("rebel_architecturaldecisions", new XMIResourceFactoryImpl());
        
        ResourceSet resourceSet = new ResourceSetImpl();
        
        // Validar si existe la carpeta, si no existe, entonces se crea
     	if(Util.checkOrCreateFolder(projectName)) {
        
     		uriAddress = "/Users/borisperezg/rebel/"+projectName+"/decision/" + modelName + ".rebel_architecturaldecisions";
	 		
	 		resource = resourceSet.createResource(URI.createURI(uriAddress));
			
	 		//--------------------
	 		// ROOT NODE CREATION
	 		project = factory.createProject();
	 		project.setName(projectName);
	 		project.setModelingDate(new Date());
	 		resource.getContents().add(project);		
	 		//--------------------
     	}else{
			throw new Exception("No se pudo crear la carpeta del proyecto para ADRs ::: "+projectName+" - "+modelName);
		}
     	return resource;
	}
	
	public void storeModel(String projectName, String modelName, String modelType) throws Exception {
		resource.save(Collections.EMPTY_MAP);
		
		// persistirlo a la base de datos
//		String xmlFileContent = new String(Files.readAllBytes(Paths.get(uriAddress)), StandardCharsets.UTF_8);

		ADDBMediator d = new ADDBMediator();
		d.insertModel(projectName, modelName, modelType, uriAddress);
	}
	
	
	public void loadModel(String modelName) {
		Rebel_architecturaldecisionsPackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("rebel_architecturaldecisions", new XMIResourceFactoryImpl());
        
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI(uriAddress), true);
        
        project = (Project) resource.getContents().get(0);

	}
	
	
	
	public Decision createAD() {
		return factory.createDecision();
	}
	
	public Person createPerson() {
		return factory.createPerson();
	}
	
	public UserStory createUserStory() {
		return factory.createUserStory();
	}
	
	public Alternative createAlternative() {
		return factory.createAlternative();
	}
	
	public Assumption createAssumption() {
		return factory.createAssumption();
	}
	
	public Consequence createConsequence() {
		return factory.createConsequence();
	}
	
	public Motivator createMotivator() {
		return factory.createMotivator();
	}
	
	public void storeDecision(Decision d) {
		project.getDecisions().add(d);
	}
	
	public EList<Decision> getListOfDecisions() {
		return project.getDecisions();
	}
	
}
