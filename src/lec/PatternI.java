package lec;

public class PatternI {	 

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		var out = System.out; 
		
		var lineNo = 10 ; 
		for (int i = 0; i < lineNo ; i++ ) {
			int cnt = i < 5 ? i + 1 : ( lineNo - i - 1 ) ; 
			
			var text = "* ".repeat( cnt );
			
			var leadCnt = 5 - cnt ; 
			var leading = leadCnt < 1 ? "" : " ".repeat( leadCnt ) ; 
			var lagging = leading;
			
			out.println( "".format( "|%s%s%s|", leading, text, lagging ) );
		}
	}

}
