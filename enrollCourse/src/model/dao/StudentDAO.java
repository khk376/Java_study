package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.Student;
import view.RunningEndView;

public class StudentDAO {
	
	public static boolean setStudent(String regNo, String colName, String value) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/datas", " ", " ");				
			switch(colName) {
				case "email":{
					pstmt = con.prepareStatement("update student set email=? where stuno=?");
					break;
				}
					
				case "phone":{
					pstmt = con.prepareStatement("update student set phone=? where stuno=?");
					break;
				}
			}

			pstmt.setString(1, value);
			pstmt.setString(2, regNo);
				
			RunningEndView.printMsg("");
			int result = pstmt.executeUpdate();
				
			if(result == 1){
				con.close();
				return true;
			}
				
		} catch(SQLException s) {
			s.printStackTrace();	
		} finally {
			con.close();
		}
		return false;
	}
	
	public static Student getStudent(String regNo) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Student student = null;
		
		try{
			con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/datas", " ", " ");
			pstmt = con.prepareStatement("select * from student where stuno=?");
			pstmt.setString(1, regNo);
			rset = pstmt.executeQuery();
			if(rset.next()){
				student = new Student(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6), rset.getString(7), rset.getInt(8));
			}
		} catch(SQLException s) {
			s.printStackTrace();
			throw s;
		} finally{
			con.close();
		}
		
		return student;
	}
	
	public static ArrayList<Student> getAllStudent() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Student> list = null;
		try{
			con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/datas", " ", " ");
			pstmt = con.prepareStatement("select * from student");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Student>();
			while(rset.next()){
				list.add(new Student(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6), rset.getString(7), rset.getInt(8)));
			}
		}catch(SQLException s){
			s.printStackTrace();
			throw s;
		}finally{
			con.close();
		}
		return list;
	}
}
