package uniandes.rebel.chatlogs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMultipart;

import rebel_chatlogs.MessageLogType;

public class CEUtil {
	
	public static boolean checkOrCreateFolder(String folderName) {
		boolean isReady = false;
		
		File folder = new File("/Users/borisperezg/rebel/"+folderName);
		if(folder.exists()) {
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/chatlogs/");
			if(subFolder.exists())
				isReady = true;
			else
				isReady = subFolder.mkdir();
		}else {
			folder.mkdir();
			File subFolder = new File("/Users/borisperezg/rebel/"+folderName+"/chatlogs/");
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
	
	public static MessageLogType getMessageType(String type) {
		switch(type) {
		case "chat": return MessageLogType.CHATLOG;
		case "email": return MessageLogType.EMAIL;
		default: return null;
		}		
	}
	
	/**
	 * Este metodo se usa en los chats, para crear el Creation
	 * como el primero de los key del hasmap usado
	 * @param text dd/mm/yy hh
	 * @return
	 */
	public static Date processingStringToDate(String text) {
		
		String[] sDateTime = text.split(" ");
		
		String[] sDate = sDateTime[0].split("/"); // Retorna dd mm yy
		String hour = sDateTime[1];
		
		@SuppressWarnings("deprecation")
		Date d = new Date(Integer.parseInt(sDate[2])+2000-1900, 
				Integer.parseInt(sDate[1])-1, 
				Integer.parseInt(sDate[0]), 
				Integer.parseInt(hour), 0, 0);
		
		return d;
		
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
	
	/**
	 * Este metodo se usa en los emails
	 * // La fecha se captura así:
			// "4 Mar 2021 14:31:54 "
	 * @param date
	 * @return
	 */
	public static Date getDateFormat(String date) {
		Date d = null;
		
		if (date != null && date.length() > 0) {
			String[] textualDate = date.trim().split(" ");

			int dayNumber = Integer.parseInt(textualDate[0]);
			String monthText = textualDate[1];
			int yearNumber = Integer.parseInt(textualDate[2]);

			d = new Date(yearNumber - 1900, CEUtil.monthNumber(monthText), dayNumber);
		}
		
		return d;
	}
	
	public static String getTextFromMimeMultipart(MimeMultipart mimeMultipart)  throws MessagingException, IOException{
	    String result = "";
	    int count = mimeMultipart.getCount();
	    for (int i = 0; i < count; i++) {
	        BodyPart bodyPart = mimeMultipart.getBodyPart(i);
	        if (bodyPart.isMimeType("text/plain")) {
	            result = result + "\n" + bodyPart.getContent();
	            break; // without break same text appears twice in my tests
	        } else if (bodyPart.isMimeType("text/html")) {
	            String html = (String) bodyPart.getContent();
	            result = result + "\n" + org.jsoup.Jsoup.parse(html).text();
	        } else if (bodyPart.getContent() instanceof MimeMultipart){
	            result = result + getTextFromMimeMultipart((MimeMultipart)bodyPart.getContent());
	        }
	    }
	    return result;
	}
	
	public static String fixSpecialCharacters(String text) {
		String newText = "";
		
		newText = text.replaceAll("=C3=A1", "á").replaceAll("=C3=BA", "ú")
				.replaceAll("=C3=A9", "é").replaceAll("=C3=B3", "ó")
				.replaceAll("=C3=AD", "í").replaceAll("=C2=BF", "¿");
		
		return newText;
	}
	
}
