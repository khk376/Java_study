package view;

import service.Controller;

public class RunningStartView {
	static Controller c = Controller.getInstance();

	public static void main(String[] args) {
		RunningEndView.printMsg("----------수강신청 시스템----------");
		c.login();
		RunningEndView.printMsg("시스템을 종료합니다.");
	}
}