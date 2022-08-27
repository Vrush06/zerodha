package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("7028857228");
		driver.findElement(By.xpath("(//input)[8]")).sendKeys("06jan1998");
		driver.findElement(By.xpath("(//button)[3]")).click();
		Thread.sleep(2000);
		
		String a=driver.getTitle();
		String e="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		if(a.equals(e)) {
			System.out.println("Test case pass : home page is opened");
		}
		else {
			System.out.println("Test case fail : home page is not opened");
		}
		
	}
	
      
		
	

}
