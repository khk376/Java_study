package testMVC;
import testMVC.PreFavoriteSport;

public class FavoriteSport  {
		private static FavoriteSport instance = new FavoriteSport();
		FavoriteSport(){}
		private PreFavoriteSport sportList[] = new PreFavoriteSport[5];
		
		private int index;
		
		
		//Singleton ������ ���� �޼ҵ� �ۼ�
		public static FavoriteSport getInstance() {
			return instance;
			
		}
		
			
		public PreFavoriteSport[] getAllData() {
			return sportList;
		
			//1�� �ۼ�
		}
		
		public void dataInsert(PreFavoriteSport data2) {
			sportList[index++]=data2;
			//1��, 2�� �� ��� �ۼ�
		}
			
}

