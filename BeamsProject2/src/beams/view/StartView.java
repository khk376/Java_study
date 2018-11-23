package beams.view;

import beams.service.BeamsProductController;

public class StartView {

	public static void main(String [] args){
		System.out.println("***** 모든 진행되는 실제 Project 검색 *****");
		 BeamsProductController.getAllProduct();
		
		//모든 재능 기부자들 검색
		System.out.println("\n***** 모든 지점 검색 *****");
		BeamsProductController.getAllBranch();
		
		//특정 브랜드 정보 검색
		System.out.println("\n***** 특정 브랜드 정보 검색 *****");
		BeamsProductController.getBrand("DANTON");
		
		
		//프로보노 id로 프로보노 목적 수정	
		//test data - id : schweitzer,  목적 : 애완동물사랑
		System.out.println("\n***** 특정 재고수량 정보 수정후 재 검색 *****");
		boolean result = BeamsProductController.updateStock(null, 0);
		BeamsProductController.getStocks(null);
	}
	
}
