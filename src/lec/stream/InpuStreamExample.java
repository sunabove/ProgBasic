package lec.stream;

import java.io.FileInputStream;

public class InpuStreamExample {
	public static void main(String args[]) throws Exception {
		FileInputStream fin = new FileInputStream("C:\\Temp\\testout.txt");
		
		int i = fin.read();
		char c = (char) i; 
		
		System.out.println( "int = " + i );
		System.out.println( "char = " + c );

		fin.close();
	}
}