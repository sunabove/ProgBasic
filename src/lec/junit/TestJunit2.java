package lec.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit2 {
	@Test

	public void testAdd() {
		String str = "Junit 2 is working fine";
		assertEquals("Junit 2 is working fine", str);
	}
}
