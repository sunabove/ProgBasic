package lec.stream;

import java.io.FileOutputStream;

public class AlphabetNumerFileOutputStream {
	public static void main(String args[]) throws Exception {
		var out = System.out;
		out.println( "Hello" );
		
		FileOutputStream fout = new FileOutputStream("C:\\Temp\\ascii.txt");
		var ascii = '0' ; 
		
		while( ascii <= 'z' ) {
			
			fout.write( ascii );
			fout.write( '\n' );
			//fout.write( "\n" );
			ascii ++ ; 
		}
		fout.close();
		
		out.println("success...");
	}
}