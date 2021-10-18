package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\OneDrive\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
//		Click the button to display a alert box
		WebElement AlertButton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		AlertButton.click();
		Thread.sleep(3000);
		Alert OkAlertBox= driver.switchTo().alert();
		OkAlertBox.accept();
		
//		Click the button to display a confirm box	
		WebElement ConfirmButton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		ConfirmButton.click();
		Thread.sleep(3000);
		Alert ConfirmAlert = driver.switchTo().alert();
		//ConfirmAlert.dismiss(); // you pressed cancel
		ConfirmAlert.accept(); //you pressed OK
		
//	Click the button to display a prompt box
		WebElement PromptButton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		PromptButton.click();
		//Thread.sleep(3000);
		Alert PromptAlert= driver.switchTo().alert();
		PromptAlert.sendKeys("Hai Mary Grace");
		Thread.sleep(6000);
		PromptAlert.accept();
		
//		Click the button to display a line breaks
		
		WebElement LineBreakButton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
		LineBreakButton.click();
		Thread.sleep(3000);
		Alert LineBreakAlert= driver.switchTo().alert();
		LineBreakAlert.accept();
		
		//click the sweet Alert
		WebElement SweetAlertButton = driver.findElement(By.id("btn"));
		SweetAlertButton.click();
		Thread.sleep(3000);
		SweetAlertButton.sendKeys(Keys.ESCAPE);
//		Alert SweetAlert= driver.switchTo().alert();
//		SweetAlert.accept();
		
	}

}
