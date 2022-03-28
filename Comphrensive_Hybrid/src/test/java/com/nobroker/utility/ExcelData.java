package com.nobroker.utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	XSSFWorkbook wb;

	public ExcelData() {
		File source = new File("./Test_Data/nobroker.xlsx");
		try {
			FileInputStream f = new FileInputStream(source);
			wb = new XSSFWorkbook(f);
		} catch (Exception e) {
			System.out.println("Exception is found" + e.getMessage());

		}
	}

	public String getStringData(int sheetIndex, int row, int cell) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(cell).getStringCellValue();
	}

	public String getStringData(String sheetName, int row, int cell) {
		return wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	}

	public double getNumericData(String sheetName, int row, int cell) {
		return wb.getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
	}

}
