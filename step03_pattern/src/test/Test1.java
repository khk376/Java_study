package test;

import biz.SingletonPattern;

public class Test1 {

	public static void main(String[] args) {
		//그룹사들 중에 A회사라 가정 하시고 공지사항을 직원들에게 출력
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
//		System.out.println("A분들: " + biz.getInfo);
