package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiononesubmenu {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		By Addons=By.xpath("//div[text()='Add-ons']");
		By SpiceCafe= By.xpath("//div[text()='SpicePlus']");
		onesubmenu(Addons,SpiceCafe);

	}
	
	
	public static void onesubmenu(By parentloc, By childloc) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(parentloc)).perform();
		Thread.sleep(5000);
		driver.findElement(childloc).click();
		
	}

}
