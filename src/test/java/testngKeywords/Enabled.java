package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test(enabled = false)
public void m()
{
	Reporter.log("dhdhhdh",true);
}
@Test
public void m2()
{
	Reporter.log("hye ", true);
}
}
