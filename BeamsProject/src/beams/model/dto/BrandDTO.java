/*create table Brand_info(
	Brdcode char(10),
	BrdName char(10),
	ProCode char(10) constraint Brand_info_ProCode_fk references Product_info(Procode),
	constraint br_PK primary key (brdcode, procode)
	);
 */
package beams.model.dto;

public class BrandDTO {

	private String Brdcode;
	private String BrdName;
	private String ProCode;

	public BrandDTO() {
	}

	public BrandDTO(String brdcode, String brdName, String procode) {
		super();
		this.Brdcode = brdcode;
		this.BrdName = brdName;
		this.ProCode = procode;
	}

	public String getBrdcode() {
		return Brdcode;
	}

	public void setBrdcode(String brdcode) {
		Brdcode = brdcode;
	}

	public String getBrdName() {
		return BrdName;
	}

	public void setBrdName(String brdName) {
		BrdName = brdName;
	}

	public String getProCode() {
		return ProCode;
	}

	public void setProCode(String procode) {
		ProCode = procode;
	}

	@Override
	
	public String toString() {
		StringBuilder builder= new StringBuilder();
		builder.append("1. 브랜드코드 : ");
		builder.append(Brdcode);
		builder.append("브랜드명 : ");
		builder.append(BrdName);
		builder.append("3. 제품코드 : ");
		builder.append(ProCode);
		return "[" + builder.toString() +"]";
	}
	
}
