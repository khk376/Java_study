package step01.reivew02;

public class Syntax3method {
		int no = 100;
		
		//? 멤버변수와 가변적인 int값 더하는 메소드 구현
		//호출한 곳으로 결과값 반환
		int sum(int no2) {
			return no + no2;
		}
		//? 멤버 변수를 가변적인 int값으로 나누고 출력( / )
		// 반환값 없음
		/*void div(int a1, int no) {
			int a2=no/a1;
			System.out.println(a2);
		}내가작성한 답..*/
		
		void div(int no2) {
			System.out.println(no/no2);
		}
		
		//? no값보다 크다면(>=) 고령, no 값보다 작으면 저연령 반환
		//가변적 데이터로 비교
		String agecheck(int no1) {
			if(no1>=no) {
				return "고령";
			}else {
				return "저연령";
			}
		}
		
		
		public static void main(String[] args) {
			//? 두개의 메소드를 호출 및 모든 데이터값들이 출력
				Syntax3method s= new Syntax3method();
			
				int r=s.sum(10);
				System.out.println(r);
				
				s.div(5);
				
				
				System.out.println();
				//조건식 학습
				if(true) {
					System.out.println("if 조건식이 true인 경우 실행");
				} else {
					System.out.println("if 조건식이 flase인 경우 실행");
				
		}
		}
}//end of class
		
