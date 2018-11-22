/* �н�����
 * 1. ����� ��ġ�� ���� ����
 * 		��� ����/���� ����
 * 		1-1. �������
 * 			- Ŭ���� �߰�ȣ{} ���ο� ����Ǵ� ����
 * 			- ��ü ������ heap�̶�� �޸𸮿� ����
 * 			- ��ü ������ �޸𸮿� �⺻(default) �ʱ�ȭ �ڵ� ����
 *
 *		1-2. ���ú���(automatic, temporary, stack)
 *			- ���� ��ġ�� �����ڿ� �޼ҵ�() �Ǵ� {} ����Ǵ� ����
 *			- �޼ҵ峪 �����ڰ� ȣ��Ǿ�߸� �޸𸮿� ���� �� Ȱ���� ����
 *			- �ڵ� �ʱ�ȭ �Ұ�
 *
 * 2. Ÿ�Կ� ���� ����
 * 		���� / �⺻
 * 		2-1. �⺻Ÿ��
 * 			1. 8����
 * 			2. ���º� - ������ / ������ / �Ǽ��� / ����
 * 						char(16) / byte(8), short(16), int(32), long(64) / float(32), double(64)/boolean(8)
 * 						- ��� �� ���� : int/double
 * 		2-2. ����Ÿ��
 * 			1. �⺻�� �ƴ� ��� Ÿ��
 * 			2. API���� �����ϴ� Ŭ����/����� ���� Ŭ������
 * 3. �޼ҵ� ȣ�� ���
 * 		1. ��ü ���� �� ���� ������ ȣ��
 * 		2. static ���� ����� �޼ҵ�� ��ü���� ���� ȣ��
 * 
 * 4. ������
 * 		1. ����
 * 			1. ���� : Ŭ������� 100% ���� ([..]){[..]}
 * 			2. ȣ�� : new ������( [..] ); ��ü ������  ������  ����
 * 		2. �뵵
 * 			- ������ ȣ�� �� ���� �Ϸ�� heap �޸𸮿� ��ü ���� �Ϸ�
 * 			- ��� �������� �Ϻ��ϰ� ��� �����ϰ� �޸𸮿� ����
 * 
 * 
 * 
 * 
 */
package step01;

public class Syntax5Variable {
	public Syntax5Variable() {}
	// �⺻ Ÿ���� ���� ������ ���� �� Ȱ��
	// �ʱ�ȭ, �ٸ� �޼ҵ忡�� ��� ���� ����
	public static void m1(int no) {// ���� ����
		int no2 =no+2;// ���� ����
		System.out.println(no2);
	}//no�� no2 ������ �޸𸮿��� �ڵ� ����
		
/*	public static void main(String[] args) {
		Syntax5Variable s = new Syntax5Variable(); // ��������� static ������ ��ü���� ���� m1(10);�����ε� ��°���
		s.m1(10);
		//AP1 - java.lang.Math ���� �߻� �޼ҵ� ȣ��
		// ����: 0.0<= ? <1.0 �� doubleŸ�� ��ȯ
		System.out.println(Math.random());
	}
	// �⺻ Ÿ�԰��� ����ȭ(type casting)
	// char(16) -> short(16)
	// byte -> int
	// int(32) -> byte(8)
*/
	public static void typeCasting() {
		char c = '��';
		System.out.println(c);
		// [���ڳ� Ư����ȣ ���� ǥ��ȭ�� ǥ������� ���ڷ� ��ȯ�� ��ǥ(�ƽ�Ű�ڵ�, �����ڵ�)]
		int s = c;//����->����  //�ڵ� �� ��ȯ, up casting
		System.out.println(s);
		
		char c2 ='A';
		short s2 = (short)c2;//������� ����ȯ, down casting
		System.out.println(s2);//65
		
	}
	//byte�� short�� ��Ģ ����ÿ� int�� ����
	public static void m3() {
		byte b =10;
		byte b2 = 20;
		byte b3 = (byte)(b + b2); // ���������� int�� �����⶧���� byte���+�Ұ�ȣ���� ���־�� ��.
		System.out.println(b3);
	}
	
	//API���� �����ϴ� Ŭ���� Ÿ�� Ȱ��(����)
	public static void m4() {
		//java.lang.String Ŭ������ �޼ҵ�
		//String�� ���� Ÿ���߿� new ���̵� �ܼ� ""ǥ��� ������ �ڵ����� ��ü
		String s="������ ���� ��ŭ�� ������ ���� �˾Ҵ��� �ʰܿ�..+�̼����� ����";
		/* 1. �̹� �����ϴ� ���ڿ��� Ư�� ���� �ϳ� ���� ��ȯ
		 * 		1. public static char charAt(2);
		 * 
		 * 		2. public char charAt(2);
		 * 			String s = "���"
		 * 			char v = s.charAt(1);
		 * 			sysout(v);
		 * 
		 * 2. ���ڿ�(��ü)�� ��ü ���� ��ȯ(int)�ϴ� ���
		 * 		1. public int length(){�� �޼ҵ� ������ ��ü�� ���� ��ȯ} 
		 * 			String s ="eee";
		 * 			int v = s.length();
		 * 
		 *		2. public static int length(){���� ��ȯ}
		 *			int v = String.length();
		 *
		 *		3. public static int length(String v){parameter�� ���� ��ȯ}
		 *			int v= String.length("wggg");
		 *
		 * 3. �̹� �����ϴ� ���ڿ��� ���ο� ���ڿ� �߰�(add/append/concat)
		 * 		- concat �޼ҵ带 ��� ������ ������?
		 * 		1. public String concat(String addString){}
		 * 				�� �޼ҵ带 ������ ��ü�� parameter�� ���ԵǴ� ���ڿ��� ���� ��ȯ
		 * 			
		 * 		
		 * 			String s= "ewew";
		 * 			String s2= s.concat("new data");
		 * 			sysout(s2);
		 * 
		 *		2. public static String concat(String old, String addData) {
		 *				old + addData�ؼ� ��ȯ	
		 *		}
		 *		 String s=String.concat("old data", "new data")
		 */
	}
	public static void main(String [] args) {
	/*	typeCasting();
		m3();
		*/
		C c= new C();
		
		/* c.cData.bData.aData
		 * c: C ��ü
		 * c.cData : B��ü
		 * c.cData.bData: A��ü
		 * c.cData.bData.aData : String ��ü 
		 */
		System.out.println(c.cData.bData.aData);//A
		
		String data = "���ڿ�";
		data=data.concat("a").concat("b").concat("c");
	}
	// API���� �����ϴ� Ŭ���� Ÿ�� Ȱ��(����)
	
	
	// ����� ���� Ÿ�� Ȱ��(����)
}//end of class

// �ϳ��� *.java���� �ټ��� Ŭ���� ���� ����(����)
/* 1. ��ü ���� ����?
 * 		-�� �ܰ踦 Ȯ���ϱ� ���� �ڵ��?
 * 2. .(dot) �����ڸ� ���� ������ Ȱ��
 * 3. �������� : ���̻��� ��ü ������ �Ұ� 
 */
class A{
		String aData ="A";
		A(){
			System.out.println("A");
		}
}
class B{
	A bData= new A();
	B(){
		System.out.println("B");
	}
	
}
class C{
	B cData = new B();
	int cNo= 10;
	
	C(){
		System.out.println("C");
	}
}

