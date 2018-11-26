/* client로 부터 view 화면을 통해서 요청 받고
 * 요청에 따른 biz(model) 로직 실행
 * 실행 결과값을 받아서 유효성 검증
 * 유효 - SuccessView
 * 무효 - FailView
 * 처리 위임
 * 
 * 설계
 * 1. 각 요청별(crud) 처리 메소드 따로 개발? 하나로?
 * 2. 예외 발생시 어떤 예외 메시지 생성해서 FailView에게 출력 위임?
 * 
 */
package dept.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import dept.model.DeptDAO;
import dept.model.domain.DeptDTO;
import dept.view.FailView;
import dept.view.SuccessView;

public class DeptController {
	private static DeptController instance = new DeptController();
	private DeptController() {	}
	public static DeptController getInstance() {
		return instance;
	}
	//모든 검색 메소드
	public void selectAllReqRes() {
		try {
			ArrayList<DeptDTO> datas = DeptDAO.selectAll();
			if(datas.size()!= 0) {//검색 데이터가 존재할 경우
				SuccessView.allDataPrint(datas);
			}else {//검색 데이터가 없는 경우
				SuccessView.msg("요청하신데이터들은 미존재합니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			FailView.errorMsg("모든 검색 실패, 잠시 후 다시 시도해 주세요.");
		}
	}
	
	//저장 요청 조절 메소드
	
	public void insertReqRes(int deptno, String dname, String loc) {
		try {
			int result = DeptDAO.insert(new DeptDTO(deptno, dname, loc));
			if(result ==1) {
				SuccessView.msg("안녕하세요, 새로운 부서 등록 완료"); //저장, 정상실행
			}else {
				SuccessView.msg("아쉽게도 저장이 안되었습니다"); // 비저장, 정상실행
			}
		} catch (SQLException e) { // 비저장, 비정상실행
			e.printStackTrace();
			FailView.errorMsg("저장 실행 실패, 잠시 후 유효한 데이터로 다시 시도해 주세요.");
		}
		
	}
	public void deleteReqRes(int deptno) {
		try {
			int result = DeptDAO.delete(new DeptDTO(deptno));
			if(result ==1) {
				SuccessView.msg("삭제 완료"); //저장, 정상실행
			}else {
				SuccessView.msg("삭제 실패"); // 비저장, 정상실행
			}
		} catch (SQLException e) { // 비저장, 비정상실행
			e.printStackTrace();
			FailView.errorMsg("삭제 실행 실패, 잠시 후 유효한 데이터로 다시 시도해 주세요.");
		}
}
}