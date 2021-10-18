package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\OneDrive\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		String parent= driver.getWindowHandle();
		
//		Click button to open home page in New window
		WebElement OpenHomePage = driver.findElement(By.id("home"));
		OpenHomePage.click();
		//How many windows are opened
		Set<String>windows = driver.getWindowHandles();
		for (String next: windows)
		{
		    driver.switchTo().window(next);
		  }
		//Check whether the edit on the home page is clicked
		
		WebElement Edit = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a"));
		Edit.click();
		driver.close();
		driver.switchTo().window(parent);
	
//		Find  the number of opened windows
		WebElement NoOpenedWindows = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		NoOpenedWindows.click();
		
		driver.getWindowHandles().size();
		System.out.println(driver.getWindowHandles().size());
		
		//Donot close me
		WebElement DonotCloseMe = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		DonotCloseMe.click();
		
		Set<String> closeWindows = driver.getWindowHandles();
		for (String n: closeWindows)
		{
			if(!n.equals(parent))
			{
				driver.switchTo().window(n);
				driver.close();
			}
		   // driver.close();
		  }
}
}
