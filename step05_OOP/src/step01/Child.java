/*학습내용
 * 1. 상속시 객체 생성 순서 이해
 * 2. 변수, 메소드 상속 이해
 * 3. 상속 받은 메소드 body 수정
 * 		- 재정의(overriding / override)
 * 		- super. 키워드 유용하게 사용
 * 
 * 4. 컴파일시 자동 추가되는 코드들
 * 		1. 어떠한 생성자도 없을 경우 기본(default) 생성자(constructor)
 * 5. 주요 키워드
 * 		1. this. : 동일한 클래스의 멤버 지정
 * 		2. this() : 동일한 클래스의 다른 생성자 호출(단, parameter가 일치되는 생성자)
 * 		3. super. : 부모 클래스의 멤버 호출
 * 						상속받은 재정의 하는 메소드 body에서 주로 사용
 * 		4. super() : 부모 클래스의 생성자 호출
 */
package step01;

class Parent extends Object{
	String name;
	Parent(){
		super();
		System.out.println("부모");
	}
	Parent(String name){//명시적인 this() 존재하기 때문에 super()
		this();//this()가 있으면 super()가 안만들어짐! 		
		this.name=name; 
		// =같은 클래스 내부의 다른 생성자로부터 그 생성자 안의 내용을 this()로 그대로 가져오고 name정보만 추가.
	}
	void printAll() {
		System.out.println(name);
	}
}

public class Child extends Parent {
	int age;
	public Child() {
		super();
		System.out.println("자식");
	}
	void printAll() {//상속받은 메소드의 {} 수정: 재정의 (by 21열) 
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		//객체 생성 순서 : Object -> Parent -> Child
		Child c = new Child();
		c.name="태성";
		c.age=26;
		System.out.println(c.name + " " + c.age);
		c.printAll();
	}
	
}
/* 객체 생성 문법
 * 1. new 생성자([..])
 * 
 */

