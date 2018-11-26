/* 1�ܰ� : Ű����� �Էµ� ������ �ֿܼ� ���
 * 2�ܰ� : �ǽð� Ű����� �Էµ� ������ �ֿܼ� ���
 * 3�ܰ� : �ǽð� Ű����� �Էµ� �����͸� ����(encore.txt)�� ���
 * 
 * *�ʿ���
 * 		1. ������ �ٿ���(Ű����, ����, �޸� ..)
 * 		2. ������ ������(�ܼ�, ����, �޸� ...)
 * 
 * 		3. ���
 * 			read�ϴ� ��� [read]/write�ϴ� ���[print or write]
 * 		4. �������
 * 			-byte or 2byte�� ���� API ����
 * 		5. �ɼ�
 * 			- ���� ����� IO���� �ݿ��� ȿ������ ������� ���� 
 * 
 *  System.in(1 byte)->���۱�� Ȱ��(Buffered 1byte, buffered 2byte)
 */
package step08_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO1 {

	//step04 - Ű����� �ǽð� �Է��ϴ� �����͸� encore.txt�� ����
	/* ���� - ���Ͽ� 1 byte ���� ��� or 2byte ���� ���? -> 2byte������ ��� :FileWriter
	 * ���ǻ��� - ����� �ݵ�� �ý��� �޸𸮿� �����Ͱ� ������ ���ɼ��� �ֱ� ������ autoflush ���(flush()) + �ڿ���ȯ �ʼ�(close())
	 */
/*	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = null;
		try 
		{
		//file�� 2byte ��°����� ��ü ����
		out = new BufferedWriter(new FileWriter("encore.txt",true ));
		String data =null;
		//? new line �ݿ��ؼ� ���
		//? Ȥ�� �̹� �����ϴ� ���ϸ� ����� ��� append��� �����Ϸ��� ���?
		while( (data=in.readLine())!=null) {
			out.write(data+"\n");
			
			out.flush();
		}
		//Ű����� ���� read�ؼ� �����Ͱ� ���� ��� ���Ͽ� write
		out.flush();
	//�ڿ� ��ȯ
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	}
}*/
	
	//step03 - �ǽð� Ű����� �Է��ؼ� �ֿܼ� �Է�
	//�ݺ��ؼ� read �� print
	//while(���ǽ�){�������, ������Ʈ ����}
	public static void main(String[] args) {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		try {
			String data = null;
			data = in.readLine();
			while(data!=null) {
				System.out.println(data);
				data=in.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	
	//step02 - 1byte�� read�ϴ� test
	/*public static void main(String[] args) {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		try {
			int data = in.read();
			System.out.println((char)data);//����ȯ���� ���� �ѱ��ڸ� ���
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/

	//step01 - �ѱ� ���� �����
/*	public static void main(String[] args) {
		//1byte�� read�� �� �ִ� Ű���忡 ���� ����� �����ؼ� ȿ�������� 2byte read ������ ��ü�� ����
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		
		//read�ϴ� ����� �޼ҵ�
		String data="read �õ� �� ����";
		
		try {
			data = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(data);//�ֿܼ� ���
		
		
	}*/

