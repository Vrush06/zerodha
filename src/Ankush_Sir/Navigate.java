package Ankush_Sir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //navigate()
	    driver.navigate().to("https://www.google.com/");
	    Thread.sleep(3000);
	    driver.navigate().to("https://www.amazon.com/");
	    //backward()
	    driver.navigate().back();
	    Thread.sleep(3000);
	    //forward()
	    driver.navigate().forward();
	    //refresh()
	    driver.navigate().refresh();
	    //close()>>it is used to close current browser
	    //driver.close();
	    driver.quit();
	}
	

}
