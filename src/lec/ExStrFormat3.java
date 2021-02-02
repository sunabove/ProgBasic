package lec;

public class ExStrFormat3 {

	@SuppressWarnings("static-access")
	public static void main( String [] args ) {		
		var out = System.out;
		
		String text;
		
		text = "".format("|%20s|", "*"); // prints: |                  93|
		out.println( text );
		
		text = "".format("|%-20s|", "*"); // prints: |93                  |
		out.println( text );
	}

}
