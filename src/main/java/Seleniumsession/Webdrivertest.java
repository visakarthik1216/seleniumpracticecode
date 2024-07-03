package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdrivertest {

	public static void main(String[] args) {
	
		//WebDriver driver=new ChromeDriver(); //open the browser
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com"); //enter the url
		
		String title=driver.getTitle(); //get title
		System.out.println("page tile is " +title);
		
		if (title.equals("Google"))
		{
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title not correct");
		}
		
		String URL=driver.getCurrentUrl();
		System.out.println("page URL is " +URL);
		
		if (URL.contains("google"))
		{
			System.out.println("URL is correct");
		}
		else
		{
			System.out.println("URL not correct");
		}
		
		driver.quit();
	

	}

}
