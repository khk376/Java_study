package beams.service;

import java.sql.SQLException;
import java.util.ArrayList;

import beams.model.BranchDAO;
import beams.model.BrandDAO;
import beams.model.ProductDAO;
import beams.model.StockDAO;
import beams.model.dto.BranchDTO;
import beams.model.dto.BrandDTO;
import beams.model.dto.ProductDTO;
import beams.model.dto.StockDTO;
import beams.view.EndView;

public class BeamsProductController {

	public static void getAllProduct() {
		ArrayList<ProductDTO> allProduct = null;
		try{			
			allProduct = ProductDAO.getAllProducts();	
			if(allProduct.size() !=0 ) {
				EndView.productListView(allProduct);
			}else {
				EndView.successMsg("제품데이터가 없음.");
			}
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("모든 제품 검색시 에러 발생");
		}
	}
	public static void getAllBranch() {
		ArrayList<BranchDTO> allBranch = null;
		try{			
			allBranch = BranchDAO.getAllBranches();	
			if(allBranch.size() !=0 ) {
				EndView.productListView(allBranch);
			}else {
				EndView.successMsg("지점 데이터가 없음.");
			}
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("모든 프로젝트 검색시 에러 발생");
		}
	}

	public static void getBrand(String Brdcode) {
		ArrayList<BrandDTO> allBrand = null;
		try{			
			allBrand = BrandDAO.getAllBrands();	
			if(allBrand.size() !=0 ) {
				EndView.productListView(allBrand);
			}else {
				EndView.successMsg("브랜드 데이터가 없음.");
			}
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("모든 브랜드 검색시 에러 발생");
		}
	}
		


	public static boolean updateStock(String procode, int quantity) {
		boolean result = false;
		try{
			result = StockDAO.updateStock(procode, quantity);
			if(result) {
				EndView.successMsg("제품코드로 수량 수정 완료");	
			}else {
				EndView.successMsg("제품코드로 수량 수정 실패");
			}
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("제품코드로 수량 수정 오류");
		}
		return result;
	}

	public static StockDTO getStocks(String procode) {
		StockDTO quantity = null;
		try {
			
			quantity = StockDAO.getStock(procode);
			if(quantity!=null) {
				EndView.allView(quantity);
				
			}else {
				EndView.successMsg("제품코드로 재고량 검색시 정보 없음");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("제품코드로 재고량 검색시 오류 ");
		}
		return quantity;
	}
		
	}

