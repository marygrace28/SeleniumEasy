package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class AssertionExample {
	
	public static String name = "Mary";
	public static int i=0;
	public static boolean value = true;
	
	
	@Test
	public static void Sample()
	{
		assertEquals(name, "Mary");
		assertEquals(i,0);
		assertEquals(value, true);
	}

}