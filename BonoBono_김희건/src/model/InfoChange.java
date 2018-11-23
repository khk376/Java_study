package model;

import java.util.ArrayList;

import database.Student;
import database.Teacher;

public class InfoChange {

	ArrayList<Teacher> t = Teacher.getInstance();
	ArrayList<Student> st = Student.getInstance();



	/* ????�� ä���ּ���
	 * 
	 * ���ο� �������� �߰��ϴ� �޼ҵ�
	 * 
	 * ������� 
	 * 		-���뺸�� �б��� �ſ� Ư���� ���̴�. 
	 * 		-���̵��� ȥ���� �������� �̸��� ���� �������� �߰��� �Ұ��� �ϸ� 
	 * 		-���ÿ� �̸��� ���̰� 3���� �����̸� �߰��� �Ұ����ϴ�
	 * 		
	 *		����ó���� �ΰ��� ��츦 �������� �ʴ´�. 
	 * 
	 */

	public String hireTeacher(String name, int age, String skill) throws Exception {
		int count = t.size();
			for (int i=0; i<count;i++) {
				if (t.get(i).getName().equals(name)&&t.get(i).getName().length()<=3) {
					throw new Exception(name + "�� �츮�� �Բ��� �� �����ϴ�.");
				}
			}
			
			Teacher.addTeacher(name, age, skill);
		
		return "���������� �������� ��ϵǾ����ϴ�.";
	}

	/* �� �ڵ�� �������� ������ ���ٰ� ǥ�õ�����
	 * ������׿� ���� ��Ҹ� ��� ������Ű�� ���ϴ� ġ������ ������ ���� �ڵ��Դϴ�.
	 * � ��쿡 ��������� ������ų �� ������  ã�Ƴ��� testcode�� �ּ����� ����ϰ� �޼ҵ带 �����ϼ���.
	 * 
	 * 
	 * ���ο� �л��� �߰��ϴ� �޼ҵ�
	 * 
	 * ������� 
	 * 		-�������� ���̵��� ���ĳ��� �̽ñ� ������ �߶��ϰ��ִ�. 
	 * 		-���̵��� �������� �̸��� ���� �θ��� �ִ� ��Ȳ�� �Ǹ� �峭�� �ſ� ���������� ����� ���뺸�� �б��� 
	 * 		
	 * 		-"���̵�� �������� �̸��� �������� ������� �ʴ´�."
	 * 		-"���� ���̵鳢���� �̸��� ������ ���� ������� �ʴ´�."
	 * 		
	 * 		���̵�� �̸��� ���Ƽ� ����� �� �Ҷ�
	 * 		�����԰� �̸��� ���Ƽ� ����� �� �Ҷ���
	 * 		�����ؼ� �˷��־�� �Ѵ�.
	 * 
	 */

	public String newStudent(String name, int age, int group) throws Exception {
		for (int i = 0; i < t.size(); i++) {
			if (t.get(i).getName().equals(name)) {
				throw new Exception(" �����԰� ������ �̸��� ���� ���� �����ϴ�. ");
			}else if(st.get(i).getName().equals(name)) {
				throw new Exception(" ���� ���� �̸��� ���� ���̰� �б��� �����մϴ�.");
			}
		}
		
		Student.addStudent(name, age, group);
		return "���������� �л��� ��ϵǾ����ϴ�.";
	}
	
	
	// ��������� ��� �����ϴ� �޼ҵ带 �ڵ��Ͻÿ�.
	//
	// �̸��� �Է¹޾Ƽ� �����ϴ� �޼ҵ�
	/*
	 * -������� 
	 * 		�������� �����ϴ� �޼ҵ�, �л��� �����ϴ� �޼ҵ� 
	 * 		�ΰ��� �޼ҵ带 ����°��� ��ȿ��
	 * �̴�
	 * 		���뺸�� �б��� ��Ģ�� ���������� ���� ���� ����.
	 * 		�׷��� �������ο� ���ؼ� �������� �ʰ�
	 * 		������ list�� ���̵� list�� ��� Ž������
	 * 
	 */
	public String delete(String name) throws Exception {
		int count2=t.size()+st.size();
		for(int i=0; i<count2;i++) {
			if(t.get(i).getName().equals(name)) {
				t.remove(i);
				st.remove(i);
			}
			
		}
		return name;
		
	
	}
	/*
	 * �л��� ���� Update �޼ҵ�
	 * 
	 * �л��� ���� ������ ������
	 * �̸��� �Է¹޾Ƽ� ��ġ�� ��쿡 ������ �����ϰ� �����.
	 * ������ ������ ��쿡�� "�л��� ���� ���������� ����Ǿ����ϴ�" ��� �޼����� �����ϰ�
	 * ���� �̸��� ��� ���ܸ� �߻� ��Ű��.
	 * �׷��� �̸��� ��Ȯ�� �Է������� ���� �Ҽӵ� �ݰ� ���������� �����Ϸ��� �� ��쿣
	 * �����߻��� �������� "�̹� ������ �ݿ� �ҼӵǾ��ֽ��ϴ�" ��� �޼��� �����ϰ�����.
	 * */
	public String update(String name, int group) throws Exception {
		for(int i =0 ; i<st.size(); i++) {
			if (st.get(i).getName().equals(name)) {
				if(st.get(i).getGroup()==group) {
					return "�л��� ���� ���������� ����Ǿ����ϴ�";
				} 
				st.get(i).setGroup(group);		
				return "�̹� ������ �ݿ� �ҼӵǾ��ֽ��ϴ�";
			}
		}
		throw new Exception(" ���� �߻� ");
	}
}
