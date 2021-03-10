package uniandes.rebelapi.textclassification;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TextClassification {
	
	private String callerToCallForTrain = "", callerToCallForUse = "";
	
	/**
	 * Esto permite configurar el caller que se usara para entrenar y para clasificar
	 * @param whatToClassify "cause", "adr", "commit", "chat", "email"
	 */
	public TextClassification(String whatToClassify) {
		if(whatToClassify.equals("types")) {
			callerToCallForTrain = "caller_textclassification_causes.sh";
			callerToCallForUse = "caller_textclassification_causes_use.sh";
		}
	}
	

	/**
	 * Este metodo invoca, por consola, el archivo resources/textclassification.py que toma un archivo de entrada,
	 * descrito en el codigo, y entrena un modelo. El modelo es persistido en disco.
	 * El archivo de entrada debe estar escrito en disco en la carpeta /Users/borisperezg/rebelmodels_storing/datasets_to_train
	 * @return
	 */
	public TextClassificationBO runScriptForTraining() throws Exception {
		
		Process p;
		TextClassificationBO bo = null;
		
		try {
			p = Runtime.getRuntime().exec("/Users/borisperezg/eclipsews/rebelapi/resources/"+callerToCallForTrain);
		
			p.waitFor();

		    BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    
		    // El modelo itera 20 veces. Esta variable toma el ultimo valor del entrenamiento.
		    String prevLine = "";
		    String line = "";
		    
		    while ((line = reader.readLine())!=null) {
		    	try {
		    		
		    		if(!line.equals("Done")) {		    		
//		    			System.out.println(line);
		    			prevLine = line;
		    		}
		        }catch(Exception e) {
		        	System.out.println("TextClassification.runScriptForTraining ::: Something went wrong: "+line);
		        	throw new Exception(e);
		        }
		    }
		    
		    if(prevLine!=null && !prevLine.isEmpty()) {
		    	
		    	bo = new TextClassificationBO();
		    	
		    	String[] fields = prevLine.split("\t");
		    	if(fields!=null && fields.length==4) {
		    		bo.setLoss(fields[0]);
		    		bo.setPrecision(fields[1]);
		    		bo.setRecall(fields[2]);
		    		bo.setF_score(fields[3]);
		    	}
		    }
		    
		    System.out.println("Ultima linea = "+prevLine);
	    
		} catch (Exception e1) {
			e1.printStackTrace();
        	throw new Exception(e1);
		}
		
		return bo;
						
	}
	
	/**
	 * Este metodo usa el modelo creado y persistido a traves del metodo runScriptForTraining, y clasifica un conjunto
	 * de textos almacenados en un archivo csv. Este comando de consola invoca el archivo textclassification_use.py
	 * @return <idFact,label> La idea es guardar el idFact como llave, para luego ser usada para extraer la etiqueta del hashmap
	 */
	public HashMap<String, String> runScriptForUse() {
		
		HashMap<String, String> idLabels = new HashMap<String, String>();
		Process p;
		
		try {
			p = Runtime.getRuntime().exec("/Users/borisperezg/eclipsews/rebelapi/resources/"+callerToCallForUse);
		
			p.waitFor();

		    BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    
		    String line = "";
		    
		    while ((line = reader.readLine())!=null) {
		    	try {
		    		if(line.equals("Done")) {		    		
		    			break;
		    		}
		        }catch(Exception e) {
		        	System.out.println("TextClassification.runScriptForUse ::: Something went wrong: "+line);
		        }
		    }
		    
		    // ------------------------------------------------
		    // LECTURA DEL ARCHIVO CON LOS TEXTOS CLASIFICADOS
		    
		    // Si acabo, abrir el archivo /Users/borisperezg/rebelmodels_storing/datasets_classified/results_tc.txt
		    // Obtener el idFact y la etiqueta
		    
		    File file = new File("/Users/borisperezg/rebelmodels_storing/datasets_classified/results_tc.txt"); 
		    
		    BufferedReader br = new BufferedReader(new FileReader(file)); 
		    
		    if(br!=null) {
			    String st = ""; 
			    while ((st = br.readLine()) != null) { 
			    	if(!st.isEmpty()){
			    		String[] variables = st.split("|");
			    		if(variables!=null && variables.length==3)
			    			idLabels.put(variables[0], variables[1]);
			    	}
			    }
			    br.close();
		    }
		
	    
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return idLabels;
						
	}
	
	public static void main(String[] args) {
		TextClassification t = new TextClassification("types");
//		t.runScriptForTraining();
	}
	
}
