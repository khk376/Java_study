/*
 *create table Branch_info(
   Brcode char(10)  primary key,
   BrName char(10),
   LocName char(10)
   );
 */
package beams.model.dto;

public class BranchDTO {
	private String Brcode;
	private String BrName;
	private String LocName;
	public BranchDTO() {
		super();
	}
	public BranchDTO(String brcode, String brName, String locName) {
		super();
		Brcode = brcode;
		BrName = brName;
		LocName = locName;
	}
	public String getBrcode() {
		return Brcode;
	}
	public void setBrcode(String brcode) {
		Brcode = brcode;
	}
	public String getBrName() {
		return BrName;
	}
	public void setBrName(String brName) {
		BrName = brName;
	}
	public String getLocName() {
		return LocName;
	}
	public void setLocName(String locName) {
		LocName = locName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 지점코드 : ");
		builder.append(Brcode);
		builder.append("2.  지점명 : ");
		builder.append(BrName);
		builder.append("3. 지역명 : ");
		builder.append(LocName);
		return "[" + builder.toString() + "]\n";
		//		return "BranchDTO [Brcode=" + Brcode + ", BrName=" + BrName + ", LocName=" + LocName + "]";
	}
	
}
