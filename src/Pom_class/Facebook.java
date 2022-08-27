package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
	@FindBy(xpath="//input[@id='email']")private WebElement number;
	@FindBy(xpath="//input[@id='pass']")private WebElement pwd;
	@FindBy(xpath="//button[text()='Log In']")private WebElement enter;
	
	
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void m1() {
		number.sendKeys("vrush137151@gmail.com");
		pwd.sendKeys("06jan1998");
		enter.click();
	}

}
