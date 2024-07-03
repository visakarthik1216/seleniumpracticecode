package CRMAssignTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Seleniumsession.BrowserException;

public class BasetestCRM {
	
	WebDriver driver;
	
	
	@Parameters({"browser","url","username","password"})
	@BeforeTest
	public void SetUp(String browser,String url,String username, String password)
	{
		switch(browser.toLowerCase().trim())
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;	
			
		default:
			System.out.println(" pls pass the correct browser name" +browser);
			throw new BrowserException("browser name is not correct");
		}
		
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
	}
	
	
	public void TearDown()
	{
		driver.quit();
		
	}
	

}
