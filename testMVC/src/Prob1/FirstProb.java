/*
* Q1-1. m1,m2,m3�� ���� �޸𸮿� ����Ǵ� ������ �����ÿ�.(���� �شܿ� �ִ� �����ͺ��� ����)
* 
* 
* Q1-2. ����� ���ø޸𸮰� � ������ ��µǰ�, ����� �Ϸ�Ǹ� ����Ǿ��� ���ø޸𸮴� ��� �Ǵ��� ���ÿ�.
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

