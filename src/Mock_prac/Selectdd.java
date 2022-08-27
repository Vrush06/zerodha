package Mock_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdd {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	   
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
	    Thread.sleep(2000);
	    
	    WebElement list = driver.findElement(By.xpath("//select[@id='candidateSearch_jobVacancy']"));
	    Thread.sleep(2000);
	   Select s=new Select(list);
	   Thread.sleep(2000);
	   s.selectByIndex(5);
	    
	    
	    
	    
	    
	}

}
