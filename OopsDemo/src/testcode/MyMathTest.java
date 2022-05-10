package testcode;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.MyMath;

public class MyMathTest {

	MyMath mm;

	@Before
	public void setUp() throws Exception {
		mm = new MyMath();
		System.out.println("this is before block");
	}

	@After
	public void tearDown() throws Exception {
		mm = null;
		System.out.println("this is after block");
	}

	@Test
	public void test() {
		System.out.println("this is test block");
		int[] a = new int[] { 1, 2, 3, 4 };
		int sum = mm.sum1(a);
		assertEquals(10, sum, 0);
	}

}
