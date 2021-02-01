package my;

public class ExB {

	public static void main(String[] args) {
		var out = System.out; 
		
		var data = "JAVA" ; 
		for( int i = 0; i < data.length() ; i ++ ) {
			for( int k = 0; k < i + 1 ; k ++ ) {
				out.print( data.charAt(k) );
			}
			out.println();
		}
	}

}
