package lec.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {
	@Test

	public void testAdd() {
		String str = "Junit 1 is working fine";
		assertEquals("Junit 1 is working fine", str);
	}
}
