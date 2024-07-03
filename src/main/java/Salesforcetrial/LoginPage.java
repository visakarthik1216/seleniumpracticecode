package Salesforcetrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://app-nosoftware-1313.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("vishalir1216-4qrr@force.com");
		driver.findElement(By.id("password")).sendKeys("Salesforce@100");
		driver.findElement(By.id("Login")).click();
		
		
		driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-id='Account']/a/span[text()='Accounts']/parent::*/parent::*")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		

	}

}

