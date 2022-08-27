package screenshots;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ss1 {
	
	

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		
	   File store = ts.getScreenshotAs(OutputType.FILE);
	   
	   File dest=new File("C:\\Manual\\Automation\\ss\\ss21.jpg");
		Files.copy(store, dest);
		
	}
	

}
