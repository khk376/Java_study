/*�н�����
 * 1. ���� ó�� ���� ����
 * 		1. ���ܰ� �߻��ɼ��� �ִ� ������ �޼ҵ� ������ ó��
 * 		2. ���ܰ� �߻��ɼ��� �ִ� ������ �޼ҵ带 ȣ���� ������ ���� ó�� ����
 * 
 * 2. ����ó�� ����
 * 		1. try{
 * 				ó�� ���� ��, ���ܰ� �߻��� �� �ִ� ���ɼ� �ִ� �ڵ��
 * 			}catch(�߻��� ���� �ִ� ����Ÿ�� ����) {
 * 				���� �߻��� ó������
 * 			}
 * 
 * 		2. ���� �߻� ���ο� �����ϰ� 100% ���� ������ ����
 * 			Ȥ�� �����󿡼� �ý��� �ڿ��� Ȱ���Ŀ� �ݳ�(�ڿ���ȯ) ������ 
 * 			finally{}�� ����
 * 			try{
 * 			}catch(){
 * 			}finally{
 * 				100% ���ຸ��
 * 			}
 * 		3. ���ܰ� �߻��� ���� �ִ� �޼ҵ� ȣ��� ȣ���� ������ ���� ó�� ����
 * 			public void �޼ҵ�() throws ~ Exception{}
 * 			try{
 * 				�޼ҵ�();
 * 			}catch(~Exception e) {
 * 			}
 */
package step06_exception;

public class Exception3 {
	//m1 - try~catch~finally
	//id�� ���� �����̶� ����
	/*	1. ���� ����� true/false�� ��ȯ
	 * 2. �����ؼ� �����Ѵٸ� ���� ����, �������� ��� ���ܸ� �߻�
	 */
	public static void m1(String id) {
		if(id.equals("master")) {//master�� �ƴ� ���� true
		try{ 
			//�ٸ� �������� �ִ� ����..
			throw new Exception("���ľ� ���� �ֱ׷�~~");
		}catch(Exception e) {
			e.printStackTrace();//�߻��� ������ ���� ��� ���� �帧
			System.out.println("id ����");
		}finally {
			System.out.println("100%���� ����");
	}//�� �ٸ� �������� �ִ� ���� {
		}
	}
	
	//m2 - ���� �߻��Ǹ� throws�� ���� ������
	//���ڿ��� length()�� 3 ���ϸ� Exception �߻��ؼ� ������
	//3 �ʰ��� ��ȿ �޽��� �ܼ� ���
	public static void m2(String data) throws Exception {
		int length=data.length();
		if(length<=3) {
			throw new Exception("��ȿ");
		}else {
			System.out.println("��ȿ");
		}
			
	}
	public static void m3() throws ArrayIndexOutOfBoundsException {
	int [] i = {1,2,3};
	
	//step02 - Ȥ�� ���� �߻��� ���� ó��
/*	try {
		System.out.println(i[8]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("��ȿ�� �迭�� index ���Դϴ�.");
	}
}*/

	//step03 - ���� �߻��� ȣ���� �������� ó�� ����
	System.out.println(i[3]);
	}
	public static void m5() throws ClassNotFoundException {
		Class.forName("step01.AAA");
	}
	//m3 - API���� �����ϴ� �޼ҵ�� Ȱ��, ���� Ŭ������ ���� �� ���� Ÿ��	
	public static void main(String[] args) {
		m3();//�޼ҵ� ���𱸿��� throws try �ɼ�
		
		try {
			m5();
		}catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			m2("test");
			m2("e");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	/*	System.out.println("-----���ܹ߻� test------");
		m1("��������");
		System.out.println("-----���� �̹߻� test-----");
		m1("master");*/
	}
}
