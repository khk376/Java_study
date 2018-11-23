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

	private static BeamsProductController instance = new BeamsProductController();

	private BeamsProductController() {
	}

	public static BeamsProductController getInstance() {
		return instance;
	}
	public static void getAllProducts() {
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
	public static void getAllBranches() {
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

/*	public static BrandDTO getBrand(String Brdcode, String procode){
		BrandDTO allBrand = null;
		try{
			allBrand = BrandDAO.getBrand(Brdcode, procode);
			if(allBrand !=null) {
				EndView.BrandView(allBrand);
			}else {
				EndView.successMsg("프로젝트 데이터가 없음.");
			}
		}catch(SQLException s){
			s.printStackTrace();
				EndView.showError("모든 재능 기부자 검색시 에러 발생");
		}
		return allBrand;
	}*/
	

		


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

/*	public static StockDTO getStocks(String procode) {
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
		*/
	public static StockDTO getStock(String procode) {
		StockDTO stock = null;
		try {
			
			stock = StockDAO.getStock(procode);
			if(stock!=null) {
				EndView.allView(stock);
				
			}else {
				EndView.successMsg("프로보노 id로 해당 프로보노 검색시 정보 없음");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("프로보노 id로 해당 프로보노 검색 오류 ");
		}
		return stock;
	}
	
	   // 제품코드로 검색
	   public static void getProduct(String Procode) {
	      ProductDTO product = null;
	      try {
	         product = ProductDAO.getProduct(Procode);
	         if (product != null) {
	            EndView.allView(product);
	         } else {
	            EndView.successMsg("제품 번호로 해당 제품 정보 미존재");
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	         EndView.showError("제품 번호로 해당 제품 검색 오류");
	      }
	   }
	   public static void getBrand(String brdcode, String procode) {
		      BrandDTO brand = null;
		      try {
		         brand = BrandDAO.getBrand(brdcode, procode);
		         
		         if (brand != null) {
		            EndView.allView(brand);
		         } else {
		            EndView.successMsg("제품 번호로 해당 제품 정보 미존재");
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		         EndView.showError("제품 번호로 해당 제품 검색 오류");
		      }
		   }
	   
	}



