package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Flib {
	public static String getDataFromProperty(String filepth,String key) throws IOException {
		
		FileInputStream  f=new FileInputStream(filepth);
		Properties p=new Properties();
		p.load(f);
		return p.getProperty(key);
		
	}
	
	public static String getDataFromExcelFile(String path,String sheetName,int rowNo,int cellNo) throws Exception {
		FileInputStream f=new FileInputStream(path);
	    Workbook book=WorkbookFactory.create(f);
	    Sheet sheet=book.getSheet(sheetName);
	    return sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
	
	}
	
	public static void implicitWit(WebDriver driver, long seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	

}
