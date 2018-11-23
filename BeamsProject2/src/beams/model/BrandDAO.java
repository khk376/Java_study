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
			int result=pstmt.executeUpdate();
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
	public static BrandDTO getBrand(String Brdcode) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		BrandDTO brand = null;
		
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from brand_info where brdcode=?");
			pstmt.setString(1, Brdcode);
			rset = pstmt.executeQuery();
			if(rset.next()){
				brand = new BrandDTO(rset.getString(1), rset.getString(2), rset.getString(3));
			}			
		}finally{
			DBUtil.close(con, pstmt, rset);
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
