package lec;

public class PatternJ {	 

	public static void main(String[] args) {
		var out = System.out; 
		
		String text;
		for (int row = 0; row < 5 ; row ++ ) {
			text = "" ; 
			for (int col = 0; col < 5 ; col ++ ) {
				var num = row*5 + col + 1;
				//text += String.format( "%2d ", num );
				text = String.format( "%s%2d ", text, num );
			}
			out.println( text );
		}
	}

}
