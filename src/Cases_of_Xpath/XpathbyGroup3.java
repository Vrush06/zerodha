package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyGroup3 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("7028857228");
		driver.findElement(By.xpath("(//input)[8]")).sendKeys("06jan1998");
		driver.findElement(By.xpath("(//span)[40]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("teddy bears");
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img)[12]")).click();
		String a=driver.getTitle();

		String e="Teddy Bears- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		if(a.equals(e)) {
			System.out.println("Test case pass : Soft toys is opened");
		}
		else {
			System.out.println("Test case fail : Soft toys is not opened");
		}
		
	
	}
	

}
