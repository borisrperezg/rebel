package co.edu.uniandes.rebel.architecturaldecisions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rebel_architecturaldecisions.StateType;

public class Util {
	
	public static boolean checkOrCreateFolder(String folderName) {
		boolean isReady = false;
		
		File folder = new File("/Users/borisperezg/rebel/"+folderName);
		if(folder.exists()) {
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/decision/");
			if(subFolder.exists())
				isReady = true;
			else
				isReady = subFolder.mkdir();
		}else {
			folder.mkdir();
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/decision/");
			isReady = subFolder.mkdir();
		}
		
		return isReady;
	}

	public static String getValueMatch(String pattern, String text) {
		Pattern rId = Pattern.compile(pattern);
		Matcher mId = rId.matcher(text);
		mId.find();
		String val = null;
		
		try {
			if(mId.group(1)!=null)
				val = mId.group(1);
		} catch (Exception e) {
			System.err.println("No match found: "+pattern);
		}
		
		return val;
	}
	
	public static String[] getValuesMatch(String pattern, String text) {
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(text);
		m.find();
		String[] values = null;
		
		try {
			int con = m.groupCount();
			values = new String[con];
			for(int i=0;i<con;i++) {
				values[i] = m.group(i+1); 
			}
		} catch (Exception e) {
			System.err.println("No match found: "+pattern);
		}
		
		
		return values;
	}
	
	public static String readFile(File f) {
		String lines = "";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(f));
			String line = reader.readLine();
			while (line != null) {
				// read next line
				
				lines += line + "\r\n";
				line = reader.readLine();
			}
			
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
	
	
	public static StateType getStateType(String type) {
		System.out.println(type);
		switch(type) {
		case "accepted": return StateType.ACCEPTED;
		case "proposed": return StateType.PROPOSED;
		case "rejected": return StateType.REJECTED;
		case "deprecated": return StateType.DEPRECATED;
		case "supercedes": return StateType.SUPERCEDES; 
		default: return null;
		}		
	}
	
	public static ArrayList<String> decomposeBullets(String text) {
		ArrayList<String> finalValues = null;
		if(text!=null && text.length()>0) {
			finalValues = new ArrayList<>();			
			String[] values = text.split("\n");			
			for(String s : values) {
				s = s.replace("*", "").trim();
				finalValues.add(s);
			}
		}
		return finalValues;
	}
	
	public static ArrayList<String> decomposeConsequences(String text) {
		ArrayList<String> finalValues = null;
		if(text!=null && text.length()>0) {
			finalValues = new ArrayList<>();			
			String[] values = text.split("\n");			
			for(String s : values) {
				s = s.trim();
				finalValues.add(s);
			}
		}
		return finalValues;
	}
	
}
