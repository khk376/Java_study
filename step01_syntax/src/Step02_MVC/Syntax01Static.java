/* �н�����
 *  1. static keyword �н�
 *  2. ���� ����
 *  	1. static ����
 *  	2. static method
 *  	3. static{}
 *  		- byte code�� ������ ���ؼ� memory�� ����(�ε�, ����)�� �� �ѹ��� ����Ǵ� ���
 *  		- ��� user�� ���������� ���Ǵ� logic�� �� �ѹ��� �ʱ�ȭ(����) ����
 *  
 *  
 *  tip
 *  1. ������ ��ɾ�
 *  	-> javac Syntax01Static.java
 *  	- ���� ���� �� byte code�κ�ȯ
 *  	- syntax01Static.class ����
 *  2. ���� ��ɾ�
 *  	>java Syntax01Static
 *  	-byte code�� ���� �޸𸮿� �ε�
 *  		: static{}�� ������ ��� ����
 *  	-�ε��� �Ϸ�Ǹ� main ȣ��
 *  3. ���� ��ɾ ������ �� ���� jre�� main()ȣ��
 *  	-Syatax01Static.main([..])
 */
//
package Step02_MVC;

public class Syntax01Static {	
	//static ���� - �����Ǵ� ��� ��ü�� �����ϴ� ����
	int a=1; //��ü ������ a���� ���� //�׷��� ��� ��ü�������ϸ� ���̷�Ʈ�� ȣ�� �ȵ�
	static int b=1;//��ü ���� ������ �����ϰ� byte code�� �޸𸮿� �ε��� �ڵ����� // ��� ���̷�Ʈȣ�� ����
	Syntax01Static(){
		a=a+1;
		b=b+1;
	}
	public static void main(String[] args) {
		System.out.println("-----step03:��ü ������ ����");
		
		Syntax01Static s11 =new Syntax01Static();
		System.out.println(s11.a+" " + s11.b);// 2 2
		
		Syntax01Static s22= new Syntax01Static();
		System.out.println(s22.a+" " + s22.b);// 2 3
		//3�� �� ����? cuz, b�� static�̱⿡ ���� �ּڰ� �����ؼ� ++
		
		System.out.println("-----step02:���� �����ϱ�");
		System.out.println(b);
		System.out.println(Syntax01Static.b);
		
		Syntax01Static s =new Syntax01Static();
		System.out.println(s.a);
		System.out.println("-------------");
		System.out.println(1);
		A a =new A(); //A��� ����Ʈ�ڵ带 �޸𸮿� ����! 
	}
	
	static {
		System.out.println(5);
	}
}

class A{
	A(){
		System.out.println("A ������");
	}
	static {
		System.out.println("A�� static ���");
		}

	}
