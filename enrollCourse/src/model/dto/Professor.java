package model.dto;

public class Professor extends Commons {
	String hireDate;
	String slaveNo;
	String slaveName;
	
	public Professor(String regNo, String name, String gender, String dname, String phone, String email,
			 String enroll, String hireDate, String slaveNo, String slaveName) {
		super(regNo, name, gender, dname, phone, email, enroll);

		this.hireDate = hireDate;
		this.slaveNo = slaveNo;
		this.slaveName = slaveName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getSlaveNo() {
		return slaveNo;
	}

	public void setSlaveNo(String slaveNo) {
		this.slaveNo = slaveNo;
	}
	
	public String getSlaveName() {
		return slaveName;
	}
	
	@Override
	public String toString() {
		return "[ 교번=" + regNo + ", 학과=" + dname + ", 이름=" + name + ", 성별=" + gender + ", email=" + email + ", 출강 여부=" + enroll + ", 조교 학번=" + slaveNo + ", 조교 이름=" + slaveName +" ]";
	}
	
}
