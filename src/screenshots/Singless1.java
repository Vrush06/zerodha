package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Singless1 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement ssofthe = driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
		File src = ssofthe.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest= new File("C:\\Manual\\Automation\\ss\\takess21.jpg");
	Files.copy(src, dest);	
	}

}
