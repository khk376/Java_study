/* 학습 내용
 * 1. 사람의 정보를 표현하는 클래스라 가정
 * 		-권장 이름: Person.java or People.java
 * 2. 데이터
 * 		- name / age / job
 * 3. main()
 * 		- 내 짝꿍들 정보로 짝궁 수만큼 객체 생성 및 데이터 저장(대입), 데이터 출력
 */

package step01.reivew;

public class people {
	String name;
	int age;
	String job;

	//객체 생성시 데이터를 받아서 멤버 변수에 대입(할당, 초기화) 하는 생성자
	//객체 생성/멤버변수 초기화	
	people(String name, int age, String job){
		this.name=name;
		this.age=age;
		this.job=job;
		//this로 멤버 지정
		
	}
	//step02
	public static void main(String [] args) {
		people p1 =new people("건훈", 27, "IT man");
		people p2 =new people("원정", 25, "IT man");
		people p3 =new people("희건", 26, "IT man");

		System.out.println(p1.job);
	}
	/*public static void main(String[] args) {	
	   people s1 = new people();
	   people s2 = new people();
	   
	   s1.name="최원정";
	   s1.age=25;
	   s1.job="young and rich";
			   
	   s2.name="김희건";
	   s2.age=26;
	   s2.job="data architecture";
	}*/
}

	