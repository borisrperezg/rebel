package uniandes.rebel.cc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class Util {
	
	public static boolean checkOrCreateFolder(String folderName) {
		boolean isReady = false;
		
		File folder = new File("/Users/borisperezg/rebel/"+folderName);
		if(folder.exists()) {
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/functionalview/");
			if(subFolder.exists())
				isReady = true;
			else
				isReady = subFolder.mkdir();
		}else {
			folder.mkdir();
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/functionalview/");
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
	
	public static ArrayList<String> readFile(String fileName) {
		ArrayList<String> lines = new ArrayList<>();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("files/"+fileName));
			String line = reader.readLine();
			while (line != null) {
				// read next line
				lines.add(line);				
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
	 * @param xmlFileName Name of the xml file, i.e. students.xml. The path of the file must be included
	 * @return
	 */
	public static Document parseXML(String xmlFileName) throws Exception{
		File xmlFile = new File(xmlFileName);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(xmlFile);
		return doc;
	}
	
	
}
