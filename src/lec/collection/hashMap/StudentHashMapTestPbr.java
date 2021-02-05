package lec.collection.hashMap;

import java.util.HashMap;

public class StudentHashMapTestPbr {

	public static void main(String[] args) {		
		
		var s = new HashMap<Integer, String>();
		int idx = 1;
		int max = idx;
		
		s.put(idx++, "박보람");
		s.put(idx++, "공경택");
		s.put(idx++, "이동수");
		s.put(idx++, "정한민");
		s.put(idx++, "홍지수");
		
		// max 값을 구한다.
		for (Integer k : s.keySet()) {
			if (k > max) {
				max = k;
			}
		}
		
		// max 차순위 키 값을 구한다.
		
		System.out.println(s.get(max));

	}

}
