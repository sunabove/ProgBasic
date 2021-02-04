package lec.file;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class WriteFibonacciFile {
	static int fibonacci(int n) {
		// 적당히 수정
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
		for(int i = 0; i < 10; i++) {
			f = fibonacci( i );
			text = String.format( "%d, %d\n", i, f );
			out.print( text );
			fileWriter.write( text );
		}
		
		fileWriter.flush();

		fileWriter.close();

		out.println("Successfully wrote to the fibonacci.csv file.");
	}

}