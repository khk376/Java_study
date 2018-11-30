package Database;

import java.util.ArrayList;

public class Student extends People {
	private int group;
	private Student(String name, int age, int group) {		
		super(name, age);
		this.group = group;
	}
	
	
	// // 1. �Ʒ� instance ���� 1�� �ڵ� ����� ä���ֱ�?
	private static ArrayList<Student> instance = new ArrayList<Student>();
	
	//�̱��� ����
	public static ArrayList<Student> getInstance() {
		return instance;
	}	
	//�л�  �߰��ع�����
	public static void addStudent(String name, int age, int group) {					
		Student new_student = new Student (name,age,group);
		instance.add(new_student);		
	}
	//���� �޼ҵ�
	public static void deleteStudent(int no) {
		instance.remove(no);
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}	
	//to string �������̵� ����
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[�̸� : ");
		builder.append(name);
		builder.append(", ���� : ");
		builder.append(age);
		builder.append(", ��� : ");
		builder.append(group);
		builder.append(" ]");
		return builder.toString();
	}
}
