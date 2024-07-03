package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//String header=driver.findElement(By.tagName("h2")).getText();
		//System.out.println(header);
		
//		String FLtext=driver.findElement(By.linkText("Forgotten Password")).getText();
//		System.out.println(FLtext);
//		
//		String para=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
//		System.out.println(para);
		
		By header=By.tagName("h2");
		By FLtext=By.linkText("Forgotten Password");
		By para=By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		
		ElementUtil ob=new ElementUtil(driver);
		
		String h=ob.doGetText(header);
		System.out.println(h);
		System.out.println(ob.doGetText(FLtext));
		

	}

}
