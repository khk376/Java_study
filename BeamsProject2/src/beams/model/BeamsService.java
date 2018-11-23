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
			throw new NotExistException("검색하신 브랜드 정보가 없습니다.");
		}
	}
	//새로운 브랜드 저장
	public static boolean addBrand(BrandDTO brand) throws SQLException{
		return BrandDAO.addBrand(brand);
	}
	
	//브랜드 삭제
	public boolean deleteBrand(String Brdcode) throws SQLException, NotExistException{
		notExistBrand(Brdcode);
		return BrandDAO.deleteBrand(Brdcode);
	}
	//브랜드 id로 검색
	public static BrandDTO getBrand(String Brdcode) throws SQLException, NotExistException{
		BrandDTO brand = BrandDAO.getBrand(Brdcode);
		if(brand == null){
			throw new NotExistException("검색하신 브랜드 정보가 없습니다.");
		}
		return brand;
}
	//모든 브랜드 정보 반환
	public static ArrayList<BrandDTO> getAllBrands() throws SQLException{
		return BrandDAO.getAllBrands();
	}
	
	
	
	
	
	public static void notExistActivist(String procode) throws NotExistException, SQLException{
		StockDTO activist = StockDAO.getStock(procode);
		if(activist == null){
			throw new NotExistException("검색하는 재고 정보가 미 존재합니다.");
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
			throw new NotExistException("검색하는 재고수량 정보가 미 존재합니다.");
		}
		return quantity;
	}
	public static ArrayList<StockDTO> getAllStocks() throws SQLException{
		return StockDAO.getAllStocks();
	}
	
	
}

