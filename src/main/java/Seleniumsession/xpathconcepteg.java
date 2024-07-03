package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathconcepteg {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.cfm?CFID=2120987&CFTOKEN=826b93abbd56e9da-5EDB3FBB-DA17-97D8-D7AAEA665E34B142&jsessionid=b630225011b708807d4a282f712c4b35652a");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
	    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	 //   driver.findElement(By.xpath("//a[text()='neha sharma']/parent::td/preceding-sibling::td/input")).click();
//	    List<WebElement> userlist=driver.findElements(By.xpath("//a[text()='neha sharma']/parent::td/preceding-sibling::td/input"));
//	    for (WebElement e: userlist)
//	    {
//	    	e.click();
//	    	
//	    }
//	    
//		List<WebElement> companyNameList=driver.findElements(By.xpath("//a[text()='neha sharma']/parent::td/following-sibling::td/a[@context='company']"));
//		for(WebElement e1:companyNameList)
//		{
//			String text=e1.getText();
//    	System.out.println(text);
//		}
//	    
	    
	    selectMultiUserName("neha sharma");
	    getCompanyName("neha sharma");
	   
	}
	
	public static void selectusername(String userName)
	{
		  driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input")).click();
	}
	
	public static void selectMultiUserName(String userName)
	{
		List<WebElement> userlist=driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input"));
	    for (WebElement e: userlist)
	    {
	    	e.click();
	    	
	    }
	}
	
	public static void indexedUser(String userName, int index)
	{
		driver.findElement(By.xpath("(//a[text()='neha sharma']/parent::td/preceding-sibling::td/input)["+index+"]")).click();
	}
	
	public static void selectLastUserName(String userName)
	{
		driver.findElement(By.xpath("(//a[text()='neha sharma']/parent::td/preceding-sibling::td/input)[last()]")).click();
	}

	public static void getCompanyName(String userName)
	{
		List<WebElement> companyNameList=driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']"));
		for(WebElement e1:companyNameList)
		{
			String text=e1.getText();
    	System.out.println(text);
		}
	}
}
