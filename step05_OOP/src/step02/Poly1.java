/*학습내용
 * 1. 상속이 전제 조건하에 성립되는 다형성 학습
 * 2. 다형성 학습이 중요한 사유
 * 		1. API 활용
 * 		2. 개발시 참조, 응용, 편집을 위한 필수 기술
 * 3. 형변환
 * 		1. 기본 타입 : 기준 - 크기
 * 		2. 참조 타입 : 레벨이 기준 
 * 						높은 레벨: 조상 부모...
 */
package step02;

class Parent1{
		String name;
		int age;
		
		void printAll() {
			System.out.println(name);
			System.out.println(age);
		}
	}
public class Poly1 extends Parent1 {
	String job;
	//? job이라는 변수값도 출력되게 재정의
	//? main에서 printAll() 호출해서 결과보기
	
	void printAll() {
		super.printAll();
		System.out.println(job);
	}
	//다형성이 적용된 메소드 반환타입
	public static Object get() {
		return "문자열";
	}
	
	public static void main(String[] args) {
		//?
		String s = (String)get();
		System.out.println(s.charAt(0));
		
		
		/* 어떤 클래스부터 확인?
		 * 1. 컴파일 시점엔 어떤 소스먼저 컴파일? ->부모클래스 먼저 컴파일
		 * 2. 실행 시점엔 어떤 클래스부터 확인 및 호출? ->자식클래스 먼저 확인 후 실행, 자식코드에 없으면 상속시킨 부모 클래스 확인후 실행
		 * 
		 */
		Parent1 p = new Poly1();//다형성 성립 문법
		//? p 변수로 모든 멤버변수들 값 초기화
		p.name = "희건";
		p.age=26;
		//상속 관계에서 자식만의 멤버 변수는 다형성이 성립된 참조 변수가 호출 불가
		//해결책:job을 보유한 자식 타입의 변수로 호출(타입 형변환)
		//p.job="it";
		Poly1 c= (Poly1)p;
		c.name="병길";
		c.job="it";
		System.out.println(p.name);
		System.out.println("---step-1");
		p.printAll();
		System.out.println("---step-2");
		c.printAll();
		}
}

/*
class A extends Object{}
class B extends A{}
class C extends B{}
class D extends Object{}

java.util.ArrayList
	- 동적 배열 구조
	- 객체 타입만 관리
	
	- 데이터 저장, 검색, 삭제, 수정
	데이터 저장
	public boolean add(Object v) {
		ArrayList객체에 데이터 저장
		v는 Object 따라서 어떤 타입으로 유입되었다 하더라도
		결론은 Object
		따라서 자식만의 멤버들은 형변환 없이는 호출 불가
	}
	public Object get(int index){
		
	}


	ArrayList list = new ArrayList();
	list.add("tew");//0
	list.add(new Integer(3));  //1

*/






























