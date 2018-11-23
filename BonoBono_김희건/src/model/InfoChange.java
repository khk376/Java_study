package model;

import java.util.ArrayList;

import database.Student;
import database.Teacher;

public class InfoChange {

	ArrayList<Teacher> t = Teacher.getInstance();
	ArrayList<Student> st = Student.getInstance();



	/* ????를 채워주세요
	 * 
	 * 새로운 선생님을 추가하는 메소드
	 * 
	 * 고려사항 
	 * 		-보노보노 학교는 매우 특이한 곳이다. 
	 * 		-아이들의 혼란을 막기위해 이름이 같은 선생님은 추가가 불가능 하며 
	 * 		-동시에 이름의 길이가 3글자 이하이면 추가가 불가능하다
	 * 		
	 *		예외처리는 두가지 경우를 구분하지 않는다. 
	 * 
	 */

	public String hireTeacher(String name, int age, String skill) throws Exception {
		int count = t.size();
			for (int i=0; i<count;i++) {
				if (t.get(i).getName().equals(name)&&t.get(i).getName().length()<=3) {
					throw new Exception(name + "는 우리와 함께할 수 없습니다.");
				}
			}
			
			Teacher.addTeacher(name, age, skill);
		
		return "성공적으로 선생님이 등록되었습니다.";
	}

	/* 이 코드는 문법적인 오류는 없다고 표시되지만
	 * 고려사항에 적힌 요소를 모두 만족시키지 못하는 치명적인 오류를 가진 코드입니다.
	 * 어떤 경우에 고려사항을 만족시킬 수 없는지  찾아내어 testcode를 주석으로 명시하고 메소드를 수정하세요.
	 * 
	 * 
	 * 새로운 학생을 추가하는 메소드
	 * 
	 * 고려사항 
	 * 		-버릇없는 아이들이 넘쳐나는 이시기 교권은 추락하고있다. 
	 * 		-아이들이 선생님의 이름을 마구 부를수 있는 상황이 되면 장난이 매우 심해질것을 우려한 보노보노 학교는 
	 * 		
	 * 		-"아이들과 선생님의 이름이 같은것은 허용하지 않는다."
	 * 		-"또한 아이들끼리의 이름이 같은것 역시 허용하지 않는다."
	 * 		
	 * 		아이들과 이름이 같아서 등록을 못 할때
	 * 		선생님과 이름이 같아서 등록을 못 할때를
	 * 		구분해서 알려주어야 한다.
	 * 
	 */

	public String newStudent(String name, int age, int group) throws Exception {
		for (int i = 0; i < t.size(); i++) {
			if (t.get(i).getName().equals(name)) {
				throw new Exception(" 선생님과 아이의 이름이 같을 수는 없습니다. ");
			}else if(st.get(i).getName().equals(name)) {
				throw new Exception(" 현재 같은 이름을 가진 아이가 학교에 존재합니다.");
			}
		}
		
		Student.addStudent(name, age, group);
		return "성공적으로 학생이 등록되었습니다.";
	}
	
	
	// 고려사항을 모두 만족하는 메소드를 코딩하시오.
	//
	// 이름을 입력받아서 삭제하는 메소드
	/*
	 * -고려사항 
	 * 		선생님을 삭제하는 메소드, 학생을 삭제하는 메소드 
	 * 		두개의 메소드를 만드는것은 비효율
	 * 이다
	 * 		보노보노 학교의 교칙상 동명이인이 나올 수는 없다.
	 * 		그러니 동명이인에 대해선 생각하지 않고
	 * 		선생님 list와 아이들 list를 모두 탐색하자
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
	 * 학생의 전공 Update 메소드
	 * 
	 * 학생의 반을 변경할 때에는
	 * 이름과 입력받아서 일치할 경우에 변경이 가능하게 만든다.
	 * 변경이 성공한 경우에는 "학생의 반이 성공적으로 변경되었습니다" 라는 메세지를 리턴하고
	 * 없는 이름일 경우 예외를 발생 시키자.
	 * 그런데 이름은 정확히 입력했으나 현재 소속된 반과 같은반으로 변경하려고 할 경우엔
	 * 오류발생은 하지말고 "이미 동일한 반에 소속되어있습니다" 라는 메세를 리턴하게하자.
	 * */
	public String update(String name, int group) throws Exception {
		for(int i =0 ; i<st.size(); i++) {
			if (st.get(i).getName().equals(name)) {
				if(st.get(i).getGroup()==group) {
					return "학생의 반이 성공적으로 변경되었습니다";
				} 
				st.get(i).setGroup(group);		
				return "이미 동일한 반에 소속되어있습니다";
			}
		}
		throw new Exception(" 오류 발생 ");
	}
}
