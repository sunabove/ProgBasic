package lec.collection;

import java.util.HashMap;

public class StudentHashMapTestPbr {

	public static void main(String[] args) {		
		
		HashMap <Integer, String> s = new HashMap<Integer, String>();
		int idx = 1;
		int max = idx;
		
		s.put(idx++, "박보람");
		s.put(idx++, "공경택");
		s.put(idx++, "이동수");
		s.put(idx++, "정한민");
		s.put(idx++, "홍지수");
		
		for (Integer k : s.keySet()) {
			if (k > max) {
				max = k;
			}
		}
		
		System.out.println(s.get(max));

	}

}
