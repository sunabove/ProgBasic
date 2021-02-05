package lec.pattern;

public class PatternK {	 

	public static void main(String[] args) {
		var out = System.out; 
		
		String text;
		String dot= "·";
		var digits = 12345679;
		var num = 0 ;
		var r = 0 ; 
		for (int row = 0; row < 5 ; row ++ ) {
			r = 9*(row + 1) ; 
			num = digits*r;
			
			text = String.format( "%9d %s %2d = %,d", digits, dot, r, num ) ;			
			
			out.println( text );
		}
	}

}
