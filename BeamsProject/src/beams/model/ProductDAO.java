package beams.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beams.model.dto.ProductDTO;
import beams.model.util.DBUtil;

public class ProductDAO {
	// 제품 등록(insert)
	public static boolean addProduct(ProductDTO product) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into Product_info values(?, ?, ?, ?, ?)");
			pstmt.setString(1, product.getProcode());
			pstmt.setString(2, product.getProName());
			pstmt.setInt(3, product.getPrice());
			pstmt.setString(4, product.getColor());
			pstmt.setString(5, product.getCategory());

			int result = pstmt.executeUpdate();

			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// 제품 코드로 가격 수정(update)
	public static boolean updateProduct(String Procode, int price) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement("update Product_info set price=? where Procode=?");
			pstmt.setInt(1, price);
			pstmt.setString(2, Procode);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// 제품 삭제(delete)
	public static boolean deleteProduct(String Procode) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement("delete from Product_info where Procode=?");
			pstmt.setString(1, Procode);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// 모든 제품 검색 반환(select)
	public static ArrayList<ProductDTO> getAllProducts() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ProductDTO> all = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from Product_info");
			rset = pstmt.executeQuery();

			all = new ArrayList<ProductDTO>();
			while (rset.next()) {
				all.add(new ProductDTO(rset.getString(1), rset.getString(2), rset.getInt(3), rset.getString(4),
						rset.getString(5)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}

	// 제품 코드로 모든 정보 반환(select)
	public static ProductDTO getProduct2(String Procode) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ProductDTO product = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from Product_info where Procode=?");
			pstmt.setString(1, Procode);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				product = new ProductDTO(rset.getString(1), rset.getString(2), rset.getInt(3), rset.getString(4),
						rset.getString(5));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return product;
	}
	
	public static ProductDTO getProduct(String Procode) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ProductDTO product = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select proname from product_info where procode like 'D%';");
//			pstmt.setString(1, Procode);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				product = new ProductDTO(rset.getString(1), rset.getString(2), rset.getInt(3), rset.getString(4),
						rset.getString(5));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return product;
	}
}