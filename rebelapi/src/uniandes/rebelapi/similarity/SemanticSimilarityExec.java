package uniandes.rebelapi.similarity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SemanticSimilarityExec {
	
	private double accuracy;
	
	public SemanticSimilarityExec(double accuracy) {
		this.accuracy = accuracy;
	}

	/**
	 * Retorna true si existe similitud entre el nombre del elemento y la oracion. La "sentence" se descompone
	 * y se hace la validacion palabra vs palabra.
	 * Si el nombre del elemento viene compuesto (Material Return), entonces cada palabra se envía a comparar contra la sentence,
	 * y luego se revisan si los %s pasaron el umbral.
	 * @param architecturalElementName
	 * @param sentence
	 * @param accuracy Integer value with the percentage of accuracy required
	 * @return
	 */
	public void sentenceHasSimilarities() {
		
		Process p;
		try {
			p = Runtime.getRuntime().exec("/Users/borisperezg/eclipsews/rebelapi/resources/wrapper.sh openAndPrepare");
		
			p.waitFor();

		    BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    
		    String line = "";
		    while ((line = reader.readLine()) != null) {
		    	try {
		        	System.out.println(line);
		        }catch(Exception e) {
		        	System.out.println("SemanticSimilarityExec.findSimilarities ::: Not a number: "+line);
		        }
		    }
	    
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
						
	}
	
	public boolean contarSimilitudes(ArrayList<Double> similarities) {
		
		boolean hasSimilarities = false;
		
		int numberOfWords = similarities.size();
		System.out.println("numberOfWords = "+numberOfWords);
		int numberOfSimilarities = 0;
		
		if(similarities.size()>0) {
			for(double val : similarities) {
				if(val>=accuracy) {
					numberOfSimilarities++;
				}
			}
		}
		
		System.out.println("numberOfSimilarities = "+numberOfSimilarities);
		
//		System.out.println(numberOfWords + " - " + numberOfSimilarities);
		
		if(numberOfWords==1) {
			if(numberOfSimilarities==1)
				hasSimilarities = true;
		}else if(numberOfWords==2) {
			if(numberOfSimilarities==2)
				hasSimilarities = true;
		}else if(numberOfWords==3) {
			if(numberOfSimilarities>=2)
				hasSimilarities = true;
		}else if(numberOfWords==4) {
			if(numberOfSimilarities>=3)
				hasSimilarities = true;
		}else if(numberOfWords==5) {
			if(numberOfSimilarities>=3)
				hasSimilarities = true;
		}else if(numberOfWords==6) {
			if(numberOfSimilarities>=4)
				hasSimilarities = true;
		}else if(numberOfWords==7) {
			if(numberOfSimilarities>=5)
				hasSimilarities = true;
		}
		
		return hasSimilarities;
	}
	
}
