package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	
	public WebDriver launchBrowser (String browserName)
	{
		System.out.println("The browser is :" + browserName);
		
		switch(browserName.trim().toLowerCase())
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;
		
		default:
			System.out.println(" please pass the correct browser name");
			throw new BrowserException(" Invalid browser :" +browserName);
			
		}
		
		return driver;
	}
	
	
	public void launchURL(String url)
	{
		if (url==null)
		{
			throw new BrowserException("Invalid url" +url);
		}
		
		if (url.isBlank()|| url.isEmpty())
		{
			throw new BrowserException("URL is empty/blank" +url);
		}
		
		if (url.indexOf("https")!=0 || url.indexOf("https")> 0)
		{
			throw new BrowserException("http in the url is missing/replaced");
		}
	
		driver.get(url.trim());
		
	
	}
	
	
	public String title()
	{
		return driver.getTitle();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
		
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
		
		
	}
	


