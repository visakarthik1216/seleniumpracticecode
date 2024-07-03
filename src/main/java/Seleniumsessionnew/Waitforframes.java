package Seleniumsessionnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforframes {
	
    
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.xpath("Vehicle-Registration-Forms-and-Examples")).click();
		By frameloc=By.xpath("//iframe[contains(@id,'frame-on");
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameloc));
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-8']")).sendKeys("visa");
		driver.switchTo().defaultContent();
	}
	
		
		public static void waitForFramebyloc(By locator,int timeout)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
			
		}
		
		public static void waitForFramebyind(int index,int timeout)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
			
		}
		
		public static void waitForFramebyidname(String idorname,int timeout)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idorname));
			
		}
		
		public static void waitForFramebyely(WebElement frameelt,int timeout)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameelt));
			
		}
		
		
		
		
		
		
		

	}


