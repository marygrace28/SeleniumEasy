package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstPgm {

	public static WebDriver driver;


	@Test
	public static void test2()
	{
		//System.out.println("This is test case 2");
		WebElement Waitforalert = driver.findElement(By.id("alert"));
		Waitforalert.click();
		WebDriverWait Wait = new WebDriverWait(driver, 20);

		Wait.until(ExpectedConditions.alertIsPresent());

	}


	@Test(dependsOnMethods = "test2")
	public void xyz()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/alertappear.html");

	}
	
	@Test
	public void happy()
	{
		System.out.println("This is a passing case");
	}

	@Test
	public void happy1()
	{
		System.out.println("This is a passing case again");
	}


}