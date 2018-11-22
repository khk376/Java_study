package step02.mvc.controller;

import step01.ex.Person;
import step02.mvc.model.Model;
import step02.mvc.view.EndView;

public class Controller {
	/* 1�� ��û - Person ���� �˻�
	 * 2�� ��û - ���̰� ����
	 * �ϳ��� �޼ҵ忡�� �����ؼ� Model�� �޼ҵ带 �����ؼ� ���� ��û
	 * ���� ����� EndView ����� ����
	 */
	public void request(int reqNo) {
		Model m = new Model();
		EndView ev= new EndView();
		
		if(reqNo==1) {
			Person p = m.getData("����", 25);
			ev.showresult(p);
		}else if(reqNo ==2) {
			Person p = m.getData("���", 26);
			ev.showresult(p);
			
			m.setData(p, 30);
			ev.revised(p);
		}else {
			
		}
	}
}//end of class
