package lec;

public class Ex9CharRange {

	public static void main(String[] args) {
		var out = System.out;
		
		char c = 0;		
		char c2 = (char) ( c + 1 ) ;
		// char c2 = c + (char)( 1) ; // error
		// char c2 =c + 1 ; // 정수 연산 => int
		                  // 실수 연산 => double
		
		while( c2 > c ) {
			out.println( (int) c2 );
			//out.println( c2 );
			
			c = c2;
			c2 = (char) ( c + 1 );
		}	

	}

}
