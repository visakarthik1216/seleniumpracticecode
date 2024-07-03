package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame("main");
		//String text=driver.findElement(By.tagName("h2")).getText();
		//System.out.println(text);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='home.html']")));
		
		String para1=driver.findElement(By.tagName("p")).getText();
		System.out.println(para1);
		
		

	}

}
