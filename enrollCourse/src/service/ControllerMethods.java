package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.dao.StudentDAO;
import model.dto.Student;
import view.RunningEndView;

public class ControllerMethods {
	private static ControllerMethods instance = new ControllerMethods();
	
	private ControllerMethods() {
		
	}
	
	public static ControllerMethods getInstance() {
		return instance;
	}
	
	public boolean cancelAdd(String temp) {
		if(temp.equals("q") || temp.equals("��")) {
			RunningEndView.printMsg("������ ����ϰ� ���� ȭ������ ���ư��ϴ�.");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean reAdd(String temp) {
		if(temp.equals("r") || temp.equals("��")) {
			RunningEndView.printMsg("�ٽ� �Է��մϴ�.");
			return true;
		} else {
			return false;
		}
	}
	
	public String getValue() {
		while(true) {
			RunningEndView.printMsg("������ �Է��ϼ���(��Ҵ� q, �ٽ� �Է��� r):");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String data = null;
			try {
				data = in.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			if(data!=null) {
				return data;
			}
		}
	}
	
	public int getSelect(String objective) {
		while(true) {
			RunningEndView.printMsg("���ϴ� ��ɿ� �ش��ϴ� ��ȣ�� �Է��ϼ���:");
			int menuLength = getMenuLength(objective);
			if(menuLength==0) {
				return 0;
			}
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String data = null;
			try {
				data = in.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				int select = Integer.parseInt(data);
				
				if(select<=menuLength) {
					return select;
				} else {
					RunningEndView.printMsg("�ùٸ� ���� �Է��ϼ���!");
				}
			} catch(Exception e) {
				RunningEndView.printMsg("�ùٸ� ���� �Է��ϼ���!");
			}
		}
	}
	
	public int getMenuLength(String objective) {
		switch(objective) {
			case "main":{
				RunningEndView.printMsg("1. ���� Ȯ��\n2. ���� ����\n3. ���� ��û\n4. �ý��� ����");
				return 4;
			}
			
			
			case "selectInfo":{
				RunningEndView.printMsg("1. �޴��� ��ȣ\n2. �̸���\n3. ���� ȭ������");
				return 3;
			}
			
			case "selectEnroll":{
				RunningEndView.printMsg("1. ���� ���� Ȯ��, ���� ���\n2. ���� ���� Ȯ��, ���� ���\n3. ���� ȭ������");
				return 3;
			}
			
			default: return 0;
		}
	}

	public String confirmNo() {
		RunningEndView.printMsg("�й��� �Է��ϼ���.");
		try {
			while(true) {
				String data = getValue();
				if(!reAdd(data)) {
					if(cancelAdd(data)){
						return null;
					}

					Student confirmData = StudentDAO.getStudent(data);
					if(confirmData!=null) {
						RunningEndView.printMsg(confirmData.getName() + "������ �α��� ����!");
						return confirmData.getRegNo();
					} else {
						RunningEndView.errorMsg("�Է��Ͻ� ��ȣ�� �������� �ʽ��ϴ�.");
					}

				}
			}
		} catch(Exception e) {
			RunningEndView.errorMsg("�Է��Ͻ� ��ȣ�� �������� �ʽ��ϴ�.");
			return null;
		}
	}
}