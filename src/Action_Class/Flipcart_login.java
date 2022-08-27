package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart_login {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Devanshi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kamble");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7620712584");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("vrush137151");
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Actions a=new Actions(driver);
		//date
		a.click(date).perform();
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ENTER).perform();
		//month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		a.click(month).perform();
		a.sendKeys(Keys.HOME).perform();
		a.sendKeys(Keys.ENTER).perform();
		//year
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		a.click(year).click().perform();
		for(int i=1;i<=21;i++) {
		a.sendKeys(Keys.ARROW_DOWN).perform();
	
		}
		Thread.sleep(1000);
		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		a.click(gender).perform();		
		
	}

}
