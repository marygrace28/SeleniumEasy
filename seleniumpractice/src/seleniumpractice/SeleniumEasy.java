package seleniumpractice;


import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumEasy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Mary Grace\\\\OneDrive\\\\Desktop\\\\Software testing\\\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.seleniumeasy.com/test/"); 
		w.manage().window().maximize();
		
		
		//Close popup
		Thread.sleep(2000);
		w.findElement(By.id("at-cv-lightbox-close")).click();
		
		
		//get title
		
		 System.out.println("Page title is : " + w.getTitle());
		 
        //Home
		w.findElement(By.linkText("Demo Home")).click();
		w.findElement(By.xpath("/html/body/div[2]/div/div/a[2]/i")).click();
		w.findElement(By.xpath("/html/body/div[2]/div/div/a[1]/i")).click();
		Thread.sleep(2000);
		
		                    //Examples
		//Form
	    //w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Input Forms")).click();
		w.findElement(By.linkText("Simple Form Demo")).click();   //Single input
		w.findElement(By.id("user-message")).sendKeys("shiniya");
		Thread.sleep(2000);
		
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")).click();
		w.findElement(By.id("sum1")).sendKeys("46");              //two inputs
		w.findElement(By.id("sum2")).sendKeys("24");
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
		Thread.sleep(2000);
		w.navigate().back();

		
		//CheckBox
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Checkbox Demo")).click();   
		WebElement checkbox = w.findElement(By.id("isAgeSelected"));    //Single   //method checks that if an element is selected on the web page or not.
		checkbox.click();
		Thread.sleep(2000);
		
		//checkbox2
		w.findElement(By.id("check1")).click();        //Click on Check all button
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/input[1]")).click();   //uncheck all
		Thread.sleep(2000);
		w.navigate().back();
		
//		//Radio Button
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Radio Buttons Demo")).click();
		WebElement radio = w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/label[2]/input"));    
		radio.click();
		w.navigate().back();

		
		
		
	
//		//Input Form
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Input Form Submit")).click();
		w.findElement(By.name("first_name")).sendKeys("Shin");    //Defect
		w.findElement(By.name("last_name")).sendKeys("Das");      //Defect
		w.findElement(By.name("email")).sendKeys("abc@yahoo.com");   //Defect
		w.findElement(By.name("phone")).sendKeys("1236547895");     //Defect
		w.findElement(By.name("address")).sendKeys("abcfyjghfutmd");
		w.findElement(By.name("zip")).sendKeys("68202");             //Defect    
		w.findElement(By.name("city")).sendKeys("ekmmm");                //Defect
		w.findElement(By.name("comment")).sendKeys("abcdefghijklmnop");
		Select dropDown = new Select(w.findElement(By.name("state")));    //Selecting state from drop down
		dropDown.selectByVisibleText("California");
		dropDown.selectByIndex(5);
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/form/fieldset/div[13]/div/button")).click();   //send botton
		Thread.sleep(2000);
		w.navigate().back();
		
//		//DropDown
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Select Dropdown List")).click();
		Select s=new Select(w.findElement(By.id("select-demo")));
		s.selectByIndex(4); 
		Thread.sleep(2000);
		w.navigate().back();
			
//				
//		//Alert
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[2]/li[2]/a")).click();
		w.findElement(By.linkText("Javascript Alerts")).click();
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/button")).click();
		w.switchTo().alert().accept();
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/button")).click();   //Ok or Cancel
		w.switchTo().alert().accept();
		Thread.sleep(2000);
		

	  //Get string element
		String Text= w.findElement(By.id("confirm-demo")).getText();
	    System.out.println(Text);  
	    w.navigate().back();
	}
}
		