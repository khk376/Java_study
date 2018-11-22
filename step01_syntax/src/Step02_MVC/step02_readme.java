/*
학습내용

1. MVC Pattern을 활용한 구조 이해하기
2. 용어
	1. pattern
		- 정형화된 개발 구조
		- 몇 백개의 pattern들이 존재
	2. MVC
		- M : model
				- !핵심 로직!, business 로직, biz, core
				- 데이터 처리로직   	//데이터 처리가 핵심!
				- DB와 실제 소통하게 되는 영역
				
		- V : view
				- 보이는 화면 담당 로직, Presentation 로직
		- C : controller
				- 수많은 요청을 구분하는 로직
				- 요청한 로직에 맞게 business 로직 실행 지시
				- business 로직으로 부터 응답 받고, 응답에 따른 view를 지정
	3. CRUD
		- create/read/update/delete
	4. 주제
		- 고객 정보 관리 프로그램
			id/address/age 변수
			각각의 멤버 변수에 값을 수정/변환하는 메소드
		- 한사람의 고객 정보 생성/거주지 정보만 수정/검색
		- 한 사람의 고객 정보 생성/거주지 정보만 수정/검색	

3. 미션 문제
	1. package 명
		step02.mvc
	2. 클래스 구조
		Model.java
			-Person 객체 생성해서 제공(검색)
			/Person 객체의 나이값 수정
		Controller.java
		 	- 어떤 요청인지 구분해서 검색? 수정?
		 StartView.java
		 	- main 시작 클래스
		 	- 요청이 발생되는 로직
		 EndView.java
		 	- 데이터 출력
			
				
*/