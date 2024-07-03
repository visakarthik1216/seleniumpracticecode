package LoginAssignone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Seleniumsession.BrowserException;

public class BaseTestLogin {
	
	WebDriver driver;
	
	@Parameters({"browser","url","username","password"})
	@BeforeTest
	public void SetUP(String browser,String url,String username,String password)
	{
		switch(browser.toLowerCase().trim())
		{
		case "chrome" :
		driver=new ChromeDriver();
		break;
		
		case "edge" :
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("pls pass the correct browsername" +browser);
			throw new BrowserException(" browsername is wrong");
								
		}
		
		driver.get(url);
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
		
	}
	

}
