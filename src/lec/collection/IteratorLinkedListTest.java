package lec.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLinkedListTest {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(8); 
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			if (i < 10) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}
