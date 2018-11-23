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
				EndView.successMsg("��ǰ�����Ͱ� ����.");
			}
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("��� ��ǰ �˻��� ���� �߻�");
		}
	}
	public static void getAllBranch() {
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

	public static void getBrand(String Brdcode) {
		ArrayList<BrandDTO> allBrand = null;
		try{			
			allBrand = BrandDAO.getAllBrands();	
			if(allBrand.size() !=0 ) {
				EndView.productListView(allBrand);
			}else {
				EndView.successMsg("�귣�� �����Ͱ� ����.");
			}
		}catch(SQLException s){
			s.printStackTrace();
			EndView.showError("��� �귣�� �˻��� ���� �߻�");
		}
	}
		


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

	public static StockDTO getStocks(String procode) {
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
		
	}

