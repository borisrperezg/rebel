package uniandes.rebelapi.bo;

public class APIElementRelations {

	private int incomingLinks, outcomingLinks, allLinks;
	private String mostLinkedLayer;

	public int getIncomingLinks() {
		return incomingLinks;
	}

	public void setIncomingLinks(int incomingLinks) {
		this.incomingLinks = incomingLinks;
	}

	public int getOutcomingLinks() {
		return outcomingLinks;
	}

	public void setOutcomingLinks(int outcomingLinks) {
		this.outcomingLinks = outcomingLinks;
	}

	public int getAllLinks() {
		return allLinks;
	}

	public void setAllLinks(int allLinks) {
		this.allLinks = allLinks;
	}

	public String getMostLinkedLayer() {
		return mostLinkedLayer;
	}

	public void setMostLinkedLayer(String mostLinkedLayer) {
		this.mostLinkedLayer = mostLinkedLayer;
	}
	
	
	
}
