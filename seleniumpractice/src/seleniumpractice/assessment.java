package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-apps.doselect.in/mibe/");
		
		WebElement 	OneClick = driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[1]"));
	    OneClick.click();
	    
	    WebElement MoveToRight = driver.findElement(By.className("adding"));
	    MoveToRight.click();
	    
	    
	    WebElement 	TwoClick = driver.findElement(By.xpath("/html/body/div/div[3]/ul/li"));
	    TwoClick.click();
	    
	    WebElement MoveToLeft = driver.findElement(By.className("removing"));
	    MoveToLeft.click();
	   
	    
	}

}


