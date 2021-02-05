package lec.regular;

import java.util.regex.*;

public class RegEx08DigitCnt {
	public static void main(String args[]) {
		var out = System.out;
		
		var s = "abc 123 def 345 ghi 678.9"; 
		
		var digitCnt = Pattern.compile( "[0-9]" ).matcher(s).results().count();
		
		out.println( String.format("digitCnt = %d", digitCnt ) ); 
	}
}