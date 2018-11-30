package Prob3;

public class ThirdProb {
		String msg;
		
		public static void main(String[] args) {
			String msg = "열공하세요";
			Person p = new Person("영선종환", 24, 25);
			System.out.println(p.name.concat(msg));
			System.out.println(p.age1+p.age2);
	}

}

class Person{
	public String name;
	public int age1;
	public int age2;

	Person(String name, int age1, int age2){
		this.name = name;
		this.age1 = age1;
		this.age2 = age2;
	}
}