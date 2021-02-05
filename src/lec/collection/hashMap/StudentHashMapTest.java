package lec.collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentHashMapTest {

	public static void main(String[] args) {
		var noNameMap = new HashMap<Integer, String>();
		
		var no = 0 ; 
		noNameMap.put( no ++ ,  "Jone" );
		noNameMap.put( no ++ ,  "Brown" );
		
		System.out.println( "*".repeat(40));
		
		var bigNo = -1 ;  
		
		// 가장 높은 번호의 키를 구한다.
		for ( var key : noNameMap.keySet()) { 
			System.out.println("No = " + key); 
		}
		
		// 가장 높은 키값의 이름을 구하여 출력한다.
	}

}
