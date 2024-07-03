package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mutlisubmenu {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
				
		By level1= By.xpath("(//span[text()='Shop by'])[2]");
		Dolevel4subelement(level1,"Beauty & Hygiene", "Hair Care", "Hair & Scalp Treatment");
//		By level2=By.linkText("Beverages");
//		By level3=By.linkText("Tea");
//		By level4=By.linkText("Green Tea");
		
		//Actions act=new Actions(driver);
//		driver.findElement(level1).click();
//		Thread.sleep(2000);
//		Actions act1=new Actions(driver);
//		act1.moveToElement(driver.findElement(level2)).perform();
//		Thread.sleep(2000);
//		act1.moveToElement(driver.findElement(level3)).perform();
//		Thread.sleep(2000);
//		driver.findElement(level4).click();
		
		
		

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void Dolevel4subelement(By level1, String level2,String level3,String level4) throws InterruptedException
	{
		getElement(level1).click();
		Thread.sleep(2000);
		Actions act1=new Actions(driver);
		act1.moveToElement(getElement(By.linkText(level2))).perform();
		Thread.sleep(2000);
		act1.moveToElement(getElement(By.linkText(level3))).perform();
		Thread.sleep(2000);
		getElement(By.linkText(level4)).click();
	}

}
