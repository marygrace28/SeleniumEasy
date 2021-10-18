package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		
		WebElement Calender = driver.findElement(By.id("datepicker"));
		//Calender.sendKeys("10/10/2020" +Keys.ENTER);
		
		Calender.click();
		WebElement next = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		next.click();
		
		WebElement date= driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		date.click();
		
	}

}
