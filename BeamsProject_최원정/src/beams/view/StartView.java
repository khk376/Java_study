package beams.view;

import beams.model.dto.ProductDTO;
import beams.service.BeamsProjectController;

public class StartView {

	public static void main(String[] args) {
		BeamsProjectController controller = BeamsProjectController.getInstance();
		
		controller.getAllProducts();
		controller.addProduct(new ProductDTO("D-00000000", "new", 50000, "white", "jacket"));
		controller.getAllProducts();
	}

}
