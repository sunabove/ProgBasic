package lec.collection.hashMap;

import java.util.HashMap;

public class StudentHashMapTestPbr2 {
	// 박보람 님 작성 

	public static void main(String[] args) {
		
		
		HashMap <Integer, String> s = new HashMap<Integer, String>();
		int idx = 1;
		int idxpre = 1;
		int max = idx;
		
		s.put(idx++, "박보람");
		s.put(idx++, "공경택");
		s.put(idx++, "이동수");
		s.put(idx++, "정한민");
		s.put(idx++, "홍지수");
		
		for (Integer k : s.keySet()) {
			if (k > max) {
				idxpre = max;
				max = k;
			}
		}
		
		System.out.println(s.get(max));
		System.out.println("pre " + s.get(idxpre));  

	}

}
