package Testngassign;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Forgotpswd extends BaseTest {
	

	
	@Test()
	public void ForgotpswdTest()
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Forgotten Password']")).click();
		String text=driver.findElement(By.xpath("//p[starts-with(text(),'Enter the e-mail address ')]")).getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("password reset link"));
			
	}
	

}
