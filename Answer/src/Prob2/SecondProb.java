package Prob2;

public class SecondProb {
		String msg = "안녕하세요. 환영합니다.";
		static int a = 10;
		static int b = 2;
	
		SecondProb(){
			if(msg.length()<=10) {
				a = a*2+1;
			}
			else {
				a = a*3;
				b = b*3;
			}
		}
		public static void main(String[] args) {
			SecondProb SP1 = new SecondProb();
			System.out.println(SP1.msg.length());
			System.out.println(SP1.a);//a도 된다
			System.out.println(SP1.b);//b도 된다
			
	}

}