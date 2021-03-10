package uniandes.rebelapi.bo;

import java.util.ArrayList;

public class APIFact {
	
	private String id, name, type, action, date, observation, model;
	private ArrayList<APIArchitecturalDecision> listOfADs;

	

	public ArrayList<APIArchitecturalDecision> getListOfADs() {
		return listOfADs;
	}

	public void setListOfADs(ArrayList<APIArchitecturalDecision> listOfADs) {
		this.listOfADs = listOfADs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
