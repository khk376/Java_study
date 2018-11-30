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
		builder.append("�����̸� : ");
		builder.append(nameB);
		builder.append(", ���� : ");
		builder.append(ageB);
		builder.append(", ���� ���� : ");
		builder.append(advantageB);
		builder.append("]");
		return builder.toString();
	
	}
}