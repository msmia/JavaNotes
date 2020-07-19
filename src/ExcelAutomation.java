import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAutomation {

	static String strFile = "/Users/dev/Documents/GIT/JavaNotes/src/excel_data/Book1.xlsx";

	public static void main(String[] args) throws IOException {

		// Create a workbook
		XSSFWorkbook wb = new XSSFWorkbook(strFile);
		// Sheet1
		Sheet sheet1 = wb.getSheet("Sheet1");
		// Get last row number 0 based
		// int lastRow = sheet1.getLastRowNum();

		// Formual eval
		FormulaEvaluator fEval = new XSSFFormulaEvaluator(wb);

		// Dataformatter
		DataFormatter df = new DataFormatter();

		List<Map<String, String>> l2m = new ArrayList<Map<String, String>>();

		String[] columnArray = { "custId", "custName", "contactName", "address", "city", "postalCode", "country" };

		for (int i = 1; i < sheet1.getLastRowNum(); i++) {

			Map<String, String> m = new HashMap<String, String>();

			for (int j = 0; j < columnArray.length; j++) {

				Cell cell = sheet1.getRow(i).getCell(j);

				if (cell.getCellTypeEnum() == CellType.STRING) {
					String s = cell.getStringCellValue();
					m.put(columnArray[j], s);
				} else if (cell.getCellTypeEnum() == CellType.BOOLEAN) {
					boolean b = cell.getBooleanCellValue();
					String b2s = Boolean.toString(b);
					m.put(columnArray[j], b2s);
				} else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
					double d = cell.getNumericCellValue();
					String d2s = String.valueOf(d);
					m.put(columnArray[j], d2s);
				} else if (cell.getCellTypeEnum() == CellType.BLANK) {
					String bl = cell.getStringCellValue();
					m.put(columnArray[j], bl);
				}
			}
			l2m.add(m);
		}
		Iterator<Map<String, String>> l = l2m.iterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}

	}

}

//String custId = df.formatCellValue(sheet1.getRow(i).getCell(0), fEval);
//String custName = df.formatCellValue(sheet1.getRow(i).getCell(1), fEval);
//String contactName = df.formatCellValue(sheet1.getRow(i).getCell(2), fEval);
//String address = df.formatCellValue(sheet1.getRow(i).getCell(3), fEval);
//String city = df.formatCellValue(sheet1.getRow(i).getCell(4), fEval);
//String postalCode = df.formatCellValue(sheet1.getRow(i).getCell(5), fEval);
//String country = df.formatCellValue(sheet1.getRow(i).getCell(6), fEval);

//[
// {country=Germany, address=Obere Str. 57, city=Berlin, contactName=Maria Anders, postalCode=12209, custId=null, custName=Alfreds Futterkiste},
// {country=null, address=null, city=null, contactName=null, postalCode=null, custId=2, custName=null},
// {country=Mexico, address=Avda. de la Constitución 2222, city=México D.F., contactName=Ana Trujillo, postalCode=5021, custId=3, custName=Ana Trujillo Emparedados y helados},
// {country=Mexico, address=Mataderos 2312, city=México D.F., contactName=Antonio Moreno, postalCode=5023, custId=4, custName=Antonio Moreno Taquería},
// {country=UK, address=120 Hanover Sq., city=London, contactName=Thomas Hardy, postalCode=WA1 1DP, custId=5, custName=Around the Horn},
// {country=null, address=null, city=null, contactName=null, postalCode=null, custId=null, custName=null},
// {country=Sweden, address=Berguvsvägen 8, city=Luleå, contactName=Christina Berglund, postalCode=S-958 22, custId=6, custName=Berglunds snabbköp},
// {country=null, address=null, city=null, contactName=null, postalCode=null, custId=7, custName=null}
//]
