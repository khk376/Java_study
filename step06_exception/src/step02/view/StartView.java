package step02.view;

import step02.controller.Controller;

public class StartView {
	public static void main(String[] args) throws Exception {
		//유효 범위값(0~9), 무효 범위값 테스트
		Controller.req(1);
		System.out.println("-----");
		Controller.req(2);
		System.out.println("-----");
		Controller.req(11);
		
	}
}
