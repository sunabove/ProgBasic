package lec;

public class Ex7FibonacciRecursive {
	
	static int fibonacci( int n ) {
		// 적당히 수정
		if( n <= 2 ) {
			return 1;
		}
		
		return n + fibonacci( n - 1 );
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		var out = System.out;
		
		int n = 45 ; 
		int f = fibonacci( n );
		out.println( "".format( "f[%d] = %d", n, f ) );
	}

}
