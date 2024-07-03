package Testngassign;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseTest{
	
	
	
	
	@Test
	public void loginTest()
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
	}
	
	
	
	
	
	
	

}
