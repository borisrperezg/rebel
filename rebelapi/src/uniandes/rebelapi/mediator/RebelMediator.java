package uniandes.rebelapi.mediator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;

import rebel_componentandconnector.Project;
import rebel_core.ATDBenefit;
import rebel_core.ATDItem;
import rebel_core.ATDRationale;
import rebel_core.BlockOfInterest;
import rebel_core.Fact;
import rebel_core.FunctionalView;
import uniandes.rebel.core.model.CoreModel;
import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.bo.Model;
import uniandes.rebelapi.bo.ResponseBO;
import uniandes.rebelapi.boi.RebelCoreCreationArchimate;
import uniandes.rebelapi.db.APIModelDerby;
import uniandes.rebelapi.util.AsynchronousSearch;
import uniandes.rebelapi.util.ModelComparison;
import uniandes.rebelapi.util.ModelFiltering;
import uniandes.rebelapi.util.Util;

public class RebelMediator {

	/**
	 * Este metodo se encarga de crear Facts a partir de modelos de Archimate
	 * @param params
	 * @return
	 */
	public String boiCreationArchi(String params) {
		RebelCoreCreationArchimate r = new RebelCoreCreationArchimate(this);
		String resp = r.boiCreationArchi(params);
		return resp;
	}
	
	
	
	/**
	 * Este metodo se encarga de crear los Facts a partir de un modelo de C&C.
	 * Actualmente este metodo no se estaría usando directamente, ya que se 
	 * genera a partir de la creación de Facts de modelos en Archimate 
	 * @param projectName
	 * @param boiName
	 * @param componentsName
	 * @param connectorsName
	 * @return
	 */
	public String boiCreationCnC(String projectName, String boiName, ArrayList<String> componentsName,
			ArrayList<String> connectorsName) {

		String resp = "NOK";

		try {

			// Listar todos los modelos que sean del proyecto y que sean de tipo
			// functionalview
			List<Model> modelsList = (new APIModelDerby()).listXMLRute(projectName);

			// Se crea el modelo Rebel Core donde se pasaran los modelos
//			Resource resource = CoreModel.getInstance().createModel(projectName, boiName);
			CoreModel core = new CoreModel();
			
			core.createModel(projectName, boiName);

			// Llena el model con los functional views obtenidos, y unicamente con los
			// elementos
			// seleccionados desde la GUI para el BoI
			buildFunctionalViews(core, modelsList, boiName, componentsName, connectorsName);

			// Crea los Fact
			rebel_core.BlockOfInterest boi = buildFacts(core, boiName);

			// Storing the model
			core.storeModel();

			// Link heterogeneous artifacts - Asynchronous call
			new Thread(() -> {
//				findAndLinkHeterogeneousArtifacts(boi, resource);
				(new AsynchronousSearch()).findAndLinkHeterogeneousArtifacts(core, boi, projectName);
			}).start();

			resp = "OK";

		} catch (Exception e) {
			resp = e.getMessage();
			e.printStackTrace();
		}

		return resp;

	}

	/**
	 * Este metodo se invoca cuando se crea el BOI en la GUI.
	 * Los Facts creados aca son listados al momento de justiciar la GUI.
	 * Cargar la GUI conlleva a invocar este metodo. 
	 * Este metodo unicamente busca dentro de los modelos de C&C por los componentes
	 * y conectores.
	 * @param projectName
	 * @param boiName
	 * @param componentsName
	 * @param connectorsName
	 * @return
	 */
	public String factsExtractionFromCnC(CoreModel core, String projectName, rebel_core.BlockOfInterest boi, ArrayList<String> componentsName,
			ArrayList<String> connectorsName, int nextFactUniqueId) {

		String resp = "NOK";

		try {

			/* -----------------------------------------
			 * Se buscan todos los modelos CnC disponibles 
			 * para el proyecto referenciado 
			 * -----------------------------------------
			 */
			List<Model> modelsList = (new APIModelDerby()).listXMLRute(projectName);

			/* -----------------------------------------
			 * Llena el model con los functional views obtenidos, 
			 * y unicamente con los elementos seleccionados desde 
			 * la GUI para el BoI
			 * -----------------------------------------
			 */
			buildFunctionalViews(core, modelsList, componentsName, connectorsName);

			/* -----------------------------------------
			 * Se crean los Facts y se asocian al BOI
			 * creado desde Archimate 
			 * -----------------------------------------
			 */
			buildFacts(core, boi, nextFactUniqueId);


			resp = "OK";

		} catch (Exception e) {
			resp = e.getMessage();
			e.printStackTrace();
		}

		return resp;

	}
	
	/**
	 * Este metodo se encarga de generar los Facts para el modelo de CnC,
	 * y almacenarlos en el BOI creado para Archimate.
	 * @param core
	 * @param boi
	 */
	private void buildFacts(CoreModel core, rebel_core.BlockOfInterest boi, int nextFactUniqueId) {
		// Se obtiene la lista de los FVs de acuerdo al proyecto.
		rebel_core.Project proj = core.getProject();

		ArrayList<FunctionalView> modelsList = new ArrayList<FunctionalView>();
		modelsList.addAll(proj.getFunctionalviews());
		
		
		// Comparacion dinamica de modelos
		ModelComparison mcSingleton = ModelComparison.getInstance();
		mcSingleton.assingNextFactUniqueId(nextFactUniqueId);

		if (modelsList.size() == 1) {
			mcSingleton.comparisonOfModels(modelsList.get(0), null, boi);
		} else if (modelsList.size() > 1) {

			// Para los create del primer modelo
			mcSingleton.comparisonOfModels(modelsList.get(0), null, boi);

			// Para las comparaciones con modelos posteriores
			for (int u = 0; u < modelsList.size(); u++) {
				FunctionalView m1 = modelsList.get(u);
				try {
					FunctionalView m2 = modelsList.get(u + 1);
					mcSingleton.comparisonOfModels(m1, m2, boi);
				} catch (IndexOutOfBoundsException ie) {
					System.err.println("--- Comparison end");
				}
			}
		}
	}

	private rebel_core.BlockOfInterest buildFacts(CoreModel core, String boiName) {
		// Se obtiene la lista de los FVs de acuerdo al proyecto.
		rebel_core.Project proj = core.getProject();

		rebel_core.BlockOfInterest boi = core.createBOI();
		boi.setId((int) Calendar.getInstance().getTimeInMillis());
		boi.setName(boiName);
		proj.getBlockofinterest().add(boi);

		ArrayList<FunctionalView> modelsList = new ArrayList<FunctionalView>();
		modelsList.addAll(proj.getFunctionalviews());
		
		
		// Comparacion dinamica de modelos
		ModelComparison mcSingleton = ModelComparison.getInstance();

		if (modelsList.size() == 1) {
			mcSingleton.comparisonOfModels(modelsList.get(0), null, boi);
		} else if (modelsList.size() > 1) {

			// Para los create del primer modelo
			mcSingleton.comparisonOfModels(modelsList.get(0), null, boi);

			// Para las comparaciones con modelos posteriores
			for (int u = 0; u < modelsList.size(); u++) {
				FunctionalView m1 = modelsList.get(u);
				try {
					FunctionalView m2 = modelsList.get(u + 1);
					mcSingleton.comparisonOfModels(m1, m2, boi);
				} catch (IndexOutOfBoundsException ie) {
					System.err.println("--- Comparison end");
				}
			}
		}
		return boi;
	}
	
	private void buildFunctionalViews(CoreModel core, List<Model> modelsList, ArrayList<String> componentsName,
			ArrayList<String> connectorsName) throws Exception {

		buildFunctionalViews(core, modelsList, null, componentsName, connectorsName);

		
	}

	private void buildFunctionalViews(CoreModel core, List<Model> modelsList, String boiName, ArrayList<String> componentsName,
			ArrayList<String> connectorsName) throws Exception {

		// Se procesan todos los modelos de Componentes, porque puede ser que hayan
		// modelos donde los elementos se eliminaran
		// por tanto, se deberán incluir para mostrar que fueron eliminados
		for (Model m : modelsList) {

			String xmlRute = m.getRute();
			String sourceModelName = m.getName();

			// fvD = FunctionalView of the destiny model
			FunctionalView fvD = core.createFunctionalView();

			Project projectS = Util.buildModelRebelComponentAndConnector(xmlRute, sourceModelName);
			rebel_componentandconnector.FunctionalView fvS = projectS.getFunctionalviews().get(0);

			fvD.setName(fvS.getName());
			
			// ------------------------------------------------------------
			// Obtencion de la fecha del modelo a partir del nombre.
			// El nombre debería ser: nombre_aaaammdd.xml.rebel_componentandconnector
			
			String fechaNombre = obtenerFechaDelNombre(fvS.getName());			
			if(fechaNombre.length()==8) {
				int year = Integer.parseInt(fechaNombre.substring(0, 4));
				int month = Integer.parseInt(fechaNombre.substring(4, 6));
				int day = Integer.parseInt(fechaNombre.substring(6, 8));
				
				/* El año queda bien generado, pero el problema es que al crear el modelo, y por 
				 * alguna razón desconocida, se guarda con una fecha sumándole 1900.
				 * Entonces a la fecha obtenida, se le resta 1900.
				 * Para lo mismo para el mes. Se debe restar uno porque inicia en 0.
				 */
				
				fvD.setDate(new Date(year-1900, month-1, day));
				
//				System.out.println(view.getName());
//				System.out.println(view.getDate().getYear() + " - " + view.getDate().getMonth());
//				System.out.println("----");
				
			}
			
			

			// Copiar la parte de los modelos, donde estén involucrados los elementos
			// Se recorre la lista para irlos agregando al boi
			for (String componentName : componentsName) {
				ModelFiltering.copyComponent(core, projectS, fvD, boiName, componentName);
			}

			for (String connectorName : connectorsName) {
				ModelFiltering.copyConnector(core, projectS, fvD, boiName, connectorName);
			}

			core.getProject().getFunctionalviews().add(fvD);

		}
	}
	
	private String obtenerFechaDelNombre(String fileName) {
		
		Pattern rId = Pattern.compile("[a-z|A-Z|\\d]+\\_([\\w|\\d]+)\\.[\\w|\\d]+");
		Matcher mId = rId.matcher(fileName);
		mId.find();
		
		String prefijo = "";
		
		try {
			if(mId.group(1)!=null)
				prefijo = mId.group(1);
		} catch (Exception e) {
			System.err.println("Processing.obtenerPrefijo ::: No match found");
		}
		
		return prefijo;
	}

	public String findNewArtifactsBOI(String project, String boiName) throws Exception {
		String result = "";
		
		
		APIBOI apiBOI = (new APIModelDerby()).getBOI(project, boiName);
		
		// TODO Todos los modelos deben tener un campo fechaCargadoAlSistema
		
		// TODO Se deben traer todos los modelos que tengan fecha posterior a la del Bloque de Interes
		Resource resboi = (new CoreModel()).buildModelRebelCore(apiBOI.getUrl(), boiName);
		rebel_core.Project proj = (rebel_core.Project) resboi.getContents().get(0);
		
		Date boiDate = proj.getModelingDate();
		
		// Se revisan los artefactos en busca de elementos recientes
		HashMap<String, ArrayList<Object>> newArtifacts; // = findArtifactsAfterBOI(boiDate);
		
		
//		if(d1.compareTo(d2) > 0) {
//			System.out.println("Date 1 occurs after Date 2");
//		}
		
		// TODO Se obtienen los nombres de los elementos involucrados en el BOI, junto con su ACTION.
		
		// TODO Se envía a ejecutar el método asincrónico de búsqueda en artefactos
		
		
		return result;
	}
	
	/**
	 * Metodo pendiente cuya finalidad será la de permitir actualizar el boi con nuevos artefactos
	 * @param project
	 * @param boiName
	 * @return
	 */
	public String updateBOI(String project, String boiName) {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * Este metodo se encarga de crear una instancia de un item de ATD, 
	 * y asociarlo a un Fact. 
	 * Adicionalmente, crea una asociación entre un Fact de Archimate y un 
	 * Fact de C&C.
	 * @param params 
	 * @return
	 */
	public ResponseBO storeATDRationale(String projectName, String boiName, String idFact, String compromisedQA, String causeType, String rationale, String benefits, String factFromCnC) {
		
		
		ResponseBO bo = new ResponseBO();
		
		CoreModel cm = new CoreModel();
		
		
		// Usar el project y el boi para instanciar el modelo
		APIBOI apiBOI = (new APIModelDerby()).getBOI(projectName, boiName);
		
		rebel_core.Project proj = null;
		Resource resource = null;
		
		try {
			resource = cm.buildModelRebelCore(apiBOI.getUrl(), boiName);
			proj = (rebel_core.Project) resource.getContents().get(0);
		} catch (Exception e) {
			e.printStackTrace();
			bo.setResponse("NOK");
			bo.setDescription("Ocurrió un error instanciando el Proyecto y el Bloque de Interés.");
			return bo;
		}
		
		// Encontrar el Fact
		if(proj!=null) {
			// Se usa la posición 0 porque el modelo se persiste siempre con un solo BOI
			BlockOfInterest boiObj = proj.getBlockofinterest().get(0); 
			if(boiObj!=null && boiObj.getFact()!=null) {
				for(int t=0;t<boiObj.getFact().size();t++) {
					Fact factObj = boiObj.getFact().get(t);
					
					// Crear una instancia de ATDItem y asociarla al Fact
					if(factObj.getId().equals(idFact)) {
						
						// --------------------------------------
						// CREACIÓN DE LA INSTANCIA DE ATDITEM
						
						ATDItem atdItem = cm.createATDItem();
						atdItem.setDate(new Date(factObj.getDate().getYear(), factObj.getDate().getMonth(), factObj.getDate().getDate()));
						atdItem.setStatus("Unresolved");
						atdItem.setCompromisedQA(compromisedQA);
						atdItem.setType(causeType);
						atdItem.setIdentifyByArchitect(true);
						
						// En este objeto se guarda la causa y el beneficio
						
						
						ATDRationale atdRationale = cm.createATDRationale();
						atdRationale.setDescription(rationale);
						
						ATDBenefit atdBenefit = cm.creaATDBenefit();
						atdBenefit.setDescription(benefits);
						
						atdItem.getRationales().add(atdRationale);
						atdItem.getBenefits().add(atdBenefit);
							
						
						
						// -------------------------------------------
						// ASOCIACION DE LA INSTANCIA ATDITEM AL FACT
						
						factObj.getAtditem().add(atdItem);
						
						try {
							// -------------------------------------------
							// SE GUARDAN LOS CAMBIOS EN EL XML
							
							resource.save(Collections.EMPTY_MAP);
							bo.setResponse("OK");
						} catch (IOException e) {
							bo.setResponse("NOK");
							bo.setDescription("Ocurrió un error persistiendo la asociación del ATD item con el Fact");
							return bo;
						}
						break;
					}
				}
			}else {
				bo.setResponse("NOK");
				bo.setDescription("Ocurrió un error obteniendo el Bloque de Interés del Proyecto o El BoI está vacío");
				return bo;
			}
		}
		
		return bo;
	}
	
//	/**
//	 * Este metodo toma como entrada el texto de la justificacion de la ATD inyectada
//	 * y obtiene la cause y el beneficio. Estos dos campos estarán separados, desde la GUI, por etiquetas
//	 * [rationale] y [benefit]. El usuario es responsable de ingresar esta información.
//	 * @param text
//	 * @return
//	 */
//	private ATDItemBO getRationaleAndBenefit(String text) {
//		ATDItemBO bo = null;
//		
//		if(text!=null && text.contains("[Rationale]")) {
//			bo = new ATDItemBO();
//			
//			String rationale = "";
//			
//			if(text.contains("[Benefits]")) {
//				rationale = text.substring(text.indexOf("[Rationale]:")+12, text.indexOf("[Benefits]")).trim();
//				String benefits = text.substring(text.indexOf("[Benefits]:")+11).trim();
//				bo.setBenefit(benefits);
//			}else {
//				rationale = text.substring(text.indexOf("[Rationale]:")+12).trim();
//			}
//			
//			bo.setRationale(rationale);
//			
//		}
//		
//		return bo;
//	}

	// *******************************************************************************************************
	// *******************************************************************************************************	
	// *******************************************************************************************************
	
	
	private void limpiarATDItems() {
		
	}

}
