/** ���� �ܰ�
 * table ����(DB) -> DTOŬ���� -> DAO Ŭ���� -> Controller & View
 * 
 *  1. DBUtil Ȱ��
 * 2. dept table�� crud ������ �ǻ� �ڵ� ���� -> ���� �ڵ�� ����
 *    1. �ǻ� �ڵ�
 *    	 	- ���� �ϴ� �ڵ�, �������� �ڵ�, ����� �ϴ� �ڵ�
 *    		- �ӽ� ���̵�
 *    2. ���� �ڵ�
 *    		- ������ �޼ҵ� ����
 *    3. ���� �ܰ�
 *    		1. DAO Ŭ������ ����
 *    			- Data Access Object �� db ��� ���� Ŭ����
 *    		
 *    		2. CRUD ��� ������ Ŭ���� ���� ����
 *    			1. �� ��ɺ� �޼ҵ� �и��ؼ� ����
 *    			2. �پ��� ��⸦ ������� ��û, ���� �� ���뼺 ���ȭ ǥ��ȭ
 *    				- �������� ��µ��� ����(����� view)
 *    				- ��û�� ������ ���� �� ����
 *    			3. �޼ҵ� �� ��ȯ Ÿ��, parameter type��?
 *    			insert, update, delete, selecet all �޼ҵ� ����
 *    			4. ����� �� �߻��� ��� ó��?
 *    				- �߻��� ���� �޼ҵ� ������ ó��
 *    				- ��û�� ������ ���ܸ� ������ ��Ȳ ����
 *    		
 */
package dept.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dept.model.domain.DeptDTO;
import util.DBUtil;

public class DeptDAO {
	//����
	/* 1. insert �޼ҵ��? insert
	 * 2. parameter Ÿ����? int deptno,  String dname, String loc
	 * 			=>���� ������ insert(int deptno,  String dname, String loc)
	 * 			 or ��ü ������ insert(DeptDTO dept)
	 * 					: dept.model.domain.DeptDTO
	 * 3. ��ȯŸ��? 
	 * 		- boolean?, void?, int?
	 * 
	 * 4. ����ó��? 
	 * 		- �޼ҵ� ���𱸿��� throws�� ����
	 * 5. �ʼ�sql : insert into dept values(?, ?, ?)
	 * 6. �ڿ���ȯ : finally 
	 * 7. �޼ҵ� ���� ���
	 * 		����� �� 1: ���� ����
	 * 						->���� ���� or ���� �Ұ�
	 * 		����� �� 2: ������ ����
	 * 						-SQLException �߻�
	 */

	public static int insert(DeptDTO newDept) throws SQLException {
		Connection con=null;//���� ��ü Ÿ��
		PreparedStatement pstmt = null;
		int result =0;
		
		try {
			con =DBUtil.getConnection();
			pstmt = con.prepareStatement( "insert into dept values(?, ?, ?)");
			pstmt.setInt(1, newDept.getDeptno());
			pstmt.setString(2,  newDept.getDname());
			pstmt.setString(3, newDept.getLoc());
			result= pstmt.executeUpdate();
		}finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	}

	/* delete
	 * 1. deptno ������ �����ϴ� �ش� �μ��� ����
	 * 2. parameter
	 * 3. ��ȯŸ��
	 * 4. �߻� ������ ����� ��
	 * 		1. ����
	 * 		2. ������
	 */

	public static int delete(DeptDTO getDept) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		int result=0;
		
		try
		{
			 con = DBUtil.getConnection();
	         pstmt = con.prepareStatement("delete from dept where deptno =  ?");
	         pstmt.setInt(1, getDept.getDeptno());
	         
	         result = pstmt.executeUpdate();
	      }finally {
	         DBUtil.close(con, pstmt);//public static void close(Connection con, Statement stmt) 
	      }
	      return result;

	}

	// ��� �˻�
	/* 1. ��ȯ Ÿ�� : ���� �޸��� �迭 ������ ����� index�� ������ ����
	 * 					 ArrayList
	 * 2. parameter
	 * 	3. �˻��� ������ ���� �ǽð� ������
	 * 		- �˻��� �����͵��� ��� ArrayList�� ���� ����?
	 * 		- 
	 * 4. ArrayList ��ü�� ���� ����ǰ���?
	 * ���� ������ ����� ��
	 * 1. ���� ����
	 * 		1. �˻� ������ ����
	 * 			DeptDTO ��ü���� ����� ArrayList ��ü ��ȯ
	 * 		2. �˻� ������ ������
	 * 			DeptDTO ��ü���� �� �����ϴ� ArrayList ��ü ��ȯ
	 * 2. ������ ����
	 * 		- ���� �߻�
	 * 
	 * select * from dept
	 */
	public static ArrayList<DeptDTO> selectAll() throws SQLException {
		Connection con = null ;
		PreparedStatement pstmt=null;
		ResultSet rset = null;
		
		ArrayList<DeptDTO> all = null;
		
		try {
			con=DBUtil.getConnection();
			pstmt=con.prepareStatement("select * from dept");
			rset=pstmt.executeQuery();


			
			/*select�� ��������� �� row�� DeptDTO ���� -> ArrayList�� ���� -> ��ȯ
			 */
			all = new ArrayList<DeptDTO>();
			while (rset.next()) {
				System.out.println(rset.getInt(1) + " " 
										 + rset.getString(2) + " " 
										 + rset.getString(3));
		/*  =System.out.println(rset.getInt("deptno") + " " 
			 							 + rset.getString("dname") + " " 
			 							 + rset.getString("loc")); */
		
			}

		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}

}





