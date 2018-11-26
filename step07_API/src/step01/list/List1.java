/** 학습내용
 * 1. list
 * - index로 데이터(객체타입)들 관리
 * - 동적 메모리
 * - java.uil
 * 2. 제네릭 활용
 * 		- 개발 코드를 simple하게 변환
 * 		- 다형성 형변환 코드도 간소화
 * 3. Wrapper class
 * 		- 기본 타입 8가지 모두 객체화해서 사용 해야 할 경우를 고려해서 
 * 			java.lang에 8가지 도우미 클래스 제공
 * 		- int : Integer 
 * 		- autoboxing / unboxing
 * 3. 
 */
package step01.list;

import java.util.ArrayList;

public class List1 {
	//ArrayList[ Obejct] 
	
	public static void m1() {
		ArrayList list =new ArrayList();
		list.add("문자열");//0번째 저장
		list.add(new Integer(3));//1번째저장
		list.add("문자열");//2번째 저장
		list.add(new Byte("10"));//?
		list.add(10);//list.add(new Integer(10)) 즉 객체로 변환되어 저장(autoboxing)
		int ill = new Integer(10);
		
		System.out.println(list.toString()); //[문자열, 3, 문자열, 10]
		System.out.println(list.get(2));
		System.out.println(list.size());

		
		//문자열의 '문' 출력
		String data=(String)list.get(2);
		System.out.println(data.charAt(2));
		//지운다 -> size() ->get
		list.remove(2);
		System.out.println(list.size());
	
		System.out.println(list.get(2));
	}
	
	//제네릭 + ArrayList
	/* 제네릭 - 객체타입제한
	 * ArrayList를 마치 String[] or 또 다른 타입 배열처럼 특정 타입에 한해서만 사용
	 * 장점:형변환 없이 데이터 활용 가능
	 */
	public static void m2() {
		//String만 저장 가능한 ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ad");
		list.add("wtw");
		//list.add(new Integer(3)); 불가
		String v=list.get(0);
		System.out.println(v.charAt(0));//형변환 없이 String만의 메소드 호출 가능
	}
	
	//boxing + ArrayList
	
	public static void main(String [] args) {
		m1();
		System.out.println("---------");
		m2();
	}
}








