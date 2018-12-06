//step01.ex2 폴더에 컴파일 해서 관리하겠다는 선언
package step01.ex2;

//외부 package의 Person을 사용하겠는 문장
import step01.ex.Person;

public class PersonTest {
	//Person 객체를 받아서 나이값 수정하는 로직의 메소드
	public void setAgePerson(Person p) {
		System.out.println(p.getName());//?
		p.setAge(10)   ;
		p.setName("융희");
	}
	public Person getPerson() {
		return new Person("민석", 26);//step01.ex.Person@7852e922
	}
	public static void main(String[] args) {
		PersonTest pt = new PersonTest();

		Person data = pt.getPerson();
		data.setName("수정");
		pt.setAgePerson(data);
		System.out.println("이름 : " + data.getName());
		
		System.out.println(data.getAge());
		
		System.out.println(data);//step01.ex.Person@7852e922
		
		Person p = new Person("수정", 31);
		//유효성 검증 로직이 있는 메소드를 통해서만 값 대입하겠금 설계
		//따라서 age 변수를 직접 호출 불가 
		//단, setAge()로 수정
		//getAge()로 값 요청해서 반환받아 사용
		
		//p.age = -20;
		//p.setAge(-20);
		//System.out.println(p.getAge());
	}

}



