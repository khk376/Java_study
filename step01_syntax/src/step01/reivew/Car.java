/* 학습내용
 * 1. 자동차는 두개의 데이터를 보유
 * 		- 차 번호(숫자), 소유자 이름
 * 2. Car 종류가 2가지= Car 객체 2개 생성
 * 3. 멤버 변수는 생성자를 통해서 초기화
 * 4. 제공받은 API 활용해서 콘솔창에 Car 정보들 출력
 */
package step01.reivew;

		
public class Car {
		String carName;
		int number;
		
		//멤버 변수명과 로컬 변수명이 다를경우 this.name 즉 this 키워드 불필요
		Car(String n ,int no){
			carName = n;
			number = no;
		}
		public static void main(String [] args) {
			Car c1 = new Car("희건", 11);
			Car c2 = new Car("원정", 22);
			System.out.println(c1.carName+ " ---" + c1.number + "," + c2.carName + "---" + c2.number);
		}
		
		
		/*Car(String name, int CarNum){
			this.name=name;
			this.CarNum=CarNum;
		}
		public static void main(String [] args) {
			Car s1= new Car("희건", 7276);
			Car s2= new Car("원정", 1234);
			
			System.out.println(s1.name+ " ---" + s1.CarNum + "," + s2.name + "---" + s2.CarNum);
		}*/
}

