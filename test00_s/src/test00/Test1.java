/* ��� ����� �Ʒ��� ���� �������� ����ǥ(?????????) �� ä��ÿ�.

������
�̿���
aaa
DA��

 * ��, ????????�� ä��� �� �̿ܿ� �ٸ� �ڵ带 �������� �ʴ´�.
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
		System.out.println("������");
	}
	void a1() {
		System.out.println("aa");
	}
	void a2() {
		System.out.println("DA��");
	}
}


class B extends A {
	B(){
		System.out.println("�̿���");
	}
	void a1() {
		System.out.println("aaa");
		
	}
}
