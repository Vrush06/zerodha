package Ankush_Sir;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework_Ddf {
	
	public static void main(String[] args) throws Throwable {
		//create object of FIS class
		FileInputStream fis=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\FirstMy1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet2");
		//set the properties
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //open the application
	    driver.get("https://kite.zerodha.com/");
	    //wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //maximize
	    driver.manage().window().maximize();
	    //ENTET UN
	    String UN = sh.getRow(0).getCell(0).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	    //ENTER PWD
	    String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
	    //CLICK ON LOGIN BTN
	    driver.findElement(By.xpath("//button[text()='Login ']")).click();
	    //ENTER PIN 
	    String PIN = sh.getRow(0).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
	    //CLICK ON CONTNUE BTN
	    driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	    //VERIFY USERID
	    String expID = sh.getRow(0).getCell(3).getStringCellValue();
	    String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	    if(actID.equals(expID)) {
	    	System.out.println("TC pass");
	    }
	    else {
	    	System.out.println("TC fail");
	    }
	    

	}

}
