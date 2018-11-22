/* �н�����
 * 1. ��� ���� �ϴ� �޼ҵ� ���� �����ϱ�
 * 2. ����
 * 		1. ����(����)
 * 				��ȯŸ�� �޼ҵ��([argument or parameter or �Ű�����]){}
 * 		2. ȣ��
 * 			1. ����� ���� �޼ҵ� ȣ��
 * 			2. API���� �����ϴ� �޼ҵ� ȣ��
 * 
 */
package step01.reivew;

public class Syntax2Method {
	//1. �ΰ��� �����͸� ���ϱ�
	/* ��������
	 * 1. �������� �������ΰ���?
	 * 		1. �ƴϴ�. ���������ʹ�.
	 * 		2. �´�.
	 * 2. ���� ������� ���� ǥ��?
	 * 		1. �׳� �α�
	 * 		2. �ܼ� ���
	 * 		3. ����� ��û�� ������ ���� �ǵ�����(return)
	 * 		...
	 */
	//��ȯ�� ���� ���������� ���ϱ�
	void sum() {
		int no1=10;
		int no2=20;
		int no3=no1+no2;
	}
	//��ȯ�� ���� �������� ������ ���ϱ�
	void sum(int n1, int n2) { //��ȯ�� ������ void
		int n3 = n1+n2;
		System.out.println(n3);
	}
	//��ȯ�� �ְ� �������� ������ ���ϱ�
	int sum2(int n1, int n2) { //type ���缭 int�� ���� (n3�� int type)
		int n3 = n1+n2;
		return n3;
	}
	//? ���¼�, 25 �ΰ��� �����͸� �޾Ƽ� ��� : �̸�:���¼� ����:25
	// �������� ������ ����ϴ� ����� �޼ҵ�
	// printInfo 
	void printInfo(String name, int age) {
		System.out.println("�̸�:" + name + " ����:" + age);
	}
	public static void main(String[] args) {
		Syntax2Method s =new Syntax2Method();
		s.sum();
		s.sum(30,20);
		
		int r= s.sum2(10, 80);
		System.out.println(r);
		
		s.printInfo("���¼�",25);
		}//end of main
		
}//end of class