package testcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import businesscode.Calculator;

class CalculatorTest {

	public static Calculator c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c = new Calculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		c = null;
	}

	@Test
	void testAdd() {
		double add = c.add(10, 10);
		assertEquals(20, add, 0);
	}

	@Test
	void testSubtract() {
		double sub = c.subtract(100, 10);
		assertEquals(90, sub, 0);
	}

	@Test
	void testMultiply() {
		double mul = c.multiply(10, .9);
		assertEquals(9, mul, 0);
	}

	@Test
	void testDivide() {

		double div = c.divide(100, 10);
		assertEquals(10, div, 0);
	}

}
