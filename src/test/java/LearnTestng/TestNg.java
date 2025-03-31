package LearnTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg {
	
	@Test
	public void login () {
		Reporter.log("Login test script executed successfully",true);
	}
	
	@Test
	public void register() {
		Reporter.log("register test script executed successfully",true);
	}
	
	@Test
	public void addToCart() {
		Reporter.log("add to cart test script executed successfully",true);
	}

}
