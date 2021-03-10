package uniandes.rebelapi.bo;

public class APIBOI {

	private String url, name, urlLinktoADRs, syncIcon, id;
	private int numbersOfComponent;
	
	public APIBOI(String url, String name, int number, String urlLinktoADRs, String syncIcon, int id) {
		this.url = url;
		this.name = name;
		this.numbersOfComponent = number;
		this.urlLinktoADRs = urlLinktoADRs;
		this.syncIcon = syncIcon;
		this.id = ""+id;
	}
	
	public APIBOI(String url, String name, int number) {
		this.url = url;
		this.name = name;
		this.numbersOfComponent = number;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public APIBOI(String url, String name) {
		this.url = url;
		this.name = name;
	}
	
	public String getUrl() {
		return url;
	}
	public String getSyncIcon() {
		return syncIcon;
	}

	public void setSyncIcon(String syncIcon) {
		this.syncIcon = syncIcon;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumbersOfComponent() {
		return numbersOfComponent;
	}
	public void setNumbersOfComponent(int numbersOfComponent) {
		this.numbersOfComponent = numbersOfComponent;
	}

	public String getUrlLinktoADRs() {
		return urlLinktoADRs;
	}

	public void setUrlLinktoADRs(String urlLinktoADRs) {
		this.urlLinktoADRs = urlLinktoADRs;
	}
	
	
	
}
