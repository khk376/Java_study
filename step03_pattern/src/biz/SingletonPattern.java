package biz;

public class SingletonPattern {
	static SingletonPattern instance = new SingletonPattern();
/*	private SingletonPattern() {}
	*/
	public static SingletonPattern getInstance() {
		return instance;
	}
	
	//.. 다양한 공통 로직의 핵심 메소드들 존재라 가정
	public String getInfo() {
		return "공지사항 : 앞으로 해야할 기술은 당췌 몇가지?..";
	}
	
}
