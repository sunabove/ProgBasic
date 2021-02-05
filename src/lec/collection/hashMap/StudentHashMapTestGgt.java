package lec.collection.hashMap;

import java.util.*;

public class StudentHashMapTestGgt {

	public static void main(String[] args) {

		HashMap <Integer,String> map = new HashMap <Integer,String>();
		
		map.put(1, "JEI/공경택");
		map.put(2, "아이웨이/배인효");
		map.put(3, "아이웨이/신성현");
		map.put(4, "아이웨이/최성호");
		map.put(5, "JEI/박보람");
		map.put(6, "JEI/이동수");
		map.put(7, "JEI/정한민");
		map.put(8, "JEI/홍지수");
		
		int maxValue = Collections.max(map.keySet());
		
		System.out.println(maxValue);

		String name = map.get( maxValue );

		System.out.println( "name = " + name );
	}

}
