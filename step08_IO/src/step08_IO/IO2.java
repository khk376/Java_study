package step08_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IO2 {

	public static void main(String[] args) {
		BufferedWriter in = null;
		try {
			in= new BufferedWriter(new FileWriter("encore2.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
