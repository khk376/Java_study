package beams.view;

import beams.service.BeamsProductController;

public class StartView {

	public static void main(String [] args){
		System.out.println("***** ��� ����Ǵ� ���� Project �˻� *****");
		 BeamsProductController.getAllProduct();
		
		//��� ��� ����ڵ� �˻�
		System.out.println("\n***** ��� ���� �˻� *****");
		BeamsProductController.getAllBranch();
		
		//Ư�� �귣�� ���� �˻�
		System.out.println("\n***** Ư�� �귣�� ���� �˻� *****");
		BeamsProductController.getBrand("DANTON");
		
		
		//���κ��� id�� ���κ��� ���� ����	
		//test data - id : schweitzer,  ���� : �ֿϵ������
		System.out.println("\n***** Ư�� ������ ���� ������ �� �˻� *****");
		boolean result = BeamsProductController.updateStock(null, 0);
		BeamsProductController.getStocks(null);
	}
	
}
