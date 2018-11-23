/** 학습내용
 * 1. 상속 & 다형성
 * 2. 필요성
 * 		- 코드의 재사용성, 유지보수 용이, 표준화의 일환
 * 		- 비용 절감 효과
 * 3. 상속 특징
 * 		1. java.lang.Object
 * 			- 최상 root
 * 			- 11개의 메소드 중에 고려해야할 메소드
 * 				public String toString(){}
 * 				public boolean equals(Object o){}
 * 		2. extends 키워드로 상속 형성
 * 		3. 상속시 멤버 변수, 메소드만 상속
 * 			-메소드 재정의(override/overriding)
 * 			-참조
 * 				-다중 정의 : 동일한 클래스에 동일한 이름의 메소드가 다수 존재
 * 							(overload/overloading)
 * 							print()/println()
 * 		4. 자식 클래스의 관점에서 부모의 멤버 지정 키워드
 * 			- super
 * 				super. :
 * 				super() : 자식 클래스 관점에서 부모 클래스 생성자 호출
 * 		5. 다형성의 특징
 * 			1. 상속 관계에서만 성립되는 이론
 * 			2. 다형성으로 재사용성이 극대화
 * 			3. 단 제약조건
 * 				부모타입 변수 = 자식객체 형성
 * 				변수는 자식만의 즉 상속하지 않은 멤버는 접근 불가
 * 				해결책 : 객체 타입간의 형변환
 * 				자식타입 변수 = (자식타입)부모타입변수;
 * 5. 재정의
 * 		1. rule
 * 				반환 타입 메소드명 argument는 반드시 100% 일치
 * 
 * 6. 연산식
 * 		1. ==
 * 			1. 기본타입 비교 : 값 비교
 * 			2. 참조타입 비교 : 주소값 비교
 * 		2. 객체타입 비교 연산자
 * 			instanceof
 */
package step03.review;

public class OOPTest1 {

	public static void main(String[] args) {
		Integer i = new Integer(3);
		Integer i2= new Integer(3);
		
//		//타입비교
//		System.out.println(i instanceof Integer);
//		//객체의 주소값 비교
//		System.out.println(i == i2);
		
		String s = "String";
		System.out.println(s instanceof Object);
		System.out.println(s instanceof String);
		/*System.out.println(s instanceof Integer);*/
		A a= new A();
		System.out.println(a instanceof Object);
		System.out.println(a instanceof B);
		B b = new B();
		System.out.println(b instanceof A);
		System.out.println(b instanceof C);
		A ab = new C();
		System.out.println(ab instanceof C);
		
		/** 부모가 자식이랑 비교하려할때 false뜸!
		 * ex) A a = new A();
		 * 		  System.out.println(a instanceof B);=>false
		 * 		  System.out.println(a instanceof C);=>false
		 */
	}

}
class A{}
class B extends A{}
class C extends B{}

/*
 Object o = new A();
 = new B();
 = new C();
  A a =new A();
  =new B();
  =new C();
  B b = new B();
  =new C();
  C c = new C();
 */





