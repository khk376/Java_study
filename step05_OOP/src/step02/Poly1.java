/*�н�����
 * 1. ����� ���� �����Ͽ� �����Ǵ� ������ �н�
 * 2. ������ �н��� �߿��� ����
 * 		1. API Ȱ��
 * 		2. ���߽� ����, ����, ������ ���� �ʼ� ���
 * 3. ����ȯ
 * 		1. �⺻ Ÿ�� : ���� - ũ��
 * 		2. ���� Ÿ�� : ������ ���� 
 * 						���� ����: ���� �θ�...
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
	//? job�̶�� �������� ��µǰ� ������
	//? main���� printAll() ȣ���ؼ� �������
	
	void printAll() {
		super.printAll();
		System.out.println(job);
	}
	//�������� ����� �޼ҵ� ��ȯŸ��
	public static Object get() {
		return "���ڿ�";
	}
	
	public static void main(String[] args) {
		//?
		String s = (String)get();
		System.out.println(s.charAt(0));
		
		
		/* � Ŭ�������� Ȯ��?
		 * 1. ������ ������ � �ҽ����� ������? ->�θ�Ŭ���� ���� ������
		 * 2. ���� ������ � Ŭ�������� Ȯ�� �� ȣ��? ->�ڽ�Ŭ���� ���� Ȯ�� �� ����, �ڽ��ڵ忡 ������ ��ӽ�Ų �θ� Ŭ���� Ȯ���� ����
		 * 
		 */
		Parent1 p = new Poly1();//������ ���� ����
		//? p ������ ��� ��������� �� �ʱ�ȭ
		p.name = "���";
		p.age=26;
		//��� ���迡�� �ڽĸ��� ��� ������ �������� ������ ���� ������ ȣ�� �Ұ�
		//�ذ�å:job�� ������ �ڽ� Ÿ���� ������ ȣ��(Ÿ�� ����ȯ)
		//p.job="it";
		Poly1 c= (Poly1)p;
		c.name="����";
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
	- ���� �迭 ����
	- ��ü Ÿ�Ը� ����
	
	- ������ ����, �˻�, ����, ����
	������ ����
	public boolean add(Object v) {
		ArrayList��ü�� ������ ����
		v�� Object ���� � Ÿ������ ���ԵǾ��� �ϴ���
		����� Object
		���� �ڽĸ��� ������� ����ȯ ���̴� ȣ�� �Ұ�
	}
	public Object get(int index){
		
	}


	ArrayList list = new ArrayList();
	list.add("tew");//0
	list.add(new Integer(3));  //1

*/






























