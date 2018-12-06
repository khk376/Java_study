package step02.mvc.view;

import step01.ex.Person;

public class EndView {
	//EndView의 모든 메소드들은 Controller에서 호출해야 함
	
	//? 검색 메소드
	public void showresult(Person p) {
		System.out.println();
	}
	
	//? 수정 완료 출력 메소드
	public void revised(Person p) {
		System.out.println();
	}
	//? 1과 2가 아닌 경우의 출력 메소드
	public void err(Person p) {
		System.out.println();
	}
	
}
