package lec.exercise;

public class ExStrFormat2 {

	public static void main( String [] args ) {		
		var out = System.out;
		
		String text;
		
		text = String.format("|%d|",93); // prints 93
		out.println( text );
		
		text = String.format("|%20d|",93); // prints: |                  93|
		out.println( text );
		
		text = String.format("|%-20d|",93); // prints: |93                  |
		out.println( text );
		
		text = String.format("|%020d|",93); // prints: |00000000000000000093|
		out.println( text );
		
		text = String.format("|%+20d|",93); // prints: |                 +93|
		out.println( text );
		
		text = String.format("|%,d|",10000000); // prints: |10,000,000|
		out.println( text );
	}

}
