package vTiger_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.manage().window().maximize();
//		
//		String expt="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
//		String act = driver.getTitle();
//		if(act.equals(expt))
//		{
//			System.out.println("matching");
//		}
//		else
//		{
//			System.out.println("not matching");
//		}
		
		//create organization
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("gajnewz2dhij engiffnegering coege");
		
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		
		//signout//move the element
		WebElement hoverRef = driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		//crate obj of actions class
		Actions a=new Actions(driver);
		a.moveToElement(hoverRef).contextClick().perform();
		
	}
}
