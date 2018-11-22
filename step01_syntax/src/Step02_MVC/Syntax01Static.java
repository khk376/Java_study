/* 학습내용
 *  1. static keyword 학습
 *  2. 적용 문법
 *  	1. static 변수
 *  	2. static method
 *  	3. static{}
 *  		- byte code가 실행을 위해서 memory에 저장(로딩, 적재)시 단 한번만 실행되는 블록
 *  		- 모든 user가 공통적으로 사용되는 logic을 단 한번만 초기화(실행) 권장
 *  
 *  
 *  tip
 *  1. 컴파일 명령어
 *  	-> javac Syntax01Static.java
 *  	- 문법 검증 후 byte code로변환
 *  	- syntax01Static.class 생성
 *  2. 실행 명령어
 *  	>java Syntax01Static
 *  	-byte code를 실행 메모리에 로딩
 *  		: static{}가 존재할 경우 실행
 *  	-로딩이 완료되면 main 호출
 *  3. 실행 명령어가 진행이 된 경우는 jre는 main()호출
 *  	-Syatax01Static.main([..])
 */
//
package Step02_MVC;

public class Syntax01Static {	
	//static 변수 - 생성되는 모든 객체가 공유하는 변수
	int a=1; //객체 생성시 a변수 생성 //그래서 얘는 객체생성안하면 다이렉트로 호출 안됨
	static int b=1;//객체 생성 시점과 무관하게 byte code가 메모리에 로딩시 자동생성 // 얘는 다이렉트호출 가능
	Syntax01Static(){
		a=a+1;
		b=b+1;
	}
	public static void main(String[] args) {
		System.out.println("-----step03:객체 데이터 공유");
		
		Syntax01Static s11 =new Syntax01Static();
		System.out.println(s11.a+" " + s11.b);// 2 2
		
		Syntax01Static s22= new Syntax01Static();
		System.out.println(s22.a+" " + s22.b);// 2 3
		//3은 왜 나옴? cuz, b는 static이기에 같은 주솟값 참조해서 ++
		
		System.out.println("-----step02:변수 이해하기");
		System.out.println(b);
		System.out.println(Syntax01Static.b);
		
		Syntax01Static s =new Syntax01Static();
		System.out.println(s.a);
		System.out.println("-------------");
		System.out.println(1);
		A a =new A(); //A라는 바이트코드를 메모리에 저장! 
	}
	
	static {
		System.out.println(5);
	}
}

class A{
	A(){
		System.out.println("A 생성자");
	}
	static {
		System.out.println("A의 static 블록");
		}

	}
