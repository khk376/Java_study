package testMVC;

public class Soccer {
		private String nameS;
		private int ageS;
		private String advantageS;
		
		public Soccer() {}
		public Soccer(String nameS, int ageS, String advantageS) {
			this.nameS = nameS;
			this.ageS = ageS;
			this.advantageS = advantageS;
		}
			
		
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("선수이름 - ");
			builder.append(nameS);
			builder.append(", 나이 - ");
			builder.append(ageS);
			builder.append(", 선수 장점 - ");
			builder.append(advantageS);
			builder.append("]");
			return builder.toString();
	}
}