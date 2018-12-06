package step01.reivew;

public class Review1 {
		//멤버변수 선언위치
		String msg="금요일";
		
		Review1(){}
		Review1(String msg){
		this.msg=msg;
		}
		//객체 생성시 필요한 기본 생성사
		public static void main(String[] args) {
			//? 객체 생성 : 참조 변수명 r
			Review1 r= new Review1();
			//? msg 변수값 : 일요일
			r.msg="일요일";
			System.out.println(r.msg);
			
			Review1 r2= new Review1("일요일");
			
	}//end of main
		
}//end of class
