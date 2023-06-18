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

public class ReadExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		   FileInputStream file = new FileInputStream("./Data/TestData.xlsx"); //add path of excel file
		   Workbook wb = WorkbookFactory.create(file); //make file ready to read
		   Sheet sheet = wb.getSheet("IPL"); //get into the sheet
		   Row row = sheet.getRow(1); //get into the row
		   Cell cell = row.getCell(0);// get into cell
		   String data = cell.getStringCellValue();// get data
		   System.out.println(data);
		   
	}

}
