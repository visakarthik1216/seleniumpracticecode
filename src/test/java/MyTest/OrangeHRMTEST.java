package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTEST extends BaseTest {

	
	@Test(description="checking login page title")
	public void loginpageTitleTest()
	{
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "OrangeHRM", "====title not matched====");
	}
	
	@Test(description="checking the URL")
	public void loginpageURLTest()
	{
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertTrue(URL.contains("demo.orangehrmlive.com"),"====URL is not found=====");
	}
	
	
	
	
	
	
	
	

}
