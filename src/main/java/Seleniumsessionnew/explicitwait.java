package Seleniumsessionnew;

import java.time.Duration;
import Seleniumsession.ElementUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//use until method which is present in webdriverwait class
		
		By emailid= By.id("input-email");
		By pswd=By.id("input-password");
		By login=By.xpath("//input[@value='Login']");
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
		
		//webElementWait(emailid,10).sendKeys("visa@gmail.com");
		//getElement(pswd).sendKeys("test123");
		//webElementWait(login,5).click();
		//webElementWaitVisible(emailid,10).sendKeys("visa@gmail.com");
		
			
		ElementUtil e= new ElementUtil(driver);
		e.doSendkeys(emailid,"visa123@gmail.com",10); //created in element util
		e.doSendkeys(pswd,"tes@123"); //created in element util
		e.doClick(login, 5); //created in element util

	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 *  This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param time
	 * @return
	 */
	public static WebElement webElementWait(By locator, int time)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
	 * @param locator
	 * @param time
	 * @return
	 */
	public static WebElement webElementWaitVisible(By locator, int time)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	

	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}

}
