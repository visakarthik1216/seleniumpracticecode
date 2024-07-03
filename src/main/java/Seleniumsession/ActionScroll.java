package Seleniumsession;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionScroll {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Actions act=new Actions(driver);
		
//		act.sendKeys(Keys.PAGE_DOWN).perform(); //this scrolls only little down
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_UP).perform();// only little up
//	

	//window--ctrl+home to go to top completely
	//ctrl+end to go to bottom completely
	
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();

	
}
}

