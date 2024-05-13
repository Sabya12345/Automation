package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityDemo 
{
	@Test(priority = 3)
	public void logout()
	{
		Reporter.log("log out now",true);
	}
	
	
	@Test(priority = 2)
	public void login()
	{
		Reporter.log("login to the app", true);
	}
}
