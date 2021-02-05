package lec.regular;

import java.util.regex.*;

public class RegEx20AlphaDigitCnt {
	public static void main(String args[]) {
		var out = System.out;
		
		var s = "abc 123 def 345 ghi 678.9"; 
		
		var digitCnt = Pattern.compile( "[0-9]" ).matcher(s).results().count();
		
		out.println( String.format("digitCnt = %d", digitCnt ) );
		
		var numCnt = Pattern.compile( "[0-9]+" ).matcher(s).results().count();
		
		out.println( String.format("numCnt = %d", numCnt ) );
		
		var alpahCnt = Pattern.compile( "[A-z]+" ).matcher(s).results().count();
		
		out.println( String.format("alpahCnt = %d", alpahCnt ) );
	}
}