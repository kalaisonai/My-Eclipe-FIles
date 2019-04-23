package learnExcelToday;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;

public class LearnExcel1 {
@BeforeClass
	public static String[][] dataReadFromExcel(String fileName, String shtName) throws IOException {
		XSSFWorkbook book=new XSSFWorkbook("./data/"+fileName+".xlsx");
		//XSSFSheet getSheet = book.getSheetAt(0);
		XSSFSheet getSheet = book.getSheet(shtName);
		int rowCount = getSheet.getLastRowNum();
		System.out.println("Row count "+rowCount);
		short columnCount = getSheet.getRow(0).getLastCellNum();
		System.out.println("Column count "+columnCount);
		
		String[][] data=new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			//Get row
			XSSFRow row = getSheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
				//Get column
				XSSFCell column = row.getCell(j);
				String cellValue = column.getStringCellValue();
				data[i-1][j]=cellValue;
				System.out.println(data);
			}
		}
		System.out.println("Sheet values "+data);
		return data;
	}

}
