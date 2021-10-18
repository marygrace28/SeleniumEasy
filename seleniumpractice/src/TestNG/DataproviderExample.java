package TestNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {


String [][] details = {
{"Admin","admin123"},
{"Admin","ijk"},
{"ijk","admin123"},
{"ijk","ijk"}

};
@DataProvider(name="details")
public String [][] details()
{
return details;
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