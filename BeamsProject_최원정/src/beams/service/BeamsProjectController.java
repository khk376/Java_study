package beams.service;

import java.sql.SQLException;
import java.util.ArrayList;

import beams.model.ProductDAO;
import beams.model.dto.ProductDTO;
import beams.view.EndView;

public class BeamsProjectController {
	private static BeamsProjectController instance = new BeamsProjectController();

	private BeamsProjectController() {
	}

	public static BeamsProjectController getInstance() {
		return instance;
	}

	public static ArrayList<ProductDTO> getAllProducts() {
		ArrayList<ProductDTO> allProducts = null;
		try {
			allProducts = ProductDAO.getAllProducts();
			if (allProducts.size() != 0) {
				EndView.ListView(allProducts);
			} else {
				EndView.showSuccess("요청 제품 미존재");
			}
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("모든 제품 검색시 에러 발생");
		}
		return allProducts;
	}

	public static boolean addProduct(ProductDTO product) {
		boolean result = false;

		try {
			result = ProductDAO.addProduct(product);
			if (result) {
				EndView.showSuccess("제품 등록 완료");
			} else {
				EndView.showSuccess("등록제품 미존재");
			}
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("모든 제품 저장시 에러 발생");
		}
		return result;
	}
}
