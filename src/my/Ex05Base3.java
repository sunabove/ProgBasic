package my;

public class Ex05Base3 {
	
	public static long toBase3(int num) {
	    long baseConvert = 0, factor = 1;
	    while (num > 0) {
	        baseConvert += num % 3 * factor;
	        num /= 3;
	        factor *= 10;
	    }
	    return baseConvert;
	}

	public static void main(String[] args) {
		System.out.println("Hello, World");
		
		for( int i = 0 ; i < 10 ; i ++ ) {
			var base3 = toBase3( i );
			System.out.println( "decimal: " + i + " => base 3: " + base3 );
		}
	}

}
