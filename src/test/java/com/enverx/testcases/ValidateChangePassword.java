package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;
import com.enverx.pageobjects.SecurityPage;

public class ValidateChangePassword extends BaseClass{
	@Test
	public void validatechangepasswordtest() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		SecurityPage sp = new SecurityPage(driver);
		lp.userlogin(userbaseurl, useremail, userpassword);
		sp.validatechangepasswordbutton();
	}

}
