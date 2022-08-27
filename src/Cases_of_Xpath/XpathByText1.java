package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://developers.kite.trade/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Read terms & conditions']")).click();
		String a=driver.getTitle();
		String e="Terms and conditions - Kite Connect trading APIs";
		if(a.equals(e)) {
			System.out.println("Terms & conditions are opened : TC is passed");
		}
		else {
			System.out.println("Terms & conditions are not opened : TC is failed");
		}
		
	}

}
