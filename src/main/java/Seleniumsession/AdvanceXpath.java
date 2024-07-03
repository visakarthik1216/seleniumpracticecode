package Seleniumsession;

public class AdvanceXpath {

	public static void main(String[] args) {
		
		
		//parent to child
		
		// (//div[@class='form-group'])[1]/input  ----input email
		// (//div[@class='form-group'])[2]/input  -----input pswd
		
	// 	(//div[@class='form-group'])[2]/a ---click forgotten pswd
		
		// (//div[@class='well'])[2]//input[@id='input-email'] ---indirect child
		
		
	//	child to parent
		
		//input[@id='input-email']/parent::div ----go to parent
		//input[@id='input-email']/ancestor::form ----go to ancestor
		
		
		
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		
		
				
				

	}

}
