/* �н� ����
 * 1. ��ü ���� ������ �⺻ ��(default)
 * 		- null
 * 2. String ��ü�� data ��
 * 3. �������
 * 		- NullPointerException
 * 		- ��� ������ ��ü(instance)�� �������� ����, �޼ҵ� ȣ�� �� �߻��Ǵ� ����
 */
package Step02_MVC;

public class Syntax04Equals {
	
	public static void main(String[] args) {
		//step01 - null Ű���� �����ϱ�
		String s = "test";
		System.out.println(s);
		System.out.println(s.length());
		
		//step02 - ���ڿ� ������ ��
		/*public boolean equals(String v){
		 * 		�� �޼ҵ带 ������ String ��ü�� parameter�� ���Ե�
		 * 		������ ��
		 * }
		 */
		String d1 = "�μ�";
		String d2 = "�μ�";
		String d3 = "����";
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		
		//step03 - �⺻ Ÿ���� �����͵� �� �� ������(���� �� ����, ==)
		System.out.println(2==3);
	}
}
