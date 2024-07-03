package Seleniumsessionnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Seleniumsession.ElementUtil;

public class WaitforBrowser {
	
	static WebDriver driver;


	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By twitter=By.xpath("//a[contains(@href,'twitter')]");
		
		ElementUtil e=new ElementUtil(driver);
		e.doClick(twitter, 10);
		if (waitForBrowser(2,10))
		{
			//fetch windows id
			//switching back to page
		}
		
		
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//		Boolean flag =wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//		System.out.println(flag);
//				
			
				
		

	}
	
	public static Boolean waitForBrowser(int numberofwindows, int timeout)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
	}

}
