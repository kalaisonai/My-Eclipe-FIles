package week5Day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book=new XSSFWorkbook("./data/MyWorkSheet.xlsx");
		XSSFSheet getSheet = book.getSheetAt(0);
		int rowCount = getSheet.getLastRowNum();
		System.out.println("Row count "+rowCount);
		short columnCount = getSheet.getRow(0).getLastCellNum();
		System.out.println("Column count "+columnCount);
		for (int i = 0; i < rowCount; i++) {
			getSheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {

			}
		}

	}

}
