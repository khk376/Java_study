package view;

import java.util.ArrayList;

import model.dto.Commons;
import model.dto.Professor;
import model.dto.Student;

public class RunningEndView {
	public static void printMsg(String msg) {
		System.out.println(msg);
	}
	
	public static void errorMsg(String msg) {
		System.out.println("Error: " + msg);
	}

	public static void printCommons(Commons commons) {
		if(commons instanceof Professor) {
			printMsg("����: " + (Professor)commons);
		}
		else if(commons instanceof Student) {
			printMsg("�л� �̸�: " + (Student)commons);
		} else if(commons==null){
			printMsg("����� �����ϴ�.");
		}
	}
	
	public static void printList(ArrayList list){
		int length = list.size();
		if( length != 0 ){
			for(int index = 0; index < length; index++){			
				printMsg("�˻����� " + (index+1) + " - " + list.get(index));
			}
		} else {
			printMsg("����� �����ϴ�.");
		}
	}

}