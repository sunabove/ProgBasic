package lec;

import java.util.ArrayList;

public class Ex03Prime {

	public static void main(String[] args) {
		System.out.println("Hello, World"); 
		
		// primes = [] , íŒŒì�´ì“´ ì½”ë“œ
				
		//ArrayList<Integer> primes = new ArrayList<>();
		//ArrayList<Integer> primes = new ArrayList<Integer>();
		var primes = new ArrayList<Integer>(); // 12, 13 ì¤„ê³¼ ë�™ì�¼
		
		primes.add( 2 );
		
		for( int num = 3; num < 100 ; num ++ ) {
			boolean isPrime = true;
			
			for( int prime : primes ) {
				if( num % prime == 0 ) {
					isPrime = false ;
					// continue; // -- 17 ë²ˆ ì¤„ë¡œ ì�´ë�™
					break; // ê°€ìž¥ ê°€ê¹Œìš´ ë°˜ë³µë¬¸ì�„ ë¹ ì ¸ ë‚˜ê°„ë‹¤. 24 ì¤„
				}
			}
			
			if( isPrime ) {
				primes.add( num ); 
			}
		}
		
		for( int prime : primes ) {
			System.out.println( prime );
		}
	}

}
