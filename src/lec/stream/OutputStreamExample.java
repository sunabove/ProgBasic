package lec.stream;

import java.io.FileOutputStream;

public class OutputStreamExample {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout = new FileOutputStream("C:\\Temp\\testout.txt");
		
		fout.write(65);
		fout.close();
		
		System.out.println("success...");
	}
}