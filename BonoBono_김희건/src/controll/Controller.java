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


	//선생 전체출력
	public void printallteacher(ArrayList<Teacher> list) {
		
		ev.printmsg(inforeturn.printTeacher(list));
		
	}
	
	//학생 전체출력
	public void printallstudent(ArrayList<Student> list) {
		
		ev.printmsg(inforeturn.printStudent(list));
		
	}
	
	

	
	
	// 학생 또는 선생님 검색
	// 이 코드에는 오류가 있다. 이유를 찾아 수정하라.
	
	public void searchinfo(String name) throws Exception {
		
		ev.printmsg(inforeturn.search(name));
		
	}
	

	// infochange에 있는 모든 메소드들은
	// 메소드 이름이 아니라 파라미터 값으로 구별이 가능하다
	// 아래 메소드들의 이름을 startView를 참조해 정하고
	// 왜 이름을 그런식으로 지을 수 있는지 주석으로 설명하라.

	// 삭제 메소드
	
	public void delefeInfo (String name) {

		try {
			ev.printmsg(infochange.delete(name));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 학생 반 변경
	public void infoC(String name, int group) {
		try {
			ev.printmsg(infochange.update(name, group));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 학생 입학
	public void iphakStudent(String name, int age, int group) {
		try {
			ev.printmsg(infochange.newStudent(name, age, group));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 선생님 고용
	public void hireTeacher(String name, int age, String skill) {
		try {
			ev.printmsg(infochange.hireTeacher(name, age, skill));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

