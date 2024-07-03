package Seleniumsession;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestUtil {

	public static void main(String[] args) {
		
		//String browser="chrome";
		
		ReadProperty propReader= new ReadProperty();
		Properties prop=propReader.initprop();
		
		
		BrowserUtil ob= new BrowserUtil();
				
		WebDriver driver=ob.launchBrowser(prop.getProperty("browser"));
		
		ob.launchURL(prop.getProperty("url"));
		
		String newtitle=ob.title();
		System.out.println(" the Title is :" +newtitle);
		if (newtitle.equals("Google"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
		
		String newurl=ob.getUrl();
		System.out.println("The URL is :" +newurl);
		if(newurl.contains("google"))
		{
			System.out.println("url is correct");
		}
		
		else
		{
			System.out.println(" url is incorrect");
		}
		
		ob.quitBrowser();
		

	}

}
