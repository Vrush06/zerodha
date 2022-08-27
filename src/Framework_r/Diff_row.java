package Framework_r;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Diff_row {
	
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\FirstMy1.xlsx");
		Sheet sh1 = WorkbookFactory.create(file).getSheet("Sheet3");
		
		 String Name = sh1.getRow(0).getCell(0).getStringCellValue();
		 String Birthdate = sh1.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(Name);
		System.out.println(Birthdate);
		
	}

}
