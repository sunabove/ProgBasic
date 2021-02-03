package lec.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {
	
	@Test // Annotation, 주석, 단위테스트를 의미함.
	public void testAdd() {
		String str = "Junit 1 is working fine";
		
		// 에러 코드
//		String s = null ;
//		s.length();
		
		assertEquals( str + str , str);
	}
}
