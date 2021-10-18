package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\OneDrive\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");	
 
		
//		Select the any one from the given choice
		 WebElement SelectRadioButton1 = driver.findElement(By.id("yes"));
		 SelectRadioButton1.click();
		 
//		 Find default selected radio button
		 WebElement DefaultRadioButton1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]"));
		boolean unchecked= DefaultRadioButton1.isSelected();
		if(unchecked)
		       System.out.println("unchecked is checked");
		
		 WebElement DefaultRadioButton2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]"));
		 boolean checked= DefaultRadioButton2.isSelected();
		 if(checked)
		       System.out.println("checked is checked");
		 
	//select your age only if it is not selected
		// 1.Find which is selected by default
            //1.Find the number of options present
		    //2.use driver.Find element to locate the elements
		    //3.store it in a web element
		    //4.use the isselected() function to know the default selection.
		//2.Based on the default selection perform a click operation
		 
		 WebElement AgeRadioButton1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
			boolean age1= AgeRadioButton1.isSelected();
//			if(!age1)
//				AgeRadioButton1.click(); 
			
			
			 WebElement AgeRadioButton2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[2]"));
			 boolean age2= AgeRadioButton2.isSelected();
//			 if(!age2)
//					AgeRadioButton2.click(); 
			 
			 
			 WebElement AgeRadioButton3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
			 boolean age3= AgeRadioButton3.isSelected();
//			 if(!age3)
//					AgeRadioButton3.click(); 
			 
			 if(!age1)
			 {
				 AgeRadioButton1.click();
				 System.out.println("op2");
			 }
			 else if(!age2)
			 {
				 AgeRadioButton2.click();
				 System.out.println("op2");
				
			 }
			 else
			 {
				 AgeRadioButton3.click();
				 System.out.println("op3"); 
			 }
			 
		}

}
