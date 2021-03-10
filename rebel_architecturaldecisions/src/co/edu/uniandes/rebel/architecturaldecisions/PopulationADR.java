package co.edu.uniandes.rebel.architecturaldecisions;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import rebel_architecturaldecisions.Alternative;
import rebel_architecturaldecisions.Assumption;
import rebel_architecturaldecisions.Consequence;
import rebel_architecturaldecisions.ConsequenceType;
import rebel_architecturaldecisions.Decision;
import rebel_architecturaldecisions.Motivator;
import rebel_architecturaldecisions.Person;
import rebel_architecturaldecisions.UserStory;

public class PopulationADR {

	private ADModel aModel;
	
	public PopulationADR() {
		aModel = new ADModel();
	}
	
	public void execute(String project, String adr) throws Exception {
		
		File fileADR = new File("/Users/borisperezg/temporaluploadfolder/"+adr);
		
		String content = Util.readFile(fileADR);
		
		String basicSection = Util.getValueMatch("^#\\s+([\\d|\\w|.]+(?:(?!\\R## Motivator).*\\R)*)", content);
		String[] values = Util.getValuesMatch("(\\d+).\\h+([\\w|\\h]+)", basicSection);
		String number = values[0];
		
		aModel.createModel(project, number);
		
		matchingPatterns(content);
		
		aModel.storeModel(project, number, "decision");
		
	}
	
//	public void executeFolder() throws Exception {		
//		
//		// Get ADR files		
//		File[] files =  gatherListOfADRs();
//		
//		// Go through each of one
//		goForEachADR(files);
//		
//		// For each ADR file, get parts
//	
//	}
	
//	public File[] gatherListOfADRs() {
//		File[] files = null; 
//		
//		File f = new File("/Users/borisrainieroperezgutierrez/GitHub/ADR/doc/architecture/decisions");
//		if(f.exists() && f.isDirectory()) {
//			files = f.listFiles();
//		}
//		
//		return files;
//	}
	
//	public void goForEachADR(File[] files) throws Exception {
//		if(files!=null && files.length>0) {
//			
//			Arrays.sort(files);
//			for(File f : files) {
//				
//				String content = Util.readFile(f);
//				
//				String basicSection = Util.getValueMatch("^#\\s+([\\d|\\w|.]+(?:(?!\\R## Motivator).*\\R)*)", content);
//				String[] values = Util.getValuesMatch("(\\d+).\\h+([\\w|\\h]+)", basicSection);
//				String number = values[0];
//				
//				ADModel.getInstance().createModel("CHIPER", number);				
//				matchingPatterns(content);
//				ADModel.getInstance().storeModel("CHIPER", number, "decision");
//			}
//			
//		}
//		
//	}
	
	/**
	 * A full ADR file content is received
	 * @param text
	 */
	public void matchingPatterns(String text) {
		
		Decision ad = aModel.createAD();
		
		// Each block is handle by separated to avoid fails in the regex
		
		// Extract basic data
		String basicSection = Util.getValueMatch("^#\\s+([\\d|\\w|.]+(?:(?!\\R## Motivator).*\\R)*)", text);
		getTitle(ad, basicSection);
		getDate(ad, basicSection);
		getPhase(ad, basicSection);
		getDeciders(ad, basicSection);
		getStatus(ad, basicSection);
		
		// Extract motivators
		getMotivators(ad, text);
		
		// Extract user stories
		getUserStories(ad, text);
		
		
		// Extract decision
		getDecision(ad, text);
		
		// Extract alternatives
		getAlternatives(ad, text);
		
		// Extract assumptions
		getAssumptions(ad, text);
		
		// Extract consequences
		getConsequences(ad, text);
				
		// Storing the model
		aModel.storeDecision(ad);
		
	}
	
	public void getTitle(Decision ad, String text) {
		
		String[] values = Util.getValuesMatch("(\\d+).\\h+([\\w|\\h]+)", text);
		ad.setNumber(values[0]);
		ad.setTitle(values[1]);
	}
	
	public void getDate(Decision ad, String text) {
		String[] date = Util.getValuesMatch("Date:\\h+([\\d]{4})-([\\d]{2})-([\\d]{2})\\h+([\\d]{2}):([\\d]{2})?", text);
		
		String year = date[0];
		String month = date[1];
		String day = date[2];
		String hour = date[3];
		String minute = date[4];
		
//		System.out.println(year+"-"+month+"-"+day+"-"+hour+"-"+minute);
		
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day), Integer.parseInt(hour), Integer.parseInt(minute));
				
		ad.setDate(c.getTime());
	}
	
	public void getPhase(Decision ad, String text) {
		String phase = Util.getValueMatch("Phase:\\h+([\\d|\\w|\\h]+)", text);
		ad.setPhase(phase);
	}
	
	public void getDeciders(Decision ad, String text) {
		String deciders = Util.getValueMatch("Deciders:\\h+([\\d|\\w|\\W|\\h|.|,|\\-|;]+)\\s(?:Status)", text);
		deciders = deciders.trim();
		if(deciders.indexOf(",")>=0) {
			String[] decidersList = deciders.split(",");
			for(String s : decidersList) {
				s = s.trim();
				Person p = aModel.createPerson();
				p.setName(s);
				ad.getDeciders().add(p);
			}
		}else {
			Person p = aModel.createPerson();
			p.setName(deciders);
			ad.getDeciders().add(p);
		}
	}
	
	public void getStatus(Decision ad, String text) {
		if(text.indexOf("supercedes")>=0) {
			System.out.println("Hay supercedes");
			String[] status = Util.getValuesMatch("Status:\\s+([supercedes]+)\\h+\\[([\\d|\\w|-]+)\\]", text);
			ad.setState(Util.getStateType(status[0]));
			// Obtener el identification del ADR
			String supercededADR = status[1];
			
			// Recorrer lista de ADRs
			EList<Decision> decisions = aModel.getListOfDecisions();
			for (Iterator<Decision> iterator = decisions.iterator(); iterator.hasNext();) {
				Decision d = iterator.next();
				System.out.println(d.getNumber()+"-"+supercededADR);
	            if(d.getNumber().equals(supercededADR)) {
	            	// Asignar el encontrado
	            	ad.setSupercedes(d);
	            }
	        }
		}else {
			System.out.println("No hay supercedes");
			String status = Util.getValueMatch("Status:\\s+([proposed|rejected|deprecated|accepted]+)", text);
			ad.setState(Util.getStateType(status));
		}
	}
	
	public void getMotivators(Decision ad, String text) {
//		System.out.println(text);
		String motivator = Util.getValueMatch("## Motivator\\s+([*|\\d|\\w|.|,|\\s|\\-|%]+)\\s+(?:[#])", text);
		
		// Comes in this structure
		// * one
		// * two
		// * three
		ArrayList<String> values = Util.decomposeBullets(motivator);
		if(values!=null && values.size()>0) {
			for(String s : values) {
				if(s!=null && s.length()>0) {
					Motivator m = aModel.createMotivator();
					m.setDescription(s);
					ad.getMotivatedBy().add(m);
				}
			}
		}
	}
	
	public void getUserStories(Decision ad, String text) {
		String userStories = Util.getValueMatch("## User stories\\s+([*|\\d|\\w|\\s|.|,]+)\\s+(?:[#])", text);
		
		// Comes in this structure
		// * one
		// * two
		// * three
		ArrayList<String> values = Util.decomposeBullets(userStories);
		if(values!=null && values.size()>0) {
			for(String s : values) {
				if(s!=null && s.length()>0) {
					UserStory element = aModel.createUserStory();
					element.setId(s);
					ad.getUserStories().add(element);
				}
			}
		}
	}
	
	public void getDecision(Decision ad, String text) {
		String decision = Util.getValueMatch("## Decision\\s+([*|\\d|\\w|\\s|.|,|\"|:]+)\\s+(?:[#])", text);
		ad.setDescription(decision);
	}
	
	public void getAlternatives(Decision ad, String text) {
		String alternatives = Util.getValueMatch("## Alternatives\\s+([*|\\d|\\w|\\s|.|,]+)\\s+(?:[#])?", text);
		
		// Comes in this structure
		// * one
		// * two
		// * three
		ArrayList<String> values = Util.decomposeBullets(alternatives);
		if(values!=null && values.size()>0) {
			for(String s : values) {
				if(s!=null && s.length()>0) {
					Alternative element = aModel.createAlternative();
					element.setDescription(s);
					ad.getAlternatives().add(element);
				}
			}
		}
	}
	
	public void getAssumptions(Decision ad, String text) {
		String assumptions = Util.getValueMatch("## Assumptions\\s+([*|\\d|\\w|\\s|.|,]+)\\s+(?:[#])?", text);
		
		// Comes in this structure
		// * one
		// * two
		// * three
		ArrayList<String> values = Util.decomposeBullets(assumptions);
		if(values!=null && values.size()>0) {
			for(String s : values) {
				if(s!=null && s.length()>0) {
					Assumption element = aModel.createAssumption();
					element.setDescription(s);
					ad.getAssumptions().add(element);
				}
			}
		}
	}
	
	public void getConsequences(Decision ad, String textC) {
		String consequences = Util.getValueMatch("## Consequences\\s+([*|\\d|\\w|\\s|.|,|+|-]+)\\s+(?:[#])?", textC);
		
		// Comes in this structure
		// + one
		// + two
		// - three
		if(consequences!=null && consequences.length()>0) {
			String[] values = consequences.split("\n");			
			for(String s : values) {
				if(s!=null && s.length()>0) {
					s = s.trim();
					Consequence element = aModel.createConsequence();
					if(s.startsWith("+")) {
						element.setType(ConsequenceType.POSITIVE);
						
						s = s.replace("+", "").trim();					
						element.setDescription(s);
					}else if(s.startsWith("-")) {
						element.setType(ConsequenceType.NEGATIVE);
						
						s = s.replace("-", "").trim();					
						element.setDescription(s);
					}
					ad.getConsequences().add(element);
				}
			}
		}
	}
	
	
}
