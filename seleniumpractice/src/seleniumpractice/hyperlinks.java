package seleniumpractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\OneDrive\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
//	Go to Home page by clicking the link
//		
//		 WebElement HomePageLink = driver.findElement(By.linkText("Go to Home Page"));
//		 HomePageLink.click();
//		 
//		driver.navigate().back();
//		 WebElement PartialLinkText = driver.findElement(By.partialLinkText("Home"));
//		 PartialLinkText.click();
//	Without clicking finding where it is going
//		 WebElement FindingLink = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/a"));
//		 String URL = FindingLink.getAttribute("href");
//		 System.out.println(URL);
		 
	//Go to Home Page with same link name we use xpath
//		 
		 WebElement HomePageLinkSame = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/label"));
		 HomePageLinkSame.click();
//	How many links are available in this page
		 String URLNew;
		List<WebElement> count= driver.findElements(By.tagName("a"));
		Iterator<WebElement> n =count.iterator();
		while(n.hasNext())
		{
			URLNew = n.next().getAttribute("href");
			System.out.println(URLNew);
		}
		
		
		 
	
		
	}

}
