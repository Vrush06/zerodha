package Ankush_Sir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Infosys {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //Enter the URL
	    driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
	    
	    //Enter UN
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	    Thread.sleep(3000);
	    
	    //Enter PWD
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	    Thread.sleep(3000);
	    //MAXIMIZE browser
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    //click on login button
	    driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	    
	    //java wait
	    Thread.sleep(5000);
	    
	    //verify home page is opened or not 
	    String expT="Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";
	    Thread.sleep(3000);
	    String actT = driver.getTitle();
	    if(actT.equals(expT)) {
	    	System.out.println("home page is opened and TC is pass");
	    }
	    else {
	    	System.out.println("Home page is not opened and Tc is fail");
	    }
	    		
	    
	}

}
