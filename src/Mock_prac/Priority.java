package Mock_prac;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 5)
	public void m1() {
		Reporter.log("hii",true);	
	}

	@Test(priority = 2)
	public void m2() {
		Reporter.log("bye",true);
	}
	@Test(priority = 4)
	
	public void m3() {
		Reporter.log("come",true);
	}
	@Test(priority = 1)
	public void m4() {
		Reporter.log("go",true);
	}
	@Test(priority = 3)
	public void m5() {
		Reporter.log("stay",true);
	}
}
