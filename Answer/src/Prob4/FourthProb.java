package Prob4;

public class FourthProb{
   public static void main(String[] args) {
	   FourthProb s = new FourthProb();
	   System.out.println(1);
	   A1 a = new A1();
   }
   
   static {
	 System.out.println(2);
   }
}

class A1{
   A1(){
	B b = new B();
	System.out.println(3);
   }

   static {
	System.out.println(4);
   }
}

class B{
   static{
	System.out.println(5);
   }
}