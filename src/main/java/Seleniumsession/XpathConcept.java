package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		// //input[@id='input-email']
		// //input[@name='password']
		//input[@id='input-firstname' and @name='firstname' and @placeholder='First Name']
		
		
		//text() -can be used for header as well for the links
		// //legend[text()='Your Personal Details']
		
		
		//contains()---- attr and value should be separated by comma not = (very imp)
		//input[contains(@id,'email')
		//input[contains(@id,'email') and @name='email']---can be used with 2 attributes
		////input[contains(@id,'email') and contains(@name,'email')] can be used with 2 contains too
		
		
		//contains with text()
		//h2[contains(text(),'Customer')] ---for header
		////p[contains(text(),'By creating an account ')]---for para
		//a[contains(text(),'Terms')] ----can be used for links
		
		//starts-with()
		//input[starts-with(@placeholder,'E-Mail')]
		////input[starts-with(@placeholder,'E-Mail') and contains(@name,'email')] ----can be combined with contains
		
		//starts-with() text
		//p[starts-with(text(),'By creating an account')]
		
		//indexing with xpath( capture group should be done)
		// (//a[text()='forgot password'])[2]
		//(//input[@id])[2]
		
		
		
		
		//last()
		// (//input[@id])[last()-last()+1] .....if u want to interact with first element
		//(//input[@id])[last()-2]
				
		
		
		
		
		

	}

}
