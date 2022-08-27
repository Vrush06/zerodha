package Ankush_Sir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_time_duration {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //open the application
	    driver.get("https://kite.zerodha.com/");
	    
	    //maximize the browser
	    driver.manage().window().maximize();
	    //give global wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //enter the user id
	    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
	    //enter password
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
	    //click on login button
	    driver.findElement(By.xpath("//button[text()='Login ']")).click();
	    //enter pin
	    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
	    //click on continue button
	    driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	    //verify user id
	    String expID="DPG458";
	    String actID=driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	    if(expID.equals(actID)) {
	    	System.out.println("Both are same,TC is pass");
	    }
	    else {
	    	System.out.println("Both are not same,TC is fail");
	    }
	    	
	    
	    
	    
	}

}
