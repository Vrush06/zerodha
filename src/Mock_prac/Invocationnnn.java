package Mock_prac;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationnnn {
	
	@Test(invocationCount = 10)
	public void m1() {
		Reporter.log("hii",true);
	}

}
