package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestediframe {
	static WebDriver driver;

	public static void main(String[] args) {
	
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("visa");
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("karthik");
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("phoenix");
		
		//switching to parent frame
		
//		driver.switchTo().parentFrame(); //f3--f2
//		driver.findElement(By.id("jex")).sendKeys(" love");
//		
//		
//		driver.switchTo().parentFrame(); //f2--f1
//		driver.findElement(By.id("inp_val")).sendKeys(" is cute");
//		
//		driver.switchTo().parentFrame(); //f1-page
//		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		//default content --goes to page form any frame(f3 or f2 or f1)
		
		driver.switchTo().defaultContent();  //goes from f3 to page if driver is in f3.
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		
		
		
		

	}

}
