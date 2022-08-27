package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2DdfPage {
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;

	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement cntbtn;
	
	public KiteLogin2DdfPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void pin(String Pin) {
		pin.sendKeys(Pin);
	}
	public void continuebtn() {
		cntbtn.click();
	}
}
