/*create table Stock_info(
	Brcode char(5) constraint Stock_info_Brcode_fk references Branch_info(Brcode),
	Procode char(10) constraint Stock_info_Procode_fk references Product_info(Procode),
	constraint st_PK primary key (Brcode, Procode),
	ReceiveDate number(10),
	quantity number(5)
	);
 * 
 */
package beams.model.dto;

public class StockDTO {

	private String Brcode;
	private String Procode;
	private int ReceiveDate;
	private int quantity;
	
	public StockDTO() {
		super();
	}

	public StockDTO(String brcode, String procode, int receiveDate, int quantity) {
		super();
		this.Brcode = brcode;
		this.Procode = procode;
		this.ReceiveDate = receiveDate;
		this.quantity = quantity;
	}

	public String getBrcode() {
		return Brcode;
	}

	public void setBrcode(String brcode) {
		Brcode = brcode;
	}

	public String getProcode() {
		return Procode;
	}

	public void setProcode(String procode) {
		Procode = procode;
	}

	public int getReceiveDate() {
		return ReceiveDate;
	}

	public void setReceiveDate(int receiveDate) {
		ReceiveDate = receiveDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "StockDTO [Brcode=" + Brcode + ", Procode=" + Procode + ", ReceiveDate=" + ReceiveDate + ", quantity="
				+ quantity + "]";
	}

	
	
}

