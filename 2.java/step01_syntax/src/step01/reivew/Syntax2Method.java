/* 학습내용
 * 1. 기능 구현 하는 메소드 문법 습득하기
 * 2. 문법
 * 		1. 개발(구현)
 * 				반환타입 메소드명([argument or parameter or 매개변수]){}
 * 		2. 호출
 * 			1. 사용자 정의 메소드 호출
 * 			2. API에서 제공하는 메소드 호출
 * 
 */
package step01.reivew;

public class Syntax2Method {
	//1. 두개의 데이터를 더하기
	/* 고려사항
	 * 1. 가변적인 데이터인가요?
	 * 		1. 아니다. 고정데이터다.
	 * 		2. 맞다.
	 * 2. 더한 결과값은 어찌 표현?
	 * 		1. 그냥 두기
	 * 		2. 단순 출력
	 * 		3. 기능을 요청한 곳으로 값을 되돌리기(return)
	 * 		...
	 */
	//반환값 없이 고정데이터 더하기
	void sum() {
		int no1=10;
		int no2=20;
		int no3=no1+no2;
	}
	//반환값 없이 가변적인 데이터 더하기
	void sum(int n1, int n2) { //반환값 없을땐 void
		int n3 = n1+n2;
		System.out.println(n3);
	}
	//반환값 있고 가변적인 데이터 더하기
	int sum2(int n1, int n2) { //type 맞춰서 int로 변경 (n3은 int type)
		int n3 = n1+n2;
		return n3;
	}
	//? 김태성, 25 두개의 데이터를 받아서 출력 : 이름:김태성 나이:25
	// 가변적인 데이터 출력하는 기능의 메소드
	// printInfo 
	void printInfo(String name, int age) {
		System.out.println("이름:" + name + " 나이:" + age);
	}
	public static void main(String[] args) {
		Syntax2Method s =new Syntax2Method();
		s.sum();
		s.sum(30,20);
		
		int r= s.sum2(10, 80);
		System.out.println(r);
		
		s.printInfo("김태성",25);
		}//end of main
		
}//end of class
