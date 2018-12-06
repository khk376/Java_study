//������ Ȱ���� ���� Ŭ����
//����: ���� �ΰ�/�� �������� ����/�����鰪 ��ȯ
/* 1. �뵵 : ��� ������ ǥ���� ���� Ŭ����
 * 2. Value Object, Data Transfer Object
 * 		= VO Pattern/DTO Pattern
 * 3. ����ȭ�� ������ �°� ���� 
 * 4. ��� ��Ģ
 * 		- Person.java
 * 		- PersonDTO.java
 * 		- PersonVO.java
 * 		- PersonBean.java
 *  */
package step01.ex;

public class Person {
	public String name;
	private int age;//1�� �̻��� �����͸� �����ؾ� ��(����, ��� ǥ�������� ����)
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		if(age >= 1) {
			this.age = age;
		}else {
			System.out.println("��ȿ�� ���̰�");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	//p.setAge(20);
	public void setAge(int age) {
		if(age >= 1) {
			this.age = age;
		}else {
			System.out.println("��ȿ�� ���̰�");
		}
	}
}
/*
String gender;
String getGender() {
	return gender;
}
void setGender(String newGender) {
	gender = newGender;
}

String grade;
String getGrade() {
	return grade;
}
void setGrade(String newG) {
	grade = newG;
}*/








