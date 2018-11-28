package testMVC;
import testMVC.PreFavoriteSport;

public class FavoriteSport  {
		private static FavoriteSport instance = new FavoriteSport();
		FavoriteSport(){}
		private PreFavoriteSport sportList[] = new PreFavoriteSport[5];
		
		private int index;
		
		
		//Singleton 구현을 위한 메소드 작성
		public static FavoriteSport getInstance() {
			return instance;
			
		}
		
			
		public PreFavoriteSport[] getAllData() {
			return sportList;
		
			//1줄 작성
		}
		
		public void dataInsert(PreFavoriteSport data2) {
			sportList[index++]=data2;
			//1줄, 2줄 중 골라서 작성
		}
			
}

