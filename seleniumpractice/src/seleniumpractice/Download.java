package seleniumpractice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		WebElement DownloadExcel = driver.findElement(By.partialLinkText("Download Excel"));
		DownloadExcel.click();
		
		File location = new File("C:\\Users\\Mary Grace\\Downloads");
		
		//check each elements whether it is from testleaf
		
		File[] totalfiles = location.listFiles();
		//list of files so we use foreach loop
		for (File file : totalfiles) {
			if(file.getName().equals("testleaf.xlsx"));
			{
			System.out.println("File I want is Downloaded");
			break;
			}
			
		}
	}

}
