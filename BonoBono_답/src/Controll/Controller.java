package Controll;

import java.util.ArrayList;

import Database.Student;
import Database.Teacher;
import Model.InfoChange;
import Model.InfoReturn;
import View.EndView;

public class Controller {

	InfoChange infochange = new InfoChange();
	InfoReturn inforeturn = new InfoReturn();
	EndView ev = new EndView();


	//���� ��ü���
	public void printallteacher(ArrayList<Teacher> list) {
		
		ev.printmsg(inforeturn.printTeacher(list));
		
	}
	
	//�л� ��ü���
	public void printallstudent(ArrayList<Student> list) {
		
		ev.printmsg(inforeturn.printStudent(list));
		
	}
	
	
	// // 1. �Ʒ� �˻� / ���� / �߰� ��ɵ鿡�� Exception �ڵ� ���� �� ä���ֱ�
	// // 2. searchinfo �ڵ� ������ ���� �� ä���ֱ�
	// // 3. �����ڸ� ���� ��ȭ������ ��� ����/�ݺ���/����/����� ���� 
	// //    public void infoC(){} �� �����Ͽ� 4�� �ְ� �˾Ƽ� ä���ֱ�  
	
	
	// �л� �Ǵ� ������ �˻�
	public void searchinfo(String name) {
		try {
		ev.printmsg(inforeturn.search(name));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	// infochang�� �ִ� ��� �޼ҵ����
	// �̸��� �ƴ϶� �Ķ���� ������ ������ �����ϴ�

	// ���� �޼ҵ�
	public void infoC(String name) {

		try {
			ev.printmsg(infochange.delete(name));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �л� �� ����
	public void infoC(String name, int group) {
		try {
			ev.printmsg(infochange.update(name, group));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �л� ����
	public void infoC(String name, int age, int group) {
		try {
			ev.printmsg(infochange.newStudent(name, age, group));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ������ ���
	public void infoC(String name, int age, String skill) {
		try {
			ev.printmsg(infochange.hireTeacher(name, age, skill));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
