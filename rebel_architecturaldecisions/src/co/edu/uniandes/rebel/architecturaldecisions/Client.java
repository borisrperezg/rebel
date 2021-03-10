package co.edu.uniandes.rebel.architecturaldecisions;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import rebel_architecturaldecisions.Alternative;
import rebel_architecturaldecisions.Assumption;
import rebel_architecturaldecisions.Decision;
import rebel_architecturaldecisions.Project;
import rebel_architecturaldecisions.Rebel_architecturaldecisionsFactory;
import rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage;
import rebel_architecturaldecisions.StateType;
import rebel_architecturaldecisions.UserStory;

public class Client {

	public static void main(String[] args) throws Exception {
		// Create a resource set to hold the resources.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(Rebel_architecturaldecisionsPackage.eNS_URI, Rebel_architecturaldecisionsPackage.eINSTANCE);
		
		Resource resource = resourceSet.createResource(URI.createURI("http:///My.github"));
		
		Project project = Rebel_architecturaldecisionsFactory.eINSTANCE.createProject();
//		root.setName("ProjectName");
		
		Decision decision = Rebel_architecturaldecisionsFactory.eINSTANCE.createDecision();
		decision.setTitle("Decision 1");
		decision.setState(StateType.ACCEPTED);
		decision.setNumber("OOO1");
		
		Alternative alt1 = Rebel_architecturaldecisionsFactory.eINSTANCE.createAlternative();
		alt1.setDescription("First alternative evaluated and discarded");
		decision.getAlternatives().add(alt1);
		
		Alternative alt2 = Rebel_architecturaldecisionsFactory.eINSTANCE.createAlternative();
		alt2.setDescription("Second alternative evaluated and selected");
		decision.getAlternatives().add(alt2);
		
		Assumption ass1 = Rebel_architecturaldecisionsFactory.eINSTANCE.createAssumption();
		ass1.setDescription("We assume that this could work");
		decision.getAssumptions().add(ass1);
		
		UserStory us1 = Rebel_architecturaldecisionsFactory.eINSTANCE.createUserStory();
		us1.setId("US0001");
		decision.getUserStories().add(us1);
		
//		Responsible res1 = Rebel_architecturaldecisionsFactory.eINSTANCE.createResponsible();
//		res1.setName("Boris Perez");
//		decision.setResponsible(res1);
		
		project.getDecisions().add(decision);
//		project.getResponsibles().add(res1);
		
		resource.getContents().add(project);		
		resource.save(System.out, null);
		
	}
	
}
