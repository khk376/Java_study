package model.dto;

public class Enroll {
	int eno;
	String stuNo;
	String stuName;
	String subNo;
	String subName;
	String pname;
	
	public Enroll(int eno, String stuNo, String stuName, String subNo, String subName, String pname) {
		this.eno = eno;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.subNo = subNo;
		this.subName = subName;
		this.pname = pname;
	}

	public int getEno() {
		return eno;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public String getSubNo() {
		return subNo;
	}

	public void setSubNo(String subNo) {
		this.subNo = subNo;
	}

	public String getSubName() {
		return subName;
	}

	public String getpname() {
		return pname;
	}

	@Override
	public String toString() {
		return "[ 신청번호=" + eno + ", 학번=" + stuNo + ", 이름=" + stuName + ", 신청한 과목 번호=" + subNo + ", 신청 과목명=" + subName + ", 담당 교수=" + pname +" ]";
	}
	
}
