package View;
import java.util.ArrayList;
import Database.People;
public class EndView {
	public void printmsg(String msg) {
		System.out.println(msg);
	}
	//���� ��� �޼ҵ�
	public void printALL( ArrayList<People> list ) {
		System.out.println("----------------------------");	
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------");
	}	
}