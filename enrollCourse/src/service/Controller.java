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
					RunningEndView.printMsg("\n----------메인 페이지----------");
					stuSelect = m.getSelect("main");
					
					switch(stuSelect) {
						case 1:{
							RunningEndView.printMsg("\n----------본인 정보 확인----------");
							RunningEndView.printCommons(myData);
							break;
						}
						
						case 2:{
							RunningEndView.printMsg("\n----------본인 정보 수정----------");
							
							switch(m.getSelect("selectInfo")) {
								case 1:{
									RunningEndView.printMsg("전화번호 수정");
									break;
								}
							
								case 2:{
									RunningEndView.printMsg("이메일 수정");
									break;
								}
							}
							
							break;
						}
					
						case 3:{
							RunningEndView.printMsg("\n----------수강 신청----------");
							
							switch(m.getSelect("selectEnroll")) {
								case 1:{
									RunningEndView.printMsg("개설과목 조회/수강 등록");
									break;
								}
								
								case 2:{
									RunningEndView.printMsg("수강내역 확인/수강 취소");
									break;
								}
							}
							break;
						}
					}
				}
				RunningEndView.printMsg("로그아웃 완료");
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}