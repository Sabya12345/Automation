package testngKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOn
{
	@Test
	public void logiin()
	{
		Reporter.log("login to thr app", true );
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "logiin")
	public void logout()
	{
		Reporter.log("logout will happen if login is sucessgul", true);
	}
	
}
