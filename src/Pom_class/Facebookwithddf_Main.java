package Pom_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebookwithddf_Main {
	
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\FirstMy1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Facebook");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Facebookwithddf fwd=new Facebookwithddf(driver);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String mail=sh.getRow(0).getCell(0).getStringCellValue();
		fwd.m1(mail);
		
		String pass=sh.getRow(0).getCell(1).getStringCellValue();
		fwd.m2(pass);
	
	
	}
	

}
