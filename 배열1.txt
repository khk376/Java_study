/* 학습내용
 * 1. 배열
 * 		- 다수의 데이터를 하나의 변수로 관리
 * 		- 모든 배열은 무조건 무조건 무조건 객체
 * 		(heap)
 * 		- 생성시 배열의 크기 값 보유한 length 변수가 자동 생성
 * 
 * 2. 문법
 * 		1. 선언, 생성, 초기화를 하나의 문장
 * 		2. 선언, 생성, 초기화를 분리한 문장
 * 
 * 	3. 배열에 사용 가능한 타입
 * 		1. 기본 - 8가지
 * 		2. 참조 - 기본 타입을 제외한 모든 타입
 *  4. 자바에서 new키워드 없이도 객체가 되는 타입은 두가지 //그외엔 모두 new로 생성
 *  	1. String - " "
 *  	2. 배열- {값1, 값2, ....}
 */
package Step02_MVC;

	
public class Syntax2Array {
	//선언, 생성, 초기화를 하나의 문장
	//int값 3개를 보유한 배열 생성 및 초기화, 반복문 사용해서 출력
	public static void m1() {
	/*	int [] i= {7, 8, 9};*/
		int i [] ={7, 8, 9};
		System.out.println(i[0] + " " + i.length);
		i[0] = 10;
		System.out.println(i[0]);
		
		//기본 반복문
		for(int index=0; index<i.length ;index++) {
			System.out.println(i[index]);
		}	
		// jdk1.5부터 추가된 반복문
		for(int v:i) {
			System.out.print(v + "\t");
		}
		
		}
	// int 데이터 3개로 test
	public static void m2() {
		//선언 생성만 한 문장
		//i가 참조하는 3개의 메모리를 보유한 int 배열 타입의 객체 생성됨
		int [] i = new int[3];
		i[0] = 7;
		i[1] = 8;
		i[2] = 9;
		System.out.println(i[2]);
		
	}
	

	//참조 타입으로 배열 생성 및 활용
	//String 타입
	public static void m3() {
		String[] s= {"붕어빵" , "500"};
		System.out.println(s[0]+ " " +s.length);
		
		String[] s2 =new String[2];
		s2[0] = new String("호빵");
		s2[1] = new String("500");
		System.out.println(s2[0]);
	}
	//사용자 정의 타입
	public static void m4() {
		Person [] all = {new Person(10), new Person(20), new Person(30) };
		System.out.println(all.length);
		/* all : Person[]
		 * all[1] : Person 객체
		 * 
		 */
		all[1].print();
		//? index 1에 저장된 Person 객체를 활용해서 T2-> T -> no값 출력
		System.out.println(all[1].t.t.no);
		/*	all[1].t.t.no
		 * all- Person 배열
		 * 	all[1] - index 1번째의 Person 객체
		 * 	all[1].t - index 1번째의 Person 객체의 t 변수
		 * 	all[1].t.t - index 1번째의 Person 객체의 t 변수 타입인 T2 객체의 t변수 타입인 T객체
		 * 	all[1].t.t.no - index 1번째의 Person 객체의 t 변수 타입인 T2 객체의 t변수 타입인 T객체의 no 변수
		 */
		
		//? index 1에 저장된 Person 객체를 활용해서 T2-> T -> no값 을 1000으로 수정 후 확인
		all[1].t.t.no=1000;
		System.out.println(all[1].t.t.no);
	}
	
	public static void main(String[] args) {
		
		/*m1();
		m2();
		m3();*/
		m4();
	}
}

class Person {
	int age=50;
	T2 t = new T2();
	Person(){}
	Person(int age){
		this.age=age;
	}
	void print(){
		System.out.println(age);
		
	}
}

class T{
	int no = 100;
}
class T2{
	T t=new T();
}


