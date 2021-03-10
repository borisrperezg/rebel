package uniandes.rebel.github;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rebel_github.OPERATIONTYPE;

public class GHUtil {
	
	public static boolean checkOrCreateFolder(String folderName) {
		boolean isReady = false;
		
		File folder = new File("/Users/borisperezg/rebel/"+folderName);
		if(folder.exists()) {
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/github/");
			if(subFolder.exists())
				isReady = true;
			else
				isReady = subFolder.mkdir();
		}else {
			folder.mkdir();
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/github/");
			isReady = subFolder.mkdir();
		}
		
		return isReady;
	}

	public static String getValueMatch(String pattern, String text) {
		Pattern rId = Pattern.compile(pattern);
		Matcher mId = rId.matcher(text);
		mId.find();
		return mId.group(1);
	}
	
	public static String[] getValuesMatch(String pattern, String text) {
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(text);
		m.find();
		
		int con = m.groupCount();
		String[] values = new String[con];
		for(int i=0;i<con;i++) {
			values[i] = m.group(i+1); 
		}
		return values;
	}
	
	public static OPERATIONTYPE getMessageType(String type) {
		switch(type) {
		case "feat": return OPERATIONTYPE.FEAT;
		case "fix": return OPERATIONTYPE.FIX;
		case "refactor": return OPERATIONTYPE.REFACTOR;
		case "models": return OPERATIONTYPE.MODELS;
		case "docs": return OPERATIONTYPE.DOCS;
		default: return null;
		}		
	}
	
	public static String readFile(String fileName) {
		String lines = "";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while (line != null) {
				// read next line
				
				lines += line + "\r\n";
				line = reader.readLine();
			}
			
			// To take advantage of the regex
			lines += line + "\r\n";
			line = "commit 000000ddddd";
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	/**
	 * 
	 * @param month 3 letters month, i.e. Feb, Mar
	 * @return
	 */
	public static int monthNumber(String month) {
		switch(month) {
		case "Jan": return 0;
		case "Feb": return 1;
		case "Mar": return 2;
		case "Apr": return 3;
		case "May": return 4;
		case "Jun": return 5;
		case "Jul": return 6;
		case "Aug": return 7;
		case "Sep": return 8;
		case "Oct": return 9;
		case "Nov": return 10;
		case "Dec": return 11;
		default: return -1;
		}
	}
	
}
