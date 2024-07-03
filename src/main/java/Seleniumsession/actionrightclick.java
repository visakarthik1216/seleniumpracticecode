package Seleniumsession;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionrightclick {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		By rightClick=By.xpath("//span[text()='right click me']");
		
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(rightClick)).perform();
		
	List<WebElement> menulist=	driver.findElements(By.cssSelector("ul.context-menu-list >li.context-menu-icon>span"));
//	for(WebElement e: menulist)
//	{
//		String menus=e.getText();
//		System.out.println(menus);
//		if(menus.equals("Copy"))
//		{
//			e.click();
//			break;
//		 assignment given by naveen- right click , click ok on alert and again rigth clcik choose next , again ok on alert
	for(WebElement e: menulist)
		{
		e.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		if(e.getText().equals("Quit"))
		{
			break;
		}
				
		act.contextClick(driver.findElement(rightClick)).perform();
		
	
	}
		
        
		
	
	}

}
