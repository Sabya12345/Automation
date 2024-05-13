package pageObjectModel_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElementReferenceException
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("admin");//one way
		
		//another way
		WebElement UN = driver.findElement(By.xpath("//input[@name='user-name']"));	
		
		//refresh the page
		driver.navigate().refresh();//SERE....bcz session id changes, so we will use find by
		
		UN.sendKeys("admin");
	}
}
