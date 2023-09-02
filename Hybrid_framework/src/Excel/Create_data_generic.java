package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Create_data_generic
{
  public static void create(String S,int R,int C,String Data) throws EncryptedDocumentException, IOException
  {
	  FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.createSheet(S);
		//Sheet sh=book.getSeet("Sheet1");
		Row row = sh.createRow(R);
		Cell cell = row.createCell(C);
		cell.setCellValue(Data);
		FileOutputStream fio=new FileOutputStream("./excel/Book1.xlsx");
		book.write(fio);
	
  }
}
