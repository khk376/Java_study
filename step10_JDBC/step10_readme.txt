학습내용

1. JDBC API
	- java Database Connectivity 표준 API
	- java언어로 DB와 소통(통신, 연동)
	- 표준
		 어떤 DB를 사용하던 자바 코드는 동일

2. 주요 기술
	1. 중복 코드 최소화
	2. 불필요한 코드 철저히 배제
	3. 재사용성 극대화
	4. Design Pattern 필수 적용
	
		 
3. 참조
	- sqlplus 동작
		*oracle db는 이미 정상 실행중
		1단계 - sqlplus 실행
		2단계 - id/pw입력 후 접속
		3단계 - sql문장 작성[CRUD]
					- c[insert] / r[select] / u[update] / d[delete]
		4단계 - 엔터 즉 sql 실행
		5단계 - 실행한 결과 활용
		6단계 - 자원반환(종료)
				 : close()
		
		
		
		
		
		검색 삽입 삭제 갱신 // Create Read Update Delete 
		테이블생성 데이터추가 