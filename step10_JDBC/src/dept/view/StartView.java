package dept.view;

import dept.controller.DeptController;

public class StartView {

	public static void main(String[] args) {
		DeptController controller = DeptController.getInstance();

		System.out.println("*** 1. 모든 검색 ***");
		controller.selectAllReqRes();
		System.out.println("*** 2. 저장 시도 ***");
		controller.insertReqRes(60, "hr", "서초");

		System.out.println("*** 3. 모든 검색 ***");
		controller.selectAllReqRes();
		System.out.println("*** 4. 삭제 ***");
		// controller.deleteReqRes(56);
		
		System.out.println("*** 5. 모든 검색 ***");
		controller.selectAllReqRes();
	}

}
