package step01.model.domain;

public class CustomerDTO {

	private String id;
	private String pw;
	public CustomerDTO() {
		super();
	}
	public CustomerDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", pw=" + pw + "]";
	}
}
