package Framework_r;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framewrok_login_ddf {
	public static void main(String[] args) throws Throwable{
		
		FileInputStream file=new FileInputStream("C:\\Users\\vrush\\OneDrive\\Documents\\FirstMy1.xlsx");
		Sheet s = WorkbookFactory.create(file).getSheet("Sheet4");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = s.getRow(4).getCell(0).getStringCellValue();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String Userid = s.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(Userid);
		
		String Password=s.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		String Pin = s.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(Pin);
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).submit();
		
		String Actualtext = driver.findElement(By.xpath("//div[@class='avatar']")).getText();
		String Expectedtext=s.getRow(2).getCell(3).getStringCellValue();
		
		if(Actualtext.equals(Expectedtext)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		System.out.println(Actualtext);
	}

}
