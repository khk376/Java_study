/* �н� ����
 * 1. ����� ������ ǥ���ϴ� Ŭ������ ����
 * 		-���� �̸�: Person.java or People.java
 * 2. ������
 * 		- name / age / job
 * 3. main()
 * 		- �� ¦��� ������ ¦�� ����ŭ ��ü ���� �� ������ ����(����), ������ ���
 */

package step01.reivew;

public class people {
	String name;
	int age;
	String job;

	//��ü ������ �����͸� �޾Ƽ� ��� ������ ����(�Ҵ�, �ʱ�ȭ) �ϴ� ������
	//��ü ����/������� �ʱ�ȭ	
	people(String name, int age, String job){
		this.name=name;
		this.age=age;
		this.job=job;
		//this�� ��� ����
		
	}
	//step02
	public static void main(String [] args) {
		people p1 =new people("����", 27, "IT man");
		people p2 =new people("����", 25, "IT man");
		people p3 =new people("���", 26, "IT man");

		System.out.println(p1.job);
	}
	/*public static void main(String[] args) {	
	   people s1 = new people();
	   people s2 = new people();
	   
	   s1.name="�ֿ���";
	   s1.age=25;
	   s1.job="young and rich";
			   
	   s2.name="�����";
	   s2.age=26;
	   s2.job="data architecture";
	}*/
}

	