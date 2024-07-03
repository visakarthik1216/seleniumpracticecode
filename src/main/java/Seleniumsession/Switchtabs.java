package Seleniumsession;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtabs {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//fetchwindowid
		
		Set<String> handles= driver.getWindowHandles();
		Iterator<String>  it=handles.iterator();
		
        String parentwindowid=it.next();
        System.out.println("parent window id is :" + parentwindowid);
        
        String childwindowid=it.next();
        System.out.println("parent window id is :" +childwindowid);
        
        //switch to child window
        driver.switchTo().window(childwindowid);
        System.out.println(driver.getCurrentUrl());
        driver.close();
        
        //switch to parent
        driver.switchTo().window(parentwindowid);
        System.out.println(driver.getCurrentUrl());
        driver.quit();
        
	}

	
}
