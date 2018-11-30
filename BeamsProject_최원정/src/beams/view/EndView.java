package beams.view;

import java.util.ArrayList;

import beams.model.dto.ProductDTO;

public class EndView {

	public static void ListView(ArrayList<ProductDTO> allProducts) {
		System.out.println(allProducts);
	}

	public static void showSuccess(String message) {
		System.out.println(message);
	}

	public static void showError(String message) {
		System.out.println(message);
	}

}
