package TestNg_Adv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MultiB {
	@Parameters("browsername")
	@Test
	public void test(String browsername) {
		WebDriver driver=null;
		if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vrush\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			
		
		
		}
		else if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();

			
		}
		driver.get("https://www.amazon.com");
	}

}
