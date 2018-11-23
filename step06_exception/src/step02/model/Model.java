package step02.model;

import step01.model.domain.CustomerDTO;

public class Model {
	//DB�� �����͸� select �ߴ� ����
	public static CustomerDTO[] getDatas() {
		CustomerDTO[] all = {new CustomerDTO("id1","pw1"), new CustomerDTO("id2", "pw2")};
		return all;
	}

	/*	1�� ���ԵǸ� : CustomerDTO �迭 ���� ��ȯ
	 * 	1�� �ƴѰ� ���ԵǸ�: null�� �ڵ� 
	 * 
	 * ? ��û�� ��ȣ�� 1�� �ڸ����� �ƴϸ� ���ܸ� �߻�
	 * throw new Exception("�ɰ��� ��û �߻�")
	 */
public static CustomerDTO[] getDatas2(int reqNo) throws Exception{
	
	if(reqNo >= 10) {
		throw new Exception ("�ɰ��� ��û �߻�");
	}
	//
	CustomerDTO [] all =null;
	if(reqNo ==1) {
		all =new CustomerDTO[]{new CustomerDTO("id1","pw1"), new CustomerDTO("id2", "pw2")};
		
	}return all;
	}

//�̷��Ե� ����
/*if(reqNo==1) {
	CustomerDTO[] all = {new CustomerDTO("id1","pw1"), new CustomerDTO("id2", "pw2")};
	return all;
	}
	else {return null;}
}*/
}





