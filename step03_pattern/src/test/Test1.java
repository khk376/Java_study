package test;

import biz.SingletonPattern;

public class Test1 {

	public static void main(String[] args) {
		//�׷��� �߿� Aȸ��� ���� �Ͻð� ���������� �����鿡�� ���
		System.out.println(SingletonPattern.getInstance().getInfo());
		//=
		SingletonPattern s=SingletonPattern.getInstance();
		System.out.println(s.getInfo());
	}

}

















//
//
//
//
//
//
//
//
//
//		SingletonPattern biz =SingletonPattern.getInstance();
//		System.out.println("A�е�: " + biz.getInfo);
