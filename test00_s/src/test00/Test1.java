/* 출력 결과가 아래와 같이 나오도록 물음표(?????????) 를 채우시오.

주종훈
이영현
aaa
DA반

 * 단, ????????를 채우는 것 이외에 다른 코드를 수정하지 않는다.
 * 
 */

package test00;

public class Test1 {

	public static void main(String[] args) {

		A aa = new B();
		aa.a1();
		aa.a2();
	}

}

class A{
	A(){
		System.out.println("주종훈");
	}
	void a1() {
		System.out.println("aa");
	}
	void a2() {
		System.out.println("DA반");
	}
}


class B extends A {
	B(){
		System.out.println("이영현");
	}
	void a1() {
		System.out.println("aaa");
		
	}
}
