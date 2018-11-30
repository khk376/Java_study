package service;

import java.sql.SQLException;
import model.dao.StudentDAO;
import model.dto.Student;
import view.RunningEndView;

public class Controller {
	private static Controller instance = new Controller();
	public ControllerMethods m = ControllerMethods.getInstance();
	
	private Controller() {
		
	}
	
	public static Controller getInstance() {
		return instance;
	}
	
	public void login() {
		ControllerMethods m = ControllerMethods.getInstance();
		
		String regNo = m.confirmNo();
		
		try {
			Student myData = StudentDAO.getStudent(regNo);
			if(regNo!=null) {
				int stuSelect = 0;
				while(stuSelect!=4) {
					RunningEndView.printMsg("\n----------���� ������----------");
					stuSelect = m.getSelect("main");
					
					switch(stuSelect) {
						case 1:{
							RunningEndView.printMsg("\n----------���� ���� Ȯ��----------");
							RunningEndView.printCommons(myData);
							break;
						}
						
						case 2:{
							RunningEndView.printMsg("\n----------���� ���� ����----------");
							
							switch(m.getSelect("selectInfo")) {
								case 1:{
									RunningEndView.printMsg("��ȭ��ȣ ����");
									break;
								}
							
								case 2:{
									RunningEndView.printMsg("�̸��� ����");
									break;
								}
							}
							
							break;
						}
					
						case 3:{
							RunningEndView.printMsg("\n----------���� ��û----------");
							
							switch(m.getSelect("selectEnroll")) {
								case 1:{
									RunningEndView.printMsg("�������� ��ȸ/���� ���");
									break;
								}
								
								case 2:{
									RunningEndView.printMsg("�������� Ȯ��/���� ���");
									break;
								}
							}
							break;
						}
					}
				}
				RunningEndView.printMsg("�α׾ƿ� �Ϸ�");
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}