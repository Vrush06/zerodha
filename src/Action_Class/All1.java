package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class All1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement ref = driver.findElement(By.xpath("//a[@id='nav-cart']"));
		Actions a=new Actions(driver);
		
		//a.moveToElement(ref).contextClick().perform();
		Thread.sleep(2000);
		a.moveToElement(ref).clickAndHold().perform();
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.moveToElement(ref).click().perform();
		Thread.sleep(2000);
		//WebElement ref2 = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[2]"));
		//a.moveToElement(ref2).click().perform();
		a.sendKeys(Keys.ARROW_UP).perform();
	}
	

}
