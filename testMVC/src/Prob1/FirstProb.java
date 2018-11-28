/*
* Q1-1. m1,m2,m3가 스택 메모리에 저장되는 순서를 적으시오.(가장 밑단에 있는 데이터부터 쓰기)
* 
* 
* Q1-2. 저장된 스택메모리가 어떤 순서로 출력되고, 출력이 완료되면 저장되었던 스택메모리는 어떻게 되는지 쓰시오.
* 
* 
*/
package Prob1;

public class FirstProb {			

			public static void m1(int a) {
				m2(a=a+1);
				System.out.println(a);
			}
			
			public static void m2(int a) {
				m3(a=a+1);
				System.out.println(a);		
			}
			
			public static void m3(int a) {
				a=a+1;
				System.out.println(a);
			}
			
		public static void main(String[] args) {
			int a = 20;
			m1(a);		
			System.out.println(a);		
		}
}

