package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		BrowserUtil ob=new BrowserUtil();
		WebDriver driver=ob.launchBrowser("chrome");
		
		ob.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By EmailID=	By.id("input-email");
		By pswd = By.id("input-password");
		
		
		ElementUtil ob1=new ElementUtil(driver);
		   ob1.doSendkeys(EmailID,"vishali126@gmail.com");
		   ob1.doSendkeys(pswd,"test123");
		  
		   ob.closeBrowser();
	}

}
