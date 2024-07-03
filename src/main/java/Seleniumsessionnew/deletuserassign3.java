package Seleniumsessionnew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class deletuserassign3 {
	static WebDriver driver;
	
	static String firstname="yuvaan";
	static String lastname="karthik";
			

	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
	    Actions act=new Actions(driver);act.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).perform();
	    
	    act.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).perform();
		driver.findElement(By.linkText("New Contact")).click();
		Select selecttitle=new Select(driver.findElement(By.name("title")));
		selecttitle.selectByVisibleText("Miss");
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@value='Load From Company']/following-sibling::input[@value='Save']")).click();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).click().perform();
		String firstname_U=firstname.toUpperCase();
		char s=firstname_U.charAt(0);
		System.out.println(s);
		driver.findElement(By.xpath("//td[text()='"+s+"']")).click();
		//driver.findElement(By.xpath("//a[text()='"+firstname+" "+lastname+"']"));
		driver.findElement(By.xpath("//a[text()='"+firstname+" "+lastname+"']/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
		Select selectdelete=new Select(driver.findElement(By.name("do_action")));
		selectdelete.selectByVisibleText("Delete Checked");
		driver.findElement(By.xpath("//input[@value='DO']")).click();
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		
		
		
		
		

	
	

	}

}
