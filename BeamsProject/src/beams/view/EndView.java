package beams.view;

import java.util.ArrayList;

import beams.model.dto.BrandDTO;
import beams.model.dto.ProductDTO;


public class EndView {

	public static void productListView(ArrayList allProduct){
		int length = allProduct.size();
		if( length != 0 ){
			for(int index = 0; index < length; index++){			
				System.out.println("�˻����� " + (index+1) + " - " + allProduct.get(index));
			}
		}
	}
/*	public static void BrandListView(BrandDTO allBrand){
		int length = allBrand();
		if( length != 0 ){
			for(int index = 0; index < length; index++){			
				System.out.println("�˻����� " + (index+1) + " - " + allBrand.get(index));
			}
		}
	}
*/	//Ư�� ������Ʈ ��� 
	public static void projectView(ProductDTO product){
		System.out.println(product);		
	}
	
	public static void BrandView(BrandDTO allbrand){
		System.out.println(allbrand);		
	}
	
	
	//?? ��� DTO ���� ����ϴ� �޼ҵ�
	public static void allView(Object object){
		System.out.println(object);
	}
	
	
	//���� ��Ȳ ���
	public static void showError(String message){
		System.out.println(message);		
	}

	public static void successMsg(String msg) {

		System.out.println(msg);
	}
	
	
}

