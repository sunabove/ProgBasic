package lec;

public class PatternI {	 

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		var out = System.out; 
		
		var lineNo = 10 ; 
		for (int i = 0; i < lineNo ; i++ ) {
			int cnt = i < 5 ? i + 1 : ( lineNo - i - 1 ) ; 
			
			var text = "* ".repeat( cnt );
			
			var leadSpaceCnt = 5 - cnt ; 
			var leadingSpace = leadSpaceCnt < 1 ? "" : " ".repeat( leadSpaceCnt ) ; 
			//leadingSpace = "";
			var laggingSpace = leadingSpace;
			//laggingSpace = "";
			
			text = "".format( "%s%s%s", leadingSpace, text, laggingSpace );
			text = text.repeat( 2 );
			
			out.println( text );
		}
	}

}
