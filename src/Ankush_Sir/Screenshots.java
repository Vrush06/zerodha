package Ankush_Sir;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    //type cast take screenshot interface
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    //use getscreenshotAs()
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    //we have to store screenshot at particular dwstinTION create object of file class
	    File dest=new File("C:\\Manual\\Automation\\fullssscree.jpg");
	    //u have to transfer file source to destination(ya adhi amhi findhandler vapraycho)
	    Files.copy(src, dest);
	    
	}

}
