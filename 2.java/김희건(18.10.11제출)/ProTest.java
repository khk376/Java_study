package step01.reivew02;

public class ProTest {
	
	public static void main(String [] args) {
		Producer myProducer = new Producer("���",26);
		Product me = new Product(22, myProducer);		
		
		System.out.println(me.producer.age);
	}		
}
