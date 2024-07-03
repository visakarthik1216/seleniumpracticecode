package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowdomassign {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(2000);
		
		//userName
		
		//document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")"
		
		
	//	String javascript="return document.querySelector(\"#userName\").document.querySelector(\"#glaf\")";
		//String javascript="document.querySelector(\"#userName\").shadowRoot.querySelector(\"#glaf\")";
		
		// driver.switchTo().fr
		 
	 
	String js1= "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		 String javascript="document.querySelector(\"#glaf\")"; 
		
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement destiny=(WebElement)js.executeScript(js1);
		 String destiny1=js.executeScript(javascript).toString();
		//destiny1.("i don");
		WebElement destiny2=driver.findElement(By.cssSelector(destiny1));
		destiny2.sendKeys("i am good");
		//driver.switchTo().frame("pact1");
		//driver.switchTo().frame(0);
		// WebElement destiny=(WebElement)js.executeScript(javascript);
		
		//js.executeScript(javascript);
		
		//driver.switchTo().frame(0);
		//destiny.sendKeys("i dontknow mine");
		    
		  //String javascript="shadowRoot.querySelector(\"#userName\")";
	//	driver.switchTo().frame("pact1");
		//String javascript1="document.querySelector(\"#glaf\")";
		
				
				
		//driver.switchTo().frame("pact1");
				
		//JavascriptExecutor js=  ((JavascriptExecutor) driver);
		
		//JavascriptExecutor js=  ((JavascriptExecutor)driver);
		
       // WebElement destiny=(WebElement)js.executeScript(javascript);
      //  destiny.sendKeys("i dontknow mine");
	}

	private static void findElement(By cssSelector) {
		// TODO Auto-generated method stub
		
	}

}
