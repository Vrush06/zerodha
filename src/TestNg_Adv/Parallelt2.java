package TestNg_Adv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallelt2 {
	@Test
	public void m1() {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vrush\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
	
	}
	

}
