/* 학습내용
 * 1. Object로 부터 상속받은 메소드 재정의 필요성
 * 2. public String toString(){
 * 			생성된 객체(instance)의 위치값을 문자열로 반환
 * 		}
 * 		- 데이터 표현을 위한 클래스에 재정의 권장
 * 		- API상에도 재정의한 클래스들 다수
 * 		- 왜?
 * 			print() / println() 
 * 			- 객체 타입의 데이터 출력시 무조건 무조건! 자동 호출
 */
package step01;

class AA extends Object{
	AA(){
		super();
	}
	public String toString() {
		return "동호";
	}
}
class BB{}
public class ToStringTest {
	
	public static void main(String[] args) {
		BB b = new BB();
		String s= "문자열";
		AA a= new AA();
		System.out.println(s.toString());
		System.out.println(a.toString());
	}
}
