package uniandes.rebelapi.bo;

public class Project {
	
	private String name;
	private String id;
	private int amountOfArtifacts;
	
	public Project(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Project() {}
	
	
	
	public int getAmountOfArtifacts() {
		return amountOfArtifacts;
	}

	public void setAmountOfArtifacts(int amountOfArtifacts) {
		this.amountOfArtifacts = amountOfArtifacts;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
