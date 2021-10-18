package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToDisappear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1).zip");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/disapper.html");
		WebElement ButtonClickDisappear = driver.findElement(By.id("btn"));
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		if(wait.until(ExpectedConditions.invisibilityOf(ButtonClickDisappear)))
		     System.out.println("Button is invisible");
	   else
		   System.out.println("Button is visible");	 
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

}
