/*�н�����
 * 1. ��ӽ� ��ü ���� ���� ����
 * 2. ����, �޼ҵ� ��� ����
 * 3. ��� ���� �޼ҵ� body ����
 * 		- ������(overriding / override)
 * 		- super. Ű���� �����ϰ� ���
 * 
 * 4. �����Ͻ� �ڵ� �߰��Ǵ� �ڵ��
 * 		1. ��� �����ڵ� ���� ��� �⺻(default) ������(constructor)
 * 5. �ֿ� Ű����
 * 		1. this. : ������ Ŭ������ ��� ����
 * 		2. this() : ������ Ŭ������ �ٸ� ������ ȣ��(��, parameter�� ��ġ�Ǵ� ������)
 * 		3. super. : �θ� Ŭ������ ��� ȣ��
 * 						��ӹ��� ������ �ϴ� �޼ҵ� body���� �ַ� ���
 * 		4. super() : �θ� Ŭ������ ������ ȣ��
 */
package step01;

class Parent extends Object{
	String name;
	Parent(){
		super();
		System.out.println("�θ�");
	}
	Parent(String name){//������� this() �����ϱ� ������ super()
		this();//this()�� ������ super()�� �ȸ������! 		
		this.name=name; 
		// =���� Ŭ���� ������ �ٸ� �����ڷκ��� �� ������ ���� ������ this()�� �״�� �������� name������ �߰�.
	}
	void printAll() {
		System.out.println(name);
	}
}

public class Child extends Parent {
	int age;
	public Child() {
		super();
		System.out.println("�ڽ�");
	}
	void printAll() {//��ӹ��� �޼ҵ��� {} ����: ������ (by 21��) 
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		//��ü ���� ���� : Object -> Parent -> Child
		Child c = new Child();
		c.name="�¼�";
		c.age=26;
		System.out.println(c.name + " " + c.age);
		c.printAll();
	}
	
}
/* ��ü ���� ����
 * 1. new ������([..])
 * 
 */

