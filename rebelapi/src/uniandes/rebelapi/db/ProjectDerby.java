package uniandes.rebelapi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import uniandes.rebelapi.bo.Project;

public class ProjectDerby {

	private static String dbURL = "jdbc:derby://localhost:1527/rebel;create=true";
	private static String tableName = "REB.PROJECT";

	// jdbc Connection
	private static Connection conn = null;
	private static Statement stmt = null;

	public ProjectDerby() {
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

	public int delete(String id) throws Exception {
		String query = "DELETE FROM " + tableName + " WHERE id = "+id;
		stmt = conn.createStatement();
		int num = stmt.executeUpdate(query);
		return num;
	}

	public void insert(String name) throws Exception {
		stmt = conn.createStatement();
		stmt.execute("insert into " + tableName + " (name) values ('" + name + "')");
		stmt.close();
	}

	public List<Project> list() {

		List<Project> list = new ArrayList<Project>();

		try {
			stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery("select id, name from " + tableName);

			while (results.next()) {
				String id = results.getString(1);
				String name = results.getString(2);
				list.add(new Project(id, name));
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return list;
	}

	public String find(String id) {
		String name = "";
		try {
			stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery("select name from " + tableName + " where id = "+id);

			if (results.next()) {
				name = results.getString(1);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return name;
	}
	
	public int countArtifacts(String id) {
		int count = 0;
		try {
			stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery("SELECT COUNT(ID) FROM REB.MODEL WHERE PROJECTID = "+id);

			if (results.next()) {
				count = results.getInt(1);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return count;
	}

}
