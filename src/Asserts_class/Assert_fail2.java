package Asserts_class;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail2 {
	@Test
	public void tc1() {
		Reporter.log("failed or not",true);
		
	}
	@Test
	public void tc2() {
		Assert.fail();
		Reporter.log("sure it's failed",true);
		
		Reporter.log("i'm not there",true);
	}

}
