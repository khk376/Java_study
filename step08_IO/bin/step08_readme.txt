학습내용

1. IO
	1. Input/Output의 약어
	2. 모든 IT 기술의 핵심
	3. 시스템 자원 빌려쓰고 반환 필수
	
2. 자바 관점에서 IO
	1. 개발이 매우 쉽다.
		- 모든 API를 다 제공
			: 데이터의 근원지 -> 데이터 출력 목적지가 무엇이냐에 따른 API 선별만 하면 됨
			: 클래스
		- file로 부터 read -> file에 출력
		- 이미지, 동영상과 같은 파일도 read -> 출력
	2. 예시
		1. 실시간 키보드로 입력하는 데이터를 콘솔창에 출력
			키보드 : System.in
			콘솔창 : System.out
			실시간 : 반복
			검증로직 :read한 데이터가 존재할 때까지만 반복
						데이터 존재 여부 검증
	
	2. 존재하는 한글이 입력된 파일로부터 encore.txt 라는 파일 생성 및 출력
		존재하는 한글 : 2byte씩 read, FileReader
				- 한 음절씩 read?
				- 한 라인씩 read? 효율적
		encore.txt 라는 파일 : 2byte씩 write, FileWirter
				- 한 라인씩 출력
		검증 로직 : 파일에 read할 데이터가 더 있냐? 없냐?
		
		* line 단위로 read/write의 기준은? 키보드의 엔터