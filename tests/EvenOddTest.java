import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvenOddTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
//	R1: Accepts 1 integer value, n
//	N > 1  
//	R2: If N < 1, then return false
//	R3: If n is even, return true
//	R4: If n is odd, return false

	@Test
	public void testEvenOddFuncion() {
//		fail("Not yet implemented");
		EvenOdd e = new EvenOdd();
				assertEquals(true,e.isEven(20));
	}
	
	//r2 
	@Test 
	public void testNLessThan1() {
		EvenOdd e = new EvenOdd();
		int n = -999;
		assertEquals(false,e.isEven(n));
	}

}
