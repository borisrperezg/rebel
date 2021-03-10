package uniandes.rebelapi.bo;

public class APIElement {

	private String id, name, type;

	public APIElement(String id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public APIElement(String id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
    public boolean equals(Object obj) {
		APIElement guest = (APIElement) obj;
		return (name!=null && name.equals(guest.name)) && 
				(id != null && id.equals(guest.id)) && 
				(type != null && type.equals(guest.type)); 
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
