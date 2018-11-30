package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.Subject;

public class SubjectDAO {
	public static Subject getSubject(String regNo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Subject subject = null;
		
		try {
			con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/datas", " ", " ");
			pstmt = con.prepareStatement("select * from subject where subno=?");
			pstmt.setString(1, regNo);
			rset = pstmt.executeQuery();
			if(rset.next()){
				subject = new Subject(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5), rset.getInt(6), rset.getString(7),rset.getString(8), rset.getString(9), rset.getString(10), rset.getString(11));
			}
		} catch(SQLException s) {
			s.printStackTrace();
		} finally {
			con.close();
		}
		
		return subject;
	}
	
	public static ArrayList<Subject> getProfSubject(String pno) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Subject> list = null;
		
		try{
			con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/datas", " ", " ");
			pstmt = con.prepareStatement("select * from subject where pno=?");
			pstmt.setString(1, pno);
			
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Subject>();
			while(rset.next()){
				list.add(new Subject(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5), rset.getInt(6), rset.getString(7),rset.getString(8), rset.getString(9), rset.getString(10), rset.getString(11)));
			}
			
		} catch(SQLException s) {
			s.printStackTrace();
			
		} finally {
			con.close();
		}
		return list;
	}
	
	public static ArrayList<Subject> getAllSubject() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Subject> list = null;
		try {
			con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/datas", " ", " ");
			pstmt = con.prepareStatement("select * from subject");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Subject>();
			while(rset.next()){
				list.add(new Subject(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5), rset.getInt(6), rset.getString(7),rset.getString(8), rset.getString(9), rset.getString(10), rset.getString(11)));
			}
		} catch(SQLException s) {
			s.printStackTrace();
		} finally {
			con.close();
		}
		return list;
	}
}
