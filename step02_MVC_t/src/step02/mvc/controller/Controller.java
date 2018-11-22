package step02.mvc.controller;

import step02.mvc.model.Model;
import step02.mvc.view.EndView;

public class Controller {
	
	Model m = new Model();
	EndView view = new EndView();
	
	public void request(int reqNo) {
		if(reqNo == 1) {
			 view.personView(m.getData());
		}else if(reqNo == 2) {
			m.setData(20);
			view.msgPrint("나이값 수정 완료");
		}else {
			view.msgPrint("요청하신 로직은 처리 불가입니다");
		}
	}
	
}




