package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class generic_excel 
{
 public static String ddt(String S,int R,int C) throws EncryptedDocumentException, IOException
 {
	 FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(S);
		Row row = sheet.getRow(R);
		Cell cell = row.getCell(C);
		String value = cell.getStringCellValue();
	    return value;
 }
}
