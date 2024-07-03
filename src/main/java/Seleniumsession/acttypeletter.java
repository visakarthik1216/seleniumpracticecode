package Seleniumsession;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class acttypeletter {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By srch= By.name("search");
		String keys= "macbook";
		long pause=500;
		DoActionprintletter(srch,keys,pause);
		DoActionprintletter(srch,keys);
		
//		char[] ch=keys.toCharArray();
//		for(char c:ch)
//		{
//			
//			act.sendKeys(driver.findElement(srch),String.valueOf(c)).pause(500).perform();
//		}
	}

	
	
	public static void DoActionprintletter(By Locator, String keys, long pausetime)
	{
		Actions act=new Actions(driver);
		char[] ch=keys.toCharArray();
		for(char c:ch)
		{
			
			act.sendKeys(driver.findElement(Locator),String.valueOf(c)).pause(pausetime).perform();
		}
	}

	
	public static void DoActionprintletter(By Locator, String keys) //default pass time is 500
	{
		Actions act=new Actions(driver);
		char[] ch=keys.toCharArray();
		for(char c:ch)
		{
			
			act.sendKeys(driver.findElement(Locator),String.valueOf(c)).pause(500).perform();
		}
	}

}
