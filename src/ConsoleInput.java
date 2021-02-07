import java.io.*;

public class ConsoleInput {

	public static void main(String[] args) throws Exception {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print( "Enter a message : " );
		
		var userInput = console.readLine();
		
		System.out.println( userInput );
		
		System.out.println( "Good bye!");
	}

}
