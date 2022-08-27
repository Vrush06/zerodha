package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOrangehrm3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vrush\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_2c4nhm6jb0_b&adgrpid=58361985549&hvpone=&hvptwo=&hvadid=294137008318&hvpos=&hvnetw=g&hvrand=17105665002867309692&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062101&hvtargid=kwd-298972033817&hydadcr=5876_1738709&gclid=Cj0KCQjw_viWBhD8ARIsAH1mCd4kdeiXAfU0rhznD7aR65mAz4MjRWKFOpGzTbQCzOCb4vpTEAPckAMaAsloEALw_wcB");
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7028857228");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("06Jan1998");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s=new Select(dropdown);
		List<WebElement> text = s.getOptions();
		for(WebElement onetext:text) {
			String store = onetext.getText();
			System.out.println(store);
		}
		s.selectByIndex(5);
	}
	

}
