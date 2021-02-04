package lec.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String args[]) throws Exception {
		var sout = System.out;
		
		sout.println( "Hello...." );
		
		var in = new FileInputStream("C:\\Temp\\ascii.txt");
		var out = new FileOutputStream("C:\\Temp\\my_ascii.txt");
		
		int i = in.read();
		
		while( i > -1 ) {
			// out ......
			sout.println( "char = " + (char) i );
		}

		out.flush();
		
		in.close();
		out.close();
		
		sout.println( "Good bye!" );
	}
}