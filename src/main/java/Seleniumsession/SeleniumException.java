package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumException {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		try {
		driver.findElement(By.id("input-email111")).sendKeys("visa123@gmal.com");
		}catch ( NoSuchElementException e){
			e.printStackTrace();
		}
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		

	}

}
