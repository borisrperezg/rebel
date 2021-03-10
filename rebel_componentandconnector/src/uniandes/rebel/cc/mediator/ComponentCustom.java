package uniandes.rebel.cc.mediator;

public class ComponentCustom {

	private String name, posX, posY, id, height, width;

	public ComponentCustom(String name, String id, String posX, String posY, String height, String width) {
		this.name = name;
		this.id = id;
		this.posX = posX;
		this.posY = posY;
		this.height = height;
		this.width = width;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosX() {
		return posX;
	}

	public void setPosX(String posX) {
		this.posX = posX;
	}

	public String getPosY() {
		return posY;
	}

	public void setPosY(String posY) {
		this.posY = posY;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}
	
	
}
