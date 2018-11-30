package testMVC;

import testMVC.BaseBall;
import testMVC.Soccer;
import testMVC.PreFavoriteSport;
import testMVC.FavoriteSport;
import testMVC.endView;


public class startView {

	public static void main(String[] args) {
		BaseBall pro1 = new BaseBall("정수빈", 26, "수비를 잘함");
		BaseBall pro2 = new BaseBall("김현수", 30, "홈런을 많이 한다");
		BaseBall pro3 = new BaseBall("오재원", 33, "많이 욱한다");
		
		Soccer player1 = new Soccer("기성용", 35, "주장이다");
		Soccer player2 = new Soccer("박지성", 38, "축구를 제일 잘한다");
		Soccer player3 = new Soccer("황의조", 31, "축구 센스가 좋다");
		
		
		PreFavoriteSport oldestProject = new PreFavoriteSport("제일 나이 많은 선수", pro3, player2, "화이팅");
		PreFavoriteSport middleProject = new PreFavoriteSport("중간 나이인 선수", pro2, player1, "화이팅");
		PreFavoriteSport youngestProject = new PreFavoriteSport("제일 어린 선수 ", pro1, player3, "화이팅");
		
		FavoriteSport favorite = FavoriteSport.getInstance();
		
		System.out.println("****프로젝트 생성 후 모든 데이터 검색****");
		favorite.dataInsert(oldestProject);
		favorite.dataInsert(middleProject);
		favorite.dataInsert(youngestProject);
		
		
		PreFavoriteSport allData[] = favorite.getAllData();
		endView.dataListView(allData);
		
	}

}
