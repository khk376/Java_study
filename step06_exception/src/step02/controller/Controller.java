package step02.controller;

import step01.model.domain.CustomerDTO;
import step02.model.Model;
import step02.view.EndView;

public class Controller {
	//여러 요청을 처리하는 조절자라 가정

	// 검색 요청이 들어오면 요청 수락 -> 핵심 기능한테 지시 -> 결과받고 -> 유무성 검증 -> view 지정
	//1로 요청시 getDatas() 실행
	//1이 아닌 값으로 요청시 getDatas1() 호출
	public static void req(int reqNo) throws Exception {
		CustomerDTO[] datas=Model.getDatas();
		//단순 view에게 출력 위임
		
		/* 데이터가 null 여부확인 후에 null 아니면 정상 데이터 출력
		 * null인 경우 요청하신 정보는 없습니다. 출력
		 * 
		 * getDatas2() 결과 및 반환
		 * 1. 예외 발생
		 * 		*** try ~ catch 문장은 필수
		 * 		1. 실제 예외 발생
		 * 		2. 예외 없이 정상 실행
		 * 2. 정상 실행
		 * 		1. 데이터가 반환 - CustomerDTO배열 객체
		 * 		2. 데이터 없이 반환 - null
		 */
		CustomerDTO[] datas2=null;
		try { datas2= Model.getDatas2(reqNo);
		}catch(Exception e) {
			e.printStackTrace();
			EndView.msgPrint("실행시 문제 발생 재 요청해 주세요.");
		}
		/* 0~9 까지의 요청 처리 로직
		 * 예외에 대한 처리 로직 아님
		 */
		if(datas2 !=null) { 
			EndView.dataPrint(datas2);
		}else {
			EndView.msgPrint("요청하신 정보가 없습니다.");
		}
	}
}
