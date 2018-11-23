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
				EndView.successMsg("��ǰ�����Ͱ� ����.");
			}
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("��� ��ǰ �˻��� ���� �߻�");
		}
	}
	public static void getAllBranches() {
		ArrayList<BranchDTO> allBranch = null;
		try{			
			allBranch = BranchDAO.getAllBranches();	
			if(allBranch.size() !=0 ) {
				EndView.productListView(allBranch);
			}else {
				EndView.successMsg("���� �����Ͱ� ����.");
			}
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("��� ������Ʈ �˻��� ���� �߻�");
		}
	}

/*	public static BrandDTO getBrand(String Brdcode, String procode){
		BrandDTO allBrand = null;
		try{
			allBrand = BrandDAO.getBrand(Brdcode, procode);
			if(allBrand !=null) {
				EndView.BrandView(allBrand);
			}else {
				EndView.successMsg("������Ʈ �����Ͱ� ����.");
			}
		}catch(SQLException s){
			s.printStackTrace();
				EndView.showError("��� ��� ����� �˻��� ���� �߻�");
		}
		return allBrand;
	}*/
	

		


	public static boolean updateStock(String procode, int quantity) {
		boolean result = false;
		try{
			result = StockDAO.updateStock(procode, quantity);
			if(result) {
				EndView.successMsg("��ǰ�ڵ�� ���� ���� �Ϸ�");	
			}else {
				EndView.successMsg("��ǰ�ڵ�� ���� ���� ����");
			}
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("��ǰ�ڵ�� ���� ���� ����");
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
				EndView.successMsg("��ǰ�ڵ�� ��� �˻��� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("��ǰ�ڵ�� ��� �˻��� ���� ");
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
				EndView.successMsg("���κ��� id�� �ش� ���κ��� �˻��� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("���κ��� id�� �ش� ���κ��� �˻� ���� ");
		}
		return stock;
	}
	
	   // ��ǰ�ڵ�� �˻�
	   public static void getProduct(String Procode) {
	      ProductDTO product = null;
	      try {
	         product = ProductDAO.getProduct(Procode);
	         if (product != null) {
	            EndView.allView(product);
	         } else {
	            EndView.successMsg("��ǰ ��ȣ�� �ش� ��ǰ ���� ������");
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	         EndView.showError("��ǰ ��ȣ�� �ش� ��ǰ �˻� ����");
	      }
	   }
	   public static void getBrand(String brdcode, String procode) {
		      BrandDTO brand = null;
		      try {
		         brand = BrandDAO.getBrand(brdcode, procode);
		         
		         if (brand != null) {
		            EndView.allView(brand);
		         } else {
		            EndView.successMsg("��ǰ ��ȣ�� �ش� ��ǰ ���� ������");
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		         EndView.showError("��ǰ ��ȣ�� �ش� ��ǰ �˻� ����");
		      }
		   }
	   
	}



