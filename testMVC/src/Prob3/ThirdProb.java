// 결과값으로 '영선종환열공하세요'와 두사람 나이의 합을 구하기 위해 다음 빈칸(1,2,3,4)을 적으시오
//	(물음표만 써주기)
package Prob3;

public class ThirdProb {
		String msg;
		public static void main(String[] args) {
			String msg = "열공하세요";
			Person p= new Person("영선종환", 24, 25);
			System.out.println(p.name.concat(msg));//영선종환열공하세요	
			System.out.println(p.age1+p.age2);//나이합
		}

	}

	class Person{
		 public String name;
		 public int age1;
		 public int age2;

		Person(String name, int age1, int age2){
			
			this.name=name;
			this.age1=age1;
			this.age2=age2;
		}
	}
