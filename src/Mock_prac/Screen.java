package Mock_prac;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File("C:\\Testing\\Automation\\ss\\ss.png");
//		
//		Files.copy(src, dest);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeAsyncScript("window.scrollBy(0,3500)");
	}

}
