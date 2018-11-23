package step06_exception;

public class Exception1 {
	
	public static void main(String[] args) {
		/* ��� 1 - �ε��� �� �ִ� �˰��� �����ؼ� ���� ����
		 * 	��� 2 - API���� �����ϴ� ���� ã�Ƽ� �Ẽ��
		 * 			java.lang.Class �� 
		 * 			public static foName(String fileName)
		 * 			throws classNotFoundException{}
		 * 				parameter�� ���ԵǴ� ���� ���� - �޸� �ε�
		 * 
		 * 			- API ������ ������ ����
		 * 				�������
		 * 				1. byte code�� �޸𸮿� �Ҵ�
		 * 				2. ���ϸ� ������ �������� ������ ��� �ʼ�
		 */
		try {
		Class.forName("step01.A");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


class A{
	private A() {	
	}
	static {
		System.out.println("A ���� ������ �޸𸮿� ���� �Ϸ�");
	}
}