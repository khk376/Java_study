package step02.mvc.model;

import step01.ex.Person;

public class Model {
	Person p;
	// 데이터 제공
	public Person getData() {
		p = new Person("혜인", 25);
		return p;
	}
	
	// 데이터값 수정 
	//m.setData(20);
	public void setData(int newAge) {
		p.setAge(newAge);//p.setAge(20);
	}
}






