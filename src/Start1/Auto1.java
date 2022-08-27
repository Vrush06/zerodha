package Start1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto1 {
	  public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		String s=d.getTitle();
		System.out.println(s);
		String m=d.getCurrentUrl();
		System.out.println(m);
	}

}
