package uniandes.rebelapi.bo;

public class APIModelElement {

	private String name, type, projectId, id, xmlroute;
	private boolean isSelected;
	
	public APIModelElement() {}

	public String getProjectId() {
		return projectId;
	}

	public String getXmlroute() {
		return xmlroute;
	}

	public void setXmlroute(String xmlroute) {
		this.xmlroute = xmlroute;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public APIModelElement(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public APIModelElement(String name, String type, boolean isSelected) {
		this.name = name;
		this.type = type;
		this.isSelected = isSelected;
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
	
	@Override
    public boolean equals(Object obj) {
		APIModelElement guest = (APIModelElement)obj;
		return (name!=null && name.equals(guest.name)) && (type != null && type.equals(guest.type)) && (isSelected == guest.isSelected); 
	}
	
	@Override
    public int hashCode() 
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        return result;              
    }
	
}
