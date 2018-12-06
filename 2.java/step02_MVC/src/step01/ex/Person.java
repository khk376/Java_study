//������ Ȱ���� ���� Ŭ����
//����: ���� �ΰ�/�� �������� ����/�����鰪 ��ȯ
/* 1. �뵵 : ��� ������ ǥ���� ���� Ŭ����
 * 2. Value Object, DataTrasfer Object
 * 		= VO Pattern/DTO Pattern
 * 3. ����ȭ�� ������ �°� ����
 * 4. ��� ��Ģ
 * 		- Person.java
 * 		- PersonDTO.java
 * 		- PersonVO.java
 * 		- PersonBean.java
 * 			//�� ����.
 * 
 */
package step01.ex;

public class Person {
		public String name;
		private int age;//1�� �̻��� �����͸� �����ؾ� ��(����, ��� ǥ�������� ����)
		
		public Person() {}
		public Person(String name, int age) {
			this.name = name;
			if(age>=1) {
			this.age = age;
			} else {
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
		public void setAge(int age) {
			if(age>=1) {
			this.age = age;
			} else {
				System.out.println("��ȿ�� ���̰�");
			}
		}
	}





