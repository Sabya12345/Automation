package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Google 
{
	@Test
	public void openGoogle()
	{
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.google.com");
	}
}
