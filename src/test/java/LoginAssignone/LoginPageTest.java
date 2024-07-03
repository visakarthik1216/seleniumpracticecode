package LoginAssignone;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTestLogin {
	
	@DataProvider
	public Object[][] getSearchData()
	{
		return new Object[][] {
			{"macbook","MacBook Pro","2"},
			{"macbook","MacBook Air","3"},
			{"imac","iMac","4"}
			
		};
	}
	
	@Test(dataProvider="getSearchData")
	public void Search(String key,String productname,String quantity)
	{
		driver.findElement(By.name("search")).sendKeys(key);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText(productname)).click();
		driver.findElement(By.name("quantity")).sendKeys(quantity);
		driver.findElement(By.name("search")).clear();
		
	}

}
