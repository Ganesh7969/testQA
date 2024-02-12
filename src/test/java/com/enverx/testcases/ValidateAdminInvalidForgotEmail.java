package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.ForgotPasswordPage;
import com.enverx.pageobjects.LoginPage;

public class ValidateAdminInvalidForgotEmail  extends BaseClass{
@Test

public void validateadminInvalidForgotEmail() throws InterruptedException
{
	LoginPage lp = new LoginPage(driver);
	lp.launchURL(userbaseurl);
	lp.clickusersignin();

	ForgotPasswordPage fp = new ForgotPasswordPage(driver);
	fp.clickforgotpasswordlink();
	fp.clicksubmit();
	fp.validateInvalidForgotEmail(driver, invalidadminemail);
}
}
