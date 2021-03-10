package uniandes.rebelapi.ngrams;

import java.util.ArrayList;
import java.util.List;

public class NgramGeneration {

	public static void main(String[] args) {
		
		NgramGeneration.generateNgrams(2, "Esta es una lisca loca", new ArrayList());
		
	}

	private static void generateNgrams(int N, String sent, List ngramList) {
		String[] tokens = sent.split("\\s+"); // split sentence into tokens

		// GENERATE THE N-GRAMS
		for (int k = 0; k < (tokens.length - N + 1); k++) {
			String s = "";
			int start = k;
			int end = k + N;
			for (int j = start; j < end; j++) {
				s = s + "" + tokens[j];
			}
			// Add n-gram to a list
			ngramList.add(s);
		}
	}// End of method

}
