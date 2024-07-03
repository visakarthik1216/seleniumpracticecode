package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class acceessiblity {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement Fname=driver.findElement(By.id("input-firstname"));
		
		Actions act=new Actions(driver);
		
	act.sendKeys(Fname,"visa")
	   .sendKeys(Keys.TAB)
	   .pause(500)
	   .sendKeys("karthik")
	   .sendKeys(Keys.TAB)
	   .pause(500)
	   .sendKeys("visa123@gmail.com")
	   .sendKeys(Keys.TAB)
	   .pause(500)
	   .sendKeys("444-333-2222")
	   .sendKeys(Keys.TAB)
	   .pause(500)
	   .sendKeys("jobs123")
	   .sendKeys(Keys.TAB)
	   .pause(500)
	   .sendKeys("jobs123")
	   .sendKeys(Keys.TAB)
	   .sendKeys(Keys.TAB)
	   .sendKeys(Keys.TAB)
	   .sendKeys(Keys.SPACE)
	   .sendKeys(Keys.ENTER)
	   .build().perform();
	   
	   
		
		
		   
		   
		   

	}
	
	
	
}
