package lec.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteFibonacciFileHashMap {
	
	static HashMap <Integer, Integer> fibMap = new HashMap<Integer, Integer>();
	
	static int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		}
		
		// 이미 구한 f(n)이 있는 지 체크한다.
		var f = fibMap.get( n );
		
		if( f != null ) {
			// 이미 구한 f(n)이 있으면, 그 값을 반환한다.
			
			return f;
		} else {
			// 이미 구한 f(n)이 없으면, 재귀함수를 사용하여 구한다.			
			f = fibonacci(n - 1) + fibonacci(n - 2);	
			
			// 구한 f(n) 값을 Map에 등록한다.
			fibMap.put( n,  f );
			
			return f;
		}
	}

	public static void main(String[] args) throws Exception {
		var out = System.out;
		FileWriter fileWriter = new FileWriter("c:\\temp\\fibonacci.csv");
		
		out.println( "Hello.." );
		
		int f;
		String text ; 
		for(int i = 1; i < 50; i++) {
			f = fibonacci( i );
			
			if( f < 0 ) {
				break;
			} else { 
				text = String.format( "%d, %d\n", i, f );
				out.print( text );
				
				fileWriter.write( text );
			}
		}
		
		fileWriter.flush();

		fileWriter.close();

		out.println("Successfully wrote to the fibonacci.csv file.");
	}

}