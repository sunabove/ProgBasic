package lec.file;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class WriteFibonacciFile {
	public static void main(String[] args) throws Exception {
		var out = System.out;
		FileWriter fileWriter = new FileWriter("c:\\temp\\fibonacci.csv");
		
		for( int i = 0 ; i < 10; i ++ ) {
			fileWriter.write("Hello....\n");
		}
		
		fileWriter.close();
		
		out.println("Successfully wrote to the fibonacci.csv file.");
	}
}