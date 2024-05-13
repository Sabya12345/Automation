package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTheTC {
@Test
public void m1()
{
	Reporter.log("it will fail the tc", true);
	Assert.fail();
}



}
