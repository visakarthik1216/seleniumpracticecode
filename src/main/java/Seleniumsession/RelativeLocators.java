package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static  org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(3000);
		WebElement baseele=driver.findElement(By.linkText("Waterloo, Canada"));
		
		String aqi=driver.findElement(with(By.tagName("p")).toRightOf(baseele)).getText();
         System.out.println(aqi);
         
         String rank=driver.findElement(with(By.tagName("p")).toLeftOf(baseele)).getText();
         System.out.println(rank);
         
         String belowcity=driver.findElement(with(By.tagName("p")).below(baseele)).getText();
         System.out.println(belowcity);
         
         String abovecity=driver.findElement(with(By.tagName("p")).above(baseele)).getText();
         System.out.println(abovecity);
         
         
         
         
         
         
         
         
         
	}

}
