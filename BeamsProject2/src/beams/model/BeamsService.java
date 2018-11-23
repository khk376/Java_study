package beams.model;

import java.sql.SQLException;
import java.util.ArrayList;

import beams.exception.NotExistException;
import beams.model.dto.BrandDTO;
import beams.model.dto.StockDTO;

public class BeamsService {

	private static BeamsService instance = new BeamsService();
	
	private BeamsService() {}
	
	public static BeamsService getInstance() {
		return instance;
	}
	//brand -CRUD
	public static void notExistBrand(String Brdcode) throws NotExistException, SQLException{
		BrandDTO brand = BrandDAO.getBrand(Brdcode);
		if(brand == null){
			throw new NotExistException("�˻��Ͻ� �귣�� ������ �����ϴ�.");
		}
	}
	//���ο� �귣�� ����
	public static boolean addBrand(BrandDTO brand) throws SQLException{
		return BrandDAO.addBrand(brand);
	}
	
	//�귣�� ����
	public boolean deleteBrand(String Brdcode) throws SQLException, NotExistException{
		notExistBrand(Brdcode);
		return BrandDAO.deleteBrand(Brdcode);
	}
	//�귣�� id�� �˻�
	public static BrandDTO getBrand(String Brdcode) throws SQLException, NotExistException{
		BrandDTO brand = BrandDAO.getBrand(Brdcode);
		if(brand == null){
			throw new NotExistException("�˻��Ͻ� �귣�� ������ �����ϴ�.");
		}
		return brand;
}
	//��� �귣�� ���� ��ȯ
	public static ArrayList<BrandDTO> getAllBrands() throws SQLException{
		return BrandDAO.getAllBrands();
	}
	
	
	
	
	
	public static void notExistActivist(String procode) throws NotExistException, SQLException{
		StockDTO activist = StockDAO.getStock(procode);
		if(activist == null){
			throw new NotExistException("�˻��ϴ� ��� ������ �� �����մϴ�.");
		}
	}
	public static boolean addStock(StockDTO stock) throws SQLException{
		return StockDAO.addStock(stock);	
	}
	public static boolean updateStock(String procode, int quantity) throws SQLException, NotExistException{
		notExistActivist(procode);
		return StockDAO.updateStock(procode, quantity);
	}
	
	public static StockDTO getStock(String procode) throws SQLException, NotExistException{
		StockDTO quantity = StockDAO.getStock(procode);
		if(quantity == null){
			throw new NotExistException("�˻��ϴ� ������ ������ �� �����մϴ�.");
		}
		return quantity;
	}
	public static ArrayList<StockDTO> getAllStocks() throws SQLException{
		return StockDAO.getAllStocks();
	}
	
	
}

