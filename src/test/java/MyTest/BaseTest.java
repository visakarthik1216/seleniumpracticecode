package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Seleniumsession.BrowserException;

public class BaseTest {
	
	 WebDriver driver;
	 
		@Parameters({"browser","url"})
		@BeforeTest
		public void SetUp(String browserName, String url)
		{
		switch(browserName.toLowerCase().trim())
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;	
			
		default:
		System.out.println(" please pass the correct browser name" +browserName);
		throw new BrowserException("wrong bowser name passed");
			
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		}
		
		@AfterTest
		public void TearDown()
		{
			driver.quit();
			
		}
		

}
