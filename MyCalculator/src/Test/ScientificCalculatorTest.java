package Test;

import static org.junit.Assert.*;
import ie.gcd.maths.ScientificCalculator;

import org.junit.Test;

public class ScientificCalculatorTest {

	@Test
	public void testAdd() {
		ScientificCalculator c = new ScientificCalculator();
		assertEquals(5,c.add(2, 3));
		
	}

}
