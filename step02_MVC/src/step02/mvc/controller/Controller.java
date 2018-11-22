package step02.mvc.controller;

import step01.ex.Person;
import step02.mvc.model.Model;
import step02.mvc.view.EndView;

public class Controller {
	/* 1번 요청 - Person 정보 검색
	 * 2번 요청 - 나이값 수정
	 * 하나의 메소드에서 구분해서 Model의 메소드를 구분해서 실행 요청
	 * 실행 결과를 EndView 출력을 위임
	 */
	public void request(int reqNo) {
		Model m = new Model();
		EndView ev= new EndView();
		
		if(reqNo==1) {
			Person p = m.getData("원정", 25);
			ev.showresult(p);
		}else if(reqNo ==2) {
			Person p = m.getData("희건", 26);
			ev.showresult(p);
			
			m.setData(p, 30);
			ev.revised(p);
		}else {
			
		}
	}
}//end of class
