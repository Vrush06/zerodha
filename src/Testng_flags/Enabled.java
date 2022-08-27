package Testng_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	
	@Test(enabled =false )
	public void tc() {
		Reporter.log("hii",true);
	}
	@Test
	public void tc1() {
		Reporter.log("hello",true);
	}
	
	@Test(enabled =false )
	public void tc2() {
		Reporter.log("hello",true);
	}

}
