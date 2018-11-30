package Database;

/* 이 People.java 파일에는 문제가 없습니다.
 * 수정 할 것이 없습니다.
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
		builder.append("[이름 : ");
		builder.append(name);
		builder.append(", 나이 : ");
		builder.append(age);
		builder.append(" ]");
		return builder.toString();
	}
	
}
