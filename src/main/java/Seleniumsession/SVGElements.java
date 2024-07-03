package Seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.get("https://petdiseasealerts.org/forecast-map/#/");
		 Thread.sleep(6000);
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		 String svgelement="//*[name()='svg' and @id='map-svg']//*[name()='path']";
		 
		List<WebElement> counttryelt=driver.findElements(By.xpath(svgelement));
		System.out.println(counttryelt.size());
		for(WebElement e : counttryelt)
		{
			String name=e.getAttribute("name");
			System.out.println(name);
		}
			
		
		 
		 
		//*[name()='svg' and @id='map-svg']//*[name()='path']
		 
		 

	}

}
