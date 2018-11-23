package controll;

import java.util.ArrayList;

import database.Student;
import database.Teacher;
import model.InfoChange;
import model.InfoReturn;
import view.EndView;

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
	
	

	
	
	// �л� �Ǵ� ������ �˻�
	// �� �ڵ忡�� ������ �ִ�. ������ ã�� �����϶�.
	
	public void searchinfo(String name) throws Exception {
		
		ev.printmsg(inforeturn.search(name));
		
	}
	

	// infochange�� �ִ� ��� �޼ҵ����
	// �޼ҵ� �̸��� �ƴ϶� �Ķ���� ������ ������ �����ϴ�
	// �Ʒ� �޼ҵ���� �̸��� startView�� ������ ���ϰ�
	// �� �̸��� �׷������� ���� �� �ִ��� �ּ����� �����϶�.

	// ���� �޼ҵ�
	
	public void delefeInfo (String name) {

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
	public void iphakStudent(String name, int age, int group) {
		try {
			ev.printmsg(infochange.newStudent(name, age, group));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ������ ���
	public void hireTeacher(String name, int age, String skill) {
		try {
			ev.printmsg(infochange.hireTeacher(name, age, skill));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

