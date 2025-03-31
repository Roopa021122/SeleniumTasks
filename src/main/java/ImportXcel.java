

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportXcel {

	public static void main(String[] args) throws IOException {
		String Excelpath = "C:\\Users\\roopa\\Desktop\\Task Sql.xlsx";
		FileInputStream Details = new FileInputStream(Excelpath);
	    Workbook workbook = new XSSFWorkbook(Details);
	    Sheet sheet = workbook.getSheetAt(0);
	   for(int i = 1;i<=10;i++) {
	    Row row = sheet.getRow(i);
	    Cell empno = row.getCell(0);
	    Cell ename = row.getCell(1);
	    Cell job = row.getCell(2);
	    Cell mgr = row.getCell(3);
	    Cell hiredate = row.getCell(4);
	    Cell sal = row.getCell(5);
	    Cell comm = row.getCell(6);
	    Cell deptno = row.getCell(7);
	    System.out.println("empno is::"+empno.toString());
	    System.out.println("hiredate is::"+hiredate.toString());
	
	}
	}
}
