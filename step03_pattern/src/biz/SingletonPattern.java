package biz;

public class SingletonPattern {
	static SingletonPattern instance = new SingletonPattern();
/*	private SingletonPattern() {}
	*/
	public static SingletonPattern getInstance() {
		return instance;
	}
	
	//.. �پ��� ���� ������ �ٽ� �޼ҵ�� ����� ����
	public String getInfo() {
		return "�������� : ������ �ؾ��� ����� ���� ���?..";
	}
	
}
