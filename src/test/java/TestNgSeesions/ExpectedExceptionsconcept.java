package TestNgSeesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


// the expectedException = exception.class does not catch the exceptions, it says we are just expecting the exceptions and it will pass the test case.
// if u dont write it will fail

public class ExpectedExceptionsconcept {
	String name;
	
	@Test (priority=1, description="checking exceptions on this code", expectedExceptions= { NullPointerException.class})
	public void addtocartTest()
	{
		System.out.println("add to cart test");
		int i=9/0;
		System.out.println("hello");
		ExpectedExceptionsconcept obj=null;
		System.out.println(obj.name);
		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		

	}


