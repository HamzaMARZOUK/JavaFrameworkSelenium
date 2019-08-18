package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelpath, String sheetname) {
		try {
			
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0, 0);
	}

	public static int getRowCount() {
		int rowcount=0;

		rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of row is:" + rowcount);
		return rowcount;

	}

	public static int getcolCount() {
		
		int colcount=0;

		colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns is:" + colcount);
		return colcount;

	}
	
	public static String getCellDataString(int rowNum, int cellNum) {
		String celldata;
		
		celldata = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		//System.out.println(celldata);
		return celldata;

	}
	
	public static void getCellDataNumber(int rowNum, int cellNum) {
		double celldata = sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		//System.out.println(celldata);

	}
}
