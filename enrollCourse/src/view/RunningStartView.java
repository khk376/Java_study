package view;

import service.Controller;

public class RunningStartView {
	static Controller c = Controller.getInstance();

	public static void main(String[] args) {
		RunningEndView.printMsg("----------������û �ý���----------");
		c.login();
		RunningEndView.printMsg("�ý����� �����մϴ�.");
	}
}