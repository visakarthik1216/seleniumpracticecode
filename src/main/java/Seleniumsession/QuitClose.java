package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitClose {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.google.com");
		
		
		String title=driver.getTitle();
		System.out.println("page title is "+title);
		
		String url=driver.getCurrentUrl();
		System.out.println(" url is "+ url);
		
		driver.quit();
		
		//driver.close();
		
		
		String title1=driver.getTitle();
		System.out.println("title is "+title1);
		
		

		

	}

}
