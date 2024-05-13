package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Facebook 
{
	@Test
	public void openFacebook()
	{
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
}
