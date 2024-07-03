package Seleniumsession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multitabassign {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
				 
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		Set <String> handles=driver.getWindowHandles();
		
		//we can also convert set to list
		// converting non-order based to order based
		
//		List<String> obj=new ArrayList<String>(handles);
//		String parentid=obj.get(0);
//		String childid=obj.get(1);
//		driver.switchTo().window(childid);
		
		Iterator<String> it=handles.iterator();
	
		
		String parentwindowid=it.next();
		String childwindowid=it.next();
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowid);
		
		 driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		 driver.switchTo().window(childwindowid);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(parentwindowid);
			
			driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
			 driver.switchTo().window(childwindowid);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(parentwindowid);	
			
			
				
				
			
			
		
		
		
		
	
	

	}

}
