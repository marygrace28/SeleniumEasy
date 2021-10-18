package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentUrl {
	public static WebDriver driver;
	public static long startTime;
	public static long endTime;
	@BeforeTest
	public static void before()
	{
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@AfterTest
	public static void after()
	{
		driver.quit();
		  endTime=System.currentTimeMillis();
		 long TotalTimeTaken=endTime-startTime;
		 System.out.println("Time taken for Total test case="+TotalTimeTaken);
	}
	@Test
    public static void GotoGoogle()
    {
     driver.get("https://www.google.co.in");
	// driver.close();
    }
    @Test
	public static void GotoBing()
    {
     driver.get("https://www.bing.com");
	// driver.close();
    }
     @Test
	public static void GotoYahoo()
	{
	 driver.get("https://in.yahoo.com/");
	// driver.close();
    } 
     @Test
	public static void GotoYoutube()
    {
	driver.get("https://www.youtube.com/");
    //driver.close();
	 } 
    
}
