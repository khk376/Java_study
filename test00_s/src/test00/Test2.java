/*     소스코드를 실행하면, 15 라인의 결과값이 false로 출력된다. 
 * 		이를 출력했을 때 true가 나올 수 있도록하는 메소드를 만들기 위해 
 *     물음표(???????????)를 채워라
 *     물음표를 채우는 것 외에는 다른 것들은 변경하지 않는다.
 */
package test00;

public class Test2 {
	public Test2() {
		super();
	}
	public static void main(String[] args) {
		
		Person p1 = new Person(10, "하늘");
		Person p2 = new Person(10, "하늘");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2)); 
		
	}

}
class Person {
	int no;
	String name;
	Person(int no, String name){
		this.no = no;
		this.name = name;	
	}
	
	
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person p = (Person)o;
			if (name.equals(p.name) && no==p.no) {
				return true;
			}else {
				return false;
			}
		}
			return false;
	}	
}	

