package Testngassign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register extends BaseTest {
	

	
	
	
	@Test
	public void registerTest()
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Register"));
		
	}

}
