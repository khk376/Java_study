/* 학습내용
 * 1. package, import, class, 변수, 생성자, 메소드, static
 * 2. 변수
 * 		1. 선언위치에 따른 구분
 * 			1. 멤버변수
 * 				1. instance 변수
 * 					-객체(instance) 생성해야만 사용 가능
 * 					-생성되는 모든 객체가 개별적으로 사용
 * 				2. static 변수 - 객체 생성하지 않아도 사용 가능
 * 					객체(instance) 생성하지 않아도 사용 가능
 * 					-생성되는 모든 객체가 공유
 * 			2. 로컬 변수
 * 				- stack, automatic, temporary 변수
 * 				- 생성자 or 메소드 ()와 {} 내부에 선언되는 변수
 * 		2. 메소드
 * 			1. 일반 메소드: 객체 생성후 참조 변수로 호출
 * 			2. static 메소드 : 객체 생성없이 클래스명.메소드([...])
 * 		3. 생성자
 * 			1. 기능 : 객체 생성시 필수
 * 			2. 클래스명과 100% 동일
 * 			3. 옵션 : 필요한 경우 멤버변수 초기화 로직
 *
 * 		4. static{}
 * 			- 실행 파일이 byte code가 메모리에 로딩시 자동 실행되는 독특한 문법
 */	 
package step02.review;

public class Test1 {
	String name = "두환"; // 객체 생성 필수
	
	Test1(){}
	
	String getName() { //static 있을땐 객체 생성 없이도 호출 가능
		return name;
	}
	void setName(String n) {
		name=n;
		
	}
	static {
		System.out.println("실행 시점 재확인");
		
	}
	
	public static void main(String[] args) {
		//?java.lang.Integer라는 클래스에 문자열을 int로 변환하는 메소드 있음
		int v =Integer.parseInt("3");
		System.out.println(v);
		
		//? name 변수값 출력
		Test1 t= new Test1(); //t=참조변수
		System.out.println(t.name);
		//? name 변수값을 set계열 메소드로 수정후 get계열 메소드로 반환받고 출력
		t.setName("융희");
		System.out.println(t.getName());
	}

}
