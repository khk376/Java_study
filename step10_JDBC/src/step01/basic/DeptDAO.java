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
		Connection con = null;// ���� ��ü Ÿ��
		PreparedStatement pstmt = null;// sql���� ���� ��ü
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into dept values(?, ?, ?)");

			// '?'���� ������ �°� �� ����(Ÿ���� �ݵ�� ��� �ʼ�)
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);

			// ����DB�� insert
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
		Connection con = null;// ���� ��ü Ÿ��
		Statement stmt = null;// sql���� ���� ��ü
		ResultSet rset = null;// select ����� �����ϰ� �Ǵ� ��ü Ÿ��
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




