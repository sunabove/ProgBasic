package lec;

public class PatternH {	 

	public static void main(String[] args) {
		var out = System.out; 
		
		var lineNo = 10 ; 
		for (int i = 0; i < lineNo ; i++ ) {
			int cnt = i < 5 ? i + 1 : ( lineNo - i ) ; 
			
			var text = "*".repeat( cnt );
			
			//var space = 
			
			out.println( text );
		}
	}

}
