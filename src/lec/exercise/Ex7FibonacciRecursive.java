package lec.exercise;

public class Ex7FibonacciRecursive {
	
	static int fibonacci( int n ) {
		// 적당히 수정
		if( n <= 2 ) {
			return 1;
		}
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		var out = System.out;
		
		int n = 46 ; // 47 => -1,323,752,223
		int f = fibonacci( n );
		out.println( "".format( "f[%d] = %,d", n, f ) );
	}

}
