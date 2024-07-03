package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		String attr=driver.findElement(By.linkText("Forgotten Password")).getAttribute("href");
		System.out.println(attr);
		
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		String emailattr=driver.findElement(By.id("input-email")).getAttribute("placeholder");
//		System.out.println(emailattr);
//		String emailvalue=driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(emailvalue);
		
		
		
		By emailattr=By.id("input-email");
		By emailvalue=By.id("input-email");
		
		ElementUtil ob=new ElementUtil(driver);
		String attr1=ob.doGetAttr(emailattr, "placeholder");
		System.out.println(attr1);
		
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		String Val=ob.doGetAttr(emailvalue, "value");
		System.out.println(Val);
	}

}
