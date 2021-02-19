package lec.exercise;

import java.util.ArrayList;

public class Ex03Prime {

	public static void main(String[] args) {
		System.out.println("Hello, World"); 
		
		// primes = [], python code
				
		//ArrayList<Integer> primes = new ArrayList<>();
		//ArrayList<Integer> primes = new ArrayList<Integer>();
		var primes = new ArrayList<Integer>(); // 12, 13 줄과 동일 
		
		primes.add( 2 );
		
		for( int num = 3; num < 100 ; num ++ ) {
			boolean isPrime = true;
			
			for( int prime : primes ) {
				if( num % prime == 0 ) {
					isPrime = false ;
					// continue; 
					break; // 가장 가까운 반복문을 빠져 나감.
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
