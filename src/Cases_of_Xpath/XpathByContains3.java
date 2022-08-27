package Cases_of_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("7028857228");
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]")).sendKeys("06jan1998");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]")).sendKeys("teddy bears");
		driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@alt,'Macros Rabbit, Elephant, Unicorn, Penguin Plush Combo for Kids, Gift & Decoration (Teddy Bear)  - 25 cm')]")).click();
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
