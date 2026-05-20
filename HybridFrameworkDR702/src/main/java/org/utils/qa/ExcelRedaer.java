package org.utils.qa;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRedaer {
	
	public static Workbook book;
	public static Sheet sheet;
	
public static Object[][] getExcelData(String specificSheet) throws EncryptedDocumentException, IOException{
	
	FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\Software Testing By Ajeet Sir\\Java Workspace-Eclipse\\HybridFrameworkDR702\\TestData\\TestData.xlsx");
	
	
	book=WorkbookFactory.create(fis); 
	sheet=book.getSheet(specificSheet);
	
	int totalRows=sheet.getLastRowNum();
	int totalColumns=sheet.getRow(0).getLastCellNum();
	
	
	Object[][] obj=new Object[totalRows][totalColumns];
	
	
	for(int i=0; i<obj.length; i++) {
		for(int j=0; j<obj.length; j++) {
			
			obj[i][j]=sheet.getRow(i+1).getCell(j).toString();
		}
	}
	
	return obj;
}
}








