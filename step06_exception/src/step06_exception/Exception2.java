package step06_exception;

public class Exception2 {
	
	public static void main(String[] args) {
		//���� ������ ������ ���� -> ����� ���� �߻�
		//�ذ�å : ��ȿ�� ���ڷ� ������, ������ ���� ó�� ���� ���ʿ�(�ɼ�)
		//System.out.println(10/2);
		
		//�޸𸮿� class ��� byte code �ε��� ������ ��ü�� �Ұ�
		//�ذ�å : ������ ������ ������ !! ����ó�� ���� �ʼ�!!(try~catch)
		//��?
		
		System.out.println(1);
	
		try {
			System.out.println(2);
			Class.forName("step01.A");
			System.out.println(3);
			
		} catch (ClassNotFoundException e) {
			System.out.println(4);
			e.printStackTrace();
		}
		
		System.out.println(5);
	}
}
