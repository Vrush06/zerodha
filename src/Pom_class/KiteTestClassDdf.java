package Pom_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClassDdf {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\FirstMy1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://kite.zerodha.com/");
		
		KiteLogin1DdfPage kl1=new KiteLogin1DdfPage(driver);
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		kl1.username(username);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		kl1.password(password);
		
		kl1.login();
		
		//2nd page
		KiteLogin2DdfPage kl2=new KiteLogin2DdfPage(driver);
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		kl2.pin(pin);
		
		kl2.continuebtn();
		
		//home page
		KiteHomeDdfPage khd=new KiteHomeDdfPage(driver);
		String home = sh.getRow(0).getCell(3).getStringCellValue();		
		khd.homepage(home);
		
	}

}
