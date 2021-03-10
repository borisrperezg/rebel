package uniandes.rebel.chatlogs;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import rebel_chatlogs.Message;
import rebel_chatlogs.MessageLog;

public class CEPopulation {

	private CEModel ceModel;

	public CEPopulation() {
		ceModel = new CEModel();
	}

	public static void main(String[] args) throws Exception {
		CEPopulation ce = new CEPopulation();
//		ce.execute("AutoNuevo", "Survey Comments.eml");
		ce.execute("AutoNuevo", "_chat.txt");
		
//		display(new File("/Users/borisperezg/temporaluploadfolder/Survey Comments.eml"));
	}

	/**
	 * Executed by revelapi
	 * 
	 * @param project
	 * @param commits
	 * @throws Exception
	 */
	public void execute(String project, String chatEmailFileName) throws Exception {

		String filePathName = "/Users/borisperezg/temporaluploadfolder/" + chatEmailFileName;
		
		// Temporal loaded route from web page
		String contentLog = CEUtil.readFile(filePathName);
		
		// ---------------
		// Type
		// ---------------
		String type = "chat";
		if (chatEmailFileName.indexOf(".eml") >= 0)
			type = "email";
		
		// ---------------
		// Model name
		// ---------------
		String modelName = "";
		
		if(type.equals("email"))
			modelName = chatEmailFileName.substring(0, chatEmailFileName.indexOf(".eml"));
		else
			modelName = chatEmailFileName.substring(0, chatEmailFileName.indexOf(".txt"));
		
		
		// ---------------
		// Model construction
		// ---------------
		ceModel.createModel(project, modelName);		
		
		if(type.equals("email")) {
			
			MessageLog msgLog = ceModel.createMessageLog();
			msgLog.setType(CEUtil.getMessageType(type));
			
			// ---------------
			// Creation date
			// ---------------
			
			// La fecha se captura así:
			// "4 Mar 2021 14:31:54 "
			String date = CEUtil.getValueMatch("Date:\\s[\\w|,]+([\\w|,|\\s|\\d|:]+)", contentLog);
			msgLog.setCreation(CEUtil.getDateFormat(date));
			
			// ------------------------------
			// Get properties of email
			// ------------------------------
			getEmailProperties(msgLog, filePathName);
			
			ceModel.storeMessageLog(msgLog);
			
		}else if(type.equals("chat")) {
			
			// ------------------------------
			// Get properties of chat
			// ------------------------------
			getChatProperties(contentLog);
			
		}
		
		ceModel.storeModel(project, modelName, type);

	}
	
	public void getChatProperties(String contentTxtFileName) throws Exception {
		
		// Se lee cada linea. Se saca la fecha y la hora.
		
		// El title de cada MsgLog es la fecha y la hora (solo la hora)
		
		// Se usara un HashMap
		
		HashMap<String, ArrayList<Message>> hashMsgs = new HashMap<String, ArrayList<Message>>();
		
		
		String[] contentSplitted = contentTxtFileName.split("\n");
		if(contentSplitted!=null && contentSplitted.length>0) {
			for(int t=0;t<contentSplitted.length;t++) {
				String lineChat = contentSplitted[t];
				
				// ---------------------------------------
				// Nota: Quitar las tildes
				
				String[] severalValues = null;
				
				try {
					severalValues = CEUtil.getValuesMatch("\\[(\\d{1,2}\\/\\d{1,2}\\/\\d{1,2}),\\s(\\d{1,2}:\\d{1,2}:\\d{1,2})\\s\\w\\.\\s\\w\\.\\]\\s([\\w|\\s]+):\\s(.+)", lineChat);
				}catch(IllegalStateException ie) {
					System.err.println("No se encontraron matches. Recuerde retirar las tildes");
				}
				
				if(severalValues!=null && severalValues.length>0) {
					
					Message msg = ceModel.createMessage();
					
					String date = severalValues[0];
					String time = severalValues[1];
					String personFrom = severalValues[2];
					String msgChat = severalValues[3];
					
					msg.setText(msgChat);
					msg.setSentBy(personFrom);
					
					String[] sDate = date.split("/"); // Retorna dd mm yy
					String[] sTime = time.split(":");
					
					@SuppressWarnings("deprecation")
					Date d = new Date(Integer.parseInt(sDate[2])+2000-1900, 
							Integer.parseInt(sDate[1])-1, 
							Integer.parseInt(sDate[0]), 
							Integer.parseInt(sTime[0]), 
							Integer.parseInt(sTime[1]));
					
					msg.setTimestamp(d);
					
					String llaveHashMap = date + " " + sTime[0];
					
					ArrayList<Message> listMessages = hashMsgs.get(llaveHashMap); 
					
					if(listMessages!=null) {
						listMessages.add(msg);
					}else {
						listMessages = new ArrayList<Message>();
						listMessages.add(msg);
						hashMsgs.put(llaveHashMap, listMessages);
					}					
				}
			}			
		}
		
		if(hashMsgs.size()>0) {
			Iterator<Map.Entry<String, ArrayList<Message>>> iterator = hashMsgs.entrySet().iterator();
		    while (iterator.hasNext()) {
		        Map.Entry<String, ArrayList<Message>> entry = iterator.next();
		        
		        MessageLog ml = ceModel.createMessageLog();
		        ml.setTitle(entry.getKey());
		        ml.getMessages().addAll(entry.getValue());
		        ml.setCreation(CEUtil.processingStringToDate(entry.getKey()));
		        
		        ceModel.storeMessageLog(ml);
		    }
		}
		
		
		
		
	}

	public void getEmailProperties(MessageLog msgLog, String emlFileName) throws Exception {
		
		// --------------------------------------
		// Bloque para instanciar EML
		// --------------------------------------
		File emlFile = new File(emlFileName);
		
		Properties props = System.getProperties();
		props.put("mail.host", "smtp.dummydomain.com");
		props.put("mail.transport.protocol", "smtp");

		Session mailSession = Session.getDefaultInstance(props, null);
		InputStream source = new FileInputStream(emlFile);
		MimeMessage message = new MimeMessage(mailSession, source);
		
		// --------------------------------------
		// Obtencion de propiedades
		// --------------------------------------
		
		msgLog.setTitle(message.getSubject());
		
		Message msg = ceModel.createMessage();
		
		msg.setSentBy(message.getFrom()[0].toString());
		msg.setReceivedBy(message.getAllRecipients()[0].toString());
		
		MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
        String result = CEUtil.getTextFromMimeMultipart(mimeMultipart);
		
        msg.setText(result);
        msg.setTimestamp(msgLog.getCreation());
        
        msgLog.getMessages().add(msg);
        
	}
	
	

}
