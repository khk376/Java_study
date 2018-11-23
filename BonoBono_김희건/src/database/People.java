package database;

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
		return "이 메시지 대신 선생님 또는 학생이 출력되어야 합니다.";
	}
	
}
