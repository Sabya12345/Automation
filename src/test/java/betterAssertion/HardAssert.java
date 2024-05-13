package betterAssertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert
{
	@Test
	public void m1()
	{
		Reporter.log("hiiiiii",true);
		
		Assert.fail();
		
		Reporter.log("hello",true);//this will not execute

	}
}
