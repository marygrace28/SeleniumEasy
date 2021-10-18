package Selenium;


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
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\OneDrive\\Desktop\\Software testing\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://demo.seleniumeasy.com/"); 
		w.manage().window().maximize();
		Thread.sleep(2000);
		 System.out.println("1.Successfully Opened the Selenium Demo Website");
		
		
		//Close popup
		Thread.sleep(2000);
		w.findElement(By.id("at-cv-lightbox-close")).click();
		Thread.sleep(5000);
		System.out.println("2.Successfully closed the Popup");
		

		
		
		//get title
		
		 System.out.println("3.Page title is : " + w.getTitle());
		 
////        //Home
//		w.findElement(By.linkText("Demo Home")).click();
//		w.findElement(By.xpath("/html/body/div[2]/div/div/a[2]/i")).click();
//		w.findElement(By.xpath("/html/body/div[2]/div/div/a[1]/i")).click();
//		Thread.sleep(2000);
//		
		                    //Examples
		//Form
	    //w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Input Forms")).click();
		w.findElement(By.linkText("Simple Form Demo")).click();   //Single input
		w.findElement(By.id("user-message")).sendKeys("Mary Grace");
		Thread.sleep(2000);
		
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")).click();
		w.findElement(By.id("sum1")).sendKeys("46");              //two inputs
		w.findElement(By.id("sum2")).sendKeys("24");
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("4.Successfully Completed the Simple Input Demo Form");
		
		//CheckBox
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Checkbox Demo")).click();   
		WebElement checkbox = w.findElement(By.id("isAgeSelected"));    //Single   //method checks that if an element is selected on the web page or not.
		checkbox.click();
		Thread.sleep(2000);
		System.out.println("5.Successfully Completed the Checkbox 1Input Demo ");
		
		//checkbox2
		w.findElement(By.id("check1")).click();        //Click on Check all button
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/input[1]")).click();   //uncheck all
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("6.Successfully Completed the Checkbox 2 Input Demo ");
		
//		//Radio Button
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Radio Buttons Demo")).click();
		WebElement radio = w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/label[2]/input"));    
		radio.click();
		w.navigate().back();
		System.out.println("7.Successfully Completed the Radio Button  Input Demo ");

//		//DropDown
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Select Dropdown List")).click();
		Select s=new Select(w.findElement(By.id("select-demo")));
		s.selectByIndex(3); 
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("8.Successfully Completed the Drop Down List");
		
		
	
//		//Input Form
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[1]/a")).click();
		w.findElement(By.linkText("Input Form Submit")).click();
		w.findElement(By.name("first_name")).sendKeys("Mary");    //Defect
		w.findElement(By.name("last_name")).sendKeys("Grace");      //Defect
		w.findElement(By.name("email")).sendKeys("mary.grace@gmail.com");   //Defect
		w.findElement(By.name("phone")).sendKeys("1236547895");     //Defect
		w.findElement(By.name("address")).sendKeys("Electronic city");
		w.findElement(By.name("zip")).sendKeys("68202");             //Defect    
		w.findElement(By.name("city")).sendKeys("Bangalore");                //Defect
		w.findElement(By.name("comment")).sendKeys("abcdkhkjklj");
		Select dropDown = new Select(w.findElement(By.name("state")));    //Selecting state from drop down
		dropDown.selectByVisibleText("California");
		dropDown.selectByIndex(5);
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/form/fieldset/div[13]/div/button")).click();   //send botton
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("9.Successfully  completed the Input Form");
		

			
//				
//		//Alert
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[2]/li[2]/a")).click();
		w.findElement(By.linkText("Javascript Alerts")).click();
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/button")).click();
		w.switchTo().alert().accept();
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/button")).click();   //Ok or Cancel
		w.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println("10.Successfully completed the Javascript Alert ");

	  //Get string element
		String Text= w.findElement(By.id("confirm-demo")).getText();
	    System.out.println(Text);  
	    w.navigate().back();
		
		//Drag and Drop
	    w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[2]/li[4]/a")).click();
		w.findElement(By.linkText("Drag and Drop")).click();
	    WebElement Drag=w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/span[1]"));
	    WebElement Drop= w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div"));
		Actions act= new Actions(w);
		act.dragAndDrop(Drag, Drop).build().perform();
		//Thread.sleep(5000);
		w.navigate().back();
		System.out.println("11.Successfully Drag and Drop the Element ");
		
		
		
		//Date picker
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[1]/li[2]/a")).click();
		w.findElement(By.linkText("Bootstrap Date Picker")).click();
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div/div/span")).click();
		w.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[6]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("12.Successfully completed the Date Picker.");

		
		//Window Handling
		w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[2]/li[2]/a")).click(); //Click the window pop up model.
		w.findElement(By.linkText("Window Popup Modal")).click();
		w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a")).click(); //Click on Follow us on Twitter
		 
		 Set <String> windows= w.getWindowHandles();         //  [parent[child]]   to get the window handle of the current window
		 Iterator <String> it= windows.iterator();
		 String parent_window=it.next();         // 0th window
		 String child_window1 =it.next();       //1st window
		 
		 System.out.println("13.Successfully completed  the Window pop up.");
		 
	   //Switch to parent window
		 w.switchTo().window(parent_window);
		 Thread.sleep(3000); 
	     w.switchTo().window(child_window1);
		 Thread.sleep(3000);
		 w.switchTo().window(parent_window);
		 Thread.sleep(2000);
		 w.navigate().back();
		 
		 System.out.println("14.Successfully Navigate to the parent window.");
		 


		 
		//Getting total no of a tag
		 List<WebElement> L = w.findElements(By.tagName("a"));
		 System.out.println("Total Links are :" +L.size());
	 
		 
	        //Counting Iframes
             List<WebElement> L1 = w.findElements(By.tagName("iframe"));
			System.out.println("Total iFrames are :" +L1.size()); // To get the total number of <iframe> tag
			w.navigate().back();
        
//			//Start Processing button
//			w.findElement(By.id("btn_basic_example")).click();
//			System.out.println("Clicked On Start Practicing Button");
			
			    //Inner Buttons
			w.findElement(By.id("inter_example")).click(); //clicked on 3rd button
			System.out.println("Clicked On Proceed Next Button");
			w.findElement(By.id("done_example")).click();
			System.out.println("Clicked On Proceed Next Button");  //clicked on 5th button
//			String Text1 =w.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[2]/p[1]")).getText();
//			System.out.println(Text1);
//			

 
//			 //Multi window handling
//			// Open new child window within the main window
			 w.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[2]/ul[2]/li[2]/a")).click();
			 w.findElement(By.linkText("Window Popup Modal")).click(); //click on the multiple window popup model.
		        w.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/a")).click();
		 
		        //Get handles of the windows
		        String mainWindowHandle = w.getWindowHandle();                // to get the window handle of the current window
		        Set<String> allWindowHandles = w.getWindowHandles();
		        Iterator<String> iterator = allWindowHandles.iterator();
		 
//		        // Here we will check if child window has other child windows and will fetch the heading of the child window
		        while (iterator.hasNext()) {
		            String ChildWindow = iterator.next();
		                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {      // method compares two strings irrespective of the case (lower or upper)
		                	                                                        
		                w.switchTo().window(ChildWindow);
		                System.out.println("Page title is  :" + w.getTitle());       //if string is not null it will print the title
		               
		                //w.navigate().back();
		            }
		        }
		        
		        
		        
		        
		        
		        w.navigate().back();
               w.quit();
 
		System.out.println("Website Successfully Tested");
	

	}

	
	}


