package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://www.leafground.com/pages/Edit.html");
		
		
	    //	Find the first editbox and type a email id to it.	
		WebElement TypeinEditBox=driver.findElement(By.id("email"));
		TypeinEditBox.sendKeys("a@gmail.com");
		
//		this is to append a text in the second text field.
		WebElement AppendBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
		AppendBox.sendKeys("This is the appended test");
		
		
		
		String s =driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(s);
		
		System.out.println(driver.getTitle());
		
		//this is to clear the 4th text box
		WebElement ClearTextBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		ClearTextBox.clear();
		
	     //	the below code is to find if the text book is editable
		boolean checkIFButtonIsEnabled =driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input")).isEnabled();
		System.out.println(checkIFButtonIsEnabled);
	}

}
