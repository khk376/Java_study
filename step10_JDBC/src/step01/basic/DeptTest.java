package step01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptTest {
	
	

	public static void main(String[] args) {
		Connection con = null;// ���� ��ü Ÿ��
		Statement stmt = null;// sql���� ���� ��ü
		ResultSet rset = null;// select ����� �����ϰ� �Ǵ� ��ü Ÿ��
		try {
			// 1�ܰ� : driver �޸𸮿� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver �ε� �Ϸ�.");

			// 2�ܰ� : ����(id/pw/db url) : Connection
			// =>db��ġ �˱����� url�� �ʿ�
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "SCOTT", "TIGER");
			System.out.println(con);
			// 3�ܰ� : sql���� �ۼ�
			/*
			 * select - �˻��� data�� table ������ �˻� �ڹ��� ������ Ÿ�� : ResultSet insert/update/delete -
			 * table�� ����, ����, ������ row�� �ڹ��� ������ Ÿ�� : int
			 */
			// 4�ܰ� : sql���� ���� �� Ȱ��
			stmt = con.createStatement();
			// ��� �˻� - select(query)
			rset = stmt.executeQuery("select * from dept");
			while (rset.next()) {
				System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
			}
			// insert
			int resultNo = stmt.executeUpdate("insert into dept values(35, '������', '����')");
			System.out.println(resultNo + "�� ����");

			// ���˻� - select(query)
			rset = stmt.executeQuery("select *from dept");
			while (rset.next()) {
				System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
			}
		/* ����� �߻� ������ ����� ��
		 * 1. sql���� ���� ����
		 * 2. ����
		 * 		1. �����Ͱ� �ִ���
		 * 			next() / getXxx()
		 * 		2. �����Ͱ� ������
		 * 			next() ������ ���� ��� getXxx()ȣ�� ����
		 */
		
		//5�ܰ� : ����(�ڿ���ȯ
		
		} catch (Exception e) {// ���� Ŭ������ ����Ÿ��, �ڽ� Ÿ�� ��� ���� ����(������)
			 e.printStackTrace();
		} finally {
			try {
				if(rset!=null) {
					rset.close();
					rset=null;
				}
				if(stmt!= null) {
					stmt.close();
					stmt=null;
				}
				if (con != null) {
					con.close();
					con = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}

	
