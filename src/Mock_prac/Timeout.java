package Mock_prac;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	
	@Test(timeOut = 200000)
	public void m1() {
		Reporter.log("hey",true);
	}

}
