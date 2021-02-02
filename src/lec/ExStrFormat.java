package lec;

public class ExStrFormat {

	public static void main( String [] args ) {		
		var out = System.out;
		
		String output;
		
		output = "joe = " + 35 ;		
		out.println( output );
		
		output = String.format( "%s = %d", "joe", 35);
		out.println( output );
		
		output = "".format( "%s = %d", "joe", 35);
		out.println( output );
		
		System.out.printf( "My name is: %s%n", "joe" );
		System.out.printf( "My name is: " + "joe" + "\n");

	}

}
