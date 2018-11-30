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
		if(temp.equals("q") || temp.equals("ㅂ")) {
			RunningEndView.printMsg("진행을 취소하고 이전 화면으로 돌아갑니다.");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean reAdd(String temp) {
		if(temp.equals("r") || temp.equals("ㄱ")) {
			RunningEndView.printMsg("다시 입력합니다.");
			return true;
		} else {
			return false;
		}
	}
	
	public String getValue() {
		while(true) {
			RunningEndView.printMsg("내용을 입력하세요(취소는 q, 다시 입력은 r):");
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
			RunningEndView.printMsg("원하는 기능에 해당하는 번호를 입력하세요:");
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
					RunningEndView.printMsg("올바른 값을 입력하세요!");
				}
			} catch(Exception e) {
				RunningEndView.printMsg("올바른 값을 입력하세요!");
			}
		}
	}
	
	public int getMenuLength(String objective) {
		switch(objective) {
			case "main":{
				RunningEndView.printMsg("1. 정보 확인\n2. 정보 수정\n3. 수강 신청\n4. 시스템 종료");
				return 4;
			}
			
			
			case "selectInfo":{
				RunningEndView.printMsg("1. 휴대폰 번호\n2. 이메일\n3. 이전 화면으로");
				return 3;
			}
			
			case "selectEnroll":{
				RunningEndView.printMsg("1. 개설 과목 확인, 수강 등록\n2. 수강 내역 확인, 수강 취소\n3. 이전 화면으로");
				return 3;
			}
			
			default: return 0;
		}
	}

	public String confirmNo() {
		RunningEndView.printMsg("학번을 입력하세요.");
		try {
			while(true) {
				String data = getValue();
				if(!reAdd(data)) {
					if(cancelAdd(data)){
						return null;
					}

					Student confirmData = StudentDAO.getStudent(data);
					if(confirmData!=null) {
						RunningEndView.printMsg(confirmData.getName() + "님으로 로그인 성공!");
						return confirmData.getRegNo();
					} else {
						RunningEndView.errorMsg("입력하신 번호가 존재하지 않습니다.");
					}

				}
			}
		} catch(Exception e) {
			RunningEndView.errorMsg("입력하신 번호가 존재하지 않습니다.");
			return null;
		}
	}
}