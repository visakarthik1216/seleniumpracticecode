package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegPageData extends BaseTest{
	
	
	@DataProvider
	public static Object[] getTestData()
	{
		return new Object[][] {
			{"kavi","martin","987623456","pass123"},
			{"kavi","martin","987623456","pass123"},
			{"kavi","martin","987623456","pass123"}
		};
		}
	
	public static String randomEmail()
	{
		String emailid="opencart"+System.currentTimeMillis()+"@sys.com";
		return emailid;
	}
	
	
	@Test(dataProvider="getTestData")
	public void getRegpagedata(String firstname, String lastname, String telephone, String password)
	{
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(randomEmail());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text,"Your Account Has Been Created!");
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
	}
}
		