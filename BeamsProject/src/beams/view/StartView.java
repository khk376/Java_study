package beams.view;

import java.util.Scanner;

import beams.model.dto.BranchDTO;
import beams.service.BeamsProductController;
public class StartView {
	private static Scanner sc;
	static String num=new String();
	
	public static void main(String [] args){
		
		      System.out.println("*** BEAMS에 오신 것을 환영합니다! ***\n 다음 메뉴 중 원하시는 서비스를 입력해 주세요.\n1.지점검색\n2.제품검색\n3. 브랜드 검색");
		      sc = new Scanner(System.in);      
		      
		      BeamsProductController controller = BeamsProductController.getInstance();
		      int input1 = sc.nextInt();
//		      controller.insertBranch((new BranchDTO("S-005", "강남점", "서울")));
//		      controller.getAllBranches();
		      
		      switch(input1) {
		      case 1:
		         controller.getAllBranches();
		         break;
		      case 2:
		         controller.getAllProducts();
		         break;
		      case 3:
		         System.out.println("브랜드를 입력해 주세요 :");
		         
		         String input2 = sc.nextLine();
		         if(sc.nextLine()=="단톤") {
		        // BeamsProductController.getBrand("F-2005","F-43578932");
		         }
/*		         String input2 = sc.nextLine();
		         String input3 = sc.nextLine();
		         String input4 = sc.nextLine();
		         controller.getBrand("F-2005","F-43578932");*/
		         break;
		      }         
		     BeamsProductController.getBrand("F-2005","F-43578932");
		      System.out.println("완료");

		      BeamsProductController.getProduct("D%");
		      
		System.out.println("***** 모든 진행되는 실제 Product 검색 *****");
		 BeamsProductController.getAllProducts();
		
		//모든 재능 기부자들 검색
		System.out.println("\n***** 모든 지점 검색 *****");
		BeamsProductController.getAllBranches();
		
		//특정 브랜드 정보 검색
		
		System.out.println("\n***** 특정 브랜드 정보 검색 *****");
		BeamsProductController.getBrand("F-2005","F-43578932");
		
		
		System.out.println("지점을 번호를 입력해주세요: 1. 신촌점, 2. 송도점, 3. 분당점");
		first1 = new Scanner(System.in);
		int first = first1.nextInt();
		
		
		
		}
		
	//System.out.println("브랜드 번호를 입력해주세요: 1. Lebeau, 2. DANTON, 3. FELISI");
	/*	int second = first2.nextInt();
		*/
//		System.out.println("\n***** 특정 재고수량 정보 수정후 재 검색 *****");
//		boolean result = BeamsProductController.updateStock("D-79813490", 30);
//		BeamsProductController.getStock("D-79813490");
/*		
		int i = 0;
		switch(i) {
		case 1 : System.out.println("신촌점 선택하셨습니다 \n지점을 선택해주세요");*/
		
		
	
	}
	




