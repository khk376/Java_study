package step02.mvc.model;

import step01.ex.Person;

public class Model {

	// ������ ����
	public Person getData(String name, int age) {
		return new Person(name, age);
		
	}	
	// �����Ͱ� ����
	public void setData(Person p, int newAge) {
		p.setAge(newAge);
	}
}
