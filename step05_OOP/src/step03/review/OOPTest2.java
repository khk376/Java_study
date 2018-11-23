package step03.review;

public class OOPTest2 extends Object {

	public OOPTest2() {
		super();
	}

	public static void main(String[] args) {
		// Person ��ü ��
		Person p1 = new Person(10, "����");
		Person p2 = new Person(10, "����");
		System.out.println(p1 == p2);// �ּҰ� ��
		System.out.println(p1.equals(p2));// ��p1.�̴ϱ� p1 �޼ҵ���!
	}
}

class Person {
	int no;
	String name;

	Person(int no, String name) {
		this.no = no;
		this.name = name;
	}

	// ������ Ÿ�Կ� ���ؼ� ��ü�� ���밪 ���ϴ� �޼ҵ� �������� ������

	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person p = (Person) o;
			if (name.equals(p.name) && no == p.no) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
/*
public boolean equals(Object o) {
	boolean r = false;
	if(o instanceof Person) {
		Person p =(Person)o;
		if(name.equals(p.name)&&no==p.no) {
			r=true;
			}	
		}
	return r;
	}
}
*/








