package step02.view;

import step02.controller.Controller;

public class StartView {
	public static void main(String[] args) throws Exception {
		//��ȿ ������(0~9), ��ȿ ������ �׽�Ʈ
		Controller.req(1);
		System.out.println("-----");
		Controller.req(2);
		System.out.println("-----");
		Controller.req(11);
		
	}
}
