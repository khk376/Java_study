package testMVC;

import testMVC.BaseBall;
import testMVC.Soccer;
import testMVC.PreFavoriteSport;
import testMVC.FavoriteSport;
import testMVC.endView;


public class startView {

	public static void main(String[] args) {
		BaseBall pro1 = new BaseBall("������", 26, "���� ����");
		BaseBall pro2 = new BaseBall("������", 30, "Ȩ���� ���� �Ѵ�");
		BaseBall pro3 = new BaseBall("�����", 33, "���� ���Ѵ�");
		
		Soccer player1 = new Soccer("�⼺��", 35, "�����̴�");
		Soccer player2 = new Soccer("������", 38, "�౸�� ���� ���Ѵ�");
		Soccer player3 = new Soccer("Ȳ����", 31, "�౸ ������ ����");
		
		
		PreFavoriteSport oldestProject = new PreFavoriteSport("���� ���� ���� ����", pro3, player2, "ȭ����");
		PreFavoriteSport middleProject = new PreFavoriteSport("�߰� ������ ����", pro2, player1, "ȭ����");
		PreFavoriteSport youngestProject = new PreFavoriteSport("���� � ���� ", pro1, player3, "ȭ����");
		
		FavoriteSport favorite = FavoriteSport.getInstance();
		
		System.out.println("****������Ʈ ���� �� ��� ������ �˻�****");
		favorite.dataInsert(oldestProject);
		favorite.dataInsert(middleProject);
		favorite.dataInsert(youngestProject);
		
		
		PreFavoriteSport allData[] = favorite.getAllData();
		endView.dataListView(allData);
		
	}

}
