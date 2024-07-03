
package Seleniumsession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowdom {
	
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);
		
		String javas="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		WebElement pizza=(WebElement)js.executeScript(javas);
		pizza.sendKeys("veggie pizza");

	}

}
