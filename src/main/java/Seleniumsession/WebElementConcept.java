package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	//1.find web element + perform action
//		
//		driver.findElement(By.id("input-email")).sendKeys("vishalir12@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");
//		
//	//2. 
//		WebElement EmailId= driver.findElement(By.id("input-email"));
//		WebElement Pswd=driver.findElement(By.id("input-password"));
//		 
//		EmailId.sendKeys("vishalir12@gmail.com");
//		Pswd.sendKeys("test123");
		
		
	//3.by locator
		
		
//	  // By EmailID=	By.id("input-email");
//	   By pswd = By.id("input-password");
//	
//	   WebElement Email_ele=driver.findElement(EmailID);
//	   WebElement Pswd_ele=driver.findElement(pswd);
//	
//	   Email_ele.sendKeys("vishalir12@gmail.com");
//	   Pswd_ele.sendKeys("test123");
	
	
		//4.by locator+ separate function for webelement
		
	  // By EmailID=	By.id("input-email");
	  // By pswd = By.id("input-password");
	   
	  // getElement(EmailID).sendKeys("vishalir12@gmail.com");
	  // getElement(pswd).sendKeys("test123");
	   
	   
	 //5..by locator+ separate function for webelement and send keys
//	   By EmailID=	By.id("input-email");
//	   By pswd = By.id("input-password");
//	   doSendkeys(EmailID,"vishali126@gmail.com");
//	   doSendkeys(pswd,"test123");
//	   
	   //6.by locator+ separate function for webelement and send keys and elementutil
	   
	   By EmailID=	By.id("input-email");
	   By pswd = By.id("input-password");
	   By Frgtpswd_elt	=By.linkText("Forgotten Password");
		By login_elt=By.linkText("Login");
	   
	   ElementUtil ob=new ElementUtil(driver);
	   ob.doSendkeys(EmailID,"vishali126@gmail.com");
	   ob.doSendkeys(pswd,"test123");
	  	ob.doClick(Frgtpswd_elt);
		ob.doClick(login_elt);
	  
   	   
	   
	}
	
	 	  
		
		

	}


