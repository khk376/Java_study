/* 학습 내용
 * 	* class 내부 구성 요소
 * 		변수(옵션) : 데이터
 * 		생성자(필수) : 객체 셍성
 * 		메소드(옵션) : 기능
 * 		static{}(옵션)
 * 
 * 1. main메소드 필요성
 * 2. 자바 문법 변수
 * 		- 이름/나이
 * 3. 생성자
 * 4. 실행 로직
 * 		1단계 : 변수 선언 및 초기화(값 대입, =)
 * 			pl sql - 할당, 초기화, :=
 *		2단계 : 활용(출력)
 *			메모리에 변수 공간 확보(생성)
 *			생성된 메모리에 값 대입하는 로직 실제 실행
 *			메모리로 부터 데이터값 가져와서 콘솔창에 출력
 * 5. 문법
 * 		1. package 문법
 * 			-package 패키지이름;
 * 		2. class 문법
 * 			- class 프로그램이름{}
 * 		3. 변수 문법
 * 			3-1. 타입 변수명 [=값];
 * 			3-2. 데이터 타입
 * 				1. 제공받은 타입 : int(정수)/String(문자열)
 * 				2. 사용자 정의 타입 : 개발자가 만드는 클래스들은 타입으로 사용 가능
 * 									Syntax1Variable(name/age)
 * 		4. 연산자
 * 			= : 대입연산자
 * 			. : 접근연산자
 * 			new : 객체 생성 연산자 
 */
package step01;

public class SyntaxVariable {
	//이름을 표현하는 변수
	String name = "민석";
	//나이를 표현하는 변수
	int age =26;
	
	//기본 생성자 - 객체 생성시 호출되는 구성 요소
	//객체 생성 사유 - 실제 사용을 위해 메모리에 생성시키는 작업
	//미 코딩시 필수 구성 요소라 컴파일러가 자동 추가
	SyntaxVariable(){}
	
	public static void main(String[] args)/*3번.*/{
		//*** 실제 사용 가능하게 시스템에 메모리 생성 및 데이터 저장
		// 생성자를 호출해서 name/age가 저장된 객체를 생성
		SyntaxVariable s= new SyntaxVariable();
			//1번.								2번.
		
		System.out.println(s.name);
		System.out.println(s);
		
		SyntaxVariable s2= new SyntaxVariable();
		s2.name="김혜경";
		System.out.println(s2.name);
		System.out.println(s2);
	}
}

/*
-문법정리
타입 변수명[=값];
타입 종류
		1. 문자열: string
		2. 정수: int
		3. 사용자 정의 타입
선언 위치
		1. class 중괄호 내부
					-멤버 변수
					-객체 생성시 heap라는 메모리에 저장
		2. main 메소드 내부
					-로컬 변수
					-선언된 메소드 내부에서만 사용 가능한 변수
					-s

		int a; //선언
		int b=3; //선언, 대입(초기화, 할당)
		
		S.o.p(a); //호출
		a=10; //호출 및 초기화
		b=50; //호출 및 초기화

*/