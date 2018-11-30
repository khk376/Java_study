package model.dto;

public class Student extends Commons {
	int grade;
	
	public Student(String regNo, String name, String gender, String dname, String phone, String email, String enroll, int grade) {
		super(regNo, name, gender, dname, phone, email, enroll);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "[  �й�=" + regNo + ", �а�=" + dname +", �̸�=" + name + ", ����=" + gender + ", �г�=" + grade + ", �޴��� ��ȣ=" + phone + ", ���� ����=" + enroll + " ]";
	}
	
}