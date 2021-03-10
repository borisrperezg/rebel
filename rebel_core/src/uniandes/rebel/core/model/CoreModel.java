package uniandes.rebel.core.model;

import java.io.File;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import rebel_core.ATDBenefit;
import rebel_core.ATDCause;
import rebel_core.ATDEffect;
import rebel_core.ATDItem;
import rebel_core.ATDRationale;
import rebel_core.ArchimateView;
import rebel_core.BlockOfInterest;
import rebel_core.Component;
import rebel_core.Connector;
import rebel_core.Decision;
import rebel_core.Element;
import rebel_core.Fact;
import rebel_core.FunctionalView;
import rebel_core.Message;
import rebel_core.Person;
import rebel_core.Port;
import rebel_core.Project;
import rebel_core.Rebel_coreFactory;
import rebel_core.Rebel_corePackage;
import rebel_core.Relation;
import rebel_core.Role;
import rebel_core.UserStory;
import uniandes.rebel.core.mediator.CoreMediator;


public class CoreModel {

	private Project project;
	private String uriAddress;
	private Rebel_coreFactory factory;
	private Resource resource;
	
	private String projectName;
	private String modelName;
	
	// --------------------

	public CoreModel() {
		factory = Rebel_coreFactory.eINSTANCE;
	}
	
	public Resource createModel(String projectName, String modelFileName) throws Exception {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_core", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Validar si existe la carpeta, si no existe, entonces se crea
		if(checkOrCreateFolder(projectName)) {
		
			uriAddress = "/Users/borisperezg/rebel/"+projectName+"/core/" + modelFileName + ".rebel_core";
			
			resource = resourceSet.createResource(URI.createURI(uriAddress));
	
			// --------------------
			// ROOT NODE CREATION
			project = factory.createProject();
			project.setName(projectName);
			project.setModelingDate(new Date());
			resource.getContents().add(project);
			
			this.projectName = projectName;
			this.modelName = modelFileName;
			
		}else{
			throw new Exception("No se pudo crear la carpeta del proyecto para Rebel ::: "+projectName+" - "+modelName);
		}
		
		return resource;
	}
	
	public String getModelName() {
		return this.modelName;
	}
	
	public rebel_core.Component createComponent() {
		return factory.createComponent();
	}
	
	public Port createPort() {
		return factory.createPort();
	}
	
	public BlockOfInterest createBOI() {
		return factory.createBlockOfInterest();
	}
	
	public Fact createFact() {
		return factory.createFact();
	}
	
	public Element createElement(String id, String name) {
		Element e = factory.createElement();
		e.setId(id);
		e.setName(name);
		
		return e;
	}
	
	public Relation createRelation(String id) {
		Relation r = factory.createRelation();
		r.setId(id);
		
		return r;
	}
	
	public UserStory createUserStory() {
		return factory.createUserStory();
	}
	
	public ATDItem createATDItem() {
		return factory.createATDItem();
	}
	
	public ATDRationale createATDRationale() {
		return factory.createATDRationale();
	}
	
	public ATDEffect createATDEffect() {
		return factory.createATDEffect();
	}
	
	public ATDBenefit creaATDBenefit() {
		return factory.createATDBenefit();
	}
	
	public Message createMessage() {
		return factory.createMessage();
	}
	
	public Person createPerson(){
		return factory.createPerson();
	}
	
	public Decision createDecision() {
		return factory.createDecision();
	}
	
	public Connector createConnector(String type) {
		if (type.equals("ProcedureCall") || type.equals("Procedure Call"))
			return factory.createProcedureCall();
		else if (type.equals("Stream"))
			return factory.createStream();
		else if (type.equals("Arbitrator"))
			return factory.createArbitrator();
		else if (type.equals("Distributor"))
			return factory.createDistributor();
		else if (type.equals("Event"))
			return factory.createEvent();
		else if (type.equals("Adaptor"))
			return factory.createAdaptor();
		return null;
	}

	public Role createRole() {
		return factory.createRole();
	}
	
	public void storeComponent(Component d, String nameFV) {
		EList<FunctionalView> functionalViews = project.getFunctionalviews();
		for (Iterator<FunctionalView> iterator = functionalViews.iterator(); iterator.hasNext();) {
			FunctionalView fv = iterator.next();
			if (fv.getName().equals(nameFV)) {
				fv.getComponents().add(d);
			}
		}
	}
	
	public void storeConnector(Connector d, String nameFV) {
		EList<FunctionalView> functionalViews = project.getFunctionalviews();
		for (Iterator<FunctionalView> iterator = functionalViews.iterator(); iterator.hasNext();) {
			FunctionalView fv = iterator.next();
			if (fv.getName().equals(nameFV)) {
				fv.getConnectors().add(d);
			}
		}
	}
	
	
	
	private boolean checkOrCreateFolder(String folderName) {
		boolean isReady = false;
		
		File folder = new File("/Users/borisperezg/rebel/"+folderName);
		if(folder.exists()) {
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/core/");
			if(subFolder.exists())
				isReady = true;
			else
				isReady = subFolder.mkdir();
		}else {
			folder.mkdir();
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/core/");
			isReady = subFolder.mkdir();
		}
		
		return isReady;
	}
	
	public FunctionalView createFunctionalView() {
		return factory.createFunctionalView();
//		view.setName(name);
//		project.getFunctionalviews().add(view);
	}
	
	public ArchimateView createArchimateView(String id, String name) {
		ArchimateView v = factory.createArchimateView();
		v.setId(id);
		v.setName(name);
		
		return v;
	}
	
	public Resource buildModelRebelCore(String xmlRoute, String modelName) throws Exception {

		Rebel_corePackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_core", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(xmlRoute), true);
//		Project project = (Project) resource.getContents().get(0);

		return resource;
	}
	
	
	/**
	 * Este metodo se usa para mantener la consistencia entre las clases ArchiToXML y RebelArchiToXML
	 * El metodo buildModelRebelCore no se cambia porque ya hay demasiadas clases invocandola.
	 * @param xmlRoute
	 * @return
	 * @throws Exception
	 */
	public Resource loadResource(String xmlRoute) throws Exception {

		return buildModelRebelCore(xmlRoute, null);
	}
	
	public Project getProject() {
		return project;
	}
	
	public void storeModel() throws Exception {
		resource.save(Collections.EMPTY_MAP);

		CoreMediator d = new CoreMediator();
		d.insertModel(projectName, modelName, "rebel", uriAddress);
	}
	
	public void updateModel() throws Exception {
		resource.save(Collections.EMPTY_MAP);
	}
	
}
