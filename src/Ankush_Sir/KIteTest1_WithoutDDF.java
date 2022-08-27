package Ankush_Sir;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KIteTest1_WithoutDDF {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //1st pom class
	    Kite1Page login1=new Kite1Page(driver);
	    login1.enterUN();
	    login1.enterPWD();
	    login1.clickLOGINBTN();
	    
	    //2nd pom class
	    Kite2Page login2=new Kite2Page(driver);
	    login2.enterPIN();
	    login2.clickcntBtn();
	    
	    //3rd class
	    KiteHPage hm=new KiteHPage(driver);
	    hm.verifyuserID();
	   // driver.close();
	}
}
