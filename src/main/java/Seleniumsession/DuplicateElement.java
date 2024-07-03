package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		
		
	By Frgtpswd_elt	=By.linkText("Forgotten Password");
	By login_elt=By.linkText("Login");
	doClick(Frgtpswd_elt);
	doClick(login_elt);
	}
	
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator)
	{
		 return driver.findElement(locator);
	}

	

	
		
	

	
}

	
		
	


