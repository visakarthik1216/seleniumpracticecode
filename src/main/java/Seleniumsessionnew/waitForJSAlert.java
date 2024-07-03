package Seleniumsessionnew;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForJSAlert {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		String alerttext=getAlertText(5);
		System.out.println(alerttext);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alertSendKeys(10, "automation");
		
		
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		Alert alert=wait.until(ExpectedConditions.alertIsPresent()); //checks whether alert is present as well it will switch to that alert.
//		System.out.println(alert.getText());
//		alert.accept();
	}
		
		public static Alert waitForJSAlert(int time)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			return wait.until(ExpectedConditions.alertIsPresent()); //checks whether alert is present as well it will switch to that alert.
			
		}
		
		public static String getAlertText(int time)
		{
			Alert alert=waitForJSAlert(time);
			String text=alert.getText();
			alert.accept();
			return text;
		
		}
		
		public static void acceptalert(int time)
		{
			waitForJSAlert(time).accept();
		}
		
		public static void dismissalert(int time)
		{
			waitForJSAlert(time).dismiss();
		}
		
		public static void alertSendKeys(int time, String value)
		{
			Alert alert=waitForJSAlert(time);
			alert.sendKeys(value);
			alert.accept();
		}


		
		
		
	

	}


