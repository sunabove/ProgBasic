package lec.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorHashMap {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, Integer> entry = entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	
	public static void main2(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Iterating over keys only
		for (Integer key : map.keySet()) {
		    System.out.println("Key = " + key);
		}

		// Iterating over values only
		for (Integer value : map.values()) {
		    System.out.println("Value = " + value);
		}
	}
	
	public static void main3(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.forEach( (k,v) -> { System.out.println( k + "," + v ); }); 
	}

}
