package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\OneDrive\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
   
		
		WebElement Coursename = driver.findElement(By.id("tags"));
		Coursename.sendKeys("s");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		System.out.println(options.size());
		
		
		for (WebElement webElement : options) {
			if (webElement.getText().equals("Web Services")) {
				webElement.click();
				break;
			}
			
		}
		
	
	
	}

}
