package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mary Grace\\Desktop\\Software testing\\geckodriver.exe");
		WebDriver mary = new FirefoxDriver();
		mary.get("https://www.youtube.com/");
		
		//mary.findElement(By.name("q")).sendKeys("hello world"+Keys.ENTER);
//		mary.getTitle();
		//System.out.println(mary.getTitle());
		

	//	System.out.println(mary.getPageSource());
//		mary.navigate.to("https://www.google.co.in/");
//		mary.navigate().to("https://www.google.co.in/");
//		System.out.println(mary.getCurrentUrl());
//		System.out.println(mary.getTitle());
//		mary.navigate().back();
//		mary.navigate().forward();
//		mary.navigate().refresh();
		
		//mary.close();
		//mary.quit();
	}

}
