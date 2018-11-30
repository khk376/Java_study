package Model;

import java.util.ArrayList;

import Database.Student;
import Database.Teacher;

public class InfoChange {
	int j = 0;
	ArrayList<Teacher> t = Teacher.getInstance();
	ArrayList<Student> st = Student.getInstance();



	/*
	 * ���ο� �������� �߰��ϴ� �޼ҵ�
	 * 
	 * ������� 
	 * 		-���뺸�� �б��� �ſ� Ư���� ���̴�. 
	 * 		-���̵��� ȥ���� �������� �̸��� ���� �������� �߰��� �Ұ��� �ϸ� 
	 * 		-���ÿ� �̸��� ���̰� 3���� �����̸� �߰��� �Ұ����ϴ�
	 * 		
	 *		����ó���� �ΰ��� ��츦 �������� �ʴ´�. 
	 * 
	 * 		�Ʒ� �ڵ带 �����ϰ�, StartView���� ������ "���" �� "���� ��δ�" �߰� �õ��� Exception �߻���Ű��
	 */

	public String hireTeacher(String name, int age, String skill) throws Exception {

			for (int i = 0; i < t.size(); i++) {
				if (!t.get(i).getName().equals(name) || name.length() <= 3) {
					throw new Exception(name + "�� �츮�� �Բ��� �� �����ϴ�.");
				}
			}
			
		Teacher.addTeacher(name, age, skill);
		return "���������� �������� ��ϵǾ����ϴ�.";
	}

	/*
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
	 * 		
	 * 		"�߿��� ��" �� �л����� ��Ͻ� Exception �߻�
	 * 		"���뺸��" �� �л����� �߰���Ͻ� Exception �߻�
	 */

	public String newStudent(String name, int age, int group) throws Exception {
		
		for (int i = 0; i < t.size(); i++) {
			if (t.get(i).getName().equals(name)) {
				throw new Exception(" �����԰� ������ �̸��� ���� ���� �����ϴ�. ");
				
			}
		}	
		
		for (int j = 0; j < st.size(); j++) {
			if (st.get(j).getName().equals(name)) {
				throw new Exception(" ���� ���� �̸��� ���� ���̰� �б��� �����մϴ�.");
					
			}
		}
		Student.addStudent(name, age, group);
		return "���������� �л��� ��ϵǾ����ϴ�.";
	}
	// �̸��� �Է¹޾Ƽ� �����ϴ� �޼ҵ�
	/*
	 * -������� 
	 * 		�ΰ��� �޼ҵ带 ����°��� ��ȿ�����̴�
	 * 		���뺸�� �б��� ��Ģ�� ���������� ���� ���� ����.
	 * 		�׷��� �������ο� ���ؼ� �������� �ʰ�
	 * 		������ list�� ���̵� list�� ��� Ž������
	 * 
	 */
	public String delete(String name) throws Exception {
		if (t != null && st != null) {
			for(int i =0 ; i<t.size(); i++) {
				if (t.get(i).getName().equals(name)) {
					t.remove(i);
					return "���������� �������� ���ŵǾ����ϴ�.";
			}
		}
			for(int i =0 ; i<st.size(); i++) {
				if (st.get(i).getName().equals(name)) {
					st.remove(i);
					return "���������� �л��� ���ŵǾ����ϴ�.";
			}
		}
		}
		throw new Exception("��Ͽ� �������� �ʴ� ��û�Դϴ�.");
	}
	/*
	 * �л��� ���� Update �޼ҵ�
	 * 
	 * �л��� ���� ������ ������
	 * �̸��� �Է¹޾Ƽ� ��ġ�� ��쿡 ������ �����ϰ� �����.
	 * �׷��� ���������� �����Ϸ��� �� ��쿣
	 * �����߻��� �������� "�̹� ������ �ݿ� �ҼӵǾ��ֽ��ϴ�" ��� �޼����� ��µǰ� ����
	 * */
	public String update(String name, int group) throws Exception {
		for(int i =0 ; i<st.size(); i++) {
			if (st.get(i).getName().equals(name)) {
				if(st.get(i).getGroup()==group) {
					return "�̹� ������ �ݿ� �ҼӵǾ��ֽ��ϴ�.";
				}
				st.get(i).setGroup(group);		
				return "���������� ���� ����Ǿ����ϴ�.";
			}
		}
		throw new Exception("�߸��� �Է��Դϴ�.");	
	}
}
