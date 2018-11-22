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
			view.msgPrint("���̰� ���� �Ϸ�");
		}else {
			view.msgPrint("��û�Ͻ� ������ ó�� �Ұ��Դϴ�");
		}
	}
	
}




