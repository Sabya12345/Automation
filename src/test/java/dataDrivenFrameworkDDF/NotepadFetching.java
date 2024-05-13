package dataDrivenFrameworkDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class NotepadFetching 
{
	@Test
	public void readDataFromNotepad() throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\intel\\eclipse-workspace\\ADVANCESELENIUM\\src\\test\\resources\\commonData.properties");
		
		Properties p=new Properties();
		p.load(fis);
		
		//write keys print values
		System.out.println(p.getProperty("un"));//one way of printing
		
		//another way of printing
		String UN=p.getProperty("un");
		System.out.println(UN);
		
		String PWD=p.getProperty("pwd");
		System.out.println(PWD);
		
		String URL=p.getProperty("url");
		System.out.println(URL);
		
		
	}
}
