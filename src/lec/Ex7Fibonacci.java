package lec;

public class Ex7Fibonacci {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		var out = System.out;
		
		int f0 = 1;
		int f1 = 1;
		
		int idx = 1; 
		while( f0 <= f1) {
			out.println( "".format( "f[%d] = %d", idx, f1 ) );
			
			idx ++ ; 
		}
	}

}
