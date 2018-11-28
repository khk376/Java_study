package testMVC;

public class PreFavoriteSport {
	private String personFeature;
	private BaseBall baseball;
	private Soccer soccer;
	private String msg;
	
	public PreFavoriteSport() {}
	public PreFavoriteSport(String pt,BaseBall b,Soccer s, String msg) {
		this.personFeature = pt;
		this.baseball = b;
		this.soccer = s;
		this.msg = msg;
	}

	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. ���̼� : ");
		builder.append(personFeature);
		builder.append("\n2. �߱����� : ");
		builder.append(baseball);
		builder.append("\n3. �౸����: ");
		builder.append(soccer);
		builder.append("\n4. ���ϴ¸�: ");
		builder.append(msg);
		return builder.toString(); 
	}
	
}