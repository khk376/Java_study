/* �н�����
 * 1. Object�� ���� ��ӹ��� �޼ҵ� ������ �ʿ伺
 * 2. public String toString(){
 * 			������ ��ü(instance)�� ��ġ���� ���ڿ��� ��ȯ
 * 		}
 * 		- ������ ǥ���� ���� Ŭ������ ������ ����
 * 		- API�󿡵� �������� Ŭ������ �ټ�
 * 		- ��?
 * 			print() / println() 
 * 			- ��ü Ÿ���� ������ ��½� ������ ������! �ڵ� ȣ��
 */
package step01;

class AA extends Object{
	AA(){
		super();
	}
	public String toString() {
		return "��ȣ";
	}
}
class BB{}
public class ToStringTest {
	
	public static void main(String[] args) {
		BB b = new BB();
		String s= "���ڿ�";
		AA a= new AA();
		System.out.println(s.toString());
		System.out.println(a.toString());
	}
}
