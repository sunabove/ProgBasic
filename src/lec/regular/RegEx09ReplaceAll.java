package lec.regular;

public class RegEx09ReplaceAll {
	public static void main(String args[]) {
		var out = System.out;
		
		var s = "a 1 bc 23 abc 456"; 
		
		var t = s.replaceAll( "[0-9]", "" );
		//var t2 = t.replaceAll( "[ ]+", " " ); // 스페이스가 여러개 붙어 있으면, 하나로 대치한다.
		var t2 = t.replaceAll( "\s+", " " ); // 스페이스가 여러개 붙어 있으면, 하나로 대치한다.
		
		out.println( t ); 
		out.println( t2 ); 
	}
}