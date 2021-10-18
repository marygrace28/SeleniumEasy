package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/mouseOver.html");
     WebElement Mouse = driver.findElement(By.xpath("/html/body/div/div/div[5]/ul/li/a"));     
     String text = Mouse.getAttribute("title");
     System.out.println(text);   
      //Creating object of an Actions class
	 Actions action = new Actions(driver);
     //Performing the mouse hover action on the target element.
	 action.moveToElement(Mouse).perform();
	 
	 //Selenium click alert box click Ok
	 WebElement SeleniumClick = driver.findElement(By.xpath("/html/body/div/div/div[5]/ul/li/ul/li[1]/a"));
	 SeleniumClick.click();
	 Thread.sleep(3000);
	 Alert OkAlertBox= driver.switchTo().alert();
	OkAlertBox.accept();
	Thread.sleep(3000);
		
		 //RPA click alert box click Ok
   WebElement RPAClick = driver.findElement(By.xpath("/html/body/div/div/div[5]/ul/li/ul/li[2]/a"));
   RPAClick.click();
   Thread.sleep(3000);
   Alert OkAlertBox2= driver.switchTo().alert();
   OkAlertBox2.accept();
   Thread.sleep(3000);
			
			//Webservices click alert box click ok
	WebElement WebServicesClick = driver.findElement(By.xpath("/html/body/div/div/div[5]/ul/li/ul/li[3]/a"));
	WebServicesClick.click();
	Thread.sleep(3000);
    Alert OkAlertBox3= driver.switchTo().alert();
	OkAlertBox3.accept();
		
	}

}
