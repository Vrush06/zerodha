package Mock_prac;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depnds {
	@Test
	public void m1() {
		Reporter.log("login1",true);
	}
	@Test(dependsOnMethods = {"login1"})
	public void m2() {
		Reporter.log("login2",true);
	}

}
