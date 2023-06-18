package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadMultipalData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Read mulitiple data ny using foe loop
		//get the row count
		FileInputStream file = new FileInputStream("./Data/TestData.xlsx");
		Workbook b1 = WorkbookFactory.create(file);
		Sheet sheet = b1.getSheet("IPL");
		int rc = sheet.getLastRowNum();
		System.out.println(rc);
		for(int i=0;i<=rc;i++)
		{
			FileInputStream files = new FileInputStream("./Data/TestData.xlsx");  //add apath of file
			b1=WorkbookFactory.create(files); //make file ready for read
			Sheet s = b1.getSheet("IPL"); //get into the sheet
			Row row = s.getRow(i);
			Cell cell = row.getCell(0);
			System.out.println(cell.getStringCellValue());
			Cell cell1 = row.getCell(1);
			System.out.println(cell1.getStringCellValue());
			
		}
	}
	

}
