package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLogin extends BaseTest {
	
	
	
	
	@Test(description="checking login page title")
	public void loginpageTitleTest()
	
	{
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login", "====title not matched====");
	}
	
	@Test(description="checking the URL")
	public void loginpageURLTest()
	{
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertTrue(URL.contains("route=account/login"),"====URL is not found=====");
	}
	
	
	@Test(description="checking the logo")
		public void loginpageLogoTest()
	{
		boolean flag=driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		Assert.assertEquals(flag, true, "====logo is mismatched====");
		
	}
	
	
	
	
	
	
	

}
