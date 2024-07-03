package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//find web element + perform action
		
		//1.by id
//		
//		driver.findElement(By.id("input-email")).sendKeys("vishalir12@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");
//		
		
		//2  by name
		
//		driver.findElement(By.name("email")).sendKeys("visa123@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test123");
//		
		
		//3 by classname
		//driver.findElement(By.className("form-control")).sendKeys("visaan@gmail.com");
		
		//4. xpath
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("jdsjd@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();
		
		//5.css
		
		driver.findElement(By.cssSelector("#input-email")).sendKeys("jdsjd@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("dsbdh");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input.btn.btn-primary")).click();
		
		//6.linktext
		
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Register")).click();
		
		//7.partiellinktest
		
		driver.findElement(By.partialLinkText("Delivery")).click();
		
		//8.bytagname
		
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		
		
		
		
		
		
		
		
		

}
}