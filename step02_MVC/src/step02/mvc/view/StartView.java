package step02.mvc.view;

import step02.mvc.controller.Controller;

public class StartView {
	
	public static void main(String[] args) {
		Controller c = new Controller();
		
		c.request(1);
		c.request(2);
		c.request(8);
	}
}
