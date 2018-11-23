package model;

import java.util.ArrayList;

import database.Student;
import database.Teacher;

public class InfoReturn {
	ArrayList<Teacher> t = Teacher.getInstance();
	ArrayList<Student> st = Student.getInstance();
	
	//������ ���� ���
	public String printTeacher(ArrayList<Teacher> list) {
		String result = "***������ ��� \n";
		for(int i =0; i < list.size(); i++) {
			result = result + list.get(i).toString() + "\n";
		}
		return result;
	}
	
	//�л����� ���
	public String printStudent(ArrayList<Student> list) {
		String result = "***�л� ��� \n";
		for(int i =0; i < list.size(); i++) {
			result = result + list.get(i).toString() + "\n";
		}
		return result;
	}
	
	// �̸����� ���� �˻� 
	// ������� - �̸��� ������ �����߻�
	public String search(String name) throws Exception {
		for(int i =0 ; i<t.size(); i++) {
			if (t.get(i).getName().equals(name)) {
				return t.get(i).toString();
			}
		}
		for(int i =0 ; i<st.size(); i++) {
			if (st.get(i).getName().equals(name)) {
				st.remove(i);
				return st.get(i).toString();
			}
		}
		throw new Exception("�߸��� �Է��Դϴ�.");
	}
}