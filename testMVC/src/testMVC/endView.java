package testMVC;
//필요한 import 작성
import testMVC.PreFavoriteSport; 

public class endView {
	
	public static void dataListView(PreFavoriteSport [] dataList ) {
		for(int num =0 ; num < dataList.length ; num++) {
			if(dataList[num] != null ) {
				//프로젝트 1부터 출력되게 하시오
				System.out.println("[프로젝트 " + (	num+1 ) + "]\n" + dataList[num].toString() + "\n");
		
			}
		}
	}
}
