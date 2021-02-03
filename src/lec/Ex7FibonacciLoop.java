package lec;

public class Ex7FibonacciLoop {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		var out = System.out;
		
		int f0 = 1;
		int f1 = 1;
		int f;
		
		int lineNo = 1; 
		while( f0 <= f1) {
			f = f0 + f1 ; 
			f0 = f1;
			f1 = f;
			out.println( "".format( "f[%d] = %d", lineNo, f1 ) );
			
			lineNo ++ ; 
		}
	}

}
