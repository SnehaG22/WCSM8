package pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File {
	public String readExcelData(String excelpath,String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sname = wb.getSheet(sheetname);
		Row r = sname.getRow(row);
		Cell c = r.getCell(cell);
		String data = c.getStringCellValue();
		return data;
	}
	// get rowcount
	public int rowCount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sname = wb.getSheet(sheetname);
		int lastrow = sname.getLastRowNum();
		return lastrow;
	}
	// get propertydata
	public String getPropertyData(String propath,String key) throws IOException
	{
		FileInputStream file = new FileInputStream(propath);
		Properties pro = new Properties();
		pro.load(file);
		String data = pro.getProperty(key);
		return data;
	}

}
