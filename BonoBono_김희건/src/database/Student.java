package database;

import java.util.ArrayList;

public class Student extends People {
	private int group;
	private Student(String name, int age, int group) {		
		super(name, age);
		this.group = group;
	}
	
	
	// //�̱��� ������ ���� ��ü ���� �ڵ��� ���ڸ��̴�. ä������.
	static ArrayList<Student> instance = new ArrayList<Student>();
	

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
		System.out.println("");
		return name;
	}
}
