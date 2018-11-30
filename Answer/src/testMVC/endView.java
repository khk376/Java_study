package testMVC;

import testMVC.PreFavoriteSport;

public class endView {
	
	public static void dataListView(PreFavoriteSport [] dataList ) {
		for(int num = 0 ; num < dataList.length ; num++) {
			if(dataList[num] != null) {
				System.out.println("[프로젝트 " + (num+1) + "]\n" + dataList[num].toString());
			}
		}
	}
}