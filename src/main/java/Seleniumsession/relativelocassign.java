package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static  org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativelocassign {

	static WebDriver driver;
	public static void main(String[] args) {
	
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
	WebElement base=driver.findElement(By.linkText("Joe.Root"));
	
	//driver.findElement(with(By.xpath("//input[@id='ohrmList_chkSelectRecord_21']")).toleftof(base)).click();
	
	driver.findElement(with(By.xpath("//input[@id='ohrmList_chkSelectRecord_21']")).toLeftOf(base)).click();
	String userrole=driver.findElement(with(By.xpath("//td[text()='ESS']")).toRightOf(base)).getText();
	System.out.println(userrole);
	String EmpName=driver.findElement(with(By.xpath("//td[text()='Joe Root']")).toRightOf(base)).getText();
	System.out.println(EmpName);
	String Status=driver.findElement(with(By.xpath("//td[text()='Enabled']")).toRightOf(base)).getText();
	System.out.println(Status);
	
	
	
	

	}
	

}
