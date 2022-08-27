package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser2 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    //click on cancel button
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    //search for mobile
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
	    //click on search button
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(3000);
	    //click on 1st mobile so that new child window  will opens
	    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	    //by default selenium control should be on main window we have switch it from main window to child
	    Thread.sleep(3000);
	    Set<String> allws = driver.getWindowHandles();
	    //use array list to store all windows
	   ArrayList<String> al=new ArrayList<String>(allws);
	   String cw = al.get(1);
	   System.out.println(cw);
	   //print main window session id
	   String mainwin = al.get(0);
	   System.out.println(mainwin);
	   //switch to main window
	   Thread.sleep(3000);
	   driver.switchTo().window(al.get(0));
	   //for confirmation getTitle
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	   
	}

}
