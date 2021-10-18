package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\OneDrive\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//select training program using index
		 WebElement DropDownIndex = driver.findElement(By.id("dropdown1"));
	//	Select name =new Select(dropdown1);
		org.openqa.selenium.support.ui.Select SelectFromdropDown1 = new org.openqa.selenium.support.ui.Select(DropDownIndex);	 
		SelectFromdropDown1.selectByIndex(3);
		
		
		//select training program using text
		 WebElement DropDownText = driver.findElement(By.name("dropdown2"));
		org.openqa.selenium.support.ui.Select SelectFromdropDown2 = new org.openqa.selenium.support.ui.Select(DropDownText);	 
		SelectFromdropDown2.selectByVisibleText("Appium");
		
		//select training program using Value
		WebElement DropDownValue = driver.findElement(By.id("dropdown3"));
		org.openqa.selenium.support.ui.Select SelectFromdropDown3 = new org.openqa.selenium.support.ui.Select(DropDownValue);	 
		SelectFromdropDown3.selectByValue("4");
		
		//Get the number of options
		WebElement DropDownNumber = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/select"));
		org.openqa.selenium.support.ui.Select SelectFromdropDown4 = new org.openqa.selenium.support.ui.Select(DropDownNumber);	 
        List<WebElement> list = SelectFromdropDown4.getOptions();
        int count =list.size();
        System.out.println(count);
    	
        
        //to print all the values inside the list box
        int x;
        for(x=0;x<count;x++)
        {
        WebElement zero = list.get(x);
        String n = zero.getText();
        System.out.println(n);
        }
        
        //use sendkeys to select
		WebElement DropDownSelect = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
		DropDownSelect.sendKeys("Sel");
		
		
//	select the multiple programs
		WebElement DropDownMultiSelectBox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		Select SelectFromDropDown5 = new Select(DropDownMultiSelectBox);
		SelectFromDropDown5.selectByIndex(4);
//		SelectFromDropDown5.selectByIndex(3);
		SelectFromDropDown5.selectByIndex(2);
		SelectFromDropDown5.selectByIndex(1);
		
		
	}

}
