package test;

import biz.SingletonPattern;

public class Test2 {

	public static void main(String[] args) {
		//getInfo ȣ��
	
		SingletonPattern s=SingletonPattern.getInstance();
		System.out.println(s.getInfo());
		}
	}	
	
