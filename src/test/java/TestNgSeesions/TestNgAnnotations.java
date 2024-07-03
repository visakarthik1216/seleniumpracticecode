package TestNgSeesions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	@BeforeSuite //1 //global precondition
	public void ConnectWithDB()
	{
		System.out.println(" BS.....Db is connected");
	}
	
	@BeforeTest //2
	public void CreateUser()
	{
		System.out.println(" BT.....user created");
	}
	
	@BeforeClass//3
	public void LaunchBrowser()
	{
		System.out.println(" BC.....browser launched");
	}
	
	@BeforeMethod//4 //7 //10
	public void LoginToAPP()
	{
		System.out.println(" BM......login to app");
	}
	
	@Test
	public void searchTest() //11
	{
		System.out.println("search test");
	}
	
	@Test //5
	public void addToCartTest()
	{
		System.out.println("add to cart test");
	}
	
	@Test
	public void checkOutTest() //8
	{
		System.out.println("check out test");
	}
	
	@AfterMethod //6 //9 //12
	public void logOut()
	{
		System.out.println("AM....Logout");
	}
	
	@AfterClass //13
	
	public void closeBrowser()
	{
		System.out.println("AC....closebrowser");
	}
	
	@AfterTest //14
	public void DeletUser()
	{
		System.out.println("AT....user deleted");
	}
	
	@AfterSuite //15
	public void DiscDB()
	{
		System.out.println("AS....dicoonect DB");
	}
	
	
	
	
	

	
	
}
