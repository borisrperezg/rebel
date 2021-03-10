package uniandes.rebel.cc.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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

import rebel_componentandconnector.Component;
import rebel_componentandconnector.Connector;
import rebel_componentandconnector.FunctionalView;
import rebel_componentandconnector.Port;
import rebel_componentandconnector.Project;
import rebel_componentandconnector.Rebel_componentandconnectorFactory;
import rebel_componentandconnector.Rebel_componentandconnectorPackage;
import rebel_componentandconnector.Role;
import uniandes.rebel.cc.mediator.CCDerbyDBMediator;

public class CNCModel {

	private Project project;
	private Rebel_componentandconnectorFactory factory;
	private Resource resource;
	private String uriAddress;

	// --------------------
	// SINGLETON
	
	public CNCModel() {
		factory = Rebel_componentandconnectorFactory.eINSTANCE;
	}

	// --------------------

	public Resource createModel(String projectName, String modelName) throws Exception {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_componentandconnector", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Validar si existe la carpeta, si no existe, entonces se crea
		if(Util.checkOrCreateFolder(projectName)) {
		
			uriAddress = "/Users/borisperezg/rebel/"+projectName+"/functionalview/" + modelName + ".rebel_componentandconnector";
	
			resource = resourceSet.createResource(URI.createURI(uriAddress));
	
			// --------------------
			// ROOT NODE CREATION
			project = factory.createProject();
			project.setName(projectName);
			project.setModelingDate(new Date());
			resource.getContents().add(project);
			
		}else{
			throw new Exception("No se pudo crear la carpeta del proyecto para C&C ::: "+projectName+" - "+modelName);
		}
		
		return resource;
	}

	public void createModelAndFunctionalView(String projectName, String modelName, String date) throws Exception {
		createModel(projectName, modelName);
		
		Date d = null;
		
		if(date!=null && date.length()>0) {
			String[] dates = date.split("-");
			System.out.println("CNCModel.createModelAndFunctionalView ::: Year 1 = "+dates[0]);
			System.out.println("CNCModel.createModelAndFunctionalView ::: Year 2 = "+Integer.parseInt(dates[0]));
			System.out.println("CNCModel.createModelAndFunctionalView ::: Year 3 = "+(Integer.parseInt(dates[0])-1900));
			
			d = new Date(Integer.parseInt(dates[0])-1900, Integer.parseInt(dates[1])-1, Integer.parseInt(dates[2]));
			
		}
		
		createFunctionalView(modelName, d);
	}

	/**
	 * Store the file in the DB
	 * 
	 * @param projectName
	 * @param modelName
	 * @param modelType
	 * @throws Exception
	 */
	public void storeModel(String projectName, String modelName, String modelType) throws Exception {
		resource.save(Collections.EMPTY_MAP);

		CCDerbyDBMediator d = new CCDerbyDBMediator();
		d.insertModel(projectName, modelName, modelType, uriAddress);
		
	}

	public Project loadModel(String modelName) {
		Rebel_componentandconnectorPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_componentandconnector", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(
				URI.createURI("modelInstances/" + modelName + ".rebel_componentandconnector"),
				true);

		project = (Project) resource.getContents().get(0);

		return project;
	}

	public static void main(String[] args) throws Exception {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("modelinstances/test.rebel_componentandconnector"));
	    writer.write("<?xml version=\"1.0\" encoding=\"ASCII\"?><rebel_componentandconnector:Project xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:rebel_componentandconnector=\"http://uniandes/rebel_componentandconnector\" name=\"NIDOO\"><functionalviews name=\"cnc1\"></functionalviews></rebel_componentandconnector:Project>");
	     
	    writer.close();
        
		
		Rebel_componentandconnectorPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_componentandconnector", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI("modelinstances/test.rebel_componentandconnector"),true);

		Project project = (Project) resource.getContents().get(0);

		File file = new File("modelinstances/test.rebel_componentandconnector"); 
        
        file.delete(); 
		
		System.out.println(project);
		
	}

	/**
	 * 
	 * @param name
	 * @param d Esta es la fecha de cuando se construyó el modelo. No es igual a la fecha de vinculación a Rebel del modelo
	 */
	public void createFunctionalView(String name, Date d) {
		FunctionalView view = factory.createFunctionalView();
		view.setName(name);
		view.setDate(d);
		project.getFunctionalviews().add(view);
	}

	public Component createComponent() {
		return factory.createComponent();
	}

	public Port createPort() {
		return factory.createPort();
	}

	/**
	 * 
	 * @param type procedureCall, stream, arbitrator, distributor, event, adaptor
	 * @return
	 */
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

	public Component getComponent(String componentName, String nameFV) {
		Component c = null;

		EList<FunctionalView> functionalViews = project.getFunctionalviews();
		for (Iterator<FunctionalView> iterator = functionalViews.iterator(); iterator.hasNext();) {
			FunctionalView fv = iterator.next();
			if (fv.getName().equals(nameFV)) {
				EList<Component> components = fv.getComponents();
				for (Iterator<Component> it = components.iterator(); it.hasNext();) {
					Component co = it.next();
					if (co.getName().equals(componentName)) {
						c = co;
						break;
					}
				}
			}
		}

		return c;
	}

	public Port getPort(String idPort, String nameFV) {
		Port p = null;

		EList<FunctionalView> functionalViews = project.getFunctionalviews();
		for (Iterator<FunctionalView> iterator = functionalViews.iterator(); iterator.hasNext();) {
			FunctionalView fv = iterator.next();
			if (fv.getName().equals(nameFV)) {
				EList<Component> components = fv.getComponents();
				for (Iterator<Component> it = components.iterator(); it.hasNext();) {
					Component co = it.next();

					EList<Port> ports = co.getPorts();
					for (Iterator<Port> itp = ports.iterator(); itp.hasNext();) {
						Port po = itp.next();
						if (po.getId().equals(idPort)) {
							p = po;
							break;
						}
					}
				}
				break;
			}
		}

		return p;
	}

	public EList<Port> getPorts(String idComponent, String nameFV) {
		EList<Port> list = null;

		EList<FunctionalView> functionalViews = project.getFunctionalviews();
		for (Iterator<FunctionalView> iterator = functionalViews.iterator(); iterator.hasNext();) {
			FunctionalView fv = iterator.next();
			if (fv.getName().equals(nameFV)) {
				EList<Component> components = fv.getComponents();
				for (Iterator<Component> it = components.iterator(); it.hasNext();) {
					Component co = it.next();

					if (co.getId().equals(idComponent)) {
						list = co.getPorts();
						break;
					}
				}
				break;
			}
		}

		return list;
	}

}
