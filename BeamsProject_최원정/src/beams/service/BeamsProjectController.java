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
				EndView.showSuccess("��û ��ǰ ������");
			}
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��� ��ǰ �˻��� ���� �߻�");
		}
		return allProducts;
	}

	public static boolean addProduct(ProductDTO product) {
		boolean result = false;

		try {
			result = ProductDAO.addProduct(product);
			if (result) {
				EndView.showSuccess("��ǰ ��� �Ϸ�");
			} else {
				EndView.showSuccess("�����ǰ ������");
			}
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��� ��ǰ ����� ���� �߻�");
		}
		return result;
	}
}
