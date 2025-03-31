package GetDataFormExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchAndWriteDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testScriptData.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("LoginData");
		   Row rw = sh.getRow(1);
		   Cell cel = rw.getCell(0);
		 String org = cel.getStringCellValue();
		 System.out.println(org);
		         
		         
		         
	}

}
