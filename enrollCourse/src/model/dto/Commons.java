package model.dto;

public class Commons {
	String regNo;
	String name;
	String gender;
	String dname;
	String phone;
	String email;
	String enroll;
	
	public Commons(String regNo, String name, String gender, String dname, String phone, String email, String enroll) {
		this.regNo = regNo;
		this.name = name;
		this.gender = gender;
		this.dname = dname;
		this.phone = phone;
		this.email = email;
		this.enroll = enroll;
	}
	
	public Commons(String regNo, String name) {
		this.regNo = regNo;
		this.name = name;
	}

	public String getRegNo() {
		return regNo;
	}
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDname() {
		return dname;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnroll() {
		return enroll;
	}

	public void setEnroll(String enroll) {
		this.enroll = enroll;
	}
}
