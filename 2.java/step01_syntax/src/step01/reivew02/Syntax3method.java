package step01.reivew02;

public class Syntax3method {
		int no = 100;
		
		//? ��������� �������� int�� ���ϴ� �޼ҵ� ����
		//ȣ���� ������ ����� ��ȯ
		int sum(int no2) {
			return no + no2;
		}
		//? ��� ������ �������� int������ ������ ���( / )
		// ��ȯ�� ����
		/*void div(int a1, int no) {
			int a2=no/a1;
			System.out.println(a2);
		}�����ۼ��� ��..*/
		
		void div(int no2) {
			System.out.println(no/no2);
		}
		
		//? no������ ũ�ٸ�(>=) ����, no ������ ������ ������ ��ȯ
		//������ �����ͷ� ��
		String agecheck(int no1) {
			if(no1>=no) {
				return "����";
			}else {
				return "������";
			}
		}
		
		
		public static void main(String[] args) {
			//? �ΰ��� �޼ҵ带 ȣ�� �� ��� �����Ͱ����� ���
				Syntax3method s= new Syntax3method();
			
				int r=s.sum(10);
				System.out.println(r);
				
				s.div(5);
				
				
				System.out.println();
				//���ǽ� �н�
				if(true) {
					System.out.println("if ���ǽ��� true�� ��� ����");
				} else {
					System.out.println("if ���ǽ��� flase�� ��� ����");
				
		}
		}
}//end of class
		