package dept.view;

import dept.controller.DeptController;

public class StartView {

	public static void main(String[] args) {
		DeptController controller = DeptController.getInstance();

		System.out.println("*** 1. ��� �˻� ***");
		controller.selectAllReqRes();
		System.out.println("*** 2. ���� �õ� ***");
		controller.insertReqRes(60, "hr", "����");

		System.out.println("*** 3. ��� �˻� ***");
		controller.selectAllReqRes();
		System.out.println("*** 4. ���� ***");
		// controller.deleteReqRes(56);
		
		System.out.println("*** 5. ��� �˻� ***");
		controller.selectAllReqRes();
	}

}
