package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/alertappear.html");
		WebElement WaitAlert = driver.findElement(By.id("alert"));
		 WaitAlert.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
		
		
		
		
	}

}
