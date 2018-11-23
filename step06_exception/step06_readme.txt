학습내용

1. 실행시 발생 가능한 경우의 수를 코드로 사전에 방지 기술
2. 금기해야 할 항목
	- 문제 발생시 프로그램 자체가 종료 되는 상황이 발생 금지
3. 예외처리
	- 발생 가능한 상황을 exception(예외)라고 표현
	- 예외 처리를 코드로 핸들링 하는 기술
4. 개발 및 실행시 발생된 문제 사항
	예외 발생 시점
	1. 문법 오류
		- ~예외 라는 메세지로 컴파일 불가인 상황
		예외처리 문장 필수! try~catch~finally
	2. 실행 오류(런타임 예외)
		- try~catch 처리 문장 옵션
		- *** API간의 관계
			java.lang.RuntimeException의 하위 클래스들이 실행 예외
		- NullPointerException
		- 해결책
			데이터값 수정 
			
5. ClassNotFoundException은 클래스일까요 아닐까요?

	java.lang.Class
		public static Class forName(String saveFileName) 
		throws ClassNotFoundException { //throws 메세지 생성 구
			존재하는 파일인 경우 메모리에 저장(로딩)
			미존하는 파일인 경우 예외를 발생해서 사용자에게 알려줌
				throw new ClassNotFoundException();
				
		}
		
		FileNotFoundException
		new FileReader("a.txt")
		
		