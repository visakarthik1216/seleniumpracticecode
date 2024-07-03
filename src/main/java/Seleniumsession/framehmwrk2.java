package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehmwrk2 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		List<WebElement> noofframes=driver.findElements(By.xpath("//frame"));
	    for(WebElement e: noofframes)
		{
			String framenames=e.getAttribute("name");
			System.out.println(framenames);
		}
		
		
		
		
		

	}

}
