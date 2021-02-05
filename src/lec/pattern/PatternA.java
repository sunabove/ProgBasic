package lec.pattern;

public class PatternA {

	public static void main(String[] args) {
		var out = System.out; 
		
		for( int i = 1; i < 7 ; i ++ ) {
			for( int k = 0; k < i ; k ++ ) {
				out.print( "" + i );
			}
			out.println();
		}
	}

}
