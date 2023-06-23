package Junit_framework;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import basic.Addition;

public class J_001_Addition {
	
	@Test
	public void TestAddition() {
//		Addition a = new Addition();
//		int actual = a.add(10, 40);
//		int excepted = 50;
//	    assertEquals(excepted, actual);
//		assertTrue(true);
//	    assertNull(null);
		
		int A[] = {10,20,30,40,550};
		int B[] = {10,20,30,40,50};
		assertArrayEquals(A, B);
	}
}
