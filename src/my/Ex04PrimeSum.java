package my;

import java.util.ArrayList;

public class Ex04PrimeSum {

	public static void main(String[] args) {
		System.out.println("Hello, World"); 
		
		// primes = [] , 파이쓴 코드
				
		//ArrayList<Integer> primes = new ArrayList<>();
		//ArrayList<Integer> primes = new ArrayList<Integer>();
		var primes = new ArrayList<Integer>(); // 12, 13 줄과 동일
		
		primes.add( 2 );
		
		for( int num = 3; num < 100 ; num ++ ) {
			boolean isPrime = true;
			
			for( int prime : primes ) {
				if( num % prime == 0 ) {
					isPrime = false ;
					// continue; // -- 17 번 줄로 이동
					break; // 가장 가까운 반복문을 빠져 나간다. 24 줄
				}
			}
			
			if( isPrime ) {
				primes.add( num );
			}
		}
		
		// int sum = 0;
		var sum = 0 ;
		
		for( int prime : primes ) {
			sum += prime ;
		}
		
		System.out.println( sum );
	}

}
