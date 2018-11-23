package step06_exception;

public class Exception1 {
	
	public static void main(String[] args) {
		/* 방법 1 - 로딩할 수 있는 알고리즘 설계해서 직접 개발
		 * 	방법 2 - API에서 제공하는 것을 찾아서 써볼까
		 * 			java.lang.Class 의 
		 * 			public static foName(String fileName)
		 * 			throws classNotFoundException{}
		 * 				parameter로 유입되는 파일 존재 - 메모리 로딩
		 * 
		 * 			- API 설계자 관점에 개발
		 * 				고려사항
		 * 				1. byte code가 메모리에 할당
		 * 				2. 파일명 오류가 있을수도 있으니 고려 필수
		 */
		try {
		Class.forName("step01.A");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


class A{
	private A() {	
	}
	static {
		System.out.println("A 실행 파일은 메모리에 저장 완료");
	}
}