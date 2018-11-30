package Database;

import java.util.ArrayList;

public class Teacher extends People {
	
	//고유스킬
	private String skill;	
	//싱글톤 - 공유할 하나의 인스턴스 생성
	private static ArrayList<Teacher> instance = new ArrayList<Teacher>();
	
	
	//1. People 클래스에서 생성자를 받아와서 skill 값을 추가해 Teacher 생성자를 만드세요
	private Teacher(String name, int age , String skill) {
		super(name, age);
		this.skill = skill;
	}
	
	//스킬불러오기
	public String getSkill() {
		return skill;
	}
	
	//스킬받아오기
	public void setSkill(String skill) {
		this.skill = skill;
	}

	
	//싱글톤 리턴
	public static ArrayList<Teacher> getInstance() {
		
		return instance;
	}	
	
	//선생님 추가해버리기
	public static void addTeacher(String name, int age, String skill) {
						
		Teacher new_teacher = new Teacher(name,age,skill);
		instance.add(new_teacher);		
		
	}
	
	//제거 메소드
	public static void deleteTeacher(int no) {
		instance.remove(no);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[이름 : ");
		builder.append(name);
		builder.append(", 나이 : ");
		builder.append(age);
		builder.append(", 특수능력 : ");
		builder.append(skill);
		builder.append(" ]");
		return builder.toString();
	}	
}
