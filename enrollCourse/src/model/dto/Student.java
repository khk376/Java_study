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
		return "[  학번=" + regNo + ", 학과=" + dname +", 이름=" + name + ", 성별=" + gender + ", 학년=" + grade + ", 휴대폰 번호=" + phone + ", 재학 여부=" + enroll + " ]";
	}
	
}