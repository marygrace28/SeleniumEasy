package TestNG;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.callback.UsernameCallback;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	public static void main(String[] args) throws IOException, BiffException {
		// TODO Auto-generated method stub
		FileInputStream excel=new FileInputStream("C:\\Users\\Mary Grace\\OneDrive\\Documents\\Book1.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(0);
		Sheet sheetexcel=workbook.getSheet(0);
		
		int row=sheetexcel.getRows();
		int column=sheetexcel.getColumns();
		System.out.println(row);
		System.out.println(column);

		String [] uname=new String[row];
		String [] pwd=new String[column];
//
		for(int i=1;i<row;i++)
		{

			for(int j=0;j<column;j++)
			{
			uname[i]  = sheet.getCell(j,i).getContents(); 
			pwd[i]  = sheet.getCell(j,i+1).getContents(); 
		    username(uname[i],pwd[i]);
			}
		}
		//return null;
		
	}
		
	

public static void username(String uname,String pwd)
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary Grace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");

WebElement username = driver.findElement(By.id("txtUsername"));
username.sendKeys(uname);

WebElement password = driver.findElement(By.id("txtPassword"));
password.sendKeys(pwd);

WebElement login = driver.findElement(By.id("btnLogin"));
login.click();

driver.quit();
}

}
