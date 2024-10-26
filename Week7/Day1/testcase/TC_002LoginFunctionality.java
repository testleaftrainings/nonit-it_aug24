package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002LoginFunctionality extends BaseClass {
	
	@Test
	public void runLogin() {
		LoginPage lp=new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyLogin();
		
	}

}
