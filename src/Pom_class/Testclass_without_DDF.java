package Pom_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass_without_DDF {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\vrush\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:/kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Pom_class1 pc1=new Pom_class1(driver);
		pc1.enterusername();
		pc1.enterpassword();
		pc1.clickloginbutton();
		
		Pom_class2 pc2=new Pom_class2(driver);
		pc2.enterpin();
		pc2.clickcont();
		
		Pom_Home home=new Pom_Home(driver);
		home.verifyuserid();
		
		
	}

}
