package step02.mvc.view;

import step01.ex.Person;

public class EndView {
	//EndView�� ��� �޼ҵ���� Controller���� ȣ���ؾ� ��
	//? �˻� ��� ���
	public void personView(Person p) {
		System.out.println(p.getName() + " " + p.getAge());
	}
	//? ���� �Ϸ� ��� �޼ҵ�
	//? 1�� 2�� �ƴ� ����� ��� �޼ҵ�
	public void msgPrint(String msg) {
		System.out.println(msg);
	}
}
