package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		//WebElement sourceLoc= driver.findElement(By.id("draggable"));
		//WebElement targetLoc= driver.findElement(By.id("droppable"));
		
		//Actions act=new Actions(driver);
	//	act.dragAndDrop(sourceLoc, targetLoc).perform();
		
		
	}
	
	public static void DragandDrop(By sourceLoc, By targetLoc)
	{
		WebElement sourceEle= driver.findElement(By.id("draggable"));
		WebElement targetEle= driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(sourceEle, targetEle).perform();
	}
	

}
