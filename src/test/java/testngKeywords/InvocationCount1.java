package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount1
{
	@Test(invocationCount = 5)
	public void methoddj()
	{
		Reporter.log("hello guys",true);
	}
}
