package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.Enroll;


public class EnrollDAO {

	public static ArrayList<Enroll> getAllRegister() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Enroll> list = null;
		
		try{
			con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/datas", " ", " ");
			pstmt = con.prepareStatement("select eno, e.stuno, stu.name, e.subno, sub.name, p.name from enroll e join student stu on e.stuno=stu.stuno join subject sub on e.subno=sub.subno join professor p on sub.pno=p.pno");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<Enroll>();
			
			while(rset.next()) {
				list.add(new Enroll(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6)));
			}
		} catch(SQLException s) {
			s.printStackTrace();
			
		} finally {
			con.close();
		}
		return list;
	}

}
