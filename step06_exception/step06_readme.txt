�н�����

1. ����� �߻� ������ ����� ���� �ڵ�� ������ ���� ���
2. �ݱ��ؾ� �� �׸�
	- ���� �߻��� ���α׷� ��ü�� ���� �Ǵ� ��Ȳ�� �߻� ����
3. ����ó��
	- �߻� ������ ��Ȳ�� exception(����)��� ǥ��
	- ���� ó���� �ڵ�� �ڵ鸵 �ϴ� ���
4. ���� �� ����� �߻��� ���� ����
	���� �߻� ����
	1. ���� ����
		- ~���� ��� �޼����� ������ �Ұ��� ��Ȳ
		����ó�� ���� �ʼ�! try~catch~finally
	2. ���� ����(��Ÿ�� ����)
		- try~catch ó�� ���� �ɼ�
		- *** API���� ����
			java.lang.RuntimeException�� ���� Ŭ�������� ���� ����
		- NullPointerException
		- �ذ�å
			�����Ͱ� ���� 
			
5. ClassNotFoundException�� Ŭ�����ϱ�� �ƴұ��?

	java.lang.Class
		public static Class forName(String saveFileName) 
		throws ClassNotFoundException { //throws �޼��� ���� ��
			�����ϴ� ������ ��� �޸𸮿� ����(�ε�)
			�����ϴ� ������ ��� ���ܸ� �߻��ؼ� ����ڿ��� �˷���
				throw new ClassNotFoundException();
				
		}
		
		FileNotFoundException
		new FileReader("a.txt")
		
		