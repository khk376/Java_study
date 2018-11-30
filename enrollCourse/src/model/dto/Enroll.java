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
		return "[ ��û��ȣ=" + eno + ", �й�=" + stuNo + ", �̸�=" + stuName + ", ��û�� ���� ��ȣ=" + subNo + ", ��û �����=" + subName + ", ��� ����=" + pname +" ]";
	}
	
}
