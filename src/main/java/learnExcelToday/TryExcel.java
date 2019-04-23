package learnExcelToday;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//Seperate Class to try fetching data from excel
public class TryExcel {
	public static void main(String[] args) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("./data/MyWorkSheet.xlsx");
		XSSFSheet sheetNumber = book.getSheetAt(1);
		int rowCount = sheetNumber.getLastRowNum();
		System.out.println("Row "+rowCount);
		short columnCount = sheetNumber.getRow(0).getLastCellNum();
		System.out.println("Row Count is "+rowCount+" Column Count is "+columnCount);
		String[][] data=new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			//Get row
			XSSFRow row = sheetNumber.getRow(i);

			for (int j = 0; j < columnCount; j++) {
				//Get column
				XSSFCell column = row.getCell(j);
				String cellValue = column.getStringCellValue();
				System.out.println("Cell value "+cellValue);
				data[i-1][j]=cellValue;
				//System.out.println(data);
			}
		}
		System.out.println("Sheet values "+data);
	}
}