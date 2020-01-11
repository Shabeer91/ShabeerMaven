import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWithSeleniumIntegration {

	public static String getData(int row, int cell) throws IOException {
		
		File loc = new File ("E:\\Shabeer Works\\SHABEER\\Excel\\New folder\\write.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Greens");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		System.out.println(c);
		
		String value = null;
		
		int cellType = c.getCellType();
		
		if (cellType==1) {
			value = c.getStringCellValue();
				
		}
		
		else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sD = new SimpleDateFormat("mm-dd-yyyy");
				value = sD.format(d);
			}
			else {
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			
			}
					
		}
		System.out.println(value);
		return value;
		
		
	}

}
