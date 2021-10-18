package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		
		WebElement TextChange = driver.findElement(By.id("btn"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBePresentInElement(TextChange,"Click ME!"));
		TextChange.click();
		driver.switchTo().alert();
		System.out.println("successfully Done");
		driver.close();
	}

}
