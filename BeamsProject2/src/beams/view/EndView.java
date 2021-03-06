package beams.view;

import java.util.ArrayList;

import probono.model.dto.ProbonoProjectDTO;

public class EndView {

	public static void productListView(ArrayList allProduct){
		int length = allProduct.size();
		if( length != 0 ){
			for(int index = 0; index < length; index++){			
				System.out.println("검색정보 " + (index+1) + " - " + allProduct.get(index));
			}
		}
	}
	//특정 프로젝트 출력 
	public static void projectView(ProductDTO product){
		System.out.println(product);		
	}
	
	//?? 모든 DTO 정보 출력하는 메소드
	public static void allView(Object object){
		System.out.println(object);
	}
	
	
	//예외 상황 출력
	public static void showError(String message){
		System.out.println(message);		
	}

	public static void successMsg(String msg) {

		System.out.println(msg);
	}
	
	
}

