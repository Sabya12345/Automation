package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
@Test(timeOut = 10)
public void j()
{
	Reporter.log("timeout demo", true);
}
}
