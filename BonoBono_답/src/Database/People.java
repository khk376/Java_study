package Database;

/* �� People.java ���Ͽ��� ������ �����ϴ�.
 * ���� �� ���� �����ϴ�.
 */

public class People {
	
	String name;
	int age;

	public People(){
		super();
	}
	
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		this.age = age;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[�̸� : ");
		builder.append(name);
		builder.append(", ���� : ");
		builder.append(age);
		builder.append(" ]");
		return builder.toString();
	}
	
}
