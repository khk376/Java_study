package beams.view;

import java.util.ArrayList;

import probono.model.dto.ProbonoProjectDTO;

public class EndView {

	public static void productListView(ArrayList allProduct){
		int length = allProduct.size();
		if( length != 0 ){
			for(int index = 0; index < length; index++){			
				System.out.println("�˻����� " + (index+1) + " - " + allProduct.get(index));
			}
		}
	}
	//Ư�� ������Ʈ ��� 
	public static void projectView(ProductDTO product){
		System.out.println(product);		
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

