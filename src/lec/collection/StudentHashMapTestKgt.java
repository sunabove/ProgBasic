package lec.collection;
import java.util.*;

import java.util.stream.Collectors;

public class StudentHashMapTestKgt {
	// 공경택님 작성

	public static void main(String[] args) {

		Map <Integer,String> map = new HashMap<>();

		var out = System.out;

		map.put(1, "JEI/홍지수");
		map.put(2, "JEI/정한민");
		map.put(3, "JEI/이동수");
		map.put(4, "JEI/공경택");
		map.put(5, "JEI/박보람");

		var sortList = map.keySet().stream().sorted().collect(Collectors.toList());
		
		var key = sortList.get( sortList.size() - 2 );
		
		var name = map.get( key );

		out.print( name );

	}

}
