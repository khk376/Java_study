package step01.reivew;

public class Review1 {
		//������� ������ġ
		String msg="�ݿ���";
		
		Review1(){}
		Review1(String msg){
		this.msg=msg;
		}
		//��ü ������ �ʿ��� �⺻ ������
		public static void main(String[] args) {
			//? ��ü ���� : ���� ������ r
			Review1 r= new Review1();
			//? msg ������ : �Ͽ���
			r.msg="�Ͽ���";
			System.out.println(r.msg);
			
			Review1 r2= new Review1("�Ͽ���");
			
	}//end of main
		
}//end of class
