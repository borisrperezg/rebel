package uniandes.rebelapi.bo;

public class Model {

	private String name, projectName, rute, syncState;
	private int id;
	
	
	
	public String getRute() {
		return rute;
	}

	public void setRute(String rute) {
		this.rute = rute;
	}

	public String getSyncState() {
		return syncState;
	}

	public void setSyncState(String syncState) {
		this.syncState = syncState;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
