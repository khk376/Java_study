/*     �ҽ��ڵ带 �����ϸ�, 15 ������ ������� false�� ��µȴ�. 
 * 		�̸� ������� �� true�� ���� �� �ֵ����ϴ� �޼ҵ带 ����� ���� 
 *     ����ǥ(???????????)�� ä����
 *     ����ǥ�� ä��� �� �ܿ��� �ٸ� �͵��� �������� �ʴ´�.
 */
package test00;

public class Test2 {
	public Test2() {
		super();
	}
	public static void main(String[] args) {
		
		Person p1 = new Person(10, "�ϴ�");
		Person p2 = new Person(10, "�ϴ�");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2)); 
		
	}

}
class Person {
	int no;
	String name;
	Person(int no, String name){
		this.no = no;
		this.name = name;	
	}
	
	
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person p = (Person)o;
			if (name.equals(p.name) && no==p.no) {
				return true;
			}else {
				return false;
			}
		}
			return false;
	}	
}	

