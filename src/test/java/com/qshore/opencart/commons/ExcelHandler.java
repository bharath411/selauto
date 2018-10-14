package com.qshore.opencart.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {
	private Sheet sheet;

	public ExcelHandler() {
		init();
	}

	FileInputStream fis;
	Workbook book;

	public void init() {
		String filepath = "./src/test/resources/ProductData.xlsx";
		File file = new File(filepath);

		try {
			fis = new FileInputStream(file);
			if (filepath.endsWith(".xlsx")) {
				book = new XSSFWorkbook(fis);
			} else {
				book = new HSSFWorkbook(fis);
			}

			sheet = book.getSheet("Sheet1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	

	public String getCellData(int row, int col) {
		Row xrow = sheet.getRow(row);
		Cell cell = xrow.getCell(col);
		String value = "";
		if (cell != null) {
			if (cell.getCellType() == CellType.NUMERIC) {
				int data = (int) cell.getNumericCellValue();
				value = String.valueOf(data);
			} else if (cell.getCellType() == CellType.STRING) {
				value = cell.getStringCellValue();
			}
		}
		return value;
	}

	public int totalRows() {
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		return rows - 2;
	}

	public static void main(String[] args) {
		ExcelHandler ex = new ExcelHandler();

	}

}
