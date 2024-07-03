package Seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']")).click();
		//a[text()='Joe.Root']/parent::td/following-sibling::td
		
		driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
	     Thread.sleep(3000);
		selectUserName("Joe.Root");
		selectUserName("Joe.Root");
		
		System.out.println(userDataList("Joe.Root"));
		
	
		
//		List<WebElement> userData=driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
//		for(WebElement e : userData)
//		{
//			System.out.println(e.getText());
//		}
		
		
			
	}
	
	public static List<String> userDataList(String userName)
	{
		List<WebElement> userData=driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> datalist=new ArrayList<String>();
		for(WebElement e : userData)
		{
			String text=e.getText();
			datalist.add(text);
		}
		return datalist;
	}

	
	public static void selectUserName(String userName)
	{
		driver.findElement(By.xpath("//a[text()='"+userName+"']/ancestor::tr//input[@type='checkbox']")).click();
	}
}
