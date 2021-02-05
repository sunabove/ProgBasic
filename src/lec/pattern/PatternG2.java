package lec.pattern;

public class PatternG2 {	
	// 박보람님 작성, 성병문 수정 

	public static void main(String[] args) {
		var out = System.out; 
		
		var lineNo = 10 ; 
		for (int i = 0; i < lineNo ; i++ ) {
			int cnt = i < 5 ? i + 1 : ( lineNo - i - 1 ) ; 
			
			var text = "* ".repeat( cnt );
			
			out.println( text );
		}
	}

}
