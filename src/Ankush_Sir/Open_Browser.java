package Ankush_Sir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser {
	public static void main(String[] args) throws Throwable{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     //open the url
	     driver.get("https://www.google.com/");
	     //maximize the browser
	     Thread.sleep(3000);//it is java wait
	     driver.manage().window().maximize();
	     //minimize the browser
	     Thread.sleep(3000);
	     driver.manage().window().minimize();
	     Thread.sleep(3000);
	     driver.close();
	     
	}
	

}
