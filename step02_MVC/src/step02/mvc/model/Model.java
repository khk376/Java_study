package step02.mvc.model;

import step01.ex.Person;

public class Model {

	// 데이터 제공
	public Person getData(String name, int age) {
		return new Person(name, age);
		
	}	
	// 데이터값 수정
	public void setData(Person p, int newAge) {
		p.setAge(newAge);
	}
}
