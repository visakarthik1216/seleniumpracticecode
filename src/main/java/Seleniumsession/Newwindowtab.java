package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindowtab {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentid=driver.getWindowHandle();
		
		//u can use tab or window to open new tab/window
		
		//driver.switchTo().newWindow(WindowType.TAB ); //opens new tab and switch to new tab
		driver.switchTo().newWindow(WindowType.WINDOW); //opens new window and switch to new window
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

	}

}
