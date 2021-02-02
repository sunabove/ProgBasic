package lec;

public class ExE_MultilicationTable {
	public static void main(String[] args) {
		var out = System.out; 
		
		for( int i = 1 , iLen = 9 ; i <= iLen ; i ++ ) {
			for( int k = 1 , kLen = 9 ; k <= kLen ; k ++ ) {
				out.println( i + " * " + k + " = " + (i*k) );				
			}
			out.println();
		}
	}
}
