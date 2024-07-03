package Seleniumsession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pseudoelement {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String javascript="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue(\"content\")";
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String firstnamecontent=js.executeScript(javascript).toString();
		System.out.println(firstnamecontent);

	}

}
