//step01.ex2 ������ ������ �ؼ� �����ϰڴٴ� ����
package step01.ex2;

//�ܺ� package�� Person�� ����ϰڴ� ����
import step01.ex.Person;

public class PersonTest {
	//Person ��ü�� �޾Ƽ� ���̰� �����ϴ� ������ �޼ҵ�
	public void setAgePerson(Person p) {
		System.out.println(p.getName());//?
		p.setAge(10)   ;
		p.setName("����");
	}
	public Person getPerson() {
		return new Person("�μ�", 26);//step01.ex.Person@7852e922
	}
	public static void main(String[] args) {
		PersonTest pt = new PersonTest();

		Person data = pt.getPerson();
		data.setName("����");
		pt.setAgePerson(data);
		System.out.println("�̸� : " + data.getName());
		
		System.out.println(data.getAge());
		
		System.out.println(data);//step01.ex.Person@7852e922
		
		Person p = new Person("����", 31);
		//��ȿ�� ���� ������ �ִ� �޼ҵ带 ���ؼ��� �� �����ϰڱ� ����
		//���� age ������ ���� ȣ�� �Ұ� 
		//��, setAge()�� ����
		//getAge()�� �� ��û�ؼ� ��ȯ�޾� ���
		
		//p.age = -20;
		//p.setAge(-20);
		//System.out.println(p.getAge());
	}

}



