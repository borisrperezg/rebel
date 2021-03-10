package uniandes.rebelapi.similarity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SemanticSimilarityExec_copy {

	/**
	 * Retorna true si existe similitud entre el nombre del elemento y la oracion. La "sentence" se descompone
	 * y se hace la validacion palabra vs palabra.
	 * Si el nombre del elemento viene compuesto (Material Return), entonces cada palabra se envía a comparar contra la sentence,
	 * y luego se revisan si los %s pasaron el umbral.
	 * Accuracy at 0.8
	 * @param architecturalElementName
	 * @param sentence
	 * @return
	 */
	public boolean sentenceHasSimilarities(String architecturalElementName, String sentence) {
		return sentenceHasSimilarities(architecturalElementName, sentence, 0.8);
	}
	
	public static void main(String[] args) {
		SemanticSimilarityExec_copy e = new SemanticSimilarityExec_copy();
		System.out.println("Similaridad = "+e.sentenceHasSimilarities("material return", "Improve codification of the models New models were included and its code was generated. Return of the materials"));
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
	public boolean sentenceHasSimilarities(String architecturalElementName, String sentence, double accuracy) {
		boolean hasSimilarities = false;
		
//		System.out.println("1");
		
		if(sentence!=null) {
			
//			System.out.println("2");
			
			// Prepare each sentence
			String newSentence = prepareSentence(sentence);
//			String newWord = prepareSentence(architecturalElementName);
			
//			System.out.println("SemanticSimilarityExec.sentenceHasSimilarities ::: newSentence = "+newSentence);
			
			int numberOfSimilarities = 0;
			int numberOfWords = 0;
			
			try{
				if(architecturalElementName.indexOf(" ")>=0) {
					String[] wordsOfName = architecturalElementName.split(" ");
					
					for(String wordName : wordsOfName) {
						numberOfWords++;
					
						ArrayList<Double> similarities = findSimilarities(wordName, newSentence);
						
	//					System.out.println("3");
						
						if(similarities.size()>0) {
							for(double val : similarities) {
								if(val>=accuracy) {
									System.out.println("SemanticSimilarityExec.sentenceHasSimilarities ::: Found similarity = "+val);
									numberOfSimilarities++;
									break;
								}
							}
						}
					}
				}
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
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}				
			
		}
		
		return hasSimilarities;
	}
	
	/**
	 * [[Este metodo ya no es necesario, se deja por historia]]
	 * This method is used to change every white-space to semicolon (;)
	 * This is required because the function for similarity is not accepting
	 * white-spaces in sentences. 
	 * @param sentence "hola mundo"
	 * @return "hola;mundo"
	 */
	private String prepareSentence(String sentence) {
		String newSentence = "";
		if(sentence!=null && sentence.trim().length()>0) {
			newSentence = sentence.replaceAll(" ", ";");
		}
		return newSentence;
	}
	
	/**
	 * La oracion se descompone para comparar palabra contra palabra, y retorna el nivel de 
	 * similaridad entre todas las palabras.
	 * @param word
	 * @param sentence
	 * @return
	 * @throws Exception
	 */
	private ArrayList<Double> findSimilarities(String word, String sentence) throws Exception {
		
//		System.out.println("2.1");
//		System.out.println("Word = "+word);
//		System.out.println("sentence = "+sentence);
		
		ArrayList<Double> similarities = null;
		
		if(!word.isEmpty() && !sentence.isEmpty()) {
		
			Process p = Runtime.getRuntime().exec("/Users/borisperezg/eclipsews/rebelapi/resources/wrapper.sh find_similarity \""+word+"\" \""+sentence+"\"");
		    p.waitFor();
	
	//	    System.out.println("2.2");
		    
		    BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    
		    similarities = new ArrayList<Double>();
	
		    String line = "";
		    while ((line = reader.readLine()) != null) {
	//	    	System.out.println("SemanticSimilarityExec.findSimilarities ::: line = "+line);
		        try {
		        	double val = Double.parseDouble(line);
		        	similarities.add(val);
		        }catch(Exception e) {
		        	System.out.println("SemanticSimilarityExec.findSimilarities ::: Not a number: "+line);
		        }
		    }
		    
		}

	    return similarities;
	}
	
}
