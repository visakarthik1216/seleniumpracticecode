package Testngassign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	@AfterTest()
	public void TearDown()
	{
		driver.quit();
		
	}

}
