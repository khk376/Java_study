package step01.reivew02;

public class Person {
	int age;
	String name;
	String sex;
	String addr;
	
	Person(int age, String name, String sex, String addr){
		this.age=age;
		this.name=name;
		this.sex=sex;
		this.addr=addr;
	}
	public void fff() {
		System.out.println(age +" "+ name +" " + sex + " "+ addr);
	}

	public static void main(String[] args) {
		Person p = new Person(11,"���","��","����");
		p.fff();
	}

}
