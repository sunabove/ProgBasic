package lec;

public class PatternF2 {	
	// 박보람님 작성, 성병문

	public static void main(String[] args) {
		var out = System.out; 
		
		for (int i = 5; i > 0; i--) {
			var text = "*".repeat( i );
			out.println( text );
		}
	}

}
