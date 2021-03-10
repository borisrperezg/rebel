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
		
		
		ArrayList<String> listOfCommits = extractCommitBlock(lines);
		matchingPatterns(listOfCommits, project, commitsFileName);		
	}
	
	/**
	 * Extract specific information within the commit
	 * @param listOfCommits
	 */
	public void matchingPatterns(ArrayList<String> listOfCommits, String project, String commitsFileName) throws Exception {
		
		if(listOfCommits!=null && listOfCommits.size()>0) {
			
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
		
		String pattern = "commit [0-9a-f]+\\R(?:(?!\\Rcommit ).*\\R)*";

		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(text);
		while(m.find()) {
			listOfCommits.add(m.group());		    
		}
		
		return listOfCommits;
	}

}
