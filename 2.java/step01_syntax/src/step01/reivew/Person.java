package step01.reivew;

public class Person {
		String pName;
		// 사용자 정의 타입 변수에 대입되는 데이터 구조는 반드시 객체여야함.
		Car car;
		
		Person(){}
		Person(String n, Car c){ //생성자
			pName= n;
			car = c;

		}
		
}