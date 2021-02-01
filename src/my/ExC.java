package my;

public class ExC {
	public static void main(String[] args) {
		var out = System.out; 
		var n = 9 ; 
		for( int i = 0 ; i < n ; i ++ ) {
			for( int k = 0 ; k < n - i - 1 ; k ++ ) {
				out.print( " ");
			}
			for( int k = 0 ; k < 2*i + 1 ; k ++ ) {
				var d = i - k + 1;
				if( d < 1) {
					d = Math.abs(d - 2);
				}
				out.print( d );
			}
			out.println();
		}
	}
}
