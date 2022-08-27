package Popups;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7028857228");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("06jan1998");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("samsung galaxy f13");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_3pLy-c row'])[1]")).click();
		Thread.sleep(2000);
		Set<String> allwindow = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allwindow);
		Thread.sleep(2000);
	    String s = al.get(1);
	    System.out.println(s);
	    driver.switchTo().window(al.get(1));
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]")).click();
//
//		Set<String> store = driver.getWindowHandles();
//		Thread.sleep(2000);
//		ArrayList<String> al=new ArrayList<String>(store);
//		al.get(1);
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

	}
}
