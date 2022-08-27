package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scroll1 {
	

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.amazon.com/");
	
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-2000)");
		

	}
	

}
