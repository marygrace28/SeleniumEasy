package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void  test()
	{
		System.out.println("Im Test");
	}
	
	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		System.out.println("Im Before test");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Im After test");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Im Before Method");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Im After Method");
	}
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Im Before Class");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Im After Class");
	}
	@BeforeGroups
	public void BeforeGroup()
	{
		System.out.println("Im Before Group");
	}
	@AfterGroups
	public void AfterGroup()
	{
		System.out.println("Im After Group");
	}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Im Before Suite");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("Im After Suite");
	}

}