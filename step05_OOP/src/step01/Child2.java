package step01;

class Parent2 extends Object {
	String name;
	int age;
	
	Parent2() {
		super();
		name="���";
		System.out.println(name);
	}
	
	Parent2(String name){
		super();
		this.name=name; 
		}
	//BTS�� ������ �̸����� ���̰��� ���������� �����ϰ��� �ϴ� �����̶� ����
	Parent2(int age){
		this("BTS");//Object -> Parent2�� name���� �ʱ�ȭ -> age�ʱ�ȭ ->Parent2 ��ü ����
		this.age=age;
		}
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
}

//? Parent2 ��� ����
public class Child2 extends Parent2 {
	//? ������ ���� �ϼ��Ǵ� �ڵ带 ���� ����


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
	//? �޼ҵ� ������ �Ͻõ� super. �̿�/�������� �� ¦�� �̸� ��� �߰�
	public static void main(String[] args) {
		Child2 c2= new Child2();
		c2.name="����";
		c2.age=25;
		
		c2.printAll();
		
	}
	
}
