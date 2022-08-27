package Ankush_Sir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomeDdfPage {
	//Declaration
			@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
			
			
			//initialization
			public KiteHomeDdfPage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			//utilization
			public void verifyuserID( String expID) {
				
				String actID = userID.getText();
				if(actID.equals(expID)) {
					System.out.println("TC is pass");
				}
				else {
					System.out.println("TC is fail");
				}
			}

}
