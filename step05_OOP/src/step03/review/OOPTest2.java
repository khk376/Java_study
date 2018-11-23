package step03.review;

public class OOPTest2 extends Object {

	public OOPTest2() {
		super();
	}

	public static void main(String[] args) {
		// Person 객체 비교
		Person p1 = new Person(10, "명장");
		Person p2 = new Person(10, "명장");
		System.out.println(p1 == p2);// 주소값 비교
		System.out.println(p1.equals(p2));// ※p1.이니깐 p1 메소드임!
	}
}

class Person {
	int no;
	String name;

	Person(int no, String name) {
		this.no = no;
		this.name = name;
	}

	// 동일한 타입에 한해서 객체의 내용값 비교하는 메소드 로직으로 재정의

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








