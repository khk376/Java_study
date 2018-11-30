package View;

import java.util.ArrayList;

import Controll.Controller;
import Database.Student;
import Database.Teacher;

// // �� import ���� ���� ������ ���� ���� �ذ��ϰ� �ϴ� ����?

public class StartView {

	public static void main(String[] args) {
		Controller ct = new Controller();		

		//�����Ե��
		ArrayList<Teacher> teacher = Teacher.getInstance();
		Teacher.addTeacher("�ʺθ� �ƺ�", 30, "�ʺθ� ������");
		Teacher.addTeacher("���뺸�� �ƺ�", 35, "���� ���");
		Teacher.addTeacher("�߿��� ��", 26, "�װ� ����̾�");
		Teacher.addTeacher("���� ������", 00, "���� ���̴� ���� �ȿ� ���ֹ�����~");
		
		//�л��� ��� 
		ArrayList<Student> student = Student.getInstance();
		Student.addStudent("���뺸��", 15, 1);
		Student.addStudent("���θ�", 15, 2);
		Student.addStudent("�ʺθ�", 16, 3);
				
		//������ ����
		
		ct.infoC("���뺸�� �ƺ�");

		System.out.println("-----------------------");
		
		//�л� �ݺ���
		// // �Ʒ� �� ���� ?? ó���ϰ�, ���⿡ �ڵ带 �־  �ܼ� â�� 
		// // �̹� ������ �ݿ� �ҼӵǾ� �ֽ��ϴ�.
		// // ���������� ���� ����Ǿ����ϴ�.
		// // �� �� �� ����ϱ�.
		
		ct.infoC("���뺸��", 1);
		ct.infoC("�ʺθ�", 2);
		
		System.out.println("-----------------------");
		
		//�л��߰�
		// // �Ʒ� 3 ���� �л��� �߰��ϼ���
		// // 17�� ���θ� ū���� ���θ��� 1������
		// // 16�� ���θ� �������� �Ʒθ��� 2������
		// // 13�� �Ʊ� ��� ���������� 3������
		// // 
		
		ct.infoC("���θ�", 17, 1);
		ct.infoC("�Ʒθ�", 16, 2);
		ct.infoC("��������", 15, 3);
		
		System.out.println("-----------------------");
		
		//������ �Ǵ� �л� �߰��� Exception
		// // �Ʒ� 4���� �߰� �õ��� ���� Exception�� ���� �Դϴ�.
		// // �߿��� ���� �̹� �������� ���, ����� �̸�����, ���� �������� �̹� �ִ� ������.

		ct.infoC("��������", 15, 3);
		ct.infoC("�߿��� ��", 25, 1);
		ct.infoC("���", 48, "���� �̻��� ¡ġ�� ����� ����");
		ct.infoC("���� ������", 00, "���� ���̴� ���� �ȿ� ���ֹ�����~");
		
		// ��ü���� ���
		// // �л� ����� ������ ��ϰ� ���������� ����� ��µǰԲ� �����ϱ� 
		
		ct.printallstudent(student);
		ct.printallteacher(teacher);
		
		
		System.out.println("-----------------------");
		
		//�˻����
		// // ���뺸�� �� ���� ��δ� �˻��� 
		// // �� �޽��� ��� ������ �Ǵ� �л��� ��µǾ�� �մϴ�. 
		// // �Ǵ� ����ó���� �߻��ϴ� ������, ��������� �ּ����� �����ּ���
		// // 1. ���뺸���� ��� : [����] Student �� toString �� ���ǵ��� �ʾ� People �� toString�� ��µǾ���. 
		// // 	 			 [�������] Teacher ���� .toString �� �����Ͽ� Student ������ �־��ش�.
		// // 2. ���� ��δ��� ��� : [����] ��Ͽ� ���� �̸��̹Ƿ� searchinfo���� try-catch�� e.printStackTrace(); ��÷
		// // 					[�������] e.printStackTrace(); ��� System.out.println(); Ȱ��
		ct.searchinfo("�߿��� ��");
		ct.searchinfo("���뺸��");
		ct.searchinfo("���� ��δ�"); 
		// //  1. �� �ڵ忡�� ���뺸�밡 �ƴ� ���θ��� ��µǴ� ������ ã��, ���뺸�밡 ��µǰ� �ڵ带 �����ϼ���
	}
}
