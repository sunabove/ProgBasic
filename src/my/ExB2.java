package my;

public class ExB2 {

	public static void main(String[] args) {
		var out = System.out; 
		
		char [] data = { 'J' , 'A', 'V', 'A' };
		
		for( int i = 0; i < data.length ; i ++ ) {
			for( int k = 0; k < i + 1 ; k ++ ) {
				out.print( data[k] );
			}
			out.println();
		}
	}

}
