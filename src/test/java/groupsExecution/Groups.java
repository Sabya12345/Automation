package groupsExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups
{
	@Test(priority = 1,groups = "smoke")
	
		public void verifyUrl()
		{
		Reporter.log("smoke tc",true);
		}
	
	
	@Test(priority = 2,groups = "smoke")
	
	public void verifyLogo()
	{
	Reporter.log("smoke tc",true);
	}
	
	
	@Test(priority = 3,groups = "functonal")
	
	public void login()
	{
	Reporter.log("functional tc",true);
	}
	
@Test(priority = 4,groups = "functonal")
	
	public void logout()
	{
	Reporter.log("functional tc",true);
	}
		
	
}
