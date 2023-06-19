package keyWordDriven;

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
	public String readPropertyData(String propath, String key) throws IOException
	{
		FileInputStream file = new FileInputStream(propath);
		Properties pro = new Properties();
		pro.load(file);
		String data = pro.getProperty(key);
		return data;
		
	}
	public String readExcelData(String excelpath,String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{  
		FileInputStream fil = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fil);
		Sheet name = wb.getSheet(sheetname);
		Row r = name.getRow(row);
		Cell c = r.getCell(cell);
		String data = c.getStringCellValue();
		return data;
	}
	public int rowcount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(f);
		Sheet n = wb.getSheet(sheetname);
		int rc = n.getLastRowNum();
		return rc;
	}

}
