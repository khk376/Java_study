package probono.service;

import java.sql.SQLException;
import java.util.ArrayList;

import probono.model.ActivistDAO;
import probono.model.ProbonoDAO;
import probono.model.ProbonoProjectDAO;
import probono.model.dto.ActivistDTO;
import probono.model.dto.ProbonoDTO;
import probono.model.dto.ProbonoProjectDTO;
import probono.view.RunningEndView;

//�� ���� : view.RunningStrartView���� ȣ�� 
public class ProbonoProjectController {
	private static ProbonoProjectController instance = new ProbonoProjectController();

	private ProbonoProjectController() {
	}

	public static ProbonoProjectController getInstance() {
		return instance;
	}

	//��� ������Ʈ �˻� ����
	/* ��û�� �߻� ������ ����� ��
	 * 1. �����Ͱ� �ִ�
	 * 2. ���� ������Ʈ�� ����, �����Ͱ� ����
	 * 3. ���� ���� �߻�(db���� ���� �Ǵ� �������� �Ǽ��� sql���� ����...) */
	public static void getAllProbonoProjects(){
		ArrayList<ProbonoProjectDTO> allProject = null;
		try{			
			allProject = ProbonoProjectDAO.getAllProbonoProjects();	
			if(allProject.size() !=0 ) {
				RunningEndView.projectListView(allProject);
			}else {
				RunningEndView.successMsg("������Ʈ �����Ͱ� ����.");
			}
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("��� ������Ʈ �˻��� ���� �߻�");
		}
	}
	
	//���ο� ������Ʈ ���� ����
	public static boolean addProbonoProject(ProbonoProjectDTO probonoProject) {
		boolean result = false;
		try{
			result = ProbonoProjectDAO.addProbonoProject(probonoProject);
			if(result) {
				RunningEndView.successMsg("���ο� ������Ʈ ����");
			}else {
				RunningEndView.successMsg("������ ������ ����");
			}
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("��� ������Ʈ ����� ���� �߻�");
		}
		return result;
	}
	
	//��� ������Ʈ �˻� ����
	public static ArrayList<ActivistDTO> getAllActivists(){
		ArrayList<ActivistDTO> allProject = null;
		try{
			allProject = ActivistDAO.getAllActivists();	
			if(allProject.size() !=0 ) {
				RunningEndView.projectListView(allProject);
			}else {
				RunningEndView.successMsg("������Ʈ �����Ͱ� ����.");
			}
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("��� ��� ����� �˻��� ���� �߻�");
		}
		return allProject;
	}
	
	//���κ��� ���̵�� ���κ��� ���� ����
	public static boolean updateProbono(String probonoId, String probonoPurpose){
		boolean result = false;
		try{
			result = ProbonoDAO.updateProbono(probonoId, probonoPurpose);
			if(result) {
				RunningEndView.successMsg("���κ��� id�� ���κ��� ���� ���� �Ϸ�");	
			}else {
				RunningEndView.successMsg("���κ��� id�� ���κ��� ���� ���� ����");
			}
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("���κ��� id�� ���κ��� ���� ���� ����");
		}
		return result;
	}
	
	//���κ��� ���� �˻�
	public static ProbonoDTO getProbono(String probonoId) {
		ProbonoDTO probono = null;
		try {
			
			probono = ProbonoDAO.getProbono(probonoId);
			if(probono!=null) {
				RunningEndView.allView(probono);
				
			}else {
				RunningEndView.successMsg("���κ��� id�� �ش� ���κ��� �˻��� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			RunningEndView.showError("���κ��� id�� �ش� ���κ��� �˻� ���� ");
		}
		return probono;
	}

}
