package step02.mvc.view;

import step01.ex.Person;

public class EndView {
	//EndView의 모든 메소드들은 Controller에서 호출해야 함
	//? 검색 결과 출력
	public void personView(Person p) {
		System.out.println(p.getName() + " " + p.getAge());
	}
	//? 수정 완료 출력 메소드
	//? 1과 2가 아닌 경우의 출력 메소드
	public void msgPrint(String msg) {
		System.out.println(msg);
	}
}
