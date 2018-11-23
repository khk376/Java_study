package step02.view;

import step01.model.domain.CustomerDTO;

public class EndView {

	public static void dataPrint(CustomerDTO[] datas2) {
		for(CustomerDTO v: datas2 ) {
			System.out.println(v.toString());
		}
	}

	public static void msgPrint(String message) {
		System.out.println("Çö »óÈ² : " + message);
		
		
	}

}
