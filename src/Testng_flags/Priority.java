package Testng_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 4)
	public void t1() {
		Reporter.log("hii",true);
	}
	@Test(priority = 2)
	public void t2() {
		Reporter.log("hello",true);
	}
	@Test(priority = 5)
	public void t3() {
		Reporter.log("bye",true);
	}
	@Test(priority = 1)
	public void t4() {
		Reporter.log("goodbye",true);
	}

}
