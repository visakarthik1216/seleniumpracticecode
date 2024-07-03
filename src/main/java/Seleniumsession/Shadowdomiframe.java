package Seleniumsession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowdomiframe {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
				
		Thread.sleep(3000);
			
		driver.switchTo().frame("pact");
		
		String javascript="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement tea=(WebElement)js.executeScript(javascript);
         tea.sendKeys("masala tea");
         
         
         // chrome settings -enter the value in search field
         
//         driver=new ChromeDriver();
//         driver.get("chrome://settings/");
// 		 Thread.sleep(3000);
// 		String javascript="return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
// 		JavascriptExecutor jscript=((JavascriptExecutor)driver);
//		WebElement search=(WebElement)jscript.executeScript(javascript);
//         search.sendKeys("masala tea");
 		
         
	}

}
