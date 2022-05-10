package testcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AssertionTest {

	private static String string1, string2, string3, string5;
	private static int variable1, variable2;
	private static int[] airethematicArray1;
	private static int[] airethematicArray2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		string1 = "Junit";
		string2 = "Junit";
		string3 = "test";
		string5 = null;
		variable1 = 1;
		variable2 = 2;
		airethematicArray1 = new int[] { 1, 2, 3 };
		airethematicArray2 = new int[] { 1, 2, 3 };
		System.out.println("Before class excuted");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class excuted");
	}

	@Test
	public void test() {
		System.out.println("In the test");
		assertEquals(string1, string2);
		assertSame(string3, string3); // assert that two same objects
		assertNotSame(string1, string3);
		assertNotNull(string1);
		assertNull(string5);
		assertTrue(variable1 < variable2);
		assertArrayEquals(airethematicArray1, airethematicArray2);
	}

}
