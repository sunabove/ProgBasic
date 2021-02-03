package lec;

public class Ex7Fibonacci {
	
	static int fibonacci( int f0 ) {
		// 적당히 수정
		return f0;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		var out = System.out;
		
		int lineNo = 1;
		int f; 
		do {
			f = fibonacci( lineNo );
			out.println( "".format( "f[%d] = %d", lineNo, f ) );
			
			lineNo ++ ;
		}
		while( f >= 0 );
	}

}
