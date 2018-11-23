/** �н�����
 * 1. ��� & ������
 * 2. �ʿ伺
 * 		- �ڵ��� ���뼺, �������� ����, ǥ��ȭ�� ��ȯ
 * 		- ��� ���� ȿ��
 * 3. ��� Ư¡
 * 		1. java.lang.Object
 * 			- �ֻ� root
 * 			- 11���� �޼ҵ� �߿� ����ؾ��� �޼ҵ�
 * 				public String toString(){}
 * 				public boolean equals(Object o){}
 * 		2. extends Ű����� ��� ����
 * 		3. ��ӽ� ��� ����, �޼ҵ常 ���
 * 			-�޼ҵ� ������(override/overriding)
 * 			-����
 * 				-���� ���� : ������ Ŭ������ ������ �̸��� �޼ҵ尡 �ټ� ����
 * 							(overload/overloading)
 * 							print()/println()
 * 		4. �ڽ� Ŭ������ �������� �θ��� ��� ���� Ű����
 * 			- super
 * 				super. :
 * 				super() : �ڽ� Ŭ���� �������� �θ� Ŭ���� ������ ȣ��
 * 		5. �������� Ư¡
 * 			1. ��� ���迡���� �����Ǵ� �̷�
 * 			2. ���������� ���뼺�� �ش�ȭ
 * 			3. �� ��������
 * 				�θ�Ÿ�� ���� = �ڽİ�ü ����
 * 				������ �ڽĸ��� �� ������� ���� ����� ���� �Ұ�
 * 				�ذ�å : ��ü Ÿ�԰��� ����ȯ
 * 				�ڽ�Ÿ�� ���� = (�ڽ�Ÿ��)�θ�Ÿ�Ժ���;
 * 5. ������
 * 		1. rule
 * 				��ȯ Ÿ�� �޼ҵ�� argument�� �ݵ�� 100% ��ġ
 * 
 * 6. �����
 * 		1. ==
 * 			1. �⺻Ÿ�� �� : �� ��
 * 			2. ����Ÿ�� �� : �ּҰ� ��
 * 		2. ��üŸ�� �� ������
 * 			instanceof
 */
package step03.review;

public class OOPTest1 {

	public static void main(String[] args) {
		Integer i = new Integer(3);
		Integer i2= new Integer(3);
		
//		//Ÿ�Ժ�
//		System.out.println(i instanceof Integer);
//		//��ü�� �ּҰ� ��
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
		
		/** �θ� �ڽ��̶� ���Ϸ��Ҷ� false��!
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





