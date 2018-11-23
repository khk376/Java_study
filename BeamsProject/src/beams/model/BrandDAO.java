/*create table Brand_info(
	Brdcode char(10),
	BrdName char(10),
	ProCode char(10) constraint Brand_info_ProCode_fk references Product_info(Procode),
	constraint br_PK primary key (brdcode, procode)
	);
 */
package beams.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beams.model.dto.BrandDTO;
import beams.model.util.DBUtil;


public class BrandDAO {

	//브랜드 검색(insert)
	public static boolean addBrand(BrandDTO brand) throws SQLException{
		
		Connection con = null;
		PreparedStatement pstmt= null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into Brand_info values(?, ?, ?)");
			pstmt.setString(1, brand.getBrdcode());
			pstmt.setString(2, brand.getBrdName());
			pstmt.setString(3, brand.getProCode());
		
			int result = pstmt.executeUpdate();
			
			if(result == 1){
				return true;
			}
		}finally{
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
	//삭제
	public static boolean deleteBrand(String Brdcode) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt=con.prepareStatement("delete from Brand_info where Brdcode=?");
			pstmt.setString(1, Brdcode);
			{return true;
			}
		}catch(SQLException s){
			s.printStackTrace();
			throw s;
		}finally{
			DBUtil.close(con, pstmt);
		}
	}
	//brdcode로 해당 브랜드 정보 검색
/*	public static BrandDTO getBrand(String Brdcode, String procode) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		BrandDTO brandInfo = null;
		try {
			con = DBUtil.getConnection();
			System.out.println("1번 마");
			//pstmt=con.prepareStatement("select * from Brand_info where Brdcode=  ?  and Procode=  ? ");
			pstmt=con.prepareStatement("select * from Brand_info");
			System.out.println("2번 마");
			//pstmt.setString(1, Brdcode);
			//pstmt.setString(2, procode);
			
			System.out.println("3번 마");
			rset = pstmt.executeQuery();
			System.out.println("4번 마");
			
			rset.next();
			System.out.println(rset.next());
			System.out.println(rset.getString(1));
			System.out.println(rset.getString(2));
			System.out.println(rset.getString(3));
			
			if(rset.next()) {
				System.out.println(rset.next());
				brandInfo = new BrandDTO(rset.getString(1), rset.getString(2), rset.getString(3));
			}
		}
		finally{
			DBUtil.close(con, pstmt, rset);
		}
		return brandInfo;
	}*/
	 public static BrandDTO getBrand(String brdcode, String procode) throws SQLException {
	      Connection con = null;
	      Statement stmt = null;
	      ResultSet rset = null;
	      BrandDTO brand = null;

	      System.out.println(brdcode);
	      System.out.println(procode);
	      try {
	         con = DBUtil.getConnection();
	         stmt = con.createStatement();
	         //pstmt = con.prepareStatement("select * from Brand_info where Brdcode=? and procode=?");
	         
	        // pstmt.setString(1, brdcode.trim());
	        //   pstmt.setString(2, procode.trim());
	         rset = stmt.executeQuery("select * from Brand_info where Brdcode='"+ brdcode  + "' and procode='" +  procode + "'");
	         
	         if (rset.next()) {
	            brand = new BrandDTO(rset.getString(1), rset.getString(2), rset.getString(3));
	         }
	      } finally {
	         DBUtil.close(con, stmt, rset);
	      }
	      return brand;
	 }
	// 모든 브랜드 검색
	public static ArrayList<BrandDTO> getAllBrands() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<BrandDTO> list = null;
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from brand_info");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<BrandDTO>();
			while(rset.next()){
				list.add(new BrandDTO(rset.getString(1), rset.getString(2), rset.getString(3)) );
			}
		}catch(SQLException s){
			s.printStackTrace();
			throw s;
		}finally{
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
}
