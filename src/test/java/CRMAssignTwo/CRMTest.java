package CRMAssignTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CRMTest  extends BasetestCRM{
	
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {
			{"Miss","visa","karthik","C:\\Users\\karth\\Downloads\\Check_My_Progress (1).docx"},
			{"Mr","sam","paul","C:\\Users\\karth\\Downloads\\Check_My_Progress (1).docx"},
			{"Ms","maggie","masala","C:\\Users\\karth\\Downloads\\Check_My_Progress (1).docx"}
		};
	
	}
	@Test(dataProvider="getData")
	    
	public void FillContactform(String title, String firstname, String lastname,String filename)
	{
		
		driver.switchTo().frame("mainpanel");
	    Actions act=new Actions(driver);act.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).perform();
		
		for(Object e: getData())
		{
		 
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).perform();
		driver.findElement(By.linkText("New Contact")).click();
		Select selecttitle=new Select(driver.findElement(By.name("title")));
		selecttitle.selectByVisibleText(title);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.name("image_file")).sendKeys(filename);
		driver.findElement(By.xpath("//input[@value='Load From Company']/following-sibling::input[@value='Save']")).click();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).click().perform();
		String firstname_U=firstname.toUpperCase();
		char s=firstname_U.charAt(0);
		System.out.println(s);
		driver.findElement(By.xpath("//td[text()='"+s+"']")).click();
		boolean flag=driver.findElement(By.xpath("//a[text()='"+firstname+" "+lastname+"']")).isDisplayed();
		Assert.assertEquals(flag, true,"name not diaplyed");
		//act.moveToElement(driver.findElement(By.xpath("//a[text()='Home']"))).click().perform();
	}
	}
	

}
