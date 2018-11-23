package step02.controller;

import step01.model.domain.CustomerDTO;
import step02.model.Model;
import step02.view.EndView;

public class Controller {
	//���� ��û�� ó���ϴ� �����ڶ� ����

	// �˻� ��û�� ������ ��û ���� -> �ٽ� ������� ���� -> ����ް� -> ������ ���� -> view ����
	//1�� ��û�� getDatas() ����
	//1�� �ƴ� ������ ��û�� getDatas1() ȣ��
	public static void req(int reqNo) throws Exception {
		CustomerDTO[] datas=Model.getDatas();
		//�ܼ� view���� ��� ����
		
		/* �����Ͱ� null ����Ȯ�� �Ŀ� null �ƴϸ� ���� ������ ���
		 * null�� ��� ��û�Ͻ� ������ �����ϴ�. ���
		 * 
		 * getDatas2() ��� �� ��ȯ
		 * 1. ���� �߻�
		 * 		*** try ~ catch ������ �ʼ�
		 * 		1. ���� ���� �߻�
		 * 		2. ���� ���� ���� ����
		 * 2. ���� ����
		 * 		1. �����Ͱ� ��ȯ - CustomerDTO�迭 ��ü
		 * 		2. ������ ���� ��ȯ - null
		 */
		CustomerDTO[] datas2=null;
		try { datas2= Model.getDatas2(reqNo);
		}catch(Exception e) {
			e.printStackTrace();
			EndView.msgPrint("����� ���� �߻� �� ��û�� �ּ���.");
		}
		/* 0~9 ������ ��û ó�� ����
		 * ���ܿ� ���� ó�� ���� �ƴ�
		 */
		if(datas2 !=null) { 
			EndView.dataPrint(datas2);
		}else {
			EndView.msgPrint("��û�Ͻ� ������ �����ϴ�.");
		}
	}
}
