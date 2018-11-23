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
		super();
	}

	public BrandDTO(String brdcode, String brdName, String proCode) {
		super();
		this.Brdcode = brdcode;
		this.BrdName = brdName;
		this.ProCode = proCode;
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

	public void setProCode(String proCode) {
		ProCode = proCode;
	}

	@Override
	public String toString() {
		return "brandDTO [Brdcode=" + Brdcode + ", BrdName=" + BrdName + ", ProCode=" + ProCode + "]";
	}
	
}
