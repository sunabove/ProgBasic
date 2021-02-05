package lec.regular;

public class RegEx21UpperReplace {
	public static void main(String args[]) {
		var out = System.out;
		
		var s = "abc abcd abcdef abcefgh"; 
		
		var t = s.replaceAll( "abc", "ABC" );
		
		out.println( t );
	}
}