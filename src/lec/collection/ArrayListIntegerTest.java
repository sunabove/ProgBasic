package lec.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntegerTest {
	public static void main(String[] args) {
		var numbers = new IntegerList();
		
		numbers.add( 1 );
		numbers.add( 2 );
		numbers.add( 5 );
		numbers.add( 9 );
		
		for (var number : numbers) {
			System.out.println( number );
		}
	}
}