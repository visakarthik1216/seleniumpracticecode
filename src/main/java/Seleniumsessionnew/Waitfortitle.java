package Seleniumsessionnew;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import Seleniumsession.ElementUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfortitle {
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		
		By pricing=By.linkText("Pricing");
		ElementUtil e=new ElementUtil(driver);
		e.doClick(pricing,5);
		
		String title=waitForTitleContains("PRICING11",5);
		System.out.println(title);
		System.out.println(title.contains("PRICING11"));
		
		String partielURL=waitForURLContains("pricing.html",5);
		System.out.println(partielURL);
		
		String fullURL=waitForURLContains("https://classic.freecrm.com/pricing.html",5);
		System.out.println(fullURL);
		
		
	}
		
	
	public static String waitForURLContains(String partial,int time)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
	
	try {
	if (wait.until(ExpectedConditions.urlContains(partial)))
	{
		return driver.getCurrentUrl();
				
	}
	}catch(Exception e1)
	{
		System.out.println("URL not found");
	}
	return driver.getCurrentUrl();
	}
	
	public static String waitForURLtobe(String fullvalue,int time)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
	
	try {
	if (wait.until(ExpectedConditions.urlToBe(fullvalue)))
	{
		return driver.getCurrentUrl();
				
	}
	}catch(Exception e1)
	{
		System.out.println("URL not found");
	}
	return driver.getCurrentUrl();
	}
	
		
		
		
	
				
		
		public static String waitForTitleContains(String partial,int time)
		{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		
		try {
		if (wait.until(ExpectedConditions.titleContains(partial)))
		{
			return driver.getTitle();
					
		}
		}catch(Exception e1)
		{
			System.out.println("title not found");
		}
		return driver.getTitle();
		}
		
		
		public static String waitForTitleTobe(String titlevalue,int time)
		{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		
		try {
		if (wait.until(ExpectedConditions.titleIs(titlevalue)))
		{
			return driver.getTitle();
					
		}
		}catch(Exception e1)
		{
			System.out.println("title not found");
		}
		return driver.getTitle();
		}
		
		
		
		
		
		
		

	


	

}
