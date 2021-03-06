//step01.ex2 폴더에 컴파일 해서 관리하겠다는 선언
package step01.ex2;

import step01.ex.Person;

//외부 package의 Person을 사용하겠다는 문장


public class PersonTest {
	//Person 객체를 받아서 나이값 수정하는 로직의 메소드
	
	// 새로운 Person 객체를 생성해서 반환하는 메소드
	public Person getPerson() {
		return new Person("원정", 25);//step01.ex.Person@7852e922
	}
	public void setAgePerson(Person p) {
		p.setAge(10);
	}
	public static void main(String[] args) {
		PersonTest pt= new PersonTest();// 클래스가 보유한 변수, 메소드 호출을 위한 전제 조건 - 객체 생성
		
		Person data = pt.getPerson();//? getPerson() 호출해서 반환받아서 변수에 대입하기 //21->16->20
		pt.setAgePerson(data);
		System.out.println(data.getAge());//step01.ex.Person@7852e922
	
		
		Person p = new Person("희건", 26); // ctrl+shift+o=>import // ctrl키 누른채로 마우스로 Person 클릭하면 찾아감
		//유효성 검사 로직이 있는 메소드를 통해서만 값 대입하게끔 설계
		//따라서 age 변수를 직접 호출 불가
		//단, setAge()로 수정
		//getAge()로 값 요청해서 반환받아 사용
		
		//p.age= -20;
		p.setAge(-20); // 참조하는 age가 private일 때 -> setAge()
		System.out.println(p.getAge()); // getAge()로 값 요청해서 반환받아 사용
	}
}
