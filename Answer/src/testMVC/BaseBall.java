package testMVC;


public class BaseBall {
	private String nameB;
	private int ageB;
	private String advantageB;
	
	public BaseBall() {}
	public BaseBall(String nameB, int ageB, String advantageB) {
		this.nameB = nameB;
		this.ageB = ageB;
		this.advantageB = advantageB;
	}
	
	public String getName() {
		return nameB;
	}

	
	
	public int getAge() {
		return ageB;
	}

	
	public String getadvantage() {
		return advantageB;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("선수이름 : ");
		builder.append(nameB);
		builder.append(", 나이 : ");
		builder.append(ageB);
		builder.append(", 선수 장점 : ");
		builder.append(advantageB);
		builder.append("]");
		return builder.toString();
	
	}
}