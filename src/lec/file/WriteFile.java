package lec.file;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class WriteFile {
	public static void main(String[] args) throws Exception {
		FileWriter fileWriter = new FileWriter("c:\\temp\\filename.txt");
		fileWriter.write("Files in Java might be tricky, but it is fun enough!");
		fileWriter.close();
		System.out.println("Successfully wrote to the file.");
	}
}