/* �н�����
 * ***
 * 		java/python
 * 		- ���ڿ��� index�� �ο�
 * 		- ���� index 0
 * 
 * 1. java API Ȱ�� ����
 * 2. java.lang.String Ŭ������ �޼ҵ�
 * 		1. ���� : API ���� ������ �������� ����
 * 		2. ���ǻ���
 * 			���/��ȯŸ��/parameter(argument/�Ű�����/�Ű�����/�μ�)
 * 3. test ����
 * 		1. ���ڿ��� index ��, ö���� ��ġ������ �ش� ö��(����)�� �̱�(��ȯ)
 * 		2. ���ڿ� ���� Ȯ��
 * 		3. ���ڿ��� �Ϻκ��� �̱�
 * 			- ��� ������ ���� �ʿ��� ������
 * 				1. ���ڿ�
 * 				2. � ���� ��ġ~ � ���������� ��ġ��(index)
 * 
 * 			- String a(int ������ġ, int ������ġ){}
 * 
 */
package step01.reivew;

public class Syntax4API {

	public static void main(String[] args) {
		//String ��ü ���� - class�� �����ϴ� ��� �����ʹ� ������ ��ü
		String msg = "���� 12345 ��� ��";
		
		//�����ϴ� String ��ü�κ��� Ư�� ������ char �� ��ȯ �� ���
		char c =msg.charAt(2);
		System.out.println(c);
		
		//���ڿ��� ��ü ���̰� ���
		System.out.println(msg.length());
		
		//���ڿ��� Ư�� �Ϻ� ���� ���� �� ���
		System.out.println(msg.substring(7,9));
		
		}
}




/*
View -> Controller -> Model -> Controller -> View 

�α��� ���� ����
ù ȭ��(view) ->
		������û ���� (������:controller) -> ���� ó�� �ϴ� ���� -> DB 
		-> ����� �������ִ� ���� -> ����? ����? �� ���� ȭ�� ����

��� ȭ��(view)

biz = model


*/
