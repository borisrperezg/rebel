package uniandes.rebelapi.textclassification;

public class TextClassificationBO {

	private String loss = "", precision = "", recall = "", f_score = "";

	public String getLoss() {
		return loss;
	}

	public void setLoss(String loss) {
		this.loss = loss;
	}

	public String getPrecision() {
		return precision;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

	public String getRecall() {
		return recall;
	}

	public void setRecall(String recall) {
		this.recall = recall;
	}

	public String getF_score() {
		return f_score;
	}

	public void setF_score(String f_score) {
		this.f_score = f_score;
	}
	
	
	
}
