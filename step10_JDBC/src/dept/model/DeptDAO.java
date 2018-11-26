/** 개발 단계
 * table 구축(DB) -> DTO클래스 -> DAO 클래스 -> Controller & View
 * 
 *  1. DBUtil 활용
 * 2. dept table의 crud 로직을 의사 코드 정리 -> 실전 코드로 개발
 *    1. 의사 코드
 *    	 	- 말로 하는 코딩, 개념으로 코딩, 영어로 하는 코딩
 *    		- 임시 가이드
 *    2. 실전 코드
 *    		- 로직별 메소드 구분
 *    3. 개발 단계
 *    		1. DAO 클래스라 가정
 *    			- Data Access Object 즉 db 통신 전담 클래스
 *    		
 *    		2. CRUD 기능 구현시 클래스 개발 설계
 *    			1. 각 기능별 메소드 분리해서 개발
 *    			2. 다양한 기기를 기반으로 요청, 응답 등 재사용성 고려화 표준화
 *    				- 종속적인 출력등은 배제(출력은 view)
 *    				- 요청별 로직만 수락 및 응답
 *    			3. 메소드 별 반환 타입, parameter type은?
 *    			insert, update, delete, selecet all 메소드 생성
 *    			4. 경우의 수 발생시 어떻게 처리?
 *    				- 발생된 로직 메소드 내에서 처리
 *    				- 요청한 곳으로 예외를 던져서 상황 전달
 *    		
 */
package dept.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dept.model.domain.DeptDTO;
import util.DBUtil;

public class DeptDAO {
	//저장
	/* 1. insert 메소드명? insert
	 * 2. parameter 타입은? int deptno,  String dname, String loc
	 * 			=>개별 데이터 insert(int deptno,  String dname, String loc)
	 * 			 or 객체 데이터 insert(DeptDTO dept)
	 * 					: dept.model.domain.DeptDTO
	 * 3. 반환타입? 
	 * 		- boolean?, void?, int?
	 * 
	 * 4. 예외처리? 
	 * 		- 메소드 선언구에서 throws로 설정
	 * 5. 필수sql : insert into dept values(?, ?, ?)
	 * 6. 자원반환 : finally 
	 * 7. 메소드 실행 결과
	 * 		경우의 수 1: 정상 실행
	 * 						->정상 저장 or 저장 불가
	 * 		경우의 수 2: 비정상 실행
	 * 						-SQLException 발생
	 */

	public static int insert(DeptDTO newDept) throws SQLException {
		Connection con=null;//접속 객체 타입
		PreparedStatement pstmt = null;
		int result =0;
		
		try {
			con =DBUtil.getConnection();
			pstmt = con.prepareStatement( "insert into dept values(?, ?, ?)");
			pstmt.setInt(1, newDept.getDeptno());
			pstmt.setString(2,  newDept.getDname());
			pstmt.setString(3, newDept.getLoc());
			result= pstmt.executeUpdate();
		}finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	}

	/* delete
	 * 1. deptno 값으로 존재하는 해당 부서만 삭제
	 * 2. parameter
	 * 3. 반환타입
	 * 4. 발생 가능한 경우의 수
	 * 		1. 정상
	 * 		2. 비정상
	 */

	public static int delete(DeptDTO getDept) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		int result=0;
		
		try
		{
			 con = DBUtil.getConnection();
	         pstmt = con.prepareStatement("delete from dept where deptno =  ?");
	         pstmt.setInt(1, getDept.getDeptno());
	         
	         result = pstmt.executeUpdate();
	      }finally {
	         DBUtil.close(con, pstmt);//public static void close(Connection con, Statement stmt) 
	      }
	      return result;

	}

	// 모든 검색
	/* 1. 반환 타입 : 동적 메모리의 배열 구조와 흡사한 index로 데이터 관리
	 * 					 ArrayList
	 * 2. parameter
	 * 	3. 검색한 데이터 수는 실시간 가변적
	 * 		- 검색한 데이터들을 어떻게 ArrayList에 까지 저장?
	 * 		- 
	 * 4. ArrayList 객체는 언제 만드실건지?
	 * 실행 가능한 경우의 수
	 * 1. 정상 실행
	 * 		1. 검색 데이터 존재
	 * 			DeptDTO 객체들이 저장된 ArrayList 객체 반환
	 * 		2. 검색 데이터 미존재
	 * 			DeptDTO 객체들이 미 존재하는 ArrayList 객체 반환
	 * 2. 비정상 실행
	 * 		- 예외 발생
	 * 
	 * select * from dept
	 */
	public static ArrayList<DeptDTO> selectAll() throws SQLException {
		Connection con = null ;
		PreparedStatement pstmt=null;
		ResultSet rset = null;
		
		ArrayList<DeptDTO> all = null;
		
		try {
			con=DBUtil.getConnection();
			pstmt=con.prepareStatement("select * from dept");
			rset=pstmt.executeQuery();


			
			/*select한 결과값으로 한 row당 DeptDTO 생성 -> ArrayList에 저장 -> 반환
			 */
			all = new ArrayList<DeptDTO>();
			while (rset.next()) {
				System.out.println(rset.getInt(1) + " " 
										 + rset.getString(2) + " " 
										 + rset.getString(3));
		/*  =System.out.println(rset.getInt("deptno") + " " 
			 							 + rset.getString("dname") + " " 
			 							 + rset.getString("loc")); */
		
			}

		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}

}





