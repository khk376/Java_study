//step01.ex2 ������ ������ �ؼ� �����ϰڴٴ� ����
package step01.ex2;

import step01.ex.Person;

//�ܺ� package�� Person�� ����ϰڴٴ� ����


public class PersonTest {
	//Person ��ü�� �޾Ƽ� ���̰� �����ϴ� ������ �޼ҵ�
	
	// ���ο� Person ��ü�� �����ؼ� ��ȯ�ϴ� �޼ҵ�
	public Person getPerson() {
		return new Person("����", 25);//step01.ex.Person@7852e922
	}
	public void setAgePerson(Person p) {
		p.setAge(10);
	}
	public static void main(String[] args) {
		PersonTest pt= new PersonTest();// Ŭ������ ������ ����, �޼ҵ� ȣ���� ���� ���� ���� - ��ü ����
		
		Person data = pt.getPerson();//? getPerson() ȣ���ؼ� ��ȯ�޾Ƽ� ������ �����ϱ� //21->16->20
		pt.setAgePerson(data);
		System.out.println(data.getAge());//step01.ex.Person@7852e922
	
		
		Person p = new Person("���", 26); // ctrl+shift+o=>import // ctrlŰ ����ä�� ���콺�� Person Ŭ���ϸ� ã�ư�
		//��ȿ�� �˻� ������ �ִ� �޼ҵ带 ���ؼ��� �� �����ϰԲ� ����
		//���� age ������ ���� ȣ�� �Ұ�
		//��, setAge()�� ����
		//getAge()�� �� ��û�ؼ� ��ȯ�޾� ���
		
		//p.age= -20;
		p.setAge(-20); // �����ϴ� age�� private�� �� -> setAge()
		System.out.println(p.getAge()); // getAge()�� �� ��û�ؼ� ��ȯ�޾� ���
	}
}