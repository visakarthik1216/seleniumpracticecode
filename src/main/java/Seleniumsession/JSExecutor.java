package Seleniumsession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
	//	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://classic.freecrm.com/index.html");
		Thread.sleep(3000);
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		String title= js.executeScript("return document.title").toString();
//	    System.out.println(title); 
//	    
	    
		JavaScriptUtil js= new JavaScriptUtil(driver);
		
//		String title=js.getTitleByJs();  // to get title
//		System.out.println(title); 
		
//		String URL= js.getURLByJs(); // to get currenturl
//		System.out.println(URL);
//		
//		js.goBackWithJS(); // to go back
//		js.goForwardWithJS(); //to go forward
		
//		String text=js.getPageInnerText(); // to get all the text of the entire page
//		System.out.println(text);
		
		js.scrollPageDown();
		Thread.sleep(2000);
		js.scrollPageUp();
		
		
	
	    

	}

}
