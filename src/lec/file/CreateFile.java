package lec.file;

import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors

public class CreateFile {
	public static void main(String[] args) throws Exception {
		File file = new File("c:\\Temp\\filename.txt");
		
		if (file.createNewFile()) {
			System.out.println("File created: " + file.getName());
		} else {
			System.out.println("File already exists.");
		}
	}
}