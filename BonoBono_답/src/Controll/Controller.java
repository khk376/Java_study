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


	//선생 전체출력
	public void printallteacher(ArrayList<Teacher> list) {
		
		ev.printmsg(inforeturn.printTeacher(list));
		
	}
	
	//학생 전체출력
	public void printallstudent(ArrayList<Student> list) {
		
		ev.printmsg(inforeturn.printStudent(list));
		
	}
	
	
	// // 1. 아래 검색 / 변경 / 추가 기능들에서 Exception 코드 삭제 후 채워넣기
	// // 2. searchinfo 코드 내용을 삭제 후 채워넣기
	// // 3. 전공자를 위한 심화문제의 경우 삭제/반변경/입학/고용을 전부 
	// //    public void infoC(){} 를 복붙하여 4개 주고 알아서 채워넣기  
	
	
	// 학생 또는 선생님 검색
	public void searchinfo(String name) {
		try {
		ev.printmsg(inforeturn.search(name));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	// infochang에 있는 모든 메소드들은
	// 이름이 아니라 파라미터 값으로 구별이 가능하다

	// 삭제 메소드
	public void infoC(String name) {

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
	public void infoC(String name, int age, int group) {
		try {
			ev.printmsg(infochange.newStudent(name, age, group));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 선생님 고용
	public void infoC(String name, int age, String skill) {
		try {
			ev.printmsg(infochange.hireTeacher(name, age, skill));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
