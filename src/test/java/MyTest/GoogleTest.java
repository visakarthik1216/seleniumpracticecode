package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	

	
	@Test(description="checking login page title")
	public void loginpageTitleTest()
	{
	
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "====title not matched====");
	}
	
	@Test(description="checking the URL", priority=2)
	public void loginpageURLTest()
	{
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertTrue(URL.contains("google.com"),"====URL is not found=====");
	}
	
	
	
	
	
	
	
	
	

}
