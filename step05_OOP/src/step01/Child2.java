package step01;

class Parent2 extends Object {
	String name;
	int age;
	
	Parent2() {
		super();
		name="희건";
		System.out.println(name);
	}
	
	Parent2(String name){
		super();
		this.name=name; 
		}
	//BTS란 고정된 이름으로 나이값만 가변적으로 생성하고자 하는 로직이라 가정
	Parent2(int age){
		this("BTS");//Object -> Parent2의 name변수 초기화 -> age초기화 ->Parent2 객체 생성
		this.age=age;
		}
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
}

//? Parent2 상속 형성
public class Child2 extends Parent2 {
	//? 컴파일 직후 완성되는 코드를 직접 개발


	Child2(){
		super();
		age=26;
		System.out.println(age);
	}
	void printAll() {
		super.printAll();
		System.out.println(name);
		System.out.println(age);
		

		
	}
	//? 메소드 재정의 하시되 super. 이용/마지막에 내 짝꿍 이름 출력 추가
	public static void main(String[] args) {
		Child2 c2= new Child2();
		c2.name="원정";
		c2.age=25;
		
		c2.printAll();
		
	}
	
}
