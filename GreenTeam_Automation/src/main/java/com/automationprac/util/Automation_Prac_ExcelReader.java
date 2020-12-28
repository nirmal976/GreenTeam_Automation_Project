package com.automationprac.util;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Automation_Prac_ExcelReader {
	@SuppressWarnings("resource")
	public static ArrayList<String> readExcellData(int columno) throws Throwable {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\deynirmal\\eclipse-workspace\\GreenTeam_Automation\\Test_Data\\AutomationTesting Log In Test.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		Iterator<Row> rowiterator = sheet.iterator();
		rowiterator.next();

		ArrayList<String> list = new ArrayList<>();
		while (rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(columno).getStringCellValue());
		}

		System.out.println("List ::: " + list);
		return list;
}

}
