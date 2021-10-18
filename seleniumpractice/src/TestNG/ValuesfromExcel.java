package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ValuesfromExcel {

	String [][] testdata=null;

	@DataProvider(name="details")
	public String [][] details() throws BiffException, IOException
	{
		testdata = Exceldata();
		return testdata;
	}

	public String[][] Exceldata() throws BiffException, IOException
	{
		FileInputStream excel=new FileInputStream("C:\\Users\\Mary Grace\\OneDrive\\Documents\\Book1.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(0);
		Sheet sheetexcel=workbook.getSheet(0);
		int row=sheetexcel.getRows();
		int column=sheetexcel.getColumns();
		System.out.println(row);
		System.out.println(column);

		String [][] value=new String[row-1][column];

		for(int i=1;i<row;i++)
		{

			for(int j=0;j<column;j++)
			{
				value[i-1][j]  = sheet.getCell(j,i).getContents(); 
			}
		}
		return value;

	}

	@Test(dataProvider = "details")
	public void username(String uname,String pwd)
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

		driver.close();
	}

}
