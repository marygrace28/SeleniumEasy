package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
//		click the first button and then go to home page
		WebElement HomeClick = driver.findElement(By.id("home"));
		HomeClick.click();
		
//	click the button and find the position
		driver.navigate().back();
		WebElement PositionClick = driver.findElement(By.id("position"));
		org.openqa.selenium.Point xypoint = PositionClick.getLocation();
		int x=xypoint.getX();
		int y=xypoint.getY();
		System.out.println("The co ordinates are "+x+" "+y);
		
	// click the button and find the color of the button
		
		WebElement ButtonColorClick =driver.findElement(By.id("color"));
		String color = ButtonColorClick.getCssValue("background-color");
		System.out.println(color);
		
	//Find the size of the button
	 WebElement ButtonSizeClick =driver.findElement(By.id("size"));
	 int height = ButtonSizeClick.getSize().getHeight();
	 int width= ButtonSizeClick.getSize().getWidth();
	 System.out.println(height);
	 System.out.println(width);
	 
	 
	
	 
		
		
		
		
	}

}
