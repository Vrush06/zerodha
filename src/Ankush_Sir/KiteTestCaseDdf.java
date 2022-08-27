package Ankush_Sir;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestCaseDdf {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\FirstMy1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet2");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //call 1st pom class  
	    KiteLogin1DdfPage login1=new KiteLogin1DdfPage(driver);
	    String username = sh.getRow(0).getCell(0).getStringCellValue();
	    login1.enterUN(username);
	    
	    String password = sh.getRow(0).getCell(1).getStringCellValue();
	    login1.enterPWD(password);
	    
	    login1.clickLOGINBTN();
	    
	    //call 2nd pom class
	    KiteLogin2DdfPage login2=new KiteLogin2DdfPage(driver);
	    String pinvalue = sh.getRow(0).getCell(2).getStringCellValue();
	    login2.enterPIN(pinvalue);
	    
	    login2.clickcntBtn();
	    
	    //call 3rd pom class
	    	KiteHomeDdfPage home=new KiteHomeDdfPage(driver);
	    	 String expuserid = sh.getRow(0).getCell(0).getStringCellValue();
	    	 home.verifyuserID(expuserid);
	    	 driver.close();
	    
		
	}


}
