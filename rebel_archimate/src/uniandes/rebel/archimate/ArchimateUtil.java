package uniandes.rebel.archimate;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class ArchimateUtil {

	public static Document parseXML(String xmlFileName) throws Exception{
		File xmlFile = new File(xmlFileName);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(xmlFile);
		return doc;
	}
	
	public static boolean checkOrCreateFolder(String folderName) {
		boolean isReady = false;
		
		File folder = new File("/Users/borisperezg/rebel/"+folderName);
		if(folder.exists()) {
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/archimate/");
			if(subFolder.exists())
				isReady = true;
			else
				isReady = subFolder.mkdir();
		}else {
			folder.mkdir();
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/archimate/");
			isReady = subFolder.mkdir();
		}
		
		return isReady;
	}
	
}
