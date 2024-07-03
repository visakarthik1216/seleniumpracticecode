package Seleniumsessionnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessandIgcognito {

	public static void main(String[] args) {
		
		//headless mode=there will not be browser visibilty
		//useful if ur runing in headless Os like linux,docker,VM
		// safari cannot be open in headless mode
		
		//incoginto mode is private window
		
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		//FirefoxOptions fo=new FirefoxOptions(); //firefox driver
		//fo.addArguments("--headless");//
		
		WebDriver driver=new ChromeDriver(co);
		//WebDriver driver=new FirefoxDriver(fo);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
