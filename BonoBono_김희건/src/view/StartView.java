package view;

import java.util.ArrayList;

import controll.Controller;
import database.Student;
import database.Teacher;


// // 3개의 클래스만 import하여 startView를 완성하라. 

public class StartView {

	public static void main(String[] args) throws Exception{
		Controller ct = new Controller();		

		//선생님등록
		ArrayList<Teacher> teacher = Teacher.getInstance();
		Teacher.addTeacher("너부리 아빠", 30, "너부리 때리기");
		Teacher.addTeacher("보노보노 아빠", 35, "범고래 잡기");
		Teacher.addTeacher("야옹이 형", 26, "그건 비밀이야");
		Teacher.addTeacher("동굴 아저씨", 00, "나쁜 아이는 동굴 안에 가둬버린다~");
		
		//학생들 등록 
		ArrayList<Student> student = Student.getInstance();
		Student.addStudent("보노보노", 15, 1);
		Student.addStudent("포로리", 15, 2);
		Student.addStudent("너부리", 16, 3);
				
		//선생님 삭제
		
		ct.delefeInfo("보노보노 아빠");

		System.out.println("-----------------------");
		
		//학생 반변경 메소드 
		// // 42, 43라인을 채워넣어
		// // 콘솔창에
		// // 이미 동일한 반에 소속되어 있습니다.
		// // 학생의 반이 성공적으로 변경되었습니다.
		// // 위 두 줄 출력하시오.
		
		ct.infoC("보노보노", 1);
		ct.infoC("보노보노", 2);
		
		System.out.println("-----------------------");
		
		//학생추가
		// // 아래 3 명의 학생을 추가하세요
		// // 17살 포로리 큰누나 도로리를 1반으로
		// // 16살 포로리 작은누나 아로리를 2반으로
		// // 13살 아기 비버 도리도리를 3반으로
		// // 
		
		ct.iphakStudent("포로리", 17, 1);
		ct.iphakStudent("아로리", 16, 2);
		ct.iphakStudent("도리도리", 13, 3);
		
		System.out.println("-----------------------");
		
		//선생님 또는 학생 추가시 Exception
		// // 아래 4건의 추가 시도는 각각 Exception인 경우들 입니다.
		// // Exception이 발생하는 이유를 각각 주석으로 달고
		// // Exception을 일으킨 부분만을 수정해서 정상적으로 추가되도록 만드시오
		// // ex) ct.infoC("김혜경", 23, "엄청난 강의스킬"); 이름이 중복되어서 예외발생
		// //     ct.infoC("연경모", 23, "엄청난 강의스킬"); -이름만 수정

		ct.iphakStudent("도리도리", 15, 3); // 이름 중복
		ct.iphakStudent("야옹이 형", 25, 1); // 선생님과 이름 중복
		ct.hireTeacher("울버", 48, "뭔가 이상한 징치를 만드는 재주"); // 이름이 3글자 이하
		ct.hireTeacher("동굴 아저씨", 00, "나쁜 아이는 동굴 안에 가둬버린다~"); // 선생님 중복
		
		// 전체정보 출력
		// // 선생님 목록은 정상적으로 출력되지만 학생목록은 정상적으로 출력되지 않습니다.
		// // 학생 목록이 선생님 목록과 마찬가지로 제대로 출력되게끔 수정하기 
		
		ct.printallstudent(student);
		ct.printallteacher(teacher);
		
		
		System.out.println("-----------------------");
		
		//검색기능
		// // 보노보노 및 범고래 장로님 검색시 
		// // 선생님 또는 학생이 출력되어야 합니다. 
		// // searchinfo의 코드에 오류를 찾아 수정하고
		// // 예외처리되는 경우엔 어떤 이유떄문에 오류가 나는지 주석으로 달아주세요
		
		ct.searchinfo("야옹이 형"); 
		ct.searchinfo("보노보노");
		ct.searchinfo("범고래 장로님"); 

	}
}
