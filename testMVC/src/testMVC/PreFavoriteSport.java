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
		builder.append("1. 나이순 : ");
		builder.append(personFeature);
		builder.append("\n2. 야구선수 : ");
		builder.append(baseball);
		builder.append("\n3. 축구선수: ");
		builder.append(soccer);
		builder.append("\n4. 전하는말: ");
		builder.append(msg);
		return builder.toString(); 
	}
	
}