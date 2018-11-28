//4. 출력값이 21435가 나오도록 숫자를 대입하시오. (물음표에 대입)
package Prob4;

public class FourthProb{
   public static void main(String[] args) {
	   FourthProb s = new FourthProb();
	   System.out.println(		1	);
	   A1 a = new A1();
   }
   
   static {
	 System.out.println(	2	);
   }
}

class A1{
   A1(){
	B b = new B();
	System.out.println(	5	);
   }

   static {
	System.out.println(	4	);
   }
}

class B{
   static{
	System.out.println(	3);
   }
}
