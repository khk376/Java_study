package testMVC;
//�ʿ��� import �ۼ�
import testMVC.PreFavoriteSport; 

public class endView {
	
	public static void dataListView(PreFavoriteSport [] dataList ) {
		for(int num =0 ; num < dataList.length ; num++) {
			if(dataList[num] != null ) {
				//������Ʈ 1���� ��µǰ� �Ͻÿ�
				System.out.println("[������Ʈ " + (	num+1 ) + "]\n" + dataList[num].toString() + "\n");
		
			}
		}
	}
}
