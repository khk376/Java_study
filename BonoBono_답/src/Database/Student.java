package Database;

import java.util.ArrayList;

public class Student extends People {
	private int group;
	private Student(String name, int age, int group) {		
		super(name, age);
		this.group = group;
	}
	
	
	// // 1. 아래 instance 생성 1줄 코드 지우고 채워넣기?
	private static ArrayList<Student> instance = new ArrayList<Student>();
	
	//싱글톤 리턴
	public static ArrayList<Student> getInstance() {
		return instance;
	}	
	//학생  추가해버리기
	public static void addStudent(String name, int age, int group) {					
		Student new_student = new Student (name,age,group);
		instance.add(new_student);		
	}
	//제거 메소드
	public static void deleteStudent(int no) {
		instance.remove(no);
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}	
	//to string 오버라이드 문제
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[이름 : ");
		builder.append(name);
		builder.append(", 나이 : ");
		builder.append(age);
		builder.append(", 몇반 : ");
		builder.append(group);
		builder.append(" ]");
		return builder.toString();
	}
}
