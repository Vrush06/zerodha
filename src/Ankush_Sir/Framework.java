package Ankush_Sir;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Framework {
	
	public static void main(String[] args) throws Throwable {
		//create object of file input stream class
			FileInputStream file=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\Documents\\may7.xlsx");
			//open excel sheet using create method
			 boolean data = WorkbookFactory.create(file).getSheet("may7").getRow(1).getCell(1).getBooleanCellValue();
			//print data in excel sheet
			System.out.println(data);
		}

}
