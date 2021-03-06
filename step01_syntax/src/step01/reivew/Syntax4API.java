/* 학습내용
 * ***
 * 		java/python
 * 		- 문자열에 index를 부여
 * 		- 시작 index 0
 * 
 * 1. java API 활용 연습
 * 2. java.lang.String 클래스의 메소드
 * 		1. 관점 : API 만든 개발자 관점에서 이해
 * 		2. 주의사항
 * 			기능/반환타입/parameter(argument/매개변수/매개인자/인수)
 * 3. test 로직
 * 		1. 문자열에 index 즉, 철자의 위치값으로 해당 철자(음절)를 뽑기(반환)
 * 		2. 문자열 길이 확인
 * 		3. 문자열의 일부분을 뽑기
 * 			- 기능 수행을 위한 필요한 데이터
 * 				1. 문자열
 * 				2. 어떤 음절 위치~ 어떤 음절까지의 위치값(index)
 * 
 * 			- String a(int 시작위치, int 종료위치){}
 * 
 */
package step01.reivew;

public class Syntax4API {

	public static void main(String[] args) {
		//String 객체 생성 - class가 존재하는 모든 데이터는 무조건 객체
		String msg = "열공 12345 희건 끝";
		
		//존재하는 String 객체로부터 특정 데이터 char 값 반환 및 출력
		char c =msg.charAt(2);
		System.out.println(c);
		
		//문자열의 전체 길이값 출력
		System.out.println(msg.length());
		
		//문자열의 특정 일부 문자 도출 및 출력
		System.out.println(msg.substring(7,9));
		
		}
}




/*
View -> Controller -> Model -> Controller -> View 

로그인 로직 실행
첫 화면(view) ->
		인증요청 구분 (조절자:controller) -> 인증 처리 하는 로직 -> DB 
		-> 결과를 응답해주는 로직 -> 성공? 실패? 에 따른 화면 지정

결과 화면(view)

biz = model


*/

