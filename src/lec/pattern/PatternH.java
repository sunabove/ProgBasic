package lec.pattern;

public class PatternH {	 

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		var out = System.out; 
		
		var lineNo = 10 ; 
		for (int i = 0; i < lineNo ; i++ ) {
			int cnt = i < 5 ? i + 1 : ( lineNo - i - 1 ) ; 
			
			var text = "* ".repeat( cnt );
			
			var leadCnt = 5 - cnt ; 
			var leading = leadCnt < 1 ? "" : " ".repeat( leadCnt ) ; 
			
			out.println( "".format( "%s%s", leading, text ) );
		}
	}

}
