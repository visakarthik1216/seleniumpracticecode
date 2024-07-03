package TestNgSeesions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test(invocationCount=10)  // if we want to run the same test no of times we can specify by invocationcount
	public void addUserTest()
	{
		
		System.out.println("user got created");
	}

}
