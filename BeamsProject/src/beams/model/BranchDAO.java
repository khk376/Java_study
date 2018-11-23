package beams.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beams.model.dto.BranchDTO;
import beams.model.util.DBUtil;

public class BranchDAO {

	// 지점 등록(insert)
	public static boolean addBranch(BranchDTO branch) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into Branch_info values(?, ?, ?)");
			pstmt.setString(1, branch.getBrcode());
			pstmt.setString(2, branch.getBrName());
			pstmt.setString(3, branch.getLocName());

			int result = pstmt.executeUpdate();

			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// 지점 삭제(delete)
	public static boolean deleteBranch(String Brcode) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement("delete from Branch_info where Brcode=?");
			pstmt.setString(1, Brcode);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// 모든 지점 검색 반환(select)
	public static ArrayList<BranchDTO> getAllBranches() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<BranchDTO> all = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from Branch_info");
			rset = pstmt.executeQuery();

			all = new ArrayList<BranchDTO>();
			while (rset.next()) {
				all.add(new BranchDTO(rset.getString(1), rset.getString(2), rset.getString(3)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}

	// 지점 코드로 모든 정보 반환(select)
	public static BranchDTO getBranch(String Brcode) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		BranchDTO branch = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from Branch_info where Brcode=?");
			pstmt.setString(1, Brcode);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				branch = new BranchDTO(rset.getString(1), rset.getString(2), rset.getString(3));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return branch;
	}
}
