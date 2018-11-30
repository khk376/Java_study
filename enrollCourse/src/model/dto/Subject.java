package model.dto;

public class Subject extends Commons {
	String semester;
	String loc;
	int credit;
	int capacity;
	String day;
	String startTime;
	String endTime;
	String pno;
	String pname;
	
	public Subject(String regNo, String name, String semester, String loc, int credit, int capacity,
			String day, String startTime, String endTime, String pno, String pname) {
		super(regNo, name);
		this.semester = semester;
		this.loc = loc;
		this.credit = credit;
		this.capacity = capacity;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
		this.pno = pno;
		this.pname = pname;
	}
	
	public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public String getLoc() {
		return loc;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public int getCredit() {
		return credit;
	}
	
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String getPno() {
		return pno;
	}
	
	public void setPno(String pno) {
		this.pno = pno;
	}
	
	public String getPname() {
		return pname;
	}

	@Override
	public String toString() {
		return "[ 과목번호=" + regNo + ", 과목명=" + name + ", 학기=" + semester + ", 강의실=" + loc + ", 학점=" + credit + ", 정원=" + capacity + ", 강의시간=" + day + " "+ startTime + "~" + endTime + ", 담당교수명=" + pname +" ]";
	}
}
