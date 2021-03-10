package uniandes.rebelapi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import uniandes.rebelapi.bo.APIModelElement;
import uniandes.rebelapi.bo.APIBOI;
import uniandes.rebelapi.bo.Model;
import uniandes.rebelapi.bo.Project;

public class APIModelDerby {

	private static String dbURL = "jdbc:derby://localhost:1527/rebel;create=true";

	// jdbc Connection
	private static Connection conn = null;

	public APIModelDerby() {
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

	public List<APIModelElement> listAllArtifacts(String projectName) {

		List<APIModelElement> list = new ArrayList<APIModelElement>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME, A.TYPE, A.PROJECTID, A.XMLRUTE FROM REB.MODEL A, REB.PROJECT B WHERE A.TYPE != 'rebel' AND A.PROJECTID = B.ID AND B.NAME = '"
							+ projectName + "'");

			while (results.next()) {
				String id = results.getString(1);
				String name = results.getString(2);
				String type = results.getString(3);
				String pId = results.getString(4);
				String route = results.getString(5);

				APIModelElement m = new APIModelElement();
				m.setId(id);
				m.setName(name);
				m.setType(type);
				m.setProjectId(pId);
				m.setXmlroute(route);

				list.add(m);
			}

			results.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public APIBOI getBOI(String projectName, String boiName) {

		APIBOI boi = null;

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME, A.XMLRUTE FROM REB.MODEL A, REB.PROJECT B WHERE A.NAME = '" + boiName
							+ "' AND A.PROJECTID = B.ID AND A.TYPE = 'rebel' AND B.NAME = '" + projectName + "'");

			if (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String rute = results.getString(3);

				boi = new APIBOI(rute, name, id);
			}

			results.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return boi;
	}

	public List<APIBOI> listBOIs(String projectName) {

		List<APIBOI> list = new ArrayList<APIBOI>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME, A.XMLRUTE FROM REB.MODEL A, REB.PROJECT B WHERE A.PROJECTID = B.ID AND A.TYPE = 'rebel' AND B.NAME = '"
							+ projectName + "'");

			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String rute = results.getString(3);

				list.add(new APIBOI(rute, name, id));
			}

			results.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Model> listByName(String projectName) {

		List<Model> list = new ArrayList<Model>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME, A.XMLRUTE, A.LOOKINARTIF "
					+ "FROM REB.MODEL A, REB.PROJECT B "
					+ "WHERE A.PROJECTID = B.ID AND A.TYPE = 'rebel' AND B.NAME = '"
							+ projectName + "'");

			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String rute = results.getString(3);
				String syncState = results.getString(4);

				Model m = new Model();
				m.setId(id);
				m.setName(name);
				m.setProjectName(projectName);
				m.setRute(rute);
				m.setSyncState(syncState);

				list.add(m);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return list;
	}

	public List<APIBOI> listAllBOIs() {

		List<APIBOI> list = new ArrayList<APIBOI>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery("SELECT ID, NAME, XMLRUTE FROM REB.MODEL WHERE TYPE = 'rebel'");

			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String rute = results.getString(3);

				list.add(new APIBOI(rute, name, id));
			}

			results.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Model> listXMLRute(String projectName, String artifactType) {

		List<Model> list = new ArrayList<Model>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME, A.XMLRUTE FROM REB.MODEL A, REB.PROJECT B WHERE A.PROJECTID = B.ID AND A.TYPE = '"+artifactType+"' AND B.NAME = '"
							+ projectName + "'");

			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String rute = results.getString(3);

				Model m = new Model();
				m.setId(id);
				m.setName(name);
				m.setRute(rute);

				list.add(m);
			}

			results.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	/**
	 * 
	 * @param projectName
	 * @param artifactType
	 * @param partName Es una parte del nombre. Se usa LIKE para encontrar otros registros
	 * @return
	 */
	public List<Model> listXMLRute(String projectName, String artifactType, String partName) {

		List<Model> list = new ArrayList<Model>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME, A.XMLRUTE " +
					"FROM REB.MODEL A, REB.PROJECT B " +
					"WHERE A.PROJECTID = B.ID " +
					"AND A.TYPE = '"+artifactType+"' " +
					"AND A.NAME LIKE '"+partName+"%' " +
					"AND B.NAME = '"+ projectName + "'");

			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String rute = results.getString(3);

				Model m = new Model();
				m.setId(id);
				m.setName(name);
				m.setRute(rute);

				list.add(m);
			}

			results.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public List<Model> listXMLRute(String projectName) {

		List<Model> list = new ArrayList<Model>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME, A.XMLRUTE " +
					"FROM REB.MODEL A, REB.PROJECT B " +
					"WHERE A.PROJECTID = B.ID " +
					"AND A.TYPE = 'functionalview' " +
					"AND B.NAME = '"+ projectName + "'");

			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String rute = results.getString(3);

				Model m = new Model();
				m.setId(id);
				m.setName(name);
				m.setRute(rute);

				list.add(m);
			}

			results.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public int deleteArtifact(String artifactId) throws Exception {
		String query = "DELETE FROM REB.MODEL WHERE id = " + artifactId;
		Statement stmt = conn.createStatement();
		int num = stmt.executeUpdate(query);
		return num;
	}

	public List<Model> listModelsName(String projectName) {

		List<Model> list = new ArrayList<Model>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME FROM REB.MODEL A, REB.PROJECT B WHERE A.PROJECTID = B.ID AND (A.TYPE = 'functionalview' OR A.TYPE = 'archimate') AND B.NAME = '"
							+ projectName + "' ORDER BY A.NAME, A.MODELDATE");

			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);

				Model m = new Model();
				m.setId(id);
				m.setName(name);

				list.add(m);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return list;
	}

	public List<Model> listArchitecturalDecisions(String projectName) {

		List<Model> list = new ArrayList<Model>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME, A.XMLRUTE FROM REB.MODEL A, REB.PROJECT B WHERE A.PROJECTID = B.ID AND A.TYPE = 'decision' AND B.NAME = '"
							+ projectName + "'");

			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String rute = results.getString(3);

				Model m = new Model();
				m.setId(id);
				m.setName(name);
				m.setRute(rute);

				list.add(m);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return list;
	}
	
	public List<Model> listArchimateModels(String projectName, String baseModel) {

		List<Model> list = new ArrayList<Model>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT A.ID, A.NAME, A.XMLRUTE " +
					"FROM REB.MODEL A, REB.PROJECT B " +
					"WHERE A.PROJECTID = B.ID AND " +
					"A.TYPE = 'archimate' AND " + 
					"B.NAME = '"+ projectName + "' AND " +
					"A.NAME LIKE '"+baseModel+"%' ORDER BY A.MODELDATE ASC");

			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String rute = results.getString(3);

				Model m = new Model();
				m.setId(id);
				m.setName(name);
				m.setRute(rute);

				list.add(m);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return list;
	}

	public String get(String modelName) {

		String xml = null;

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery("SELECT XMLRUTE FROM REB.MODEL WHERE NAME = '" + modelName + "'");

			if (results.next()) {
				xml = results.getString(1);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return xml;
	}

	public APIModelElement getArtifact(String artifactId) {
		APIModelElement artifact = null;

		try {
			Statement stmt = conn.createStatement();

//			System.out.println("Artifact ID = " + artifactId);

			ResultSet results = stmt.executeQuery("SELECT ID, NAME, TYPE FROM REB.MODEL WHERE ID = " + artifactId);

			if (results.next()) {
				artifact = new APIModelElement();
				artifact.setId(results.getString(1));
				artifact.setName(results.getString(2));
				artifact.setType(results.getString(3));
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return artifact;
	}

	public Project getProject(String artifactId) {
		Project project = null;

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"SELECT PROJECTID, B.NAME FROM REB.MODEL A, REB.PROJECT B WHERE A.PROJECTID = B.ID AND A.ID = "
							+ artifactId);

			if (results.next()) {
				project = new Project();
				project.setId(results.getString(1));
				project.setName(results.getString(2));

			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return project;
	}

	public String get(String modelName, String projectName) {

		String xml = null;

//		System.out.println("ModelDerby.get(modelName, projectName) = " + modelName + " - " + projectName);

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery("SELECT A.XMLRUTE "
												+ "FROM REB.MODEL A, REB.PROJECT B "
												+ "WHERE A.PROJECTID = B.ID "
												+ "AND B.NAME = '" + projectName + "' "
												+ "AND A.NAME = '" + modelName + "' "
												+ "ORDER BY A.MODELDATE DESC ");

			if (results.next()) {
				xml = results.getString(1);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return xml;
	}

	public void update(String xml, String modelName) throws Exception {
		String query = "UPDATE REB.MODEL SET XMLFILE = '" + xml + "' WHERE name = '" + modelName + "'";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(query);
	}
	
	public int updateLookForArtifactsState(String boiName, String projectName, String state) throws Exception {
		StringBuffer query = new StringBuffer();
		
		query.append("UPDATE REB.MODEL M SET M.LOOKINARTIF = ? ");
		query.append("WHERE M.NAME = ? AND EXISTS ");
		query.append("(SELECT 1 FROM REB.PROJECT P WHERE M.PROJECTID = P.ID AND P.NAME = ?)");
		
		PreparedStatement prep1 = conn.prepareStatement(query.toString());
		prep1.setString(1, state);
		prep1.setString(2, boiName);
		prep1.setString(3, projectName);
		
		int affectedRows = prep1.executeUpdate();
		
		return affectedRows;
	}

	public ArrayList<APIModelElement> obtenerListaDeVistas(String projectName, String prenombre) {
		ArrayList<APIModelElement> list = new ArrayList<APIModelElement>();

		try {
			Statement stmt = conn.createStatement();

			ResultSet results = stmt.executeQuery(
					"select a.id, a.name, a.xmlrute " +
					"from reb.model a, reb.project b " + 
					"where a.projectid = b.id and " +
					"b.name = '"+projectName+"' and " +
					"type = 'archimate' and " +
					"a.name like '"+prenombre+"%' order by name asc");

			while (results.next()) {
				String id = results.getString(1);
				String name = results.getString(2);
				String rute = results.getString(3);

				APIModelElement m = new APIModelElement();
				m.setId(id);
				m.setName(name);
				m.setXmlroute(rute);

				list.add(m);
			}

			results.close();
			stmt.close();

		} catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}

		return list;
	}

}
