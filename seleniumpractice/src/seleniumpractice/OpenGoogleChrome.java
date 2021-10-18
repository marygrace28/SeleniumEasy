package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// tell the system that you are going to use which browser - chrome
		// creating object for that browser
		// using that object open a url
		// do whatever action u want
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver mary = new ChromeDriver();
		mary.get("https://www.youtube.com/");
		
	}

}
