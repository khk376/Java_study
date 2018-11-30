package beams.model;

import java.sql.SQLException;
import java.util.ArrayList;

import beams.exception.NotExistException;
import beams.model.dto.BranchDTO;
import beams.model.dto.ProductDTO;

public class BeamsService {
	private static BeamsService instance = new BeamsService();

	private BeamsService() {
	}

	public static BeamsService getInstance() {
		return instance;
	}

	// Product - CRUD
	public static void notExistProduct(String Procode) throws NotExistException, SQLException {
		ProductDTO product = ProductDAO.getProduct(Procode);
		if (product == null) {
			throw new NotExistException("해당 검색 제품 미존재");
		}
	}

	public static boolean addProduct(ProductDTO product) throws SQLException {
		return ProductDAO.addProduct(product);
	}

	public static boolean updateProduct(String Procode, int Price) throws SQLException, NotExistException {
		notExistProduct(Procode);
		return ProductDAO.updateProduct(Procode, Price);
	}

	public boolean deleteProduct(String Procode) throws SQLException, NotExistException {
		notExistProduct(Procode);
		return ProductDAO.deleteProduct(Procode);
	}

	public static ProductDTO getProduct(String Procode) throws SQLException, NotExistException {
		ProductDTO product = ProductDAO.getProduct(Procode);
		if (product == null) {
			throw new NotExistException("해당 검색 제품 미존재");
		}
		return product;
	}

	public static ArrayList<ProductDTO> getAllProducts() throws SQLException {
		return ProductDAO.getAllProducts();
	}

	// Branch CRD
	public static void notExistBranch(String Brcode) throws NotExistException, SQLException {
		BranchDTO branch = BranchDAO.getBranch(Brcode);
		if (branch == null) {
			throw new NotExistException("해당 검색 지점 미존재");
		}
	}

	public static boolean addBranch(BranchDTO branch) throws SQLException {
		return BranchDAO.addBranch(branch);
	}

	public boolean deleteBranch(String Brcode) throws SQLException, NotExistException {
		notExistBranch(Brcode);
		return BranchDAO.deleteBranch(Brcode);
	}

	public static BranchDTO getBranch(String Brcode) throws SQLException, NotExistException {
		BranchDTO branch = BranchDAO.getBranch(Brcode);
		if (branch == null) {
			throw new NotExistException("해당 검색 지점 미존재");
		}
		return branch;
	}

	public static ArrayList<BranchDTO> getAllBranches() throws SQLException {
		return BranchDAO.getAllBranches();
	}
}
