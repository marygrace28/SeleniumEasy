package seleniumpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");

		//For the column count
		List<WebElement> columncount = driver.findElements(By.tagName("th"));
		int colcount = columncount.size();
		System.out.println("Column count is" +colcount);

		//For the row count
		List<WebElement> Rowcount = driver.findElements(By.tagName("tr"));
		int rowcount = Rowcount.size();
		System.out.println("Row count is" +rowcount);
		
		//Get the Progress value of 'Learn with elements'
		WebElement LearnWithElements = driver.findElement(By.xpath("//td[normalize-space() = 'Learn to interact with Elements']//following::td[1]"));
		//WebElement LearnWithElements = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[4]/td[3]/input"));
		System.out.println("Got the progress value of Learn with elements" +LearnWithElements.getText());
		
		
		//Check the clickbox
//		WebElement ClickCheckBox = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[4]/td[3]/input"));
//		ClickCheckBox.click();
		
		//Check the vital task for the least completed progress
		//get that column
		List<WebElement> VitalTask = driver.findElements(By.xpath("//td[2]"));
	
		List<Integer> integerList = new ArrayList<>();
		
		for (WebElement webElement : VitalTask) {
			//converted into numbers
			String newItem = webElement.getText().replace("%", "");
			integerList.add(Integer.parseInt(newItem));
		}
		System.out.println(integerList);
		//check the smallest element from that column
		int small= Collections.min(integerList);
		System.out.println(small);
		//we get the ouput as 30
		String smallString= Integer.toString(small);//30
		//find the xpath.made custom xpath
		String xpath ="//td[normalize-space()="+"\'"+smallString+"%\'"+"]//following::td[1]/input";
		System.out.println(xpath);
		//check
		WebElement check = driver.findElement(By.xpath(xpath));
		check.click();
		
	}	
	}


