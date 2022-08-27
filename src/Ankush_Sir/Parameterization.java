package Ankush_Sir;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
	public static void main(String[] args) throws Throwable {
		//create object of file input stream class
			FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Desktop\\FirstMy.xlsx");
			//open excel sheet using create method
			 boolean data = WorkbookFactory.create(file).getSheet("Sheet3").getRow(2).getCell(0).getBooleanCellValue();
			//print data in excel sheet
			System.out.println(data);
		}

}
