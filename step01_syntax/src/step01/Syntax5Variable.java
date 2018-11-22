/* 학습내용
 * 1. 선언된 위치에 따라 구분
 * 		멤버 변수/로컬 변수
 * 		1-1. 멤버변수
 * 			- 클래스 중괄호{} 내부에 선언되는 변수
 * 			- 객체 생성시 heap이라는 메모리에 생성
 * 			- 객체 생성시 메모리에 기본(default) 초기화 자동 진행
 *
 *		1-2. 로컬변수(automatic, temporary, stack)
 *			- 선언 위치가 생성자와 메소드() 또는 {} 선언되는 변수
 *			- 메소드나 생성자가 호출되어야만 메모리에 생성 및 활용이 가능
 *			- 자동 초기화 불가
 *
 * 2. 타입에 따른 구분
 * 		참조 / 기본
 * 		2-1. 기본타입
 * 			1. 8가지
 * 			2. 형태별 - 문자형 / 정수형 / 실수형 / 논리형
 * 						char(16) / byte(8), short(16), int(32), long(64) / float(32), double(64)/boolean(8)
 * 						- 사용 빈도 높음 : int/double
 * 		2-2. 참조타입
 * 			1. 기본이 아닌 모든 타입
 * 			2. API에서 제공하는 클래스/사용자 정의 클래스들
 * 3. 메소드 호출 방법
 * 		1. 객체 생성 후 참조 변수로 호출
 * 		2. static 으로 선언된 메소드는 객체생성 없이 호출
 * 
 * 4. 생성자
 * 		1. 문법
 * 			1. 구현 : 클래스명과 100% 동일 ([..]){[..]}
 * 			2. 호출 : new 생성자( [..] ); 객체 생성의  유일한  문법
 * 		2. 용도
 * 			- 생성자 호출 및 실행 완료는 heap 메모리에 객체 생성 완료
 * 			- 멤버 변수들이 완벽하게 사용 가능하게 메모리에 생성
 * 
 * 
 * 
 * 
 */
package step01;

public class Syntax5Variable {
	public Syntax5Variable() {}
	// 기본 타입을 로컬 변수로 선언 및 활용
	// 초기화, 다른 메소드에서 사용 가능 여부
	public static void m1(int no) {// 로컬 변수
		int no2 =no+2;// 로컬 변수
		System.out.println(no2);
	}//no와 no2 변수가 메모리에서 자동 삭제
		
/*	public static void main(String[] args) {
		Syntax5Variable s = new Syntax5Variable(); // 멤버변수에 static 넣으면 객체선언 없이 m1(10);만으로도 출력가능
		s.m1(10);
		//AP1 - java.lang.Math 난수 발생 메소드 호출
		// 난수: 0.0<= ? <1.0 즉 double타입 반환
		System.out.println(Math.random());
	}
	// 기본 타입간의 형변화(type casting)
	// char(16) -> short(16)
	// byte -> int
	// int(32) -> byte(8)
*/
	public static void typeCasting() {
		char c = '나';
		System.out.println(c);
		// [문자나 특수기호 들을 표준화한 표기법으로 숫자로 변환한 도표(아스키코드, 유니코드)]
		int s = c;//문자->정수  //자동 형 변환, up casting
		System.out.println(s);
		
		char c2 ='A';
		short s2 = (short)c2;//명시적인 형변환, down casting
		System.out.println(s2);//65
		
	}
	//byte와 short는 사칙 연산시에 int로 변경
	public static void m3() {
		byte b =10;
		byte b2 = 20;
		byte b3 = (byte)(b + b2); // 연산결과값이 int로 나오기때문에 byte명시+소괄호까지 써주어야 함.
		System.out.println(b3);
	}
	
	//API에서 제공하는 클래스 타입 활용(참조)
	public static void m4() {
		//java.lang.String 클래스의 메소드
		//String은 참조 타입중에 new 없이도 단순 ""표기법 만으로 자동으로 객체
		String s="여름이 가고 상큼한 가을이 올줄 알았더니 초겨울..+미세먼지 시작";
		/* 1. 이미 존재하는 문자열의 특정 음절 하나 도출 반환
		 * 		1. public static char charAt(2);
		 * 
		 * 		2. public char charAt(2);
		 * 			String s = "희건"
		 * 			char v = s.charAt(1);
		 * 			sysout(v);
		 * 
		 * 2. 문자열(객체)의 전체 길이 반환(int)하는 기능
		 * 		1. public int length(){이 메소드 보유한 객체의 길이 반환} 
		 * 			String s ="eee";
		 * 			int v = s.length();
		 * 
		 *		2. public static int length(){길이 반환}
		 *			int v = String.length();
		 *
		 *		3. public static int length(String v){parameter값 길이 변환}
		 *			int v= String.length("wggg");
		 *
		 * 3. 이미 존재하는 문자열에 새로운 문자열 추가(add/append/concat)
		 * 		- concat 메소드를 어떻게 설계할 것인지?
		 * 		1. public String concat(String addString){}
		 * 				이 메소드를 보유한 객체에 parameter로 유입되는 문자열을 결합 반환
		 * 			
		 * 		
		 * 			String s= "ewew";
		 * 			String s2= s.concat("new data");
		 * 			sysout(s2);
		 * 
		 *		2. public static String concat(String old, String addData) {
		 *				old + addData해서 반환	
		 *		}
		 *		 String s=String.concat("old data", "new data")
		 */
	}
	public static void main(String [] args) {
	/*	typeCasting();
		m3();
		*/
		C c= new C();
		
		/* c.cData.bData.aData
		 * c: C 객체
		 * c.cData : B객체
		 * c.cData.bData: A객체
		 * c.cData.bData.aData : String 객체 
		 */
		System.out.println(c.cData.bData.aData);//A
		
		String data = "문자열";
		data=data.concat("a").concat("b").concat("c");
	}
	// API에서 제공하는 클래스 타입 활용(참조)
	
	
	// 사용자 정의 타입 활용(참조)
}//end of class

// 하나의 *.java에는 다수의 클래스 개발 가능(비추)
/* 1. 객체 생성 순서?
 * 		-이 단계를 확인하기 위한 코드는?
 * 2. .(dot) 연산자를 통한 변수들 활용
 * 3. 제약조건 : 더이상의 객체 생성은 불가 
 */
class A{
		String aData ="A";
		A(){
			System.out.println("A");
		}
}
class B{
	A bData= new A();
	B(){
		System.out.println("B");
	}
	
}
class C{
	B cData = new B();
	int cNo= 10;
	
	C(){
		System.out.println("C");
	}
}

