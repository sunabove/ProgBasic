package lec;

public class PatternG2 {	
	// 박보람님 작성, 성병문

	public static void main(String[] args) {
		var out = System.out; 
		
		var lineNo = 11 ; 
		for (int i = 1; i < lineNo ; i++ ) {
			int cnt = i < 6 ? i : ( lineNo -i - 1 ) ; 
			
			var text = "* ".repeat( cnt );
			
			out.println( text );
		}
	}

}
