package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class ValidateUserLoginPageElements extends BaseClass {
	@Test
	public void validateuserloginpageelementstest() {
		LoginPage lp = new LoginPage(driver);
		lp.launchURL(userbaseurl);
		lp.validateloginpageelements();
	}

}
