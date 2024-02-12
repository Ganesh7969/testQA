package com.enverx.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class ValidateUserLoginasInvestor extends BaseClass {
	
	@Test
	public void ValidateUserLoginasInvestorTest() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.userlogin(userbaseurl, investoremail, investorpassword);
		lp.loginasinvestor();

	}
	@AfterClass
    public void tearDown() {
        // Close the browser and perform cleanup
        if (driver != null) {
            driver.quit();
        }
    }
	
	
	
	

}
