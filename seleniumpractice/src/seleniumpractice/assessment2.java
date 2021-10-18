package seleniumpractice;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assessment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-apps.doselect.in/Cryptographer/");
		
		WebElement cipher = driver.findElement(By.id("cipher"));
	    cipher.sendKeys("fsoceity");
	    String encrptData= "fsoceity";
		
	    byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
	    	String strEncode = new String(encodedBytes);	
	    	WebElement result = driver.findElement(By.id("result"));
		    result.sendKeys(strEncode);
	    	
	    	
	    }

}
