package tests;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginObject;
	@Test
	public void UserLoginSuccessfully() {
		
		loginObject = new LoginPage(driver);
		loginObject.UserSignIn("testrcm", "testrcm");		
	}
	

}
