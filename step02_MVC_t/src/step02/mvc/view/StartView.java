package step02.mvc.view;

import step02.mvc.controller.Controller;

public class StartView {

	public static void main(String[] args) {
		 Controller con = new Controller();
		 System.out.println("--- ģ�� ���� �˻� ��û --- ");
		 con.request(1);
		 
		 System.out.println("\n--- ģ�� ���� ���� ��û --- ");
		 con.request(2);
		 
		 System.out.println("\n--- �߸��� �˻� ��û --- ");
		 con.request(8);
	}

}
