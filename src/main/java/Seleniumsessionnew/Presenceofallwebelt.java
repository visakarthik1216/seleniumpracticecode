package Seleniumsessionnew;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Presenceofallwebelt {
	

	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		
		By toplinks=By.cssSelector("div#navbar-collapse a");
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		List<WebElement> toplinksset=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toplinks));
//		System.out.println(toplinksset.size());
//		
		List<WebElement> toplinksset=waitPresenceOfAllElet(toplinks,10);
		System.out.println(toplinksset.size());
		

	}
	
	// this says atlaest one element is visible in the web page (when it comes to list, there is no check on DOM)
	
	public static List<WebElement> waitPresenceOfAllElet(By locator, int duration)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
 
	//this says that ALL elments are present on the page that match the locator are visible
	//visibilty means height and width od webelt is greater than 0
	
	public static List<WebElement> waitVisibiltiyOfAllElet(By locator, int duration)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

}
