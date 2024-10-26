package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreateLeadFunctionality extends BaseClass {
	
	@Test
	public void runCreateLead() {
		LoginPage lp=new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyLogin()
		.clickCrmsfa()
		.clickLeadslink()
		.clickCreatelink()
		.enterCompanyname()
		.enterFirstname()
		.enterLastname()
		.clickCreateLeadButton()
		.verifyFirstName();
		
	}

}
