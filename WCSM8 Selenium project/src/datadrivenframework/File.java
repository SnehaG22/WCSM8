package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File {
	// This class is used to store generic resuable methods 
	// all methods are non static
	public String readExcelData(String execlpath,String sheetname,int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(execlpath); // path of file
		Workbook wb = WorkbookFactory.create(file); // make file ready
		Sheet sname = wb.getSheet(sheetname); // get into sheet
		Row r = sname.getRow(row); // get into row
		Cell c = r.getCell(cell);  //get into cell
		String data = c.getStringCellValue();
		return data;
	}
	public int rowCount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet name = wb.getSheet(sheetname);
		int row = name.getLastRowNum();
		return row;
	}
}
