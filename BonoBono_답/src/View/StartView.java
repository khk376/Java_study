package View;

import java.util.ArrayList;

import Controll.Controller;
import Database.Student;
import Database.Teacher;

// // 위 import 들을 전부 지워서 직접 문제 해결하게 하는 것은?

public class StartView {

	public static void main(String[] args) {
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
		
		ct.infoC("보노보노 아빠");

		System.out.println("-----------------------");
		
		//학생 반변경
		// // 아래 두 줄을 ?? 처리하고, 여기에 코드를 넣어서  콘솔 창에 
		// // 이미 동일한 반에 소속되어 있습니다.
		// // 성공적으로 반이 변경되었습니다.
		// // 위 두 줄 출력하기.
		
		ct.infoC("보노보노", 1);
		ct.infoC("너부리", 2);
		
		System.out.println("-----------------------");
		
		//학생추가
		// // 아래 3 명의 학생을 추가하세요
		// // 17살 포로리 큰누나 도로리를 1반으로
		// // 16살 포로리 작은누나 아로리를 2반으로
		// // 13살 아기 비버 도리도리를 3반으로
		// // 
		
		ct.infoC("도로리", 17, 1);
		ct.infoC("아로리", 16, 2);
		ct.infoC("도리도리", 15, 3);
		
		System.out.println("-----------------------");
		
		//선생님 또는 학생 추가시 Exception
		// // 아래 4건의 추가 시도는 각각 Exception인 경우들 입니다.
		// // 야옹이 형은 이미 선생님인 경우, 울버는 이름제한, 동굴 아저씨는 이미 있는 선생님.

		ct.infoC("도리도리", 15, 3);
		ct.infoC("야옹이 형", 25, 1);
		ct.infoC("울버", 48, "뭔가 이상한 징치를 만드는 재주");
		ct.infoC("동굴 아저씨", 00, "나쁜 아이는 동굴 안에 가둬버린다~");
		
		// 전체정보 출력
		// // 학생 목록이 선생님 목록과 마찬가지로 제대로 출력되게끔 수정하기 
		
		ct.printallstudent(student);
		ct.printallteacher(teacher);
		
		
		System.out.println("-----------------------");
		
		//검색기능
		// // 보노보노 및 범고래 장로님 검색시 
		// // 이 메시지 대신 선생님 또는 학생이 출력되어야 합니다. 
		// // 또는 예외처리가 발생하는 이유와, 개선방안을 주석으로 적어주세요
		// // 1. 보노보노의 경우 : [이유] Student 의 toString 이 정의되지 않아 People 의 toString이 출력되었다. 
		// // 	 			 [개선방안] Teacher 에서 .toString 을 복사하여 Student 내용을 넣어준다.
		// // 2. 범고래 장로님의 경우 : [이유] 목록에 없는 이름이므로 searchinfo에서 try-catch중 e.printStackTrace(); 당첨
		// // 					[개선방안] e.printStackTrace(); 대신 System.out.println(); 활용
		ct.searchinfo("야옹이 형");
		ct.searchinfo("보노보노");
		ct.searchinfo("범고래 장로님"); 
		// //  1. 위 코드에서 보노보노가 아닌 포로리가 출력되는 이유를 찾고, 보노보노가 출력되게 코드를 수정하세요
	}
}
