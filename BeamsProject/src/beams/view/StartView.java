package beams.view;

import java.util.Scanner;

import beams.model.dto.BranchDTO;
import beams.service.BeamsProductController;
public class StartView {
	private static Scanner sc;
	static String num=new String();
	
	public static void main(String [] args){
		
		      System.out.println("*** BEAMS�� ���� ���� ȯ���մϴ�! ***\n ���� �޴� �� ���Ͻô� ���񽺸� �Է��� �ּ���.\n1.�����˻�\n2.��ǰ�˻�\n3. �귣�� �˻�");
		      sc = new Scanner(System.in);      
		      
		      BeamsProductController controller = BeamsProductController.getInstance();
		      int input1 = sc.nextInt();
//		      controller.insertBranch((new BranchDTO("S-005", "������", "����")));
//		      controller.getAllBranches();
		      
		      switch(input1) {
		      case 1:
		         controller.getAllBranches();
		         break;
		      case 2:
		         controller.getAllProducts();
		         break;
		      case 3:
		         System.out.println("�귣�带 �Է��� �ּ��� :");
		         
		         String input2 = sc.nextLine();
		         if(sc.nextLine()=="����") {
		        // BeamsProductController.getBrand("F-2005","F-43578932");
		         }
/*		         String input2 = sc.nextLine();
		         String input3 = sc.nextLine();
		         String input4 = sc.nextLine();
		         controller.getBrand("F-2005","F-43578932");*/
		         break;
		      }         
		     BeamsProductController.getBrand("F-2005","F-43578932");
		      System.out.println("�Ϸ�");

		      BeamsProductController.getProduct("D%");
		      
		System.out.println("***** ��� ����Ǵ� ���� Product �˻� *****");
		 BeamsProductController.getAllProducts();
		
		//��� ��� ����ڵ� �˻�
		System.out.println("\n***** ��� ���� �˻� *****");
		BeamsProductController.getAllBranches();
		
		//Ư�� �귣�� ���� �˻�
		
		System.out.println("\n***** Ư�� �귣�� ���� �˻� *****");
		BeamsProductController.getBrand("F-2005","F-43578932");
		
		
		System.out.println("������ ��ȣ�� �Է����ּ���: 1. ������, 2. �۵���, 3. �д���");
		first1 = new Scanner(System.in);
		int first = first1.nextInt();
		
		
		
		}
		
	//System.out.println("�귣�� ��ȣ�� �Է����ּ���: 1. Lebeau, 2. DANTON, 3. FELISI");
	/*	int second = first2.nextInt();
		*/
//		System.out.println("\n***** Ư�� ������ ���� ������ �� �˻� *****");
//		boolean result = BeamsProductController.updateStock("D-79813490", 30);
//		BeamsProductController.getStock("D-79813490");
/*		
		int i = 0;
		switch(i) {
		case 1 : System.out.println("������ �����ϼ̽��ϴ� \n������ �������ּ���");*/
		
		
	
	}
	




