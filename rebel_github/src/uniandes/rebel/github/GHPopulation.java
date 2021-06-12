package uniandes.rebel.github;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rebel_github.Message;
import rebel_github.Person;

public class GHPopulation {
	
	private GHModel ghModel;
	
	public GHPopulation() {
		ghModel = new GHModel();
	}
	
	/**
	 * Executed by revelapi
	 * @param project
	 * @param commits
	 * @throws Exception
	 */
	public void execute(String project, String commitsFileName) throws Exception {		
		
		// Temporal loaded route from web page
		String lines =  GHUtil.readFile("/Users/borisperezg/temporaluploadfolder/"+commitsFileName);
		
		System.out.println("GHPopulation.execute - Entering");
		
		ArrayList<String> listOfCommits = extractCommitBlock(lines);
		
		matchingPatterns(listOfCommits, project, commitsFileName);		
	}
	
	/**
	 * Extract specific information within the commit
	 * @param listOfCommits
	 */
	public void matchingPatterns(ArrayList<String> listOfCommits, String project, String commitsFileName) throws Exception {
		
		System.out.println("matchingPatterns");
		
		if(listOfCommits!=null && listOfCommits.size()>0) {
		
			System.out.println("listOfCommits = "+listOfCommits.size());
			
			Message msg = null;
			
			for(String s : listOfCommits) {
				// Id
				String id = GHUtil.getValueMatch("commit\\s+([\\d|\\w|<|>|@|\\.]+(?:(?!\\RAuthor:).*\\R)*)", s);
				
				ghModel.createModel(project, id);
				
				msg = ghModel.createMessage();
				msg.setId(id);				
				
				// Author
				String person = GHUtil.getValueMatch("Author:\\s+([\\d|\\w|<|>|\\s|\\.|\\@]+)\\R(?:(?!Date:).*\\R)*", s);
				Person p = ghModel.createPerson();
				String[] valuesPerson = GHUtil.getValuesMatch("([\\w]+)\\h+<([\\w|\\d|-|_|@|.]+)>", person);
				p.setEmail(valuesPerson[0]);
				p.setName(valuesPerson[1]);
				msg.setPerson(p);
				ghModel.storePerson(p);
				
				// Date
				String[] date = GHUtil.getValuesMatch("(?:[\\w]{3})\\h([\\w]{3})\\h([\\d]{1,2})\\h([\\d]{1,2}):([\\d]{1,2}):(?:[\\d]{1,2})\\h([\\d]{4})", s);
				Calendar c = Calendar.getInstance();
				String month = date[0];
				String day = date[1];
				String hour = date[2];
				String minute = date[3];
				String year = date[4];				
				c.set(Integer.parseInt(year), GHUtil.monthNumber(month), Integer.parseInt(day), Integer.parseInt(hour), Integer.parseInt(minute));
				msg.setDate(c.getTime());
				
				// Type, scope, subject 
				String[] infoCommit = GHUtil.getValuesMatch("(feat|fix|refactor|docs|models|style)<([\\w]+)>:\\s+([\\w|\\h]+)[\\r|\\n|\\s]*(.*)", s);
				msg.setType(GHUtil.getMessageType(infoCommit[0]));
				msg.setScope(infoCommit[1]);
				msg.setSubject(infoCommit[2]);
				msg.setBody(infoCommit[3]);
				
				ghModel.storeMessage(msg);
				ghModel.storeModel(project, id, "github");
			}
		}
	}
	
	/**
	 * Get blocks of commits from the file of commits
	 * @param text
	 * @return
	 */
	public ArrayList<String> extractCommitBlock(String text) {
		ArrayList<String> listOfCommits = new ArrayList<String>();
		
		String pattern = "commit [0-9a-f]+";

		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(text);
		while(m.find()) {
			listOfCommits.add(m.group());		    
		}
		
		return listOfCommits;
	}
	
	// ---------------------------------
	
	public static void main(String[] args) {
		GHPopulation gh = new GHPopulation();
		try {
			String[] date = {"Mar", "15", "11", "17", "2021"};
			gh.matchingPatternsDirect("Grades Grouper", "7d74jd8dsf5jdhdf1c29747c83h4b43i2nndn338",
					"Camila Parra", "mc.parrad@uniandes.edu.co", date, "feat", "architecture_model", 
					"First version including business elements.", 
					"Design of the business model for selection of best students. Only elements related to the business layer were included. This first model allows the team to think in the services required to support these processes.");
			
			String[] date2 = {"Mar", "22", "11", "34", "2021"};
			gh.matchingPatternsDirect("Grades Grouper", "h56ytu7vgh84nfjgn49948cncb93bslmh95mfn30",
					"Camila Parra", "mc.parrad@uniandes.edu.co", date2, "feat", "architecture_model", 
					"Inclusion of supporting application services and components to business processes.", 
					"Several alternatives were considered. Initial list of elements from the Application layer are included. These elements are used to support business processes by providing services. These services are provided by one component, but a component can provide two services, for example: Template management and Courses management.");
			
			String[] date3 = {"Mar", "25", "10", "42", "2021"};
			gh.matchingPatternsDirect("Grades Grouper", "234ff6fj485kh07kfncbs67733nncnmmd33u3i3c",
					"Camila Parra", "mc.parrad@uniandes.edu.co", date3, "feat", "architecture_model", 
					"Improving architecture by doing tailored components.", 
					"Three new components were created: Grades persistence, in charge of communications with data sources. Consolidation manager, in charge of dealing with all operations for summarize the data. Report cards and certificates management, in charge of use the data and transform it into the required output file.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void matchingPatternsDirect(String project, String id, 
			String personName, String personEmail, String[] date, 
			String type, String scope, String subject, String body) 
			throws Exception {
		
		
			
			Message msg = null;
						
			// Id
			
			ghModel.createModel(project, id);
			
			msg = ghModel.createMessage();
			msg.setId(id);				
			
			// Author
			Person p = ghModel.createPerson();
			p.setEmail(personName);
			p.setName(personEmail);
			msg.setPerson(p);
			ghModel.storePerson(p);
			
			// Date
			Calendar c = Calendar.getInstance();
			String month = date[0];
			String day = date[1];
			String hour = date[2];
			String minute = date[3];
			String year = date[4];				
			c.set(Integer.parseInt(year), GHUtil.monthNumber(month), Integer.parseInt(day), Integer.parseInt(hour), Integer.parseInt(minute));
			msg.setDate(c.getTime());
			
			// Type, scope, subject 
			msg.setType(GHUtil.getMessageType(type));
			msg.setScope(scope);
			msg.setSubject(subject);
			msg.setBody(body);
			
			ghModel.storeMessage(msg);
			ghModel.storeModel(project, id, "github");
			
		}
	

}
