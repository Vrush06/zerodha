package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1DdfPage {
	
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement lbtn;
	
	public KiteLogin1DdfPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void username(String username) {
		UN.sendKeys(username);
	}
	public void password(String password) {
		PWD.sendKeys(password);
	}
	public void login() {
		lbtn.click();
	}

}
