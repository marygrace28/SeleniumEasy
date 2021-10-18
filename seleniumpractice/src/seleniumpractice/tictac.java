package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tictac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-apps.doselect.in/tic-tac-toe/");
		driver.findElement(By.xpath("/html/body/div/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/div/ul/li[2]")).click();
		driver.findElement(By.xpath("/html/body/div/ul/li[3]")).click();
		driver.findElement(By.xpath("/html/body/div/ul/li[4]")).click();
		driver.findElement(By.xpath("/html/body/div/ul/li[6]")).click();
		driver.findElement(By.xpath("/html/body/div/ul/li[7]")).click();
	    
		
       //	the below code is to find if the text book is editable	
		String s=driver.findElement(By.xpath("/html/body/div/div/span[1]")).getText();
	    System.out.println(s);
		
	}

}
