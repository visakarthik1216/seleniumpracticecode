package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static  org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class Relativeloceg {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		Thread.sleep(3000);
//		WebElement elt=driver.findElement(By.cssSelector("a.agree"));
//		driver.findElement(with(By.name("agree")).toRightOf(elt)).click();
//		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	WebElement base=driver.findElement(By.tagName("h2"));
	String para1=driver.findElement(with(By.tagName("p")).below(base)).getText();
	System.out.println(para1);
	
	String para2= driver.findElement(with(By.xpath("//div[@class='well']//p/following-sibling::p")).below(base)).getText();
	System.out.println(para2);	
	
	//driver.findElement(with(By.xpath("")))

	}

}
