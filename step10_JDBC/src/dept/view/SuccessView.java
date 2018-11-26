package dept.view;

import java.util.ArrayList;
import dept.model.domain.DeptDTO;

public class SuccessView {

	public static void msg(String message) {
		System.out.println("정상 실행: " + message);

	}

	public static void allDataPrint(ArrayList<DeptDTO> datas) {
		for(DeptDTO dto :datas) {
			System.out.println(dto); //dto.toString()
		}
	}
}
