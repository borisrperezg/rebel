package uniandes.rebelapi.mediator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;

import rebel_core.ATDItem;
import rebel_core.BlockOfInterest;
import rebel_core.Fact;
import uniandes.rebel.core.model.CoreModel;
import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.db.APIModelDerby;

public class IdentificationMediatorExecutor {

	final String DATAFILECLASSIFIED = "/Users/borisperezg/rebelmodels_storing/datasets_classified/";

	// ******************************************
	// ESPACIO PARA VINCULAR CSV A REBEL_CORE
	// ******************************************

	/**
	 * Este metodo main se usa con el unico proposito de leer el csv generado por
	 * los Notebook, y crear las instancias correspondientes para el Fact
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// ************************************
		// VARIABLES DE CONFIGURACION
		// ************************************
		String csvFileName = "facts_prediction_dataset_1616537048521" + "_done.csv";
		String projectName = "NewProject";
		String boiName = "3rd BOI";

		IdentificationMediatorExecutor me = new IdentificationMediatorExecutor();

		ArrayList<String> lines = me.readCSV(csvFileName);

		if (lines.size() > 0) {
			
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
			}
			
			boolean found = false;
			BlockOfInterest boiObj = null;
			
			if(proj!=null) 
				boiObj = proj.getBlockofinterest().get(0);
			
			for (String sLine : lines) {
				String[] fields = sLine.split(Pattern.quote(","));
								
				if(boiObj.getFact()!=null && boiObj.getFact().size()>0) {
					
					for(Fact fact : boiObj.getFact()) {
						if(fact!=null && fact.getId().equals(fields[0])) {
							
							if(!fields[1].contains("noatd")) {							
								ATDItem atdItem = cm.createATDItem();
								atdItem.setType(fields[1]);
								atdItem.setCompromisedQA(fields[2]);
								atdItem.setDate(Calendar.getInstance().getTime());
								atdItem.setIdentifyByArchitect(false);
								
								fact.getAtditem().add(atdItem);
								found = true;
								break;
							}
						}
					}
				}
				
			}
			
			try {
				if(found) {
					resource.save(Collections.EMPTY_MAP);
					System.out.println("Done");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Leerlo y extraer en un Hash. Llave: el FactId, Valor: La info del ATD. Crear
		// una clase para eso.
	}

	/**
	 * Este metodo se usa para leer el csv que se construye luego de ejecutar los
	 * notebooks. Se encarga de extraer cada una de las lineas para guardarlas en
	 * una lista.
	 * 
	 * @param csvFileName Nombre del archivo, incluida la extension.
	 * @return
	 */
	private ArrayList<String> readCSV(String csvFileName) {

		ArrayList<String> lines = new ArrayList<String>();

		File myObj = new File(DATAFILECLASSIFIED + csvFileName);

		try {
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				lines.add(data);
			}
			myReader.close();
		} catch (Exception e) {
			System.err.println("Se presento un error abriendo el CSV de facts clasificados: " + e.getMessage());
		}

		return lines;
	}

}