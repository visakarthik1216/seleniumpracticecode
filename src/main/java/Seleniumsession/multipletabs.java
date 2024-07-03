package Seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipletabs {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
				
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		String parentwindowid=driver.getWindowHandle();
		
      
        driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		//fetch window id
		
		Set<String> handles=driver.getWindowHandles();
		Iterator <String> it=handles.iterator();
		
		while(it.hasNext())
		{
			String windowid=it.next();
			driver.switchTo().window(windowid);
			System.out.println(driver.getCurrentUrl());
			if(!parentwindowid.equals(windowid))
			{
			driver.close();
			}
			
		}
		
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getTitle());
		
		
		 
	


	}

}
