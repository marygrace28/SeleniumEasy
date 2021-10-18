package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

	@Test
	@Parameters("Name")
	public static void parameter(String abc)
	{
		System.out.println(abc);
	}
	
	
	@Test
	@Parameters("Number")
	public static void parameter(int i)
	{
		System.out.println(i);
	}

}
