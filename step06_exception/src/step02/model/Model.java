package step02.model;

import step01.model.domain.CustomerDTO;

public class Model {
	//DB의 데이터를 select 했다 가정
	public static CustomerDTO[] getDatas() {
		CustomerDTO[] all = {new CustomerDTO("id1","pw1"), new CustomerDTO("id2", "pw2")};
		return all;
	}

	/*	1값 유입되면 : CustomerDTO 배열 정상 반환
	 * 	1이 아닌값 유입되면: null값 코드 
	 * 
	 * ? 요청된 번호가 1의 자릿수가 아니면 예외를 발생
	 * throw new Exception("심각한 요청 발생")
	 */
public static CustomerDTO[] getDatas2(int reqNo) throws Exception{
	
	if(reqNo >= 10) {
		throw new Exception ("심각한 요청 발생");
	}
	//
	CustomerDTO [] all =null;
	if(reqNo ==1) {
		all =new CustomerDTO[]{new CustomerDTO("id1","pw1"), new CustomerDTO("id2", "pw2")};
		
	}return all;
	}

//이렇게도 가능
/*if(reqNo==1) {
	CustomerDTO[] all = {new CustomerDTO("id1","pw1"), new CustomerDTO("id2", "pw2")};
	return all;
	}
	else {return null;}
}*/
}





