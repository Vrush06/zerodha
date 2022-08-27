package Mock_prac;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exception_testng {
	@Test(expectedExceptions = Exception.class)
	public void exception() {
		Reporter.log("Exception",true);
		System.out.println(20/0);
		
		Reporter.log("Handled",true);
	}
	
	
	@Test(expectedExceptions = NullPointerException.class)
	public void exc2() {
		throw new NullPointerException();
		
	}

}
