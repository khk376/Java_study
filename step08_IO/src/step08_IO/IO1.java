/* 1단계 : 키보드로 입력된 데이터 콘솔에 출력
 * 2단계 : 실시간 키보드로 입력된 데이터 콘솔에 출력
 * 3단계 : 실시간 키보드로 입력된 데이터를 파일(encore.txt)에 출력
 * 
 * *필요요소
 * 		1. 데이터 근원지(키보드, 파일, 메모리 ..)
 * 		2. 데이터 목적지(콘솔, 파일, 메모리 ...)
 * 
 * 		3. 기능
 * 			read하는 기능 [read]/write하는 기능[print or write]
 * 		4. 고려사항
 * 			-byte or 2byte에 따라 API 선별
 * 		5. 옵션
 * 			- 필터 기능을 IO에도 반영시 효율적인 입출력이 가능 
 * 
 *  System.in(1 byte)->버퍼기능 활용(Buffered 1byte, buffered 2byte)
 */
package step08_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO1 {

	//step04 - 키보드로 실시간 입력하는 데이터를 encore.txt에 저장
	/* 설계 - 파일에 1 byte 단위 출력 or 2byte 단위 출력? -> 2byte단위로 출력 :FileWriter
	 * 주의사항 - 출력은 반드시 시스템 메모리에 데이터가 잔존할 가능성이 있기 때문에 autoflush 기능(flush()) + 자원반환 필수(close())
	 */
/*	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = null;
		try 
		{
		//file에 2byte 출력가능한 객체 생성
		out = new BufferedWriter(new FileWriter("encore.txt",true ));
		String data =null;
		//? new line 반영해서 출력
		//? 혹시 이미 존재하는 파일명에 출력할 경우 append기능 적용하려면 어떻게?
		while( (data=in.readLine())!=null) {
			out.write(data+"\n");
			
			out.flush();
		}
		//키보드로 부터 read해서 데이터가 있을 경우 파일에 write
		out.flush();
	//자원 반환
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
	
	//step03 - 실시간 키보드로 입력해서 콘솔에 입력
	//반복해서 read 및 print
	//while(조건식){실행로직, 업데이트 문장}
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
	
	
	//step02 - 1byte씩 read하는 test
	/*public static void main(String[] args) {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		try {
			int data = in.read();
			System.out.println((char)data);//형변환으로 앞자 한글자만 출력
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

	//step01 - 한글 정상 입출력
/*	public static void main(String[] args) {
		//1byte씩 read할 수 있는 키보드에 버퍼 기능을 적용해서 효율적으로 2byte read 가능한 객체만 생성
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		
		//read하는 기능은 메소드
		String data="read 시도 시 실패";
		
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
		System.out.println(data);//콘솔에 출력
		
		
	}*/

