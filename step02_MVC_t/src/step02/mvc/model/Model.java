package step02.mvc.model;

import step01.ex.Person;

public class Model {
	Person p;
	// ������ ����
	public Person getData() {
		p = new Person("����", 25);
		return p;
	}
	
	// �����Ͱ� ���� 
	//m.setData(20);
	public void setData(int newAge) {
		p.setAge(newAge);//p.setAge(20);
	}
}






