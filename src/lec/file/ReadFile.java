package lec.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Temp\\filename.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String data = scanner.nextLine();
			System.out.println(data);
		}
		scanner.close();
	}
}