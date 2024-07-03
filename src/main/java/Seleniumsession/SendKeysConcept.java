package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.id("input-email")).sendKeys("djsnjd@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("defjef");
		
		String name="visa";
		String desg="SE";
		StringBuilder sd=new StringBuilder("automation");
		StringBuffer sd1=new StringBuffer("selenium");
				
		
		driver.findElement(By.id("input-email")).sendKeys(name, " ", desg, "abcd",sd,sd1);
				
		
		
		

	}

}
