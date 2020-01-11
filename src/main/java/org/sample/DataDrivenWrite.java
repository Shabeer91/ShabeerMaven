package org.sample;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWrite {
	public static void main(String[] args) throws IOException {
		File loc = new File("E:\\Shabeer Works\\SHABEER\\Excel\\write.xlsx");
		
		Workbook w = new XSSFWorkbook();
		Sheet s=w.createSheet("Greens");
		Row r=s.createRow(5);
		Cell c=r.createCell(6);
		c.setCellValue("shabeer");
		FileOutputStream o=new FileOutputStream(loc);
		w.write(o);
		System.out.println("write");
	}
}

