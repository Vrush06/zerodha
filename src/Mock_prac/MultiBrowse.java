package Mock_prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowse {
	@Parameters("browsername")
	@Test
	public void m1(String browsername) {
		WebDriver driver=null;
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
			
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vrush\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		
		
		driver.get("https://www.google.com");
	}

}
