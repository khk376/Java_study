package Database;

import java.util.ArrayList;

public class Teacher extends People {
	
	//������ų
	private String skill;	
	//�̱��� - ������ �ϳ��� �ν��Ͻ� ����
	private static ArrayList<Teacher> instance = new ArrayList<Teacher>();
	
	
	//1. People Ŭ�������� �����ڸ� �޾ƿͼ� skill ���� �߰��� Teacher �����ڸ� ���弼��
	private Teacher(String name, int age , String skill) {
		super(name, age);
		this.skill = skill;
	}
	
	//��ų�ҷ�����
	public String getSkill() {
		return skill;
	}
	
	//��ų�޾ƿ���
	public void setSkill(String skill) {
		this.skill = skill;
	}

	
	//�̱��� ����
	public static ArrayList<Teacher> getInstance() {
		
		return instance;
	}	
	
	//������ �߰��ع�����
	public static void addTeacher(String name, int age, String skill) {
						
		Teacher new_teacher = new Teacher(name,age,skill);
		instance.add(new_teacher);		
		
	}
	
	//���� �޼ҵ�
	public static void deleteTeacher(int no) {
		instance.remove(no);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[�̸� : ");
		builder.append(name);
		builder.append(", ���� : ");
		builder.append(age);
		builder.append(", Ư���ɷ� : ");
		builder.append(skill);
		builder.append(" ]");
		return builder.toString();
	}	
}
