package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
     WebElement Tool = driver.findElement(By.id("age"));     
     String text = Tool.getAttribute("title");
     System.out.println(text);   
      //Creating object of an Actions class
	 Actions action = new Actions(driver);
     //Performing the mouse hover action on the target element.
	 action.moveToElement(Tool).perform();
    
	}

}
