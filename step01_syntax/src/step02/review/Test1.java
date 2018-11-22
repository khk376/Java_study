/* �н�����
 * 1. package, import, class, ����, ������, �޼ҵ�, static
 * 2. ����
 * 		1. ������ġ�� ���� ����
 * 			1. �������
 * 				1. instance ����
 * 					-��ü(instance) �����ؾ߸� ��� ����
 * 					-�����Ǵ� ��� ��ü�� ���������� ���
 * 				2. static ���� - ��ü �������� �ʾƵ� ��� ����
 * 					��ü(instance) �������� �ʾƵ� ��� ����
 * 					-�����Ǵ� ��� ��ü�� ����
 * 			2. ���� ����
 * 				- stack, automatic, temporary ����
 * 				- ������ or �޼ҵ� ()�� {} ���ο� ����Ǵ� ����
 * 		2. �޼ҵ�
 * 			1. �Ϲ� �޼ҵ�: ��ü ������ ���� ������ ȣ��
 * 			2. static �޼ҵ� : ��ü �������� Ŭ������.�޼ҵ�([...])
 * 		3. ������
 * 			1. ��� : ��ü ������ �ʼ�
 * 			2. Ŭ������� 100% ����
 * 			3. �ɼ� : �ʿ��� ��� ������� �ʱ�ȭ ����
 *
 * 		4. static{}
 * 			- ���� ������ byte code�� �޸𸮿� �ε��� �ڵ� ����Ǵ� ��Ư�� ����
 */	 
package step02.review;

public class Test1 {
	String name = "��ȯ"; // ��ü ���� �ʼ�
	
	Test1(){}
	
	String getName() { //static ������ ��ü ���� ���̵� ȣ�� ����
		return name;
	}
	void setName(String n) {
		name=n;
		
	}
	static {
		System.out.println("���� ���� ��Ȯ��");
		
	}
	
	public static void main(String[] args) {
		//?java.lang.Integer��� Ŭ������ ���ڿ��� int�� ��ȯ�ϴ� �޼ҵ� ����
		int v =Integer.parseInt("3");
		System.out.println(v);
		
		//? name ������ ���
		Test1 t= new Test1(); //t=��������
		System.out.println(t.name);
		//? name �������� set�迭 �޼ҵ�� ������ get�迭 �޼ҵ�� ��ȯ�ް� ���
		t.setName("����");
		System.out.println(t.getName());
	}

}
