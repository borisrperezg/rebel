package uniandes.rebel.archimate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class AMModelDerby {

	private static String dbURL = "jdbc:derby://localhost:1527/rebel;create=true";

	// jdbc Connection
	private static Connection conn = null;
	private static Statement stmt = null;

	public AMModelDerby() {
		createConnection();
	}

	private void createConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			// Get a connection
			conn = DriverManager.getConnection(dbURL);
		} catch (Exception except) {
			except.printStackTrace();
		}
	}

	public void findProjectAndInsertModel(String projectName, String modelName, String modelType, String xmlroute) throws Exception {
		
		stmt = conn.createStatement();
		ResultSet results = stmt.executeQuery("select id from REB.PROJECT where name = '" + projectName +"'");

		String projectId = "";
		if (results.next()) {
			projectId = results.getString(1);
			
			stmt = conn.createStatement();
			stmt.execute("insert into REB.MODEL (name, type, XMLRUTE, projectid) "
					+ "values ('" + modelName + "', '"+ modelType +"', '"+xmlroute+"', "+projectId+")");
		}
		
		results.close();
		stmt.close();
	}
	
	public void findProjectAndInsertModel(String projectName, String modelName, String modelType, 
			String xmlroute, String viewDate) throws Exception {
		
		stmt = conn.createStatement();
		ResultSet results = stmt.executeQuery("SELECT ID FROM REB.PROJECT WHERE NAME = '" + projectName +"'");

		String projectId = "";
		if (results.next()) {
			projectId = results.getString(1);
			
			stmt = conn.createStatement();
			stmt.execute("INSERT INTO REB.MODEL (NAME, TYPE, XMLRUTE, PROJECTID, MODELDATE) " +
					"VALUES ('" + modelName + "', '"+ modelType +"', '"+xmlroute+"', " + 
					projectId+", DATE('"+viewDate+"'))");
		}
		
		results.close();
		stmt.close();
	}
	
	public String findProject(String projectName) {

		String projectId = "";

		try {
			stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery("select id from REB.PROJECT where name = '" + projectName +"'");

			if (results.next()) {
				projectId = results.getString(1);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return projectId;
	}
	
}
