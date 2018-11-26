package step01.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBUtil;

public class DeptDAO {

	// insert
	public static void insert(int deptno, String dname, String loc) throws SQLException {
		Connection con = null;// 접속 객체 타임
		PreparedStatement pstmt = null;// sql문장 실행 객체
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into dept values(?, ?, ?)");

			// '?'선언 순서에 맞게 값 대입(타입은 반드시 고려 필수)
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);

			// 실제DB에 insert
			pstmt.executeUpdate();
		} finally {
			DBUtil.close(con, pstmt);
		}
	}

	// update
	public static void update(int deptno, String loc) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("update dept set loc=? where deptno=?");

			pstmt.setString(1, loc);
			pstmt.setString(3, loc);

			pstmt.executeUpdate();
		} finally {
			DBUtil.close(con, pstmt);
		}
	}

	// delete
	public static void delete(int deptno) {
	}

	// select - all
	public static void selectAll() throws SQLException {
		Connection con = null;// 접속 객체 타임
		Statement stmt = null;// sql문장 실행 객체
		ResultSet rset = null;// select 결과를 보유하게 되는 객체 타입
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rset = stmt.executeQuery("select * from dept");

			while (rset.next()) {
				System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
			}
		} finally {
			DBUtil.close(con, stmt, rset);
		}
	}
}




