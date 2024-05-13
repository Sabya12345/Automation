package dataDrivenFrameworkDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//2 extra dependencies are needed to add in pom.xml file
public class ExcelDataFetch
{
	public static void main(String[] args) throws Throwable 
	{
		//create obj of FIS class
		FileInputStream fis=new FileInputStream("C:\\Users\\intel\\eclipse-workspace\\ADVANCESELENIUM\\src\\test\\resources\\TestData.xlsx");
		// open the excel sheet
		Workbook wb = WorkbookFactory.create(fis);
		
		//navigate to sheet row cell and fetch data
	
		String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
		System.out.println(data);//sabyasachi
		//print(0,1) data
		double data2 = wb.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data2);
		
		
	}
}
