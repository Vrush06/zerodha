package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTargetScreenSz;

import com.google.common.io.Files;

public class Ss2 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\vrush\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File("C:\\Manual\\Automation\\ss\\amazonss.png");
//		
//		Files.copy(src, dest);
		
		
		
		
	}

}
