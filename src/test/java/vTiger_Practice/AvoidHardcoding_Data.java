package vTiger_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pomclassess.LoginPage_VT;
import utility.Icon;

public class AvoidHardcoding_Data
{
	public static void main(String[] args) throws Throwable 
	{
		//fetching property file data
		//to hide the full property path, create package as UTILITY in src/main/java...and create one interface
	FileInputStream fis=new FileInputStream(Icon.propertyPath);
	Properties p=new Properties();
	p.load(fis);
	String URL = p.getProperty("url");
	System.out.println(URL);
	String UN = p.getProperty("un");
	String PWD = p.getProperty("pwd");
	
	///upper part is over, that one for fetching the data from notepad
	
	WebDriver driver=new EdgeDriver();
	driver.get(URL);
	
	//to avoid hard coding the locators, create one package pomclasses.then design pom class for login page in src/test/java
//	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
//	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
//	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
	
	//login operation by pom class
	LoginPage_VT lp=new LoginPage_VT(driver);
	lp.loginTOApp(UN, PWD);
		
	}
}
