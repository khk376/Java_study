/* 학습 내용
 * 1. 객체 참조 변수의 기본 값(default)
 * 		- null
 * 2. String 객체의 data 비교
 * 3. 고려사항
 * 		- NullPointerException
 * 		- 사용 가능한 객체(instance)가 없음에도 변수, 메소드 호출 시 발생되는 예외
 */
package Step02_MVC;

public class Syntax04Equals {
	
	public static void main(String[] args) {
		//step01 - null 키워드 이해하기
		String s = "test";
		System.out.println(s);
		System.out.println(s.length());
		
		//step02 - 문자열 데이터 비교
		/*public boolean equals(String v){
		 * 		이 메소드를 보유한 String 객체와 parameter로 유입된
		 * 		데이터 비교
		 * }
		 */
		String d1 = "민석";
		String d2 = "민석";
		String d3 = "윤후";
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		
		//step03 - 기본 타입의 데이터들 값 비교 연산자(동등 비교 연산, ==)
		System.out.println(2==3);
	}
}
