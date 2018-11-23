package view;

import java.util.ArrayList;

import controll.Controller;
import database.Student;
import database.Teacher;


// // 3���� Ŭ������ import�Ͽ� startView�� �ϼ��϶�. 

public class StartView {

	public static void main(String[] args) throws Exception{
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
		
		ct.delefeInfo("���뺸�� �ƺ�");

		System.out.println("-----------------------");
		
		//�л� �ݺ��� �޼ҵ� 
		// // 42, 43������ ä���־�
		// // �ܼ�â��
		// // �̹� ������ �ݿ� �ҼӵǾ� �ֽ��ϴ�.
		// // �л��� ���� ���������� ����Ǿ����ϴ�.
		// // �� �� �� ����Ͻÿ�.
		
		ct.infoC("���뺸��", 1);
		ct.infoC("���뺸��", 2);
		
		System.out.println("-----------------------");
		
		//�л��߰�
		// // �Ʒ� 3 ���� �л��� �߰��ϼ���
		// // 17�� ���θ� ū���� ���θ��� 1������
		// // 16�� ���θ� �������� �Ʒθ��� 2������
		// // 13�� �Ʊ� ��� ���������� 3������
		// // 
		
		ct.iphakStudent("���θ�", 17, 1);
		ct.iphakStudent("�Ʒθ�", 16, 2);
		ct.iphakStudent("��������", 13, 3);
		
		System.out.println("-----------------------");
		
		//������ �Ǵ� �л� �߰��� Exception
		// // �Ʒ� 4���� �߰� �õ��� ���� Exception�� ���� �Դϴ�.
		// // Exception�� �߻��ϴ� ������ ���� �ּ����� �ް�
		// // Exception�� ����Ų �κи��� �����ؼ� ���������� �߰��ǵ��� ����ÿ�
		// // ex) ct.infoC("������", 23, "��û�� ���ǽ�ų"); �̸��� �ߺ��Ǿ ���ܹ߻�
		// //     ct.infoC("�����", 23, "��û�� ���ǽ�ų"); -�̸��� ����

		ct.iphakStudent("��������", 15, 3); // �̸� �ߺ�
		ct.iphakStudent("�߿��� ��", 25, 1); // �����԰� �̸� �ߺ�
		ct.hireTeacher("���", 48, "���� �̻��� ¡ġ�� ����� ����"); // �̸��� 3���� ����
		ct.hireTeacher("���� ������", 00, "���� ���̴� ���� �ȿ� ���ֹ�����~"); // ������ �ߺ�
		
		// ��ü���� ���
		// // ������ ����� ���������� ��µ����� �л������ ���������� ��µ��� �ʽ��ϴ�.
		// // �л� ����� ������ ��ϰ� ���������� ����� ��µǰԲ� �����ϱ� 
		
		ct.printallstudent(student);
		ct.printallteacher(teacher);
		
		
		System.out.println("-----------------------");
		
		//�˻����
		// // ���뺸�� �� ���� ��δ� �˻��� 
		// // ������ �Ǵ� �л��� ��µǾ�� �մϴ�. 
		// // searchinfo�� �ڵ忡 ������ ã�� �����ϰ�
		// // ����ó���Ǵ� ��쿣 � ���������� ������ ������ �ּ����� �޾��ּ���
		
		ct.searchinfo("�߿��� ��"); 
		ct.searchinfo("���뺸��");
		ct.searchinfo("���� ��δ�"); 

	}
}
