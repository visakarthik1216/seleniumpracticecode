package TestNgSeesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLogin {
	
	
	 WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	}
	
	@Test(description="checking login page title", priority=2)
	public void loginpageTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login", "====title not matched====");
	}
	
	@Test(description="checking the URL", priority=1)
	public void loginpageURLTest()
	{
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertTrue(URL.contains("route=account/login"),"====URL is not found=====");
	}
	
	
	@Test(description="checking the logo", priority=3)
		public void loginpageLogoTest()
	{
		boolean flag=driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		Assert.assertEquals(flag, true, "====logo is mismatched====");
		
	}
	
	
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
		
	}
	
	
	
	

}
