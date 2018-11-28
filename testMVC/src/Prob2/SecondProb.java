/*결과값이 다음과 같도록 코딩하시오.(물음표에 대입)
	13
	30
	6
*/

package Prob2;

public class SecondProb {
	String msg = "안녕하세요. 환영합니다.";
	static int a = 10;
	static int b = 2;
	
	SecondProb(){
		if(msg.length()>=10) {
			System.out.println(msg.length());
			a=a*3;
			b=b*3;
		}
		else {
			a = a*2;
		}
	}
	
	public static void main(String[] args) {
		SecondProb SP1 = new SecondProb();

		System.out.println(SP1.a);
		System.out.println(SP1.b);
	}
}
