/* create table Stock_info(
	Brcode char(10) constraint Stock_info_Brcode_fk references Branch_info(Brcode),
	Procode char(10) constraint Stock_info_Procode_fk references Product_info(Procode),
	constraint st_PK primary key (Brcode, Procode),
	ReceiveDate number(10),
	quantity number(5)
	);
 */

package beams.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beams.model.dto.StockDTO;
import beams.model.util.DBUtil;

public class StockDAO {

	public static boolean addStock(StockDTO stock) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into stock_info values(?, ?, ?, ?)");
			pstmt.setString(1, stock.getBrcode());
			pstmt.setString(2, stock.getProcode());
			pstmt.setInt(3, stock.getReceiveDate());
			pstmt.setInt(4, stock.getQuantity());

			
			int result = pstmt.executeUpdate();
		
			if(result == 1){
				return true;
			}
			
		}catch(SQLException s){
			s.printStackTrace();
			throw s;
		}finally{
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	//제품코드로 재고량 수정하기
	public static boolean updateStock(String procode, int quantity ) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("update stock_info set quantity=? where procode=?");
			pstmt.setInt(1, quantity);
			pstmt.setString(2, procode);
			
			int result = pstmt.executeUpdate();
			if(result == 1){
				return true;
			}
		}catch(SQLException s){
			s.printStackTrace();
			throw s;
		}finally{
			DBUtil.close(con, pstmt);
		}
		return false;
	
	}

	//프로포노 아이디로 해당 프로보노 모든 정보 검색
	public static StockDTO getStock(String procode) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		StockDTO quantity = null;
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select quantity from stock_info where procode=?");
			pstmt.setString(1, procode);
			rset = pstmt.executeQuery();
			if(rset.next()){
				quantity = new StockDTO(rset.getString(1), rset.getString(2), rset.getInt(3),rset.getInt(4));
			}
		}catch(SQLException s){
			s.printStackTrace();
			throw s;
		}finally{
			DBUtil.close(con, pstmt, rset);
		}
		return quantity;
	}
	
	//모든 제품의 재고량 검색
	public static ArrayList<StockDTO> getAllStocks() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<StockDTO> list = null;
		try{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from Stock_info");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<StockDTO>();
			while(rset.next()){
				list.add(new StockDTO(rset.getString(1), rset.getString(2), rset.getInt(3), rset.getInt(4)) );
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
