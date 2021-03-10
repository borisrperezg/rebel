package uniandes.rebel.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CoreProjectDerby {

	private static String dbURL = "jdbc:derby://localhost:1527/rebel;create=true";

	// jdbc Connection
	private static Connection conn = null;
	private static Statement stmt = null;

	public CoreProjectDerby() {
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

	public String find(String name) {

		String projectId = "";

		try {
			stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery("select id from REB.PROJECT where name = '" + name +"'");

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
