package lec.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String args[]) throws Exception {
		var sout = System.out;
		
		sout.println( "Hello...." );
		
		var in = new FileInputStream("C:\\Temp\\ascii.txt");
		var out = new FileOutputStream("C:\\Temp\\my_ascii.txt");
		
		int i ;
		
		// 파일에서 한 바이트 읽어들임.
		i = in.read();
		
		while( i > -1 ) {
			sout.println( "char = " + (char) i );
			
			// 파일에서 한 바이트 씀.
			out.write( i );
			// 파일에서 한 바이트 읽어들임.
			i = in.read(); 
		}

		out.flush();
		
		in.close();
		out.close();
		
		sout.println( "Good bye!" );
	}
}