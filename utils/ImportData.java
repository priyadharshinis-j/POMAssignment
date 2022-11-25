package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import baseClass.CommonClass;

public class ImportData extends CommonClass {
	
	
public static String[][] excelData(String fileName,String sheetName) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("./dataImport/"+fileName+".xlsx");
		
		
		XSSFSheet sheetAt = book.getSheet(sheetName);

		int rowCount = sheetAt.getLastRowNum();
		XSSFRow row = sheetAt.getRow(0);
		
		System.out.println(rowCount);
		
		int cellCount = row.getLastCellNum();
		
		System.out.println(cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		System.out.println("Data from all rows and columns");
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				String cellValue = sheetAt.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(cellValue);
				data[i-1][j]=cellValue;
			}
		}
		
		book.close();
		return data;
	

}
}