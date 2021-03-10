package uniandes.rebelapi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import uniandes.rebelapi.bo.APIElement;

public class APIQualityAttributesDerby {

	private static String dbURL = "jdbc:derby://localhost:1527/rebel;create=true";

	// jdbc Connection
	private static Connection conn = null;

	public APIQualityAttributesDerby() {
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
	
	public List<APIElement> listQualityAttributes() {

		List<APIElement> list = new ArrayList<APIElement>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery("SELECT ID, NAME FROM REB.QUALITYATTRIBUTE ORDER BY NAME");

			while (results.next()) {
				String id = results.getString(1);
				String name = results.getString(2);

				list.add(new APIElement(id, name));
			}

			results.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
}
