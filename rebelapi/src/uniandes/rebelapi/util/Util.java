package uniandes.rebelapi.util;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage;
import rebel_chatlogs.Rebel_chatlogsPackage;
import rebel_componentandconnector.Rebel_componentandconnectorPackage;
import rebel_github.Rebel_githubPackage;

public class Util {

	/**
	 * This method is used to load the root eclass of the model received as
	 * parameter. This method is called before create the json file.
	 * 
	 * @param xml
	 * @param modelName
	 * @return
	 * @throws Exception
	 */
//	public static Resource buildModelRebelCore(String xmlRoute, String modelName) throws Exception {
//
//		Rebel_corePackage.eINSTANCE.eClass();
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("rebel_core", new XMIResourceFactoryImpl());
//
//		ResourceSet resSet = new ResourceSetImpl();
//		Resource resource = resSet.getResource(URI.createURI(xmlRoute), true);
////		Project project = (Project) resource.getContents().get(0);
//
//		return resource;
//	}

	/**
	 * This method is used to load the root eclass of the model received as
	 * parameter. This method is called before create the json file.
	 * 
	 * @param xml
	 * @param modelName
	 * @return
	 * @throws Exception
	 */
	public static rebel_componentandconnector.Project buildModelRebelComponentAndConnector(String xmlRoute,
			String modelName) throws Exception {

		Rebel_componentandconnectorPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_componentandconnector", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(xmlRoute), true);
		rebel_componentandconnector.Project project = (rebel_componentandconnector.Project) resource.getContents()
				.get(0);

		return project;
	}

	public static rebel_architecturaldecisions.Project buildModelRebelArchitecturalDecisions(String xmlRoute,
			String modelName) throws Exception {

		Rebel_architecturaldecisionsPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_architecturaldecisions", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(xmlRoute), true);
		rebel_architecturaldecisions.Project project = (rebel_architecturaldecisions.Project) resource.getContents()
				.get(0);

		return project;
	}
	
	public static rebel_github.Project buildModelRebelGitHub(String xmlRoute) throws Exception {

		Rebel_githubPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_github", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(xmlRoute), true);
		rebel_github.Project project = (rebel_github.Project) resource.getContents().get(0);

		return project;
	}
	
	public static rebel_chatlogs.Project buildModelRebelChatLogs(String xmlRoute) throws Exception {

		Rebel_chatlogsPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("rebel_chatlogs", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(xmlRoute), true);
		rebel_chatlogs.Project project = (rebel_chatlogs.Project) resource.getContents().get(0);

		return project;
	}

	public static ArrayList<String> separateInWords(String jointWords) {
		ArrayList<String> words = new ArrayList<String>();

		if (jointWords != null && jointWords.length() > 0) {
			
			String newWord = String.valueOf(jointWords.charAt(0));
			
			for (int i = 1; i < jointWords.length(); i++) {

				if (Character.isUpperCase(jointWords.charAt(i)) || jointWords.charAt(i)==' ') { // new word
					words.add(newWord.trim());
//					System.out.println(newWord);
					if(jointWords.charAt(i)!=' ')
						newWord = String.valueOf(jointWords.charAt(i));
					else
						newWord = "";
				}else {
					newWord += String.valueOf(jointWords.charAt(i));
				}
			}
			words.add(newWord.trim());
//			System.out.println(newWord);
		}

		return words;
	}
	
	public static void main(String[] args) {
		Util.separateInWords("payment Service");
		System.out.println("--");
		Util.separateInWords("Payment Service");
		System.out.println("--");
		Util.separateInWords("payment service");
		
	}

}
