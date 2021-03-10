package uniandes.rebel.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CoreModelDerby {

	private static String dbURL = "jdbc:derby://localhost:1527/rebel;create=true";

	// jdbc Connection
	private static Connection conn = null;

	public CoreModelDerby() {
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

	public void insert(String projectId, String modelName, String modelType, String xmlRute) throws Exception {
		Statement stmt = conn.createStatement();
		stmt.execute("insert into REB.MODEL (name, type, xmlrute, projectid) values ('" + modelName + "', '"+ modelType +"', '"+xmlRute+"', "+projectId+")");
		stmt.close();
	}
	
	public String findX(String projectName, String modelName) {

		String xmlContent = "";
		String projectId = "";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery("select id from REB.PROJECT where name = '" + projectName +"'");

			if (results.next()) {
				projectId = results.getString(1);
			}
			
			results.close();
			stmt.close();
			
			stmt = conn.createStatement();
			results = stmt.executeQuery("select XMLRUTE from REB.MODEL where name = '" + modelName +"' AND PROJECTID = "+projectId);
			
			if (results.next()) {
				java.sql.Clob aclob = results.getClob(1);
				xmlContent = aclob.getSubString(1l, (int)aclob.length());
			}

		} catch (Exception sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return xmlContent;
	}

}
