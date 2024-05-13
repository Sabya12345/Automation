package childBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		
		//click on the searchbar and type
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000");
		//click on the search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//print title of main window
		System.out.println("this is the main window title:"+driver.getTitle());
		
		//click on the first link
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		
		//switch to child window
		Set<String> allWin = driver.getWindowHandles();
		//for each loop
		for(String child:allWin)
		{
			driver.switchTo().window(child);
		}
		//print the title of child window
		System.out.println("this is the title of child window"+driver.getTitle());
	}
}
