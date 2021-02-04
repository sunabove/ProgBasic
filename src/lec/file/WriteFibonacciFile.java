package lec.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteFibonacciFile {
	
	static int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) throws Exception {
		var out = System.out;
		FileWriter fileWriter = new FileWriter("c:\\temp\\fibonacci.csv");
		
		out.println( "Hello.." );
		
		int f;
		String text ; 
		for(int i = 1; i < 50; i++) {
			f = fibonacci( i );
			
			if( f < 0 ) {
				break;
			} else { 
				text = String.format( "%d, %d\n", i, f );
				out.print( text );
				
				fileWriter.write( text );
			}
		}
		
		fileWriter.flush();

		fileWriter.close();

		out.println("Successfully wrote to the fibonacci.csv file.");
	}

}