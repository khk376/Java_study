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
//			builder.append("1. 프로젝트 id : ");
//			builder.append(probonoProjectId);
//			builder.append("2. 프로보노 프로젝트명 : ");
//			builder.append(probonoProjectName);
//			builder.append("3. 프로보노 정보 : ");
//			builder.append(probonoId);
//			builder.append("4. 재능 기부자 정보 : ");
//			builder.append(activistId);
//			builder.append("5. 수해자 정보 : ");
//			builder.append(receiveId);
//			builder.append("6. 프로젝트 제공내용 : ");
//			builder.append(projectContent);
//			return builder.toString();
//		}
			StringBuilder builder = new StringBuilder();
			builder.append("1. 제품 코드 : ");
			builder.append(Procode);
			builder.append(" 2. 제품 이름 : ");
			builder.append(ProName);
			builder.append(" 3. 제품 가격 : ");
			builder.append(Price);
			builder.append(" 4. 색상 : ");
			builder.append(color);
			builder.append(" 5. 품목 : ");
			builder.append(category);
			return "["+ builder.toString() + "]\n";
//		return "ProductDTO [Procode=" + Procode + ", ProName=" + ProName + ", Price=" + Price + ", color=" + color
//				+ ", category=" + category + "]";
	}
}
