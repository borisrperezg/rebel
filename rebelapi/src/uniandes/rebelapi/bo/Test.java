package uniandes.rebelapi.bo;

public class Test {

	public static void main(String[] args) {
		// Create Sync property: SYNC
		// Create Service Type property: EVENT
		// Change Sync property: NONE (prev. SYNC)
		
		printing("Create Sync property: SYNC");
		printing("Create Service Type property: EVENT");
		printing("Change Sync property: NONE (prev. SYNC)");
		
		
	}
	
	public static void printing(String val) {
		// Ambas tienen la misma longitud
		int posCreateChange = 6;
		int posPropertyWord = val.lastIndexOf("property");
		
		System.out.println("Property name = "+val.substring(posCreateChange, posPropertyWord).trim());
		
		String[] splitByValue = val.split(":");
		String tempValue = splitByValue[1];
		
		if(tempValue.contains("prev")) {
			int posPrev = tempValue.indexOf("prev");
			int cierreParen = tempValue.indexOf(")");
			
			String oldValue = tempValue.substring((posPrev+5),cierreParen).trim();
			String newValue = tempValue.substring(0, tempValue.indexOf("(")).trim();
			
			System.out.println("New value = "+newValue);
			System.out.println("Old value = "+oldValue);
			
		}else
			System.out.println("New value = "+tempValue.trim());
	}
	
}