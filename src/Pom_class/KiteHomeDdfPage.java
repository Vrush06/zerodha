package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomeDdfPage {
	
	@FindBy(xpath="//div[@class='user-nav perspective']")private WebElement userid;
	
	public KiteHomeDdfPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void homepage(String UserId) {
		String actId = userid.getText();
		String expId=UserId;
		
		if(actId.equals(expId)) {
			System.out.println("TC is passed");
		}
		else {
			System.out.println("TC is failed");
		}
		
	}

}
