//데이터 활용을 위한 클래스
//구성: 변수 두개/각 변수들을 수정/변수들값 변환
/* 1. 용도 : 사람 정보를 표현을 위한 클래스
 * 2. Value Object, DataTrasfer Object
 * 		= VO Pattern/DTO Pattern
 * 3. 정형화된 구조에 맞게 개발
 * 4. 명명 규칙
 * 		- Person.java
 * 		- PersonDTO.java
 * 		- PersonVO.java
 * 		- PersonBean.java
 * 			//다 같음.
 * 
 */
package step01.ex;

public class Person {
		public String name;
		private int age;//1살 이상의 데이터만 대입해야 함(음수, 양수 표현가능한 정수)
		
		public Person() {}
		public Person(String name, int age) {
			this.name = name;
			if(age>=1) {
			this.age = age;
			} else {
				System.out.println("무효한 나이값");
			}
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			if(age>=1) {
			this.age = age;
			} else {
				System.out.println("무효한 나이값");
			}
		}
	}





