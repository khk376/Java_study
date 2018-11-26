/** �н�����
 * 1. list
 * - index�� ������(��üŸ��)�� ����
 * - ���� �޸�
 * - java.uil
 * 2. ���׸� Ȱ��
 * 		- ���� �ڵ带 simple�ϰ� ��ȯ
 * 		- ������ ����ȯ �ڵ嵵 ����ȭ
 * 3. Wrapper class
 * 		- �⺻ Ÿ�� 8���� ��� ��üȭ�ؼ� ��� �ؾ� �� ��츦 ����ؼ� 
 * 			java.lang�� 8���� ����� Ŭ���� ����
 * 		- int : Integer 
 * 		- autoboxing / unboxing
 * 3. 
 */
package step01.list;

import java.util.ArrayList;

public class List1 {
	//ArrayList[ Obejct] 
	
	public static void m1() {
		ArrayList list =new ArrayList();
		list.add("���ڿ�");//0��° ����
		list.add(new Integer(3));//1��°����
		list.add("���ڿ�");//2��° ����
		list.add(new Byte("10"));//?
		list.add(10);//list.add(new Integer(10)) �� ��ü�� ��ȯ�Ǿ� ����(autoboxing)
		int ill = new Integer(10);
		
		System.out.println(list.toString()); //[���ڿ�, 3, ���ڿ�, 10]
		System.out.println(list.get(2));
		System.out.println(list.size());

		
		//���ڿ��� '��' ���
		String data=(String)list.get(2);
		System.out.println(data.charAt(2));
		//����� -> size() ->get
		list.remove(2);
		System.out.println(list.size());
	
		System.out.println(list.get(2));
	}
	
	//���׸� + ArrayList
	/* ���׸� - ��üŸ������
	 * ArrayList�� ��ġ String[] or �� �ٸ� Ÿ�� �迭ó�� Ư�� Ÿ�Կ� ���ؼ��� ���
	 * ����:����ȯ ���� ������ Ȱ�� ����
	 */
	public static void m2() {
		//String�� ���� ������ ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ad");
		list.add("wtw");
		//list.add(new Integer(3)); �Ұ�
		String v=list.get(0);
		System.out.println(v.charAt(0));//����ȯ ���� String���� �޼ҵ� ȣ�� ����
	}
	
	//boxing + ArrayList
	
	public static void main(String [] args) {
		m1();
		System.out.println("---------");
		m2();
	}
}








