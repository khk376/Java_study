package testMVC;

import testMVC.PreFavoriteSport;
public class FavoriteSport  {
		private static FavoriteSport instance = new FavoriteSport();
		FavoriteSport(){}
		private PreFavoriteSport sportList[] = new PreFavoriteSport[5];
		
		private int index;
		
		
		public static FavoriteSport getInstance() {
			return instance;
		}
		
		
			
		public PreFavoriteSport[] getAllData() {
			return sportList;
		}
		
		public void dataInsert(PreFavoriteSport data2) {
			sportList[index] = data2;
			index = index +1;
		}
			
}
