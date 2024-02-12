package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.ForgotPasswordPage;
import com.enverx.pageobjects.LoginPage;

public class ValidateUserForgotPasswordPageElements extends BaseClass {
	@Test
	public void validateuserforgotpasswordpageelementstest() {
		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		LoginPage lp = new LoginPage(driver);
		lp.launchURL(userbaseurl);
		fp.validateforgotpasswordpageelements();
		
	}

}
