/*create table Product_info(
   Procode char(10)  primary key,
   ProName char(30),
   Price number(10),
   color char(10),
   category char(10)
   );
 */
package beams.model.dto;

public class ProductDTO {
	private String Procode;
	private String ProName;
	private int Price;
	private String color;
	private String category;
	
	public ProductDTO() {
		super();
	}
	
	public ProductDTO(String procode, String proName, int price, String color, String category) {
		super();
		Procode = procode;
		ProName = proName;
		Price = price;
		this.color = color;
		this.category = category;
	}


	public String getProcode() {
		return Procode;
	}
	public void setProcode(String procode) {
		Procode = procode;
	}
	public String getProName() {
		return ProName;
	}
	public void setProName(String proName) {
		ProName = proName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
		
	@Override
	public String toString() {

//			StringBuilder builder = new StringBuilder();
//			builder.append("1. ������Ʈ id : ");
//			builder.append(probonoProjectId);
//			builder.append("2. ���κ��� ������Ʈ�� : ");
//			builder.append(probonoProjectName);
//			builder.append("3. ���κ��� ���� : ");
//			builder.append(probonoId);
//			builder.append("4. ��� ����� ���� : ");
//			builder.append(activistId);
//			builder.append("5. ������ ���� : ");
//			builder.append(receiveId);
//			builder.append("6. ������Ʈ �������� : ");
//			builder.append(projectContent);
//			return builder.toString();
//		}
			StringBuilder builder = new StringBuilder();
			builder.append("1. ��ǰ �ڵ� : ");
			builder.append(Procode);
			builder.append(" 2. ��ǰ �̸� : ");
			builder.append(ProName);
			builder.append(" 3. ��ǰ ���� : ");
			builder.append(Price);
			builder.append(" 4. ���� : ");
			builder.append(color);
			builder.append(" 5. ǰ�� : ");
			builder.append(category);
			return "["+ builder.toString() + "]\n";
//		return "ProductDTO [Procode=" + Procode + ", ProName=" + ProName + ", Price=" + Price + ", color=" + color
//				+ ", category=" + category + "]";
	}
}
