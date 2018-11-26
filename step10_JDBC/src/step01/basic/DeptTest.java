package step01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptTest {
	
	

	public static void main(String[] args) {
		Connection con = null;// 접속 객체 타임
		Statement stmt = null;// sql문장 실행 객체
		ResultSet rset = null;// select 결과를 보유하게 되는 객체 타입
		try {
			// 1단계 : driver 메모리에 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver 로딩 완료.");

			// 2단계 : 접속(id/pw/db url) : Connection
			// =>db위치 알기위해 url도 필요
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "SCOTT", "TIGER");
			System.out.println(con);
			// 3단계 : sql문장 작성
			/*
			 * select - 검색한 data가 table 구조로 검색 자바의 연관된 타입 : ResultSet insert/update/delete -
			 * table에 저장, 수정, 삭제한 row수 자바의 연관된 타입 : int
			 */
			// 4단계 : sql문장 실행 및 활용
			stmt = con.createStatement();
			// 모든 검색 - select(query)
			rset = stmt.executeQuery("select * from dept");
			while (rset.next()) {
				System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
			}
			// insert
			int resultNo = stmt.executeUpdate("insert into dept values(35, '교육부', '교대')");
			System.out.println(resultNo + "행 저장");

			// 모든검색 - select(query)
			rset = stmt.executeQuery("select *from dept");
			while (rset.next()) {
				System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
			}
		/* 실행시 발생 가능한 경우의 수
		 * 1. sql문장 실행 오류
		 * 2. 정상
		 * 		1. 데이터가 있더라
		 * 			next() / getXxx()
		 * 		2. 데이터가 없더라
		 * 			next() 검증후 없을 경우 getXxx()호출 안함
		 */
		
		//5단계 : 종료(자원반환
		
		} catch (Exception e) {// 예외 클래스들 상위타입, 자식 타입 모두 수용 가능(다형성)
			 e.printStackTrace();
		} finally {
			try {
				if(rset!=null) {
					rset.close();
					rset=null;
				}
				if(stmt!= null) {
					stmt.close();
					stmt=null;
				}
				if (con != null) {
					con.close();
					con = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}

	
