package Step02_MVC;

import java.nio.charset.MalformedInputException;

public class Syntax03Array {

	// ? Person 배열을 생성해서 반환하는 메소드
	// Person 객체수는 2개 이상
	// 반드시 기본 생성자로 객체 생성

	public static Person[] getPersons() {
		Person[] all = { new Person(), new Person() };
		return all;
	}

	// ? parameter로 Person 배열을 받아서 for 문으로 출력
	// age 변수값 수정 없이 출력
	public static void printPersons(Person[] all) {
		for (Person p : all) {
			p.print();
			/*
			 * for(int index=0; index<i.length;index++) { System.out.println(i[index]);
			 */
		}
	}

	// ? 두개의 메소드를 호출해서 실행되는 test 코드 구하기
	public static void main(String[] args) {
		printPersons(getPersons());

	}

}