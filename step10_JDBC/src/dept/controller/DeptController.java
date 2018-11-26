/* client�� ���� view ȭ���� ���ؼ� ��û �ް�
 * ��û�� ���� biz(model) ���� ����
 * ���� ������� �޾Ƽ� ��ȿ�� ����
 * ��ȿ - SuccessView
 * ��ȿ - FailView
 * ó�� ����
 * 
 * ����
 * 1. �� ��û��(crud) ó�� �޼ҵ� ���� ����? �ϳ���?
 * 2. ���� �߻��� � ���� �޽��� �����ؼ� FailView���� ��� ����?
 * 
 */
package dept.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import dept.model.DeptDAO;
import dept.model.domain.DeptDTO;
import dept.view.FailView;
import dept.view.SuccessView;

public class DeptController {
	private static DeptController instance = new DeptController();
	private DeptController() {	}
	public static DeptController getInstance() {
		return instance;
	}
	//��� �˻� �޼ҵ�
	public void selectAllReqRes() {
		try {
			ArrayList<DeptDTO> datas = DeptDAO.selectAll();
			if(datas.size()!= 0) {//�˻� �����Ͱ� ������ ���
				SuccessView.allDataPrint(datas);
			}else {//�˻� �����Ͱ� ���� ���
				SuccessView.msg("��û�Ͻŵ����͵��� �������մϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			FailView.errorMsg("��� �˻� ����, ��� �� �ٽ� �õ��� �ּ���.");
		}
	}
	
	//���� ��û ���� �޼ҵ�
	
	public void insertReqRes(int deptno, String dname, String loc) {
		try {
			int result = DeptDAO.insert(new DeptDTO(deptno, dname, loc));
			if(result ==1) {
				SuccessView.msg("�ȳ��ϼ���, ���ο� �μ� ��� �Ϸ�"); //����, �������
			}else {
				SuccessView.msg("�ƽ��Ե� ������ �ȵǾ����ϴ�"); // ������, �������
			}
		} catch (SQLException e) { // ������, ���������
			e.printStackTrace();
			FailView.errorMsg("���� ���� ����, ��� �� ��ȿ�� �����ͷ� �ٽ� �õ��� �ּ���.");
		}
		
	}
	public void deleteReqRes(int deptno) {
		try {
			int result = DeptDAO.delete(new DeptDTO(deptno));
			if(result ==1) {
				SuccessView.msg("���� �Ϸ�"); //����, �������
			}else {
				SuccessView.msg("���� ����"); // ������, �������
			}
		} catch (SQLException e) { // ������, ���������
			e.printStackTrace();
			FailView.errorMsg("���� ���� ����, ��� �� ��ȿ�� �����ͷ� �ٽ� �õ��� �ּ���.");
		}
}
}