package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\OneDrive\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		
	// select all the multiple choices
		 WebElement javaSelect = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
		 javaSelect.click();
		 
		 WebElement SqlSelect = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[3]/input"));
		 SqlSelect.click();
		 WebElement SelectC = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[4]/input"));
		 SelectC.click();
		 
	//Confirm Selenium is selected
		 WebElement ConfirmSelect = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		 boolean seleniumCheck= ConfirmSelect.isSelected();
			if(seleniumCheck)
			       System.out.println("Selenium is checked");
			else 
				  System.out.println("Selenium is unchecked");
		 
	//Deselect the selected and select the option and deselect
			
			//Select the option Not Selected and then deselect
			 WebElement DeSelectNot= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
			 DeSelectNot.click();
			 boolean DeselectCheck= DeSelectNot.isSelected();	
				if(DeselectCheck)
				       DeSelectNot.click();
			 
		
			
             //Selected option deselected        
			 WebElement DeSelect = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
			 boolean Deselect1= DeSelect.isSelected();	
				if(Deselect1)
				       DeSelect.click();
				
				
			//Check	all the boxes
				
				
				WebElement SelectOption1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[1]/input"));
				SelectOption1.click();
				 
				 WebElement SelectOption2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[2]/input"));
				 SelectOption2.click();
				 WebElement SelectOption3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[3]/input"));
				 SelectOption3.click();
				 WebElement SelectOption4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[4]/input"));
				 SelectOption4.click();
				 
				 WebElement SelectOption5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[5]/input"));
				 SelectOption5.click();
			
				 	
				
				
		
	}

}
