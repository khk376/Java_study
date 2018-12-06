package step02.mvc.view;

import step02.mvc.controller.Controller;

public class StartView {

	public static void main(String[] args) {
		 Controller con = new Controller();
		 System.out.println("--- 친구 정보 검색 요청 --- ");
		 con.request(1);
		 
		 System.out.println("\n--- 친구 나이 수정 요청 --- ");
		 con.request(2);
		 
		 System.out.println("\n--- 잘못된 검색 요청 --- ");
		 con.request(8);
	}

}
