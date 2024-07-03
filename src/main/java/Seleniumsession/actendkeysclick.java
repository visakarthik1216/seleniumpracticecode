package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actendkeysclick {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By name= By.id("input-firstname");
		By fp=By.linkText("Forgotten Password");
		DoActionsSendkeys(name,"visa");
		DoActionsClick(fp);
		
		
		
//		Actions act=new Actions(driver);
//		act.sendKeys(driver.findElement(name), "visa").perform();
//		act.click(driver.findElement(fp)).perform();
//		


	}
	
	public static void DoActionsSendkeys(By locator, String keys)
	{
		Actions act=new Actions(driver);
		act.sendKeys(driver.findElement(locator), keys).perform();
	}
	
	public static void DoActionsClick(By locator)
	{
		Actions act=new Actions(driver);
		act.click(driver.findElement(locator)).perform();
	}

}
