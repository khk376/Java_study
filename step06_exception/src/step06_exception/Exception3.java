/*학습내용
 * 1. 예외 처리 문법 습득
 * 		1. 예외가 발생될수도 있는 로직의 메소드 내에서 처리
 * 		2. 예외가 발생될수도 있는 로직의 메소드를 호출한 곳으로 예외 처리 위임
 * 
 * 2. 예외처리 문법
 * 		1. try{
 * 				처리 로직 단, 예외가 발생될 수 있는 가능성 있는 코드들
 * 			}catch(발생될 수도 있는 예외타입 변수) {
 * 				예외 발생시 처리문장
 * 			}
 * 
 * 		2. 예외 발생 여부와 무관하게 100% 실행 보장인 문법
 * 			혹여 로직상에서 시스템 자원을 활용후에 반납(자원반환) 로직을 
 * 			finally{}에 개발
 * 			try{
 * 			}catch(){
 * 			}finally{
 * 				100% 실행보장
 * 			}
 * 		3. 예외가 발생될 수도 있는 메소드 호출시 호출한 곳으로 예외 처리 위임
 * 			public void 메소드() throws ~ Exception{}
 * 			try{
 * 				메소드();
 * 			}catch(~Exception e) {
 * 			}
 */
package step06_exception;

public class Exception3 {
	//m1 - try~catch~finally
	//id값 검증 로직이라 가정
	/*	1. 검증 결과를 true/false로 반환
	 * 2. 검증해서 존재한다면 정상 실행, 미존재할 경우 예외를 발생
	 */
	public static void m1(String id) {
		if(id.equals("master")) {//master가 아닐 때만 true
		try{ 
			//다른 로직들이 있다 가정..
			throw new Exception("윤후야 오늘 왜그래~~");
		}catch(Exception e) {
			e.printStackTrace();//발생된 예외의 내부 모든 실행 흐름
			System.out.println("id 오류");
		}finally {
			System.out.println("100%실행 보장");
	}//또 다른 로직들이 있다 가정 {
		}
	}
	
	//m2 - 예외 발생되면 throws로 예외 던지기
	//문자열의 length()가 3 이하면 Exception 발생해서 던지기
	//3 초과면 유효 메시지 단순 출력
	public static void m2(String data) throws Exception {
		int length=data.length();
		if(length<=3) {
			throw new Exception("무효");
		}else {
			System.out.println("유효");
		}
			
	}
	public static void m3() throws ArrayIndexOutOfBoundsException {
	int [] i = {1,2,3};
	
	//step02 - 혹여 예외 발생시 직접 처리
/*	try {
		System.out.println(i[8]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("무효한 배열의 index 값입니다.");
	}
}*/

	//step03 - 예외 발생시 호출한 영역으로 처리 위임
	System.out.println(i[3]);
	}
	public static void m5() throws ClassNotFoundException {
		Class.forName("step01.AAA");
	}
	//m3 - API에서 제공하는 메소드등 활용, 예외 클래스들 종류 및 상위 타입	
	public static void main(String[] args) {
		m3();//메소드 선언구에서 throws try 옵션
		
		try {
			m5();
		}catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			m2("test");
			m2("e");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	/*	System.out.println("-----예외발생 test------");
		m1("ㄱㅎㅁㅎ");
		System.out.println("-----예외 미발생 test-----");
		m1("master");*/
	}
}
