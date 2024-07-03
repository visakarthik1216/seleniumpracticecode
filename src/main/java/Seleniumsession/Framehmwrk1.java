package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framehmwrk1 {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("titlexyz");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("texas");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("/05/12/2024");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys(" this is a good practice for frame work");
		driver.findElement(By.id("RESULT_FileUpload-6")).sendKeys("C:\\Users\\karth\\Downloads\\Check_My_Progress (1).docx");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("visa");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("karthik");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("6711 s ankie street");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("phoenix");
		Select select_state=new Select(driver.findElement(By.name("RESULT_RadioButton-13")));
		select_state.selectByVisibleText("Colorado");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("85248");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("(602)-572-4322");
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("Submit")).click();
		
		
				
		

	}

}
