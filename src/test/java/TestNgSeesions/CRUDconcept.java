package TestNgSeesions;

import org.testng.annotations.Test;

public class CRUDconcept {
	
	
	public int addUser()
	{
		return 123;
	}
	
	public String getUser(int uid)
	{
		 return "the userinfo of the user " +uid;
	}
	
	public void updateUser(int uid)
	{
		System.out.println(" update the userifo of the userid " +uid);
	}
	
	public void deleteUser(int uid)
	{
		System.out.println(" the user of this user id is deleted" +uid);
	}
	
	
	
// for CRUD operation always create user first and then do the actions for get , update as well delete
	// do not do on exisiting data
	//follow aaa pattern

@Test
public void addUserTest()
{
	int uid=addUser();
	System.out.println(uid);
}
@Test
public void getUserTest()
{
	int uid=addUser();
	String userinfo=getUser(uid);
	System.out.println(userinfo);
}
@Test
public void updateUserTest()
{
	int uid=addUser();
	updateUser(uid);
	String userinfo= getUser(uid);
	System.out.println(userinfo);
}
@Test
public void deleteUserTest()
{
	int uid=addUser();
	deleteUser(uid);
	getUser(uid);
}

}

