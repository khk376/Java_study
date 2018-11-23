package step06_exception;

public class Exception2 {
	
	public static void main(String[] args) {
		//연산 오류시 컴파일 정상 -> 실행시 예외 발생
		//해결책 : 유효한 숫자로 나누기, 별도의 예외 처리 문장 불필요(옵션)
		//System.out.println(10/2);
		
		//메모리에 class 라는 byte code 로딩시 컴파일 자체가 불가
		//해결책 : 무조건 무조건 무조건 !! 예외처리 문장 필수!!(try~catch)
		//왜?
		
		System.out.println(1);
	
		try {
			System.out.println(2);
			Class.forName("step01.A");
			System.out.println(3);
			
		} catch (ClassNotFoundException e) {
			System.out.println(4);
			e.printStackTrace();
		}
		
		System.out.println(5);
	}
}
