package Framework_r;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FRame2 {
	
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\FirstMy1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //maximize
	    driver.manage().window().maximize();
	    //ENTET UN
	    String UN =sh.getRow(0).getCell(0).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	    
	    String PWD=sh.getRow(0).getCell(1).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
	    
	    driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	    
	    String pin=sh.getRow(0).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	    
	    driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	    
	    String expT = UN;
	    String actT = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	    
	    if(expT.equals(actT)) {
	    	System.out.println("Test case is pass");
	    }
	    else {
	    	System.out.println("Test case is failed");
	    }
	
	
	
	}

}
