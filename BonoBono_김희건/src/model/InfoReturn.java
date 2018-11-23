package model;

import java.util.ArrayList;

import database.Student;
import database.Teacher;

public class InfoReturn {
	ArrayList<Teacher> t = Teacher.getInstance();
	ArrayList<Student> st = Student.getInstance();
	
	//선생님 정보 출력
	public String printTeacher(ArrayList<Teacher> list) {
		String result = "***선생님 명단 \n";
		for(int i =0; i < list.size(); i++) {
			result = result + list.get(i).toString() + "\n";
		}
		return result;
	}
	
	//학생정보 출력
	public String printStudent(ArrayList<Student> list) {
		String result = "***학생 명단 \n";
		for(int i =0; i < list.size(); i++) {
			result = result + list.get(i).toString() + "\n";
		}
		return result;
	}
	
	// 이름으로 정보 검색 
	// 고려사항 - 이름이 없을시 에러발생
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
		throw new Exception("잘못된 입력입니다.");
	}
}