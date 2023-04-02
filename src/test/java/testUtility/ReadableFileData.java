package testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadableFileData {
	
	static String data="";
	
public static String fetchDataFromExcel(int Row,int Cell) throws EncryptedDocumentException, IOException	{
	
	String path="src"+File.separator+"test"+File.separator+"resources"+File.separator+"ExcelFile"+File.separator+"Book1.xlsx.xlsx";
	FileInputStream file=new FileInputStream(path);

	Cell s=WorkbookFactory.create(file).getSheet("Namrata").getRow(Row).getCell(Cell);
	
	
	CellType type=s.getCellType();
	
	
	if(type.equals(CellType.STRING))
	{
		 data=s.getStringCellValue();
	}
	else if(type.equals(CellType.NUMERIC))
	{
		double number=s.getNumericCellValue();
		 data=Double.toString(number);
	}
	else if(type.equals(CellType.BLANK))
	{
		data="";
	}
		
	return data;
	
	
	
	
	
	
	
}
	
	
	
	
	
	

}
