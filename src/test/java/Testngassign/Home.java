package Testngassign;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home extends BaseTest {
	
	
	
	@Test
	public void SearchTest()
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		driver.findElement(By.name("search")).sendKeys("macbook");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Search - macbook");
		
	}
	
	

}
