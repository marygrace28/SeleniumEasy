package seleniumpractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\OneDrive\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		
		//Button click inside iframe
		driver.switchTo().frame(0);
		WebElement Button1 = driver.findElement(By.id("Click"));
		Button1.click();
		driver.switchTo().defaultContent();

		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement Button2 = driver.findElement(By.id("Click1"));
		Button2.click();
		driver.switchTo().defaultContent();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        Iterator<WebElement> i = frames.iterator();
        int j=0;        
        while(i.hasNext()) {        	
        	String nameofFrame = i.next().getAttribute("Name");
        	System.out.println("nameofFrame");
        	j++;        	
        }
        System.out.println(j);
    
		

	}

}


